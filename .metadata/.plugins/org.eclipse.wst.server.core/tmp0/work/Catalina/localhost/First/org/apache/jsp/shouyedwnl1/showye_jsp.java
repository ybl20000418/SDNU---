/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2019-12-11 12:55:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.shouyedwnl1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showye_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>图书管理系统首页</title> \r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"bootstrap.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("<link href=\"font-awesome.css\" rel=\"stylesheet\">  <!-- font-awesome icons --> \r\n");
      out.write("<link href=\"index.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /> <!-- filter css --> \r\n");
      out.write("<link rel=\"stylesheet\" href=\"swipebox.css\"> <!-- filter css --> \r\n");
      out.write("<!-- //Custom Theme files -->\r\n");
      out.write("<!-- js -->\r\n");
      out.write("<script src=\"jquery-2.2.3.min.js\"></script>   \r\n");
      out.write("<!-- //js -->\r\n");
      out.write("<!-- web-fonts -->\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //web-fonts --> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header -->\t<!-- //header -->\r\n");
      out.write("\t<!-- banner -->\t<!-- //banner -->\r\n");
      out.write("\t<!-- portfolio -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"portfolio\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"w3ls-title\">\r\n");
      out.write("\t\t\t  <h3 class=\"agileits-title w3title1\">图书管理系统</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"gallery_gds agileits-w3layouts\">\r\n");
      out.write("\t\t\t\t<ul class=\"simplefilter\">\r\n");
      out.write("\t\t\t\t  <li class=\"active\" data-filter=\"all\">全部</li>\r\n");
      out.write("\t\t\t\t  <li data-filter=\"1\">服务功能</li>\r\n");
      out.write("\t\t\t\t  <li data-filter=\"2\">借阅</li>\r\n");
      out.write("\t\t\t\t  <li data-filter=\"3\">研究支持</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"filtr-container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 col-xs-6 filtr-item\" data-category=\"1\" data-sort=\"Busy streets\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"hover ehover14\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g1.jpg\" class=\"swipebox\" title=\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g1.jpg\" alt=\"\" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <h4><a fref=\"http://localhost:8080/First/logindwn/adminlogin.jsp\">管理员服务</a></h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"info nullbutton button\" data-toggle=\"modal\" data-target=\"#modal14\"><a href=\"http://localhost:8080/First/logindwn/adminlogin.jsp\">进入</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 col-xs-6 filtr-item\" data-category=\"2\" data-sort=\"Luminous night\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"hover ehover14\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g2.jpg\" class=\"swipebox\" title=\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g2.jpg\" alt=\"\" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>借阅规则</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"info nullbutton button\" data-toggle=\"modal\" data-target=\"#modal14\">进入</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 col-xs-6 filtr-item\" data-category=\"3\" data-sort=\"City wonders\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"hover ehover14\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g3.jpg\" class=\"swipebox\" title=\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g3.jpg\" alt=\"\" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>学科服务</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"info nullbutton button\" data-toggle=\"modal\" data-target=\"#modal14\">进入</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 col-xs-6 filtr-item\" data-category=\"3\" data-sort=\"Industrial site\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"hover ehover14\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g4.jpg\" class=\"swipebox\" title=\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g4.jpg\" alt=\"\" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>数据服务</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"info nullbutton button\" data-toggle=\"modal\" data-target=\"#modal14\">进入</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 col-xs-6 filtr-item\" data-category=\"3\" data-sort=\"In production\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"hover ehover14\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g5.jpg\" class=\"swipebox\" title=\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g5.jpg\" alt=\"\" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>分析报告</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"info nullbutton button\" data-toggle=\"modal\" data-target=\"#modal14\">进入</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 col-xs-6 filtr-item\" data-category=\"2\" data-sort=\"Peaceful lake\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"hover ehover14\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g6.jpg\" class=\"swipebox\" title=\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g6.jpg\" alt=\"\" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>借阅推荐</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"info nullbutton button\" data-toggle=\"modal\" data-target=\"#modal14\">进入</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 col-xs-6 filtr-item\" data-category=\"1\" data-sort=\"Industrial site\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"hover ehover14\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g7.jpg\" class=\"swipebox\" title=\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g7.jpg\" alt=\"\" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>学生服务</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"info nullbutton button\" data-toggle=\"modal\" data-target=\"#modal14\" ><a href=\"http://localhost:8080/First/logindwn/login1.jsp\">进入</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 col-xs-6 filtr-item\" data-category=\"1\" data-sort=\"In production\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"hover ehover14\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g8.jpg\" class=\"swipebox\" title=\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g8.jpg\" alt=\"\" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4><a href=\"http://localhost:8080/First/shouye/shouye1.jsp\">资源服务</a></h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"info nullbutton button\" data-toggle=\"modal\" data-target=\"#modal14\"><a href=\"http://localhost:8080/First/shouye/shouye1.jsp\">进入</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4 col-xs-6 filtr-item\" data-category=\"2, 4\" data-sort=\"Peaceful lake\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"hover ehover14\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g9.jpg\" class=\"swipebox\" title=\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis maximus tortor diam, ac lobortis justo rutrum quis. Praesent non purus fermentum, eleifend velit non\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/g9.jpg\" alt=\"\" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>数据服务</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"info nullbutton button\" data-toggle=\"modal\" data-target=\"#modal14\">进入</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //portfolio -->\r\n");
      out.write("\t<!-- footer -->\t<!-- //footer -->    \r\n");
      out.write("<!-- Include jQuery & Filterizr -->\r\n");
      out.write("  <script src=\"jquery.filterizr.js\"></script>\r\n");
      out.write("  <script src=\"controls.js\"></script>\r\n");
      out.write("<!-- Kick off Filterizr -->\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("      $(function() {\r\n");
      out.write("        //Initialize filterizr with default options\r\n");
      out.write("        $('.filtr-container').filterizr();\r\n");
      out.write("      });\r\n");
      out.write("  </script>\r\n");
      out.write("<!--//gallery-->\r\n");
      out.write("<!-- swipe box js -->\r\n");
      out.write("\t<script src=\"E:\\homepage\\js/jquery.swipebox.min.js\"></script> \r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(function($) {\r\n");
      out.write("\t\t\t\t$(\".swipebox\").swipebox();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- //swipe box js -->\r\n");
      out.write("    <script src=\"E:\\homepage\\js/bootstrap.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
