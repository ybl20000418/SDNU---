/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2019-12-13 12:35:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Firstpagejump;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guize_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>借阅规则</title>\r\n");
      out.write("<!-- Meta tag Keywords -->\r\n");
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
      out.write("<body>\r\n");
      out.write("\r\n");
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
