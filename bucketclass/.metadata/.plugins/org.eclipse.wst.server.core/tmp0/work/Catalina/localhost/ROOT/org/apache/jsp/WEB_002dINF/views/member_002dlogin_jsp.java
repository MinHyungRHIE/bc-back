/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-08-30 10:20:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("    <!-- Basic Page Needs -->\r\n");
      out.write("    <title>BucketClass</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/main-color.css\" id=\"colors\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"/img/favicon-32x32.png\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Wrapper -->\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Header Container -->\r\n");
      out.write("    <header id=\"header-container\">\r\n");
      out.write("        <!-- Header -->\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Left Side Content -->\r\n");
      out.write("                <div class=\"left-side\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Logo -->\r\n");
      out.write("                    <div id=\"logo\">\r\n");
      out.write("                        <a href=\"/\"><img src=\"/img/logo.png\" alt=\"\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                    <!-- Main Navigation / End -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Left Side Content / End -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Right Side Content / End -->\r\n");
      out.write("                <div class=\"right-side\">\r\n");
      out.write("                    <div class=\"header-widget\">\r\n");
      out.write("                        <a href=\"/signup\" class=\"sign-in\">회원가입</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Right Side Content / End -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Header / End -->\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .notify {\r\n");
      out.write("            font-family: \"HelveticaNeue\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;\r\n");
      out.write("            font-size: 10px !important;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <!-- container -->\r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("        <!-- Sign In -->\r\n");
      out.write("        <div id=\"sign-in-dialog\" class=\"zoom-anim-dialog\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"small-dialog-header\" align=\"center\">\r\n");
      out.write("                <h3>BucketClass</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--Tabs -->\r\n");
      out.write("            <div class=\"sign-in-form style-1\">\r\n");
      out.write("                <div class=\"tabs-container alt\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- class=\"category-box-content\" -->\r\n");
      out.write("                    <div class=\"tab-content\" id=\"tab1\" style=\"display: none;\">\r\n");
      out.write("                        <form method=\"post\" class=\"login\" action=\"/login\" id=\"myForm\" name=\"myForm\">\r\n");
      out.write("                            <p class=\"form-row form-row-wide\">\r\n");
      out.write("                                <label for=\"username\">아이디:\r\n");
      out.write("                                    <i class=\"im im-icon-Male\"></i>\r\n");
      out.write("                                    <input type=\"text\" class=\"input-text\" name=\"username\" id=\"username\" onkeyup=\"loginValidation(this.value, this.id)\"/>\r\n");
      out.write("                                </label>\r\n");
      out.write("                                <label id=\"id-notify\" class=\"notify\"></label>\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                            <p class=\"form-row form-row-wide\">\r\n");
      out.write("                                <label for=\"password\">비밀번호:\r\n");
      out.write("                                    <i class=\"im im-icon-Lock-2\"></i>\r\n");
      out.write("                                    <input type=\"password\" class=\"input-text\" name=\"password\" id=\"password\" onkeyup=\"loginValidation(this.value, this.id)\"/>\r\n");
      out.write("                                </label>\r\n");
      out.write("                                <label id=\"pw-notify\" class=\"notify\"></label>\r\n");
      out.write("                                <span class=\"lost_password\" class=\"notify\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">비밀번호를 잊으셨나요?</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-row\">\r\n");
      out.write("                                <input type=\"submit\" class=\"button border margin-top-5\" name=\"login\" id=\"loginInputCheck\" value=\"로그인\"/>\r\n");
      out.write("                                <div class=\"checkboxes margin-top-10\">\r\n");
      out.write("                                    <input id=\"remember-me\" type=\"checkbox\" name=\"check\">\r\n");
      out.write("                                    <label for=\"remember-me\">로그인 상태 유지</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Sign In Popup / End -->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"footer\" class=\"sticky-footer\">\r\n");
      out.write("        <!-- Main -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-5 col-sm-6\">\r\n");
      out.write("                    <img class=\"footer-logo\" src=\"/img/logo.png\" alt=\"\">\r\n");
      out.write("                    <br><br>\r\n");
      out.write("                    <p>Morbi convallis bibendum urna ut viverra. Maecenas quis consequat libero, a feugiat eros. Nunc ut\r\n");
      out.write("                        lacinia tortor morbi ultricies laoreet ullamcorper phasellus semper.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4 col-sm-6 \">\r\n");
      out.write("                    <h4>Helpful Links</h4>\r\n");
      out.write("                    <ul class=\"footer-links\">\r\n");
      out.write("                        <li><a href=\"#\">Login</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Sign Up</a></li>\r\n");
      out.write("                        <li><a href=\"#\">My Account</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Add Listing</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Pricing</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"footer-links\">\r\n");
      out.write("                        <li><a href=\"#\">FAQ</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Blog</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Our Partners</a></li>\r\n");
      out.write("                        <li><a href=\"#\">How It Works</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3  col-sm-12\">\r\n");
      out.write("                    <h4>Contact Us</h4>\r\n");
      out.write("                    <div class=\"text-widget\">\r\n");
      out.write("                        <span>12345 Little Lonsdale St, Melbourne</span> <br>\r\n");
      out.write("                        Phone: <span>(123) 123-456 </span><br>\r\n");
      out.write("                        E-Mail:<span> <a href=\"#\">office@example.com</a> </span><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"social-icons margin-top-20\">\r\n");
      out.write("                        <li><a class=\"facebook\" href=\"#\"><i class=\"icon-facebook\"></i></a></li>\r\n");
      out.write("                        <li><a class=\"twitter\" href=\"#\"><i class=\"icon-twitter\"></i></a></li>\r\n");
      out.write("                        <li><a class=\"gplus\" href=\"#\"><i class=\"icon-gplus\"></i></a></li>\r\n");
      out.write("                        <li><a class=\"vimeo\" href=\"#\"><i class=\"icon-vimeo\"></i></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Copyright -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"copyrights\">© 2019 Listeo. All Rights Reserved.</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Footer / End -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Wrapper / End -->\r\n");
      out.write("\r\n");
      out.write("<!-- Scripts -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/login-validation.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-2.2.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/mmenu.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/chosen.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/slick.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/rangeslider.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/magnific-popup.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/waypoints.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/counterup.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/tooltips.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/apis.js\"></script>\r\n");
      out.write("<!-- Style Switcher -->\r\n");
      out.write("<script src=\"/js/switcher.js\"></script>\r\n");
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
