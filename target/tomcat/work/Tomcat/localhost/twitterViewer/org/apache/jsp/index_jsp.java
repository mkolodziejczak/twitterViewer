/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-02-06 01:17:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Twitter Viewer</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: Century Gothic, sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".filters{\r\n");
      out.write("\tpadding-left:80px;\r\n");
      out.write("\tcolor: #50a5e6;\r\n");
      out.write("}\r\n");
      out.write(".filters h2{\r\n");
      out.write("\tpadding-bottom: 60px;\r\n");
      out.write("}\r\n");
      out.write(".filter{\r\n");
      out.write("\tpadding-bottom: 40px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction validate()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar userInput=document.getElementById(\"user\").value;\r\n");
      out.write("\t\tvar tagsInput=document.getElementById(\"tags\").value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(userInput == \"\" && tagsInput == \"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Incorrect filters\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"filterForm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"width: 100%; height:100%; float: left; background-color:#001b34; text-align:center; \">\r\n");
      out.write("\t\t<div style=\"color:#50a5e6;\">\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\tPlease enter any filters to begin.\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"filters\">\r\n");
      out.write("\t\t<form id=\"filterForm\" action=\"welcome.html\">\r\n");
      out.write("\t\t\t<h2>Filters</h2>\r\n");
      out.write("\t\t\t<div class=\"filter\">\r\n");
      out.write("\t\t\t\t<h3>User Account</h3>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"user\" id=\"user\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"filter\">\r\n");
      out.write("\t\t\t\t<h3>Tags</h3>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"tags\" id=\"tags\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.tags}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<div class=\"filter\">\r\n");
      out.write("\t\t\t\t<button onClick=\"validate()\">Search!</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}