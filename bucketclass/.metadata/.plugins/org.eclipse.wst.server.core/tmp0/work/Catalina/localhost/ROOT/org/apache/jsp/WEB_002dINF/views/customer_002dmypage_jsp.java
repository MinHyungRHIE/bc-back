/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-08-31 08:29:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_002dmypage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Basic Page Needs\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("\t<title>BucketClass-User-profile</title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- CSS\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/css/style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/css/main-color.css\" id=\"colors\">\r\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"/img/favicon-32x32.png\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Wrapper -->\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Header Containerd\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("\t<header id=\"header-container\" class=\"fixed fullwidth dashboard\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Header -->\r\n");
      out.write("\t\t<div id=\"header\" class=\"not-sticky\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Left Side Content -->\r\n");
      out.write("\t\t\t\t<div class=\"left-side\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Logo -->\r\n");
      out.write("\t\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<!--\t\t\t\t\t<a href=\"index.html\"><img src=\"/img/logo.png\" alt=\"\"></a>-->\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/\" class=\"dashboard-logo\"><img src=\"/img/logo.png\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Mobile Navigation -->\r\n");
      out.write("\t\t\t\t\t<div class=\"mmenu-trigger\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"hamburger hamburger--collapse\" type=\"button\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"hamburger-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"hamburger-inner\"></span>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Main Navigation -->\r\n");
      out.write("\t\t\t\t\t<nav id=\"navigation\" class=\"style-1\">\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"responsive\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t<ul>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"index.html\">Home 1</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"index-2-airbnb.html\">Home 2 (Airbnb)</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"index-3.html\">Home 3</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"index-4.html\">Home 4</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"index-5.html\">Home 5</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"index-6.html\">Home 6</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t</ul>-->\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Listings</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">List Layout</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-list-with-sidebar.html\">With Sidebar</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-list-full-width.html\">Full Width</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-list-full-width-with-map.html\">Full Width + Map</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Grid Layout</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-grid-with-sidebar-1.html\">With Sidebar 1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-grid-with-sidebar-2.html\">With Sidebar 2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-grid-full-width.html\">Full Width</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-grid-full-width-with-map.html\">Full Width + Map</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Half Screen Map</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-half-screen-map-list.html\">List Layout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-half-screen-map-grid-1.html\">Grid Layout 1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-half-screen-map-grid-2.html\">Grid Layout 2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Single Listings</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-single-page.html\">Single Listing 1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-single-page-2.html\">Single Listing 2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-single-page-3.html\">Single Listing 3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"current\" href=\"#\">User Panel</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard.html\">Dashboard</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-messages.html\">Messages</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-bookings.html\">Bookings</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-wallet.html\">Wallet</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-my-listings.html\">My Listings</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-reviews.html\">Reviews</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"dashboard-bookmarks.html\">Bookmarks</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <li><a href=\"dashboard-add-listing.html\">Add Listing</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"provider-mypage.html\">마이페이지</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-invoice.html\">Invoice</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t<li><a href=\"#\">Pages</a>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t<div class=\"mega-menu mobile-styles three-columns\">-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t<div class=\"mega-menu-section\">-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t<ul>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t\t<li class=\"mega-menu-headline\">Pages #1</li>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-user-profile.html\"><i class=\"sl sl-icon-user\"></i> User Profile</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-booking.html\"><i class=\"sl sl-icon-check\"></i> Booking Page</a></li>&ndash;&gt;-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t\t&lt;!&ndash; <li><a href=\"pages-add-listing.html\"><i class=\"sl sl-icon-plus\"></i> Add Listing</a></li> &ndash;&gt;-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-blog.html\"><i class=\"sl sl-icon-docs\"></i> Blog</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t</ul>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t<div class=\"mega-menu-section\">-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t<ul>&ndash;&gt;-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li class=\"mega-menu-headline\">Pages #2</li>&ndash;&gt;-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-contact.html\"><i class=\"sl sl-icon-envelope-open\"></i> Contact</a></li>&ndash;&gt;-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-coming-soon.html\"><i class=\"sl sl-icon-hourglass\"></i> Coming Soon</a></li>&ndash;&gt;-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-404.html\"><i class=\"sl sl-icon-close\"></i> 404 Page</a></li>&ndash;&gt;-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-masonry-filtering.html\"><i class=\"sl sl-icon-equalizer\"></i> Masonry Filtering</a></li>&ndash;&gt;-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t</ul>&ndash;&gt;-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t<div class=\"mega-menu-section\">-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t<ul>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t\t<li class=\"mega-menu-headline\">Other</li>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-elements.html\"><i class=\"sl sl-icon-settings\"></i> Elements</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-pricing-tables.html\"><i class=\"sl sl-icon-tag\"></i> Pricing Tables</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-typography.html\"><i class=\"sl sl-icon-pencil\"></i> Typography</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-icons.html\"><i class=\"sl sl-icon-diamond\"></i> Icons</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t\t</ul>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t\t\t-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--\t\t\t\t\t\t</li>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t<!-- Main Navigation / End -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Left Side Content / End -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Right Side Content / End -->\r\n");
      out.write("\t\t\t\t<div class=\"right-side\">\r\n");
      out.write("\t\t\t\t\t<!-- Header Widget -->\r\n");
      out.write("\t\t\t\t\t<div class=\"header-widget\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- User Menu -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"user-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"user-name\"><span><img id= \"member_img\" alt=\"\" /></span>Hi! </div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"dashboard.html\"><i class=\"sl sl-icon-settings\"></i> Dashboard</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"dashboard-bookmarks.html\"><i class=\"sl sl-icon-heart\"></i> Bookmarks</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t<li><a href=\"dashboard-messages.html\"><i class=\"sl sl-icon-envelope-open\"></i> Messages</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t\t\t\t\t\t\t<li><a href=\"dashboard-bookings.html\"><i class=\"fa fa-calendar-check-o\"></i> Bookings</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/logout\"><i class=\"sl sl-icon-power\"></i> Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- <a href=\"dashboard-add-listing.html\" class=\"button border with-icon\">Add Listing <i class=\"sl sl-icon-plus\"></i></a> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- Header Widget / End -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Right Side Content / End -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Header / End -->\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t<!-- Header Container / End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Dashboard -->\r\n");
      out.write("\t<div id=\"dashboard\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Navigation\r\n");
      out.write("        ================================================== -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Responsive Navigation Trigger -->\r\n");
      out.write("\t\t<a href=\"#\" class=\"dashboard-responsive-nav-trigger\"><i class=\"fa fa-reorder\"></i> Dashboard Navigation</a>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"dashboard-nav\">\r\n");
      out.write("\t\t\t<div class=\"dashboard-nav-inner\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--\t\t\t<ul data-submenu-title=\"Main\">-->\r\n");
      out.write("\t\t\t\t<!--\t\t\t\t<li><a href=\"dashboard.html\"><i class=\"sl sl-icon-settings\"></i> Dashboard</a></li>-->\r\n");
      out.write("\t\t\t\t<!--\t\t\t\t<li><a href=\"dashboard-messages.html\"><i class=\"sl sl-icon-envelope-open\"></i> Messages <span class=\"nav-tag messages\">2</span></a></li>-->\r\n");
      out.write("\t\t\t\t<!--\t\t\t\t<li><a href=\"dashboard-bookings.html\"><i class=\"fa fa-calendar-check-o\"></i> Bookings</a></li>-->\r\n");
      out.write("\t\t\t\t<!--\t\t\t\t<li><a href=\"dashboard-wallet.html\"><i class=\"sl sl-icon-wallet\"></i> Wallet</a></li>-->\r\n");
      out.write("\t\t\t\t<!--\t\t\t</ul>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul data-submenu-title=\"Listings\">\r\n");
      out.write("\t\t\t\t\t<!--\t\t\t\t<li><a><i class=\"sl sl-icon-layers\"></i> My Listings</a>-->\r\n");
      out.write("\t\t\t\t\t<!--\t\t\t\t\t<ul>-->\r\n");
      out.write("\t\t\t\t\t<!--\t\t\t\t\t\t<li><a href=\"dashboard-my-listings.html\">Active <span class=\"nav-tag green\">6</span></a></li>-->\r\n");
      out.write("\t\t\t\t\t<!--\t\t\t\t\t\t<li><a href=\"dashboard-my-listings.html\">Pending <span class=\"nav-tag yellow\">1</span></a></li>-->\r\n");
      out.write("\t\t\t\t\t<!--\t\t\t\t\t\t<li><a href=\"dashboard-my-listings.html\">Expired <span class=\"nav-tag red\">2</span></a></li>-->\r\n");
      out.write("\t\t\t\t\t<!--\t\t\t\t\t</ul>\t-->\r\n");
      out.write("\t\t\t\t\t<!--\t\t\t\t</li>-->\r\n");
      out.write("\t\t\t\t\t<!--\t\t\t\t<li><a href=\"dashboard-reviews.html\"><i class=\"sl sl-icon-star\"></i> Reviews</a></li>-->\r\n");
      out.write("\t\t\t\t\t<li><a id=\"sideBarBookmarks\"><i class=\"sl sl-icon-heart\"></i> Bookmarks</a></li>\r\n");
      out.write("\t\t\t\t\t<!-- <li><a href=\"dashboard-add-listing.html\"><i class=\"sl sl-icon-plus\"></i> Add Listing</a></li> -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul data-submenu-title=\"\">\r\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a id=\"sideBarMyPage\"><i class=\"sl sl-icon-user\"></i> 마이페이지</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/logout\" id=\"sideBarLogout\"><i class=\"sl sl-icon-power\"></i> Logout</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Navigation / End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Content\r\n");
      out.write("        ================================================== -->\r\n");
      out.write("\t\t<div class=\"dashboard-content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Titlebar -->\r\n");
      out.write("\t\t\t<div id=\"titlebar\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t<h2>마이페이지</h2>\r\n");
      out.write("\t\t\t\t\t\t<!-- Breadcrumbs -->\r\n");
      out.write("\t\t\t\t\t\t<nav id=\"breadcrumbs\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Dashboard</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>마이페이지</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Profile -->\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"dashboard-list-box margin-top-0\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"gray\">마이페이지 변경</h4>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-fs-6\" align=\"\" style=\"color:#c8c8c8; font-size:0.8em\">가입일 : <span id=\"memberJoinDate\" style=\"color:#c8c8c8\"></span></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dashboard-list-box-static\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Avatar -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"edit-profile-photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span> <img id=\"member_img1\" alt=\"\" > </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"change-photo-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"photoUpload\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><i class=\"fa fa-upload\"></i> 사진 업로드</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"file\" class=\"upload\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 프로필 세부사항 -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"my-profile\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>닉네임</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"memberNickname\" id=\"memberNickname\" value=\"\" placeholder=\"닉네임을 입력하세요\" onKeyUp=\"nickValidity(this.value)\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<label id = \"checknick\" class=\"check\"></label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>E-mail</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" name=\"memberEmail\" id=\"memberEmail\" value=\"\" placeholder=\"E-Mail 을 입력하세요\" onKeyUp=\"emailValidity(this.value)\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<label id = \"checkemail\" class=\"check\" ></label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>자기소개</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea name=\"introduce\" id=\"introduce\" cols=\"30\" rows=\"10\" onKeyUp=\"checkByte(this.form, 500)\"><?=$introduce?></textarea>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"data_count\" style=\"font-size: smaller\"><em id=\"introbyte\">0</em>/250 글자</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<button id='buttonProfile' class='button margin-top-15'>마이페이지 수정</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Change Password -->\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"dashboard-list-box margin-top-0\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"gray\">비밀번호 변경</h4>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dashboard-list-box-static\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Change Password -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"my-profile\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"margin-top-0\">현재 비밀번호</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"memberPassword\" id=\"memberPassword\" value=\"\" placeholder=\"현재 비밀번호 입력\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t<label id=\"pw-notify\"></label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>새 비밀번호</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"newPassword\" id=\"newPassword\" value=\"\" placeholder=\"새 비밀번호 입력\" onkeyup=\"newPwValidity(this.value)\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<label id=\"new-pw-notify\"></label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>새 비밀번호 확인</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"checkPassword\" id=\"checkPassword\" value=\"\" placeholder=\"새 비밀번호 확인\" onkeyup=\"confirmPwValidity(this.value)\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<label id=\"confirm-pw-notify\"></label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id='buttonPassword' class=\"button margin-top-15\">비밀번호 변경</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Copyrights -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"copyrights\">© 2019 BucketClass. All Rights Reserved.</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Content / End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Dashboard / End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Wrapper / End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Scripts ====================================================================== -->\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"/js/customer-profile.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/apis.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"UTF-8\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
