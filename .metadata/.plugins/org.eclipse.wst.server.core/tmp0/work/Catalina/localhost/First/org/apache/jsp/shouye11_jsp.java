/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2019-12-13 12:09:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shouye11_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>图书管理系统</title>\r\n");
      out.write("\t<!-- Meta tag Keywords -->\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("\t<script type=\"application/x-javascript\">\r\n");
      out.write("\t\taddEventListener(\"load\", function () {\r\n");
      out.write("\t\t\tsetTimeout(hideURLbar, 0);\r\n");
      out.write("\t\t}, false);\r\n");
      out.write("\r\n");
      out.write("\t\tfunction hideURLbar() {\r\n");
      out.write("\t\t\twindow.scrollTo(0, 1);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!--// Meta tag Keywords -->\r\n");
      out.write("    \r\n");
      out.write("\t<!-- css files -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS/bootstrap2.css\"> <!-- Bootstrap-Core-CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS/style2.css\" type=\"text/css\" media=\"all\" /> <!-- Style-CSS --> \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS/fontawesome-all2.css\"> <!-- Font-Awesome-Icons-CSS -->\r\n");
      out.write("\t<!-- //css files -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS/flexslider2.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<!--web font-->\r\n");
      out.write("\t<link href=\"http://fonts.googleapis.com/CSS?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext\" rel=\"stylesheet\">\r\n");
      out.write("\t<!--//web font-->\r\n");
      out.write("<style>\r\n");
      out.write(".row {\r\n");
      out.write("\t\tmargin-top:8px;\r\n");
      out.write("\t\tcolor:#fff;\r\n");
      out.write("\t\tpadding-left: 20px;\r\n");
      out.write("\t\tpadding-right: 20px;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<header>\t\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<!-- nav -->\r\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-lg navbar-light py-4\">\r\n");
      out.write("\t\t\t<!-- logo -->\r\n");
      out.write("\t\t\t<h1>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\"> \r\n");
      out.write("\t\t\t\t\t图书管理系统\r\n");
      out.write("\t\t\t  </a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<!-- //logo -->\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler ml-md-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("\t\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<!-- main nav -->\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-lg-auto text-center\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item mr-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"row\" href=\"http://localhost:8080/First/logindwn/adminlogin.jsp\">首页</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item mr-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"row\" href=\"http://localhost:8080/First/logindwn/adminlogin.jsp\">规则</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item mr-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"row\" href=\"http://localhost:8080/First/logindwn/adminlogin.jsp\">管理员</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item mr-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link scroll\" href=\"#services\">   </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item mr-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"row\" href=\"http://localhost:8080/First/logindwn/login1.jsp\">学生</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"last\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"contact scroll\" href=\"#contact\">注册账户</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //main nav -->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<!-- //nav -->\r\n");
      out.write("</div>\r\n");
      out.write("</header>\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- banner -->\r\n");
      out.write("<div class=\"banner\">\r\n");
      out.write("\t<div class=\"banner-layer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"agile_banner_info\">\r\n");
      out.write("\t\t\t\t<div class=\"agile_banner_info1\">\r\n");
      out.write("\t\t\t\t\t<div id=\"typed-strings\" class=\"agileits_w3layouts_strings\">\r\n");
      out.write("\t\t\t\t\t\t<p><i>弘德明志，</i>博学笃行</p>\r\n");
      out.write("\t\t\t\t\t\t<p>欢迎来到<i>图书管理系统</i></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<span id=\"typed\" style=\"white-space:pre;\">欢迎来到<em>图书管理系统</em></span></div>\r\n");
      out.write("\t\t\t<div class=\"banner_agile_para\">\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#exampleModalCenter\" role=\"button\"> 显示更多 </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //banner -->\t\r\n");
      out.write("<!-- about -->\r\n");
      out.write("<section class=\"welcome py-5\" id=\"welcome\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"head_part\">\r\n");
      out.write("\t\t  <h3 class=\"heading\">关于系统：</h3>\r\n");
      out.write("\t\t  <p class=\"heading-bottom mb-5\">实现了图书借阅、管理等功能</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-7 welcome_left\">\r\n");
      out.write("\t\t\t  <h3 class=\"mb-3\">本系统所实现的功能：</h3>\r\n");
      out.write("\t\t\t  <p>本系统分学生和管理员两种角色和权限进行对图书管理系统进行控制，可以方便的对图书进行快捷操作</p>\r\n");
      out.write("\t\t\t  <div class=\"row about-grids\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 about-grid1\">\r\n");
      out.write("\t\t\t  <h3>查询图书功能</h3>\r\n");
      out.write("\t\t\t  <p>可以实时查看书库当中图书的各种信息。</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 about-hover-grid\">\r\n");
      out.write("\t\t\t\t\t  <h3>借阅功能</h3>\r\n");
      out.write("\t\t\t\t\t  <p>实现借阅与还书的快捷功能。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 about-hover-grid\">\r\n");
      out.write("\t\t\t\t\t  <h3>管理功能</h3>\r\n");
      out.write("\t\t\t\t\t  <p>可以对图书进行实时操作，增加、删除、修改图书信息。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- //about -->\r\n");
      out.write("\r\n");
      out.write("<!-- services -->\r\n");
      out.write("<section class=\"services py-5\" id=\"services\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"head_part\">\r\n");
      out.write("\t\t  <h3 class=\"heading\">借阅须知：</h3>\r\n");
      out.write("\t\t  <p class=\"heading-bottom mb-5\">&nbsp;</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"serv-grids text-center\">\r\n");
      out.write("\t\t\t<div class=\"serv-icons\"> <span class=\"fab mr-md-5 mr-3 fa-accusoft\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t  <h4>图书馆书刊阅览与外借规则</h4>\r\n");
      out.write("\t\t  <p> &nbsp;1.图书馆图书只向我校全日制本科生、研究生、交换生和教职工提供借阅。进入书库请首先出示本人校园卡（无卡者不得进入），并拿取代书板后方可入库，用完放回原处。 2.读者应将携带的书包、水杯、书籍等物放在指定地点，请勿带入书库内。 3.读者选书时请使用代书板，严禁乱插乱放，以保证图书排架准确、整齐。 4.请保持库内安静，不得随地吐痰，严禁吸烟、乱扔杂物等。 5.借书前请仔细检查图书污损（包括污渍、水渍、油渍、划痕、字迹、撕页、缺页等）。若书籍有污损，请在借书时声明，待工作人员处理好后再借。还书时，如发现图书有污损，将按有关规定处理。 </p>\r\n");
      out.write("\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t  <div class=\"read\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- services -->\r\n");
      out.write("\r\n");
      out.write("<!-- pricing -->\r\n");
      out.write("<section class=\"pricing\" id=\"pricing\"> </section>\r\n");
      out.write("<!-- //pricing -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- testimonials -->\r\n");
      out.write("<div class=\"testimonials py-5\" id=\"testimonials\"> </div>\r\n");
      out.write("<!-- //testimonials -->\t\r\n");
      out.write("\r\n");
      out.write("<!-- stats -->\r\n");
      out.write("<section class=\"stats\" id=\"stats\"> </section>\r\n");
      out.write("<!-- //stats -->\r\n");
      out.write("\r\n");
      out.write("<!-- team --><!-- //team -->\r\n");
      out.write("\r\n");
      out.write("<!-- contact -->\r\n");
      out.write("<div class=\"contact py-5\" id=\"contact\">\r\n");
      out.write("\t<div class=\"container py-3\">\r\n");
      out.write("\t\t<div class=\"head_part\">\r\n");
      out.write("\t\t  <h3 class=\"heading\">注册账户：</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row agile-contact-form\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 contact-form-left\">\r\n");
      out.write("\t\t\t\t<iframe src=\"\" class=\"map\" allowfullscreen=\"\"></iframe>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6 mt-md-0 mt-5 contact-form-right\">\r\n");
      out.write("\t\t\t\t<div class=\"agileinfo-contact-form-grid\">\r\n");
      out.write("\t\t\t\t\t<form action=\"http://localhost:8080/First/login/chenggong.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"学号\" placeholder=\"学号\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"Subject\" placeholder=\"密码\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"Email\" placeholder=\"姓名\" required=\"\">\r\n");
      out.write("<button class=\"btn1\">注册</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //contact -->\r\n");
      out.write("\r\n");
      out.write("<!-- footer --><!-- footer -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Vertically centered Modal -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"exampleModalCenter\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\r\n");
      out.write("\t  <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t  <div class=\"modal-header\">\r\n");
      out.write("\t\t    <h5 class=\"modal-title text-capitalize text-center\" id=\"exampleModalLongTitle\"> 图书管理系统 </h5>\r\n");
      out.write("\t\t    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("\t\t\t  <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"modal-body\">\r\n");
      out.write("\t\t\t<img src=\"images/banner1.jpg\" class=\"img-fluid mb-3\" alt=\"Modal Image\" />\r\n");
      out.write("\t\t\t为了更加方便地管理和借阅图书，我们制作了图书管理系统。\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-primary\">关闭</button>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //Vertically centered Modal -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- js -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-2.1.4.min2.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/bootstrap2.js\"></script> <!-- Necessary-JavaScript-File-For-Bootstrap --> \r\n");
      out.write("\t<!-- //js -->\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- banner-type-text -->\r\n");
      out.write("\t\t<script src=\"js/typed2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$(function(){\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#typed\").typed({\r\n");
      out.write("\t\t\t\t\t// strings: [\"Typed.js is a <strong>jQuery</strong> plugin.\", \"It <em>types</em> out sentences.\", \"And then deletes them.\", \"Try it out!\"],\r\n");
      out.write("\t\t\t\t\tstringsElement: $('#typed-strings'),\r\n");
      out.write("\t\t\t\t\ttypeSpeed: 30,\r\n");
      out.write("\t\t\t\t\tbackDelay: 500,\r\n");
      out.write("\t\t\t\t\tloop: false,\r\n");
      out.write("\t\t\t\t\tcontentType: 'html', // or text\r\n");
      out.write("\t\t\t\t\t// defaults to false for infinite loop\r\n");
      out.write("\t\t\t\t\tloopCount: false,\r\n");
      out.write("\t\t\t\t\tcallback: function(){ foo(); },\r\n");
      out.write("\t\t\t\t\tresetCallback: function() { newTyped(); }\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\".reset\").click(function(){\r\n");
      out.write("\t\t\t\t\t$(\"#typed\").typed('reset');\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction newTyped(){ /* A new typed object */ }\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction foo(){ console.log(\"Callback\"); }\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t<!-- //banner-type-text -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Stats-Number-Scroller-Animation-JavaScript -->\r\n");
      out.write("\t<script src=\"js/waypoints.min2.js\"></script> \r\n");
      out.write("\t<script src=\"js/counterup.min2.js\"></script> \r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tjQuery(document).ready(function( $ ) {\r\n");
      out.write("\t\t\t$('.counter').counterUp({\r\n");
      out.write("\t\t\t\tdelay: 10,\r\n");
      out.write("\t\t\t\ttime: 1000 \r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- //Stats-Number-Scroller-Animation-JavaScript -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- flexslider --><!-- for testimonials -->\r\n");
      out.write("\t<script defer src=\"js/jquery.flexslider2.js\"></script>\r\n");
      out.write("\t<!--Start-slider-script-->\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(window).load(function(){\r\n");
      out.write("\t\t  $('.flexslider').flexslider({\r\n");
      out.write("\t\t\tanimation: \"slide\",\r\n");
      out.write("\t\t\tstart: function(slider){\r\n");
      out.write("\t\t\t  $('body').removeClass('loading');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t\t});\r\n");
      out.write("\t  </script>\r\n");
      out.write("\t<!--End-slider-script-->\r\n");
      out.write("\t<!-- //flexslider --><!-- //for testimonials -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- start-smoth-scrolling -->\r\n");
      out.write("\t<script src=\"js/SmoothScroll.min2.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/move-top2.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/easing2.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- here stars scrolling icon -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t/*\r\n");
      out.write("\t\t\t\tvar defaults = {\r\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\r\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\r\n");
      out.write("\t\t\t\teasingType: 'linear' \r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- //here ends scrolling icon -->\r\n");
      out.write("\t<!-- start-smoth-scrolling -->\r\n");
      out.write("\r\n");
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
