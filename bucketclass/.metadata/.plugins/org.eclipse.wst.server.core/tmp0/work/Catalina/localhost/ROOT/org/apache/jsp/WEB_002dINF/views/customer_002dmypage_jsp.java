/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-08-28 08:37:12 UTC
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- Basic Page Needs\r\n");
      out.write("================================================== -->\r\n");
      out.write("<title>BucketClass-User-profile</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS\r\n");
      out.write("================================================== -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/main-color.css\" id=\"colors\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"../img/favicon-32x32.png\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Wrapper -->\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("<!-- Header Containerd\r\n");
      out.write("================================================== -->\r\n");
      out.write("<header id=\"header-container\" class=\"fixed fullwidth dashboard\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Header -->\r\n");
      out.write("\t<div id=\"header\" class=\"not-sticky\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Left Side Content -->\r\n");
      out.write("\t\t\t<div class=\"left-side\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Logo -->\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("<!--\t\t\t\t\t<a href=\"index.html\"><img src=\"../img/logo.png\" alt=\"\"></a>-->\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\" class=\"dashboard-logo\"><img onclick=\"javascript:location.href='http://메인페이지';\" src=\"../img/logo.png\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Mobile Navigation -->\r\n");
      out.write("\t\t\t\t<div class=\"mmenu-trigger\">\r\n");
      out.write("\t\t\t\t\t<button class=\"hamburger hamburger--collapse\" type=\"button\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"hamburger-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"hamburger-inner\"></span>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Main Navigation -->\r\n");
      out.write("\t\t\t\t<nav id=\"navigation\" class=\"style-1\">\r\n");
      out.write("\t\t\t\t\t<ul id=\"responsive\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Home</a>\r\n");
      out.write("<!--\t\t\t\t\t\t\t<ul>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"index.html\">Home 1</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"index-2-airbnb.html\">Home 2 (Airbnb)</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"index-3.html\">Home 3</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"index-4.html\">Home 4</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"index-5.html\">Home 5</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"index-6.html\">Home 6</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t</ul>-->\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Listings</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">List Layout</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-list-with-sidebar.html\">With Sidebar</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-list-full-width.html\">Full Width</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-list-full-width-with-map.html\">Full Width + Map</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Grid Layout</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-grid-with-sidebar-1.html\">With Sidebar 1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-grid-with-sidebar-2.html\">With Sidebar 2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-grid-full-width.html\">Full Width</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-grid-full-width-with-map.html\">Full Width + Map</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Half Screen Map</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-half-screen-map-list.html\">List Layout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-half-screen-map-grid-1.html\">Grid Layout 1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-half-screen-map-grid-2.html\">Grid Layout 2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Single Listings</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-single-page.html\">Single Listing 1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-single-page-2.html\">Single Listing 2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"listings-single-page-3.html\">Single Listing 3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"current\" href=\"#\">User Panel</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard.html\">Dashboard</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-messages.html\">Messages</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-bookings.html\">Bookings</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-wallet.html\">Wallet</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-my-listings.html\">My Listings</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-reviews.html\">Reviews</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"dashboard-bookmarks.html\">Bookmarks</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <li><a href=\"dashboard-add-listing.html\">Add Listing</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"provider-mypage.html\">마이페이지</a></li>\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"dashboard-invoice.html\">Invoice</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("<!--\t\t\t\t\t\t<li><a href=\"#\">Pages</a>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t<div class=\"mega-menu mobile-styles three-columns\">-->\r\n");
      out.write("\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t<div class=\"mega-menu-section\">-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t<ul>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t\t<li class=\"mega-menu-headline\">Pages #1</li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-user-profile.html\"><i class=\"sl sl-icon-user\"></i> User Profile</a></li>-->\r\n");
      out.write("<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-booking.html\"><i class=\"sl sl-icon-check\"></i> Booking Page</a></li>&ndash;&gt;-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t\t&lt;!&ndash; <li><a href=\"pages-add-listing.html\"><i class=\"sl sl-icon-plus\"></i> Add Listing</a></li> &ndash;&gt;-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-blog.html\"><i class=\"sl sl-icon-docs\"></i> Blog</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t</ul>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("<!--\t\t-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t<div class=\"mega-menu-section\">-->\r\n");
      out.write("<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t<ul>&ndash;&gt;-->\r\n");
      out.write("<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li class=\"mega-menu-headline\">Pages #2</li>&ndash;&gt;-->\r\n");
      out.write("<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-contact.html\"><i class=\"sl sl-icon-envelope-open\"></i> Contact</a></li>&ndash;&gt;-->\r\n");
      out.write("<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-coming-soon.html\"><i class=\"sl sl-icon-hourglass\"></i> Coming Soon</a></li>&ndash;&gt;-->\r\n");
      out.write("<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-404.html\"><i class=\"sl sl-icon-close\"></i> 404 Page</a></li>&ndash;&gt;-->\r\n");
      out.write("<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-masonry-filtering.html\"><i class=\"sl sl-icon-equalizer\"></i> Masonry Filtering</a></li>&ndash;&gt;-->\r\n");
      out.write("<!--&lt;!&ndash;\t\t\t\t\t\t\t\t\t\t</ul>&ndash;&gt;-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t<div class=\"mega-menu-section\">-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t<ul>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t\t<li class=\"mega-menu-headline\">Other</li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-elements.html\"><i class=\"sl sl-icon-settings\"></i> Elements</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-pricing-tables.html\"><i class=\"sl sl-icon-tag\"></i> Pricing Tables</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-typography.html\"><i class=\"sl sl-icon-pencil\"></i> Typography</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pages-icons.html\"><i class=\"sl sl-icon-diamond\"></i> Icons</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t\t</ul>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t</div>-->\r\n");
      out.write("<!--\t\t\t\t\t\t</li>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t<!-- Main Navigation / End -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Left Side Content / End -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Right Side Content / End -->\r\n");
      out.write("\t\t\t<div class=\"right-side\">\r\n");
      out.write("\t\t\t\t<!-- Header Widget -->\r\n");
      out.write("\t\t\t\t<div class=\"header-widget\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- User Menu -->\r\n");
      out.write("\t\t\t\t\t<div class=\"user-menu\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"user-name\"><span><img id= \"member_img\" alt=\"\" /></span>Hi! </div>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"dashboard.html\"><i class=\"sl sl-icon-settings\"></i> Dashboard</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"dashboard-bookmarks.html\"><i class=\"sl sl-icon-heart\"></i> Bookmarks</a></li>\r\n");
      out.write("<!--\t\t\t\t\t\t\t<li><a href=\"dashboard-messages.html\"><i class=\"sl sl-icon-envelope-open\"></i> Messages</a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t<li><a href=\"dashboard-bookings.html\"><i class=\"fa fa-calendar-check-o\"></i> Bookings</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.html\"><i class=\"sl sl-icon-power\"></i> Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- <a href=\"dashboard-add-listing.html\" class=\"button border with-icon\">Add Listing <i class=\"sl sl-icon-plus\"></i></a> -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Header Widget / End -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Right Side Content / End -->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Header / End -->\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"clearfix\"></div>\r\n");
      out.write("<!-- Header Container / End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Dashboard -->\r\n");
      out.write("<div id=\"dashboard\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Navigation\r\n");
      out.write("\t================================================== -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Responsive Navigation Trigger -->\r\n");
      out.write("\t<a href=\"#\" class=\"dashboard-responsive-nav-trigger\"><i class=\"fa fa-reorder\"></i> Dashboard Navigation</a>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"dashboard-nav\">\r\n");
      out.write("\t\t<div class=\"dashboard-nav-inner\">\r\n");
      out.write("\r\n");
      out.write("<!--\t\t\t<ul data-submenu-title=\"Main\">-->\r\n");
      out.write("<!--\t\t\t\t<li><a href=\"dashboard.html\"><i class=\"sl sl-icon-settings\"></i> Dashboard</a></li>-->\r\n");
      out.write("<!--\t\t\t\t<li><a href=\"dashboard-messages.html\"><i class=\"sl sl-icon-envelope-open\"></i> Messages <span class=\"nav-tag messages\">2</span></a></li>-->\r\n");
      out.write("<!--\t\t\t\t<li><a href=\"dashboard-bookings.html\"><i class=\"fa fa-calendar-check-o\"></i> Bookings</a></li>-->\r\n");
      out.write("<!--\t\t\t\t<li><a href=\"dashboard-wallet.html\"><i class=\"sl sl-icon-wallet\"></i> Wallet</a></li>-->\r\n");
      out.write("<!--\t\t\t</ul>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul data-submenu-title=\"Listings\">\r\n");
      out.write("<!--\t\t\t\t<li><a><i class=\"sl sl-icon-layers\"></i> My Listings</a>-->\r\n");
      out.write("<!--\t\t\t\t\t<ul>-->\r\n");
      out.write("<!--\t\t\t\t\t\t<li><a href=\"dashboard-my-listings.html\">Active <span class=\"nav-tag green\">6</span></a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t<li><a href=\"dashboard-my-listings.html\">Pending <span class=\"nav-tag yellow\">1</span></a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t\t<li><a href=\"dashboard-my-listings.html\">Expired <span class=\"nav-tag red\">2</span></a></li>-->\r\n");
      out.write("<!--\t\t\t\t\t</ul>\t-->\r\n");
      out.write("<!--\t\t\t\t</li>-->\r\n");
      out.write("<!--\t\t\t\t<li><a href=\"dashboard-reviews.html\"><i class=\"sl sl-icon-star\"></i> Reviews</a></li>-->\r\n");
      out.write("\t\t\t\t<li><a id=\"sideBarBookmarks\"><i class=\"sl sl-icon-heart\"></i> Bookmarks</a></li>\r\n");
      out.write("\t\t\t\t<!-- <li><a href=\"dashboard-add-listing.html\"><i class=\"sl sl-icon-plus\"></i> Add Listing</a></li> -->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul data-submenu-title=\"\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a id=\"sideBarMyPage\"><i class=\"sl sl-icon-user\"></i> 마이페이지</a></li>\r\n");
      out.write("\t\t\t\t<li><a id=\"sideBarLogout\"><i class=\"sl sl-icon-power\"></i> Logout</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Navigation / End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Content\r\n");
      out.write("\t================================================== -->\r\n");
      out.write("\t<div class=\"dashboard-content\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Titlebar -->\r\n");
      out.write("\t\t<div id=\"titlebar\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<h2>마이페이지</h2>\r\n");
      out.write("\t\t\t\t\t<!-- Breadcrumbs -->\r\n");
      out.write("\t\t\t\t\t<nav id=\"breadcrumbs\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Dashboard</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>마이페이지</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Profile -->\r\n");
      out.write("\t\t\t<div class=\"col-lg-6 col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"dashboard-list-box margin-top-0\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"gray\">마이페이지 변경</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-fs-6\" align=\"\" style=\"color:#c8c8c8; font-size:0.8em\">가입일 : <span id=\"member_join_date\" style=\"color:#c8c8c8\"></span></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dashboard-list-box-static\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Avatar -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"edit-profile-photo\">\r\n");
      out.write("\t\t\t\t\t\t\t<span> <img id=\"member_img1\" alt=\"\" > </span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"change-photo-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"photoUpload\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    <span><i class=\"fa fa-upload\"></i> 사진 업로드</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t    <input type=\"file\" class=\"upload\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 프로필 세부사항 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"my-profile\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<label>닉네임</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member_nickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" id=\"member_nickname\" placeholder=\"닉네임을 입력하세요\" value=\"\" onKeyUp=\"nickValidity(this.value)\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label id = \"checknick\" class=\"check\"></label>\r\n");
      out.write("\r\n");
      out.write("<!--\t\t\t\t\t\t\t<label> 전화번호</label>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t<input type=\"text\" name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userphonenum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" id=\"userphonenum\" style=\"DISPLAY: none\" placeholder=\"전화번호를 입력하세요\" />-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<label>E-mail</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member_email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" id=\"member_email\" placeholder=\"E-Mail 을 입력하세요\" onKeyUp=\"emailValidity(this.value)\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label id = \"checkemail\" class=\"check\" ></label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<label>자기소개</label>\r\n");
      out.write("\t\t\t\t\t\t\t<textarea name=\"introduce\" id=\"introduce\" cols=\"30\" rows=\"10\" onKeyUp=\"checkByte(this.form, 500)\"></textarea>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"data_count\" style=\"font-size: smaller\"><em id=\"introbyte\">0</em>/250 글자</p>\r\n");
      out.write("\r\n");
      out.write("<!--\t\t\t\t\t\t\t<textarea name=\"notes\"  cols=\"30\" rows=\"10\" >-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t\t자기소개 입력란 입니다-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t</textarea>-->\r\n");
      out.write("\r\n");
      out.write("<!--\t\t\t\t\t\t\t<label><i class=\"fa fa-twitter\"></i> Twitter</label>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t<input placeholder=\"https://www.twitter.com/\" type=\"text\">-->\r\n");
      out.write("\r\n");
      out.write("<!--\t\t\t\t\t\t\t<label><i class=\"fa fa-facebook-square\"></i> Facebook</label>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t<input placeholder=\"https://www.facebook.com/\" type=\"text\">-->\r\n");
      out.write("\r\n");
      out.write("<!--\t\t\t\t\t\t\t<label><i class=\"fa fa-google-plus\"></i> Google+</label>-->\r\n");
      out.write("<!--\t\t\t\t\t\t\t<input placeholder=\"https://www.google.com/\" type=\"text\">-->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button id='buttonProfile' class='button margin-top-15'>마이페이지 수정</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Change Password -->\r\n");
      out.write("\t\t\t<div class=\"col-lg-6 col-md-12\">\r\n");
      out.write("\t\t\t\t<div class=\"dashboard-list-box margin-top-0\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"gray\">비밀번호 변경</h4>\r\n");
      out.write("\t\t\t\t\t<div class=\"dashboard-list-box-static\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Change Password -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"my-profile\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"margin-top-0\">현재 비밀번호</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member_Password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" id=\"member_Password\" placeholder=\"현재 비밀번호 입력\"  />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<label>새 비밀번호</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${newpassword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" id=\"newpassword\" placeholder=\"새 비밀번호 입력\" value=\"\" onkeyup=\"newPwValidity(this.value)\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label id=\"new-pw-notify\"></label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<label>새 비밀번호 확인</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${confirmpassword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" id=\"confirmpassword\" placeholder=\"새 비밀번호 확인\" value=\"\" onkeyup=\"confirmPwValidity(this.value)\" />\r\n");
      out.write("\t\t\t\t\t\t\t<label id=\"confirm-pw-notify\"></label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<button id='buttonPassword' class=\"button margin-top-15\">비밀번호 변경</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Copyrights -->\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<div class=\"copyrights\">© 2019 Listeo. All Rights Reserved.</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Content / End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Dashboard / End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Wrapper / End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Scripts ====================================================================== -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-2.2.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/mmenu.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/chosen.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/slick.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/rangeslider.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/magnific-popup.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/waypoints.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/counterup.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/tooltips.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/custom.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/customer-profile.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/apis.js\"></script>\r\n");
      out.write("<!-- =============================================================================== -->\r\n");
      out.write("\r\n");
      out.write("<!--<script src=\"/js/apis.js\"></script>-->\r\n");
      out.write("<script type=\"text/javascript\" charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\tvar callpassword;\r\n");
      out.write("\t// =============== Loading & Parsing JSON ==================\r\n");
      out.write("\tvar mock = true;\r\n");
      out.write("\t$(document).ready(function () {\r\n");
      out.write("\t\tif (mock) {\r\n");
      out.write("\t\t\tstartXhr();\r\n");
      out.write("\t\t\t//startXhr2();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tApis.getRequest('/list');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tvar xhr;\r\n");
      out.write("\r\n");
      out.write("\tfunction startXhr() {\r\n");
      out.write("\t\txhr = new XMLHttpRequest();\r\n");
      out.write("\t\txhr.open(\"GET\", \"../data/member_provider.json\");\r\n");
      out.write("\t\txhr.send();\r\n");
      out.write("\t\txhr.onreadystatechange = function () {\r\n");
      out.write("\t\t\tif (xhr.readyState == 4) {\r\n");
      out.write("\t\t\t\tif (xhr.status == 200) {\r\n");
      out.write("\t\t\t\t\tconsole.log(\"데이터 불러오기 성공\");\r\n");
      out.write("\t\t\t\t\tserializeData();\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tconsole.log(\"데이터 불러오기 실패\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\tfunction serializeData() {\r\n");
      out.write("\t\t// var response = xhr.responseText;\r\n");
      out.write("\t\t// for(var i=0; i<response.length; i++){\r\n");
      out.write("\t\t//     for (var j=0; j<response[i].length; j++){\r\n");
      out.write("\t\t//         if(typeof response[i][j] ){\r\n");
      out.write("\t\t//         }\r\n");
      out.write("\t\t//     }\r\n");
      out.write("\t\t// }\r\n");
      out.write("\t\tvar profileData = JSON.parse(xhr.responseText);\r\n");
      out.write("\r\n");
      out.write("\t\tshowServiceItem(profileData);\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t// =============== Loading & Parsing JSON / END ==================\r\n");
      out.write("\t// ==================== Tag & Value Mapping =======================\r\n");
      out.write("\tvar member_id;\r\n");
      out.write("\r\n");
      out.write("\tfunction showServiceItem(profileData) {\r\n");
      out.write("\t\tconsole.log(profileData);\r\n");
      out.write("\r\n");
      out.write("\t\tif (mock) {\r\n");
      out.write("\t\t\tmember_id = 0;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tserviceNo = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${service-id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tinsertValue('member_nickname', profileData[member_id].member_nickname);\r\n");
      out.write("\t\tinsertValue('member_email', profileData[member_id].member_email);\r\n");
      out.write("\t\t//insertValue('career', profileData[member_id].career);\r\n");
      out.write("\t\t//insertValue('certi', profileData[member_id].certi);\r\n");
      out.write("\t\tinsertValue('introduce', profileData[member_id].introduce);\r\n");
      out.write("\r\n");
      out.write("\t\tinsertText('member_join_date', profileData[member_id].member_join_date);\r\n");
      out.write("\r\n");
      out.write("\t\tinsertProfileImgResource('member_img', profileData[member_id].member_img);\r\n");
      out.write("\r\n");
      out.write("\t\tcallPW(profileData[member_id].member_password);\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t// 1) 단일 값 맵핑\r\n");
      out.write("\tfunction insertValue(tag, column) {\r\n");
      out.write("\t\tif (column == null) {\r\n");
      out.write("\t\t\tdocument.getElementById(tag).setAttribute('placeholder', '입력하세요');\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tdocument.getElementById(tag).setAttribute('value', column);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\tfunction insertText(tag, column) {\r\n");
      out.write("\t\tdocument.getElementById(tag).appendChild(document.createTextNode(column));\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t// 2) 프로필 이미지 소스 맵핑 //로직 다시 짜보기(ClassName :콜랙션으로 됨)\r\n");
      out.write("\tfunction insertProfileImgResource(tag, column) {\r\n");
      out.write("\r\n");
      out.write("\t\t//document.getElementsByClassName(tag).setAttribute('src', column);\r\n");
      out.write("\t\tdocument.getElementById(tag).setAttribute('src', column);\r\n");
      out.write("\t\tvar id2 = (tag + \"1\");\r\n");
      out.write("\t\tdocument.getElementById(id2).setAttribute('src', column);\r\n");
      out.write("\t\t// const imgTag = document.getElementById(tag);\r\n");
      out.write("\t\t// const imgItem = document.createElement('img');\r\n");
      out.write("\t\t// imgItem.setAttribute('src', column);\r\n");
      out.write("\t\t// imgTag.appendChild(imgItem);\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t// // 3) 비밀번호 값 불러오기\r\n");
      out.write("\tfunction callPW(column) {\r\n");
      out.write("\t\tcallpassword = column;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\treturn callpassword;\r\n");
      out.write("\t}\r\n");
      out.write("\t// ==================== Tag & Data Mapping / END =======================\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t//===================== SideBar Button Mapping Function====================\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
