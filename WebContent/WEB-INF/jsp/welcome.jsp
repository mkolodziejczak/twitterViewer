<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" >
<title>Twitter Viewer</title>
<style type="text/css">
body {
	font-family: Century Gothic, sans-serif;
}
.filters{
	padding-left:80px;
	color: #50a5e6;
}
.filters h2{
	padding-bottom: 60px;
}
.filter{
	padding-bottom: 40px;
}
div.twitter-tweet-rendered p.entry-title {
    font-family: Arial, sans-serif !important;
    font-size: 14px !important;
    padding: 5px !important;
    background: #eee !important;
    max-width: 300px !important;
}
blockquote.twitter-tweet {
  display: inline-block;
  font-family: "Helvetica Neue", Roboto, "Segoe UI", Calibri, sans-serif;
  font-size: 12px;
  font-weight: bold;
  line-height: 16px;
  border-color: #eee #ddd #bbb;
  border-radius: 5px;
  border-style: solid;
  border-width: 1px;
  box-shadow: 0 1px 3px rgba(0, 0, 0, 0.15);
  margin: 10px 5px;
  padding: 0 16px 16px 16px;
  max-width: 468px;
}
 
blockquote.twitter-tweet p {
  font-size: 16px;
  font-weight: normal;
  line-height: 20px;
}
 
blockquote.twitter-tweet a {
  color: inherit;
  font-weight: normal;
  text-decoration: none;
  outline: 0 none;
}
 
blockquote.twitter-tweet a:hover,
blockquote.twitter-tweet a:focus {
  text-decoration: underline;
}
</style>
<script type="text/javascript">
	function validate()
	{
		var userInput=document.getElementById("user").value;
		var tagsInput=document.getElementById("tags").value;
		
		if(userInput == "" && tagsInput == "")
		{
			alert("Incorrect filters");
		}
		else
		{
			document.getElementById("filterForm").submit();
		}
	}
</script>
</head>
<body>
	<div style="width: 30%; height:100%; float: left; background-color:#001b34;">
		<div class="filters">
		<form action="welcome.html">
			<h2>Filters</h2>
			<div class="filter">
				<h3>User Account</h3>
				<input type="text" name="user"  value="${sessionScope.user}">
			</div>
			<div class="filter">
				<h3>Tags</h3>
				<input type="text" name="tags"  value="${sessionScope.tags}">
			</div>
			<div class="filter">
				<input type="submit">
			</div>
			</form>
		</div>
	</div>
	<div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align:center;">
	
	${message}

	</div>
</body>
</html>