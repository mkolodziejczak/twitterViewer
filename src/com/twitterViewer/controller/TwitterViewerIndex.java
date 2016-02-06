package com.twitterViewer.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;



@Controller
public class TwitterViewerIndex {
	@RequestMapping("/welcome")
	public ModelAndView twitterIndex(HttpServletRequest request, @RequestParam("user") String user, @RequestParam("tags") String tags) {
		String filter = "";
		tags=tags.replaceAll(" ", "");
		user=user.replaceAll(" ", "");
		if(user != "")
		{
			
			filter = user;
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("tags", tags);
		}
		else
		{
			filter = "#" + tags;
			request.getSession().setAttribute("user", "");
			request.getSession().setAttribute("tags", tags);
		}
		
		StringBuilder viewVar = new StringBuilder();
		String viewString="";
		Twitter twitter = new TwitterFactory().getInstance();
	    AccessToken accessToken = new AccessToken("4858356423-p5buN7zTF59SlOpMMqwux6rIAUyBT4v2YWdpGPs", "q2xWqiwHMzIpoMXgMhNJI4UhCTEOAzGKVEjpUuTit7kyn");
	    twitter.setOAuthConsumer("8r1bWUiYIpoDBvUiZn4mPpNCi", "wJnlrl94XYxjY9FwEGWmCMzfeXk3XcuY8FYUCLD1EyXIywdI4b");
	    twitter.setOAuthAccessToken(accessToken);

	    try {
	        Query query = new Query(filter);
	        QueryResult result;
	        result = twitter.search(query);
	        List<Status> tweets = result.getTweets();
	        for (Status tweet : tweets) {
	        	if(tweet.getText().indexOf(tags) != -1)
	        		viewVar.append("<blockquote class='twitter-tweet'><p>"+tweet.getText()+"</p> &mdash; "+tweet.getUser().getScreenName()+" </blockquote><br>");
	        }
	    }
	    catch (TwitterException te) {
	        te.printStackTrace();
	        viewString = "Failed to search tweets: " + te.getMessage();
	    }

	    viewString = viewVar.toString();
	    
		return new ModelAndView("welcome", "message", viewString);
	}
}
