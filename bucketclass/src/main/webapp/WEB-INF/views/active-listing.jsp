<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

    <!-- Basic Page Needs
    ================================================== -->
    <title>Listeo</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- CSS
    ================================================== -->
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/main-color.css" id="colors">


</head>

<body>

<!-- Wrapper -->
<div id="wrapper">

    <!-- Header Container
    ================================================== -->
    <header id="header-container" class="fixed fullwidth dashboard">

        <!-- Header -->
        <div id="header" class="not-sticky">
            <div class="container">

                <!-- Left Side Content -->
                <div class="left-side">

                    <!-- Logo -->
                    <div id="logo">
                        <a href="index.html"><img src="/img/logo.png" alt=""></a>
                        <a href="index.html" class="dashboard-logo"><img src="/img/logo2.png" alt=""></a>
                    </div>

                    <!-- Mobile Navigation -->
                    <div class="mmenu-trigger">
                        <button class="hamburger hamburger--collapse" type="button">
                  <span class="hamburger-box">
                     <span class="hamburger-inner"></span>
                  </span>
                        </button>
                    </div>

                    <!-- Main Navigation -->
                    <nav id="navigation" class="style-1">
                        <ul id="responsive">

                            <li><a href="#">Home</a>
                                <ul>
                                    <li><a href="index.html">Home 1</a></li>
                                    <li><a href="index-2-airbnb.html">Home 2 (Airbnb)</a></li>
                                    <li><a href="index-3.html">Home 3</a></li>
                                    <li><a href="index-4.html">Home 4</a></li>
                                    <li><a href="index-5.html">Home 5</a></li>
                                    <li><a href="index-6.html">Home 6</a></li>
                                </ul>
                            </li>

                            <li><a href="#">Listings</a>
                                <ul>
                                    <li><a href="#">List Layout</a>
                                        <ul>
                                            <li><a href="listings-list-with-sidebar.html">With Sidebar</a></li>
                                            <li><a href="listings-list-full-width.html">Full Width</a></li>
                                            <li><a href="listings-list-full-width-with-map.html">Full Width + Map</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Grid Layout</a>
                                        <ul>
                                            <li><a href="listings-grid-with-sidebar-1.html">With Sidebar 1</a></li>
                                            <li><a href="listings-grid-with-sidebar-2.html">With Sidebar 2</a></li>
                                            <li><a href="listings-grid-full-width.html">Full Width</a></li>
                                            <li><a href="listings-grid-full-width-with-map.html">Full Width + Map</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Half Screen Map</a>
                                        <ul>
                                            <li><a href="listings-half-screen-map-list.html">List Layout</a></li>
                                            <li><a href="listings-half-screen-map-grid-1.html">Grid Layout 1</a></li>
                                            <li><a href="listings-half-screen-map-grid-2.html">Grid Layout 2</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Single Listings</a>
                                        <ul>
                                            <li><a href="listings-single-page.html">Single Listing 1</a></li>
                                            <li><a href="listings-single-page-2.html">Single Listing 2</a></li>
                                            <li><a href="listings-single-page-3.html">Single Listing 3</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>

                            <li><a class="current" href="#">User Panel</a>
                                <ul>
                                    <li><a href="dashboard.html">Dashboard</a></li>
                                    <li><a href="dashboard-messages.html">Messages</a></li>
                                    <li><a href="dashboard-bookings.html">Bookings</a></li>
                                    <li><a href="dashboard-wallet.html">Wallet</a></li>
                                    <li><a href="dashboard-my-listings.html">My Listings</a></li>
                                    <li><a href="dashboard-reviews.html">Reviews</a></li>
                                    <li><a href="dashboard-bookmarks.html">Bookmarks</a></li>
                                    <li><a href="dashboard-add-listing.html">Add Listing</a></li>
                                    <li><a href="dashboard-my-profile.html">My Profile</a></li>
                                    <li><a href="dashboard-invoice.html">Invoice</a></li>
                                </ul>
                            </li>

                            <li><a href="#">Pages</a>
                                <div class="mega-menu mobile-styles three-columns">

                                    <div class="mega-menu-section">
                                        <ul>
                                            <li class="mega-menu-headline">Pages #1</li>
                                            <li><a href="pages-user-profile.html"><i class="sl sl-icon-user"></i> User Profile</a></li>
                                            <li><a href="pages-booking.html"><i class="sl sl-icon-check"></i> Booking Page</a></li>
                                            <li><a href="pages-add-listing.html"><i class="sl sl-icon-plus"></i> Add Listing</a></li>
                                            <li><a href="pages-blog.html"><i class="sl sl-icon-docs"></i> Blog</a></li>
                                        </ul>
                                    </div>

                                    <div class="mega-menu-section">
                                        <ul>
                                            <li class="mega-menu-headline">Pages #2</li>
                                            <li><a href="pages-contact.html"><i class="sl sl-icon-envelope-open"></i> Contact</a></li>
                                            <li><a href="pages-coming-soon.html"><i class="sl sl-icon-hourglass"></i> Coming Soon</a></li>
                                            <li><a href="pages-404.html"><i class="sl sl-icon-close"></i> 404 Page</a></li>
                                            <li><a href="pages-masonry-filtering.html"><i class="sl sl-icon-equalizer"></i> Masonry Filtering</a></li>
                                        </ul>
                                    </div>

                                    <div class="mega-menu-section">
                                        <ul>
                                            <li class="mega-menu-headline">Other</li>
                                            <li><a href="pages-elements.html"><i class="sl sl-icon-settings"></i> Elements</a></li>
                                            <li><a href="pages-pricing-tables.html"><i class="sl sl-icon-tag"></i> Pricing Tables</a></li>
                                            <li><a href="pages-typography.html"><i class="sl sl-icon-pencil"></i> Typography</a></li>
                                            <li><a href="pages-icons.html"><i class="sl sl-icon-diamond"></i> Icons</a></li>
                                        </ul>
                                    </div>

                                </div>
                            </li>

                        </ul>
                    </nav>
                    <div class="clearfix"></div>
                    <!-- Main Navigation / End -->

                </div>
                <!-- Left Side Content / End -->

                <!-- Right Side Content / End -->
                <div class="right-side">
                    <!-- Header Widget -->
                    <div class="header-widget">

                        <!-- User Menu -->
                        <div class="user-menu">
                            <div class="user-name"><span><img src="/img/dashboard-avatar.jpg" alt=""></span>Hi, Tom!</div>
                            <ul>
                                <li><a href="dashboard.html"><i class="sl sl-icon-settings"></i> Dashboard</a></li>
                                <li><a href="dashboard-messages.html"><i class="sl sl-icon-envelope-open"></i> Messages</a></li>
                                <li><a href="dashboard-bookings.html"><i class="fa fa-calendar-check-o"></i> Bookings</a></li>
                                <li><a href="index.html"><i class="sl sl-icon-power"></i> Logout</a></li>
                            </ul>
                        </div>

                        <a href="dashboard-add-listing.html" class="button border with-icon">Add Listing <i class="sl sl-icon-plus"></i></a>
                    </div>
                    <!-- Header Widget / End -->
                </div>
                <!-- Right Side Content / End -->

            </div>
        </div>
        <!-- Header / End -->

    </header>
    <div class="clearfix"></div>
    <!-- Header Container / End -->


    <!-- Dashboard -->
    <div id="dashboard">

        <!-- Navigation
        ================================================== -->

        <!-- Responsive Navigation Trigger -->
        <a href="#" class="dashboard-responsive-nav-trigger"><i class="fa fa-reorder"></i> Dashboard Navigation</a>

        <div class="dashboard-nav">
            <div class="dashboard-nav-inner">

                <ul data-submenu-title="Main">
                    <li><a href="dashboard.html"><i class="sl sl-icon-settings"></i> Dashboard</a></li>
                    <li><a href="dashboard-messages.html"><i class="sl sl-icon-envelope-open"></i> Messages <span class="nav-tag messages">2</span></a></li>
                    <li><a href="dashboard-bookings.html"><i class="fa fa-calendar-check-o"></i> Bookings</a></li>
                    <li><a href="dashboard-wallet.html"><i class="sl sl-icon-wallet"></i> Wallet</a></li>
                </ul>

                <ul data-submenu-title="Listings">
                    <li class="active"><a><i class="sl sl-icon-layers"></i> 나의 수업 관리</a>
                        <ul>
                            <li><a href="/provider/pending-listing">대기중 <span class="nav-tag green">6</span></a></li>
                            <li><a href="/provider/active-listing">진행중 <span class="nav-tag yellow">1</span></a></li>
                            <li><a href="/provider/expired-listing">완료 <span class="nav-tag red">2</span></a></li>
                        </ul>
                    </li>
                    <li><a href="dashboard-reviews.html"><i class="sl sl-icon-star"></i> Reviews</a></li>
                    <li><a href="dashboard-bookmarks.html"><i class="sl sl-icon-heart"></i> Bookmarks</a></li>
                    <li><a href="dashboard-add-listing.html"><i class="sl sl-icon-plus"></i> Add Listing</a></li>
                </ul>

                <ul data-submenu-title="Account">
                    <li><a href="dashboard-my-profile.html"><i class="sl sl-icon-user"></i> My Profile</a></li>
                    <li><a href="index.html"><i class="sl sl-icon-power"></i> Logout</a></li>
                </ul>

            </div>
        </div>


        <!-- Content
        ================================================== -->
        <div class="dashboard-content">

            <!-- Titlebar -->
            <div id="titlebar">
                <div class="row">
                    <div class="col-md-12">
                        <h2>나의 수업 관리</h2>
                        <!-- Breadcrumbs -->
                        <nav id="breadcrumbs">
                            <ul>
                                <li><a href="#">메인</a></li>
                                <li><a href="#">마이페이지</a></li>
                                <li>나의 수업 관리</li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>

            <div class="row">

                <!-- Listings -->
                <div class="col-lg-12 col-md-12">
                    <div class="dashboard-list-box margin-top-0">
                        <h4> 진행중인 수업 목록</h4>
                        <ul id="wrap-list">
                            ===============================================
                            =============== CREATE DOM AREA ===============
                            ===============================================
                        </ul>
                    </div>
                </div>

                <!-- Pagination -->
                <div class="clearfix"></div>
                <div class="row">
                    <div class="col-md-12">
                        <!-- Pagination -->
                        <div class="pagination-container margin-top-20 margin-bottom-40">
                            <nav class="pagination">
                                <ul id="pagination">
                                    <!--=====================================================-->
                                    <!-- ==============Pagination Context ================== -->
                                    <!--=====================================================-->
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
                <!-- Pagination / End -->


                <!-- Copyrights -->
                <div class="col-md-12">
                    <div class="copyrights">© 2019 Bucket Class. All Rights Reserved.</div>
                </div>
            </div>
        </div>
        <!-- Content / End -->
    </div>
    <!-- Dashboard / End -->
</div>
<!-- Wrapper / End -->


<!-- Scripts
================================================== -->
<script type="text/javascript" src="/js/jquery-2.2.0.min.js"></script>
<script type="text/javascript" src="/js/mmenu.min.js"></script>
<script type="text/javascript" src="/js/chosen.min.js"></script>
<script type="text/javascript" src="/js/slick.min.js"></script>
<script type="text/javascript" src="/js/rangeslider.min.js"></script>
<script type="text/javascript" src="/js/magnific-popup.min.js"></script>
<script type="text/javascript" src="/js/waypoints.min.js"></script>
<script type="text/javascript" src="/js/counterup.min.js"></script>
<script type="text/javascript" src="/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="/js/tooltips.min.js"></script>
<script type="text/javascript" src="/js/custom.js"></script>
<script type="text/javascript" src="/js/apis.js"></script>
<script>

    var mock = false;

    $(document).ready(function(){
        ajax();
    });

    function ajax() {
        if(mock) startXhr();
        else initFetch();
    }

    function initFetch() {
        const reqJson = new Object();
        reqJson.req = "화이팅 !!";
        Apis.postRequest("/provider/active-listing", reqJson).then(response => {
            console.log("여기에 들어왔니?");
            console.log(typeof response.items, response.items);
            resetPagination(response.page, response.size, response.totalCount);
            filterExpiredList(response.items);
        });
    }

    var xhr;
    function startXhr() {
        xhr = new XMLHttpRequest();
        xhr.open("GET", "/data/my-listing.json");
        xhr.send();
        xhr.onreadystatechange = function () {
            if(xhr.readyState == 4){
                if(xhr.status == 200){
                    console.log("데이터 불러오기 성공");
                    serializeData();
                } else {
                    console.log("데이터 불러오기 실패");
                }
            }
        }
    }

    function serializeData() {

        var serviceData = JSON.parse(xhr.responseText);
        filterExpiredList(serviceData.items);
        resetPagination(serviceData.page, serviceData.size, serviceData.totalCount);
    }

    // ==================================================================================================
    // ======================================= LIST HANDLER ==========================================
    // ==================================================================================================

    function filterExpiredList(services) {


        var date = new Date();
        var currentDate = Number(date.getFullYear() + ("0"+(date.getMonth()+1)).slice(-2) + ("0"+date.getDate()).slice(-2));
        console.log(currentDate);

        for(const service of services){
            console.log(service);
            var i = 0;
            const endDate = Number((service.serviceEndDate).substr(0, 10).replace(/-/gi, '')); // 20190901
            console.log(endDate);
            if(currentDate > endDate){
                // 서비스 종료일을 초과한 경우 Active List에서 삭제함
                services.splice(i, 1);
                console.log(services);
            }
            i += 1;
        }
        filterActiveList(services);
    }


    function serviceDelete(serviceId){

        if(mock === false){
            Apis.deleteRequest("/provider/my-listing/" +serviceId + "/delete").then(response =>{
                initFetch();
            });
        } else {
            <!-- delete 누를시 화면에서만 listings 삭제 -->

        }
    }

    function serviceReadOnly(serviceId){
        location.href = "/provider/my-listing/" + serviceId + "/read";
    }

    function serviceStatusUpdate(serviceId){

        // 가라로 화면에서만 보여준다
        const tagItem = document.getElementById('li-'+serviceId);
        tagItem.getAttribute("style") != null ? tagItem.removeAttribute("style") :
            tagItem.setAttribute("style", "pointer-event:none; opacity:0.6; cursor:default");

    }

    // ==================================================================================================
    // ======================================= CREATE LIST DOM ==========================================
    // ==================================================================================================

    function filterActiveList(services){

        // Initialize Global Variable that Creating DOM
        var serviceContent = "";

        for(const service of services){

            if(service.serviceRegisterIsActive === true){
                showActiveItem(service);

            } else if(service.serviceRegisterIsActive === false){
                showDeactiveItem(service);
            }
        }

        function showActiveItem(service) {

            serviceContent += '<li id="li-'+service.serviceId+'"><div class="list-box-listing"><div class="list-box-listing-img">'
                +'<a href="" onclick="serviceReadOnly('+ service.serviceId +');"><img src="' + service.serviceImgUri + '" alt=""></a></div>'
                +'<div class="list-box-listing-content"><div class="inner"><h3><a  onclick="serviceReadOnly('+service.serviceId+');">'
                +service.serviceTitle+'</a></h3><span>'+service.serviceAddress.addressState+'</span>&nbsp;<span>'+service.serviceAddress.addressCity
                +'</span>&nbsp;<span>'+service.serviceAddress.addressDong+'</span></div></div></div><div class="buttons-to-right">'
                +'<label class="switch"><input type="checkbox" checked onclick="serviceStatusUpdate('+service.serviceId+');"><span class="slider round"></span></input></label></div></li>';

        }

        function showDeactiveItem(service) {

            console.log(typeof service, service);

            serviceContent += '<li id="li-'+service.serviceId+'" style="pointer-event:none; opacity:0.6; cursor:default;"><div class="list-box-listing"><div class="list-box-listing-img">'
                +'<a href="" onclick="serviceReadOnly('+service.serviceId+');"><img src="'+service.serviceImgUri+'" alt=""></a></div>'
                +'<div class="list-box-listing-content"><div class="inner"><h3><a  onclick="serviceReadOnly('+service.serviceId+');">'
                +service.serviceTitle+'</a></h3><span>'+service.serviceAddress.addressState+'</span>&nbsp;<span>'+service.serviceAddress.addressCity
                +'</span>&nbsp;<span>'+service.serviceAddress.addressDong+'</span></div></div></div><div class="buttons-to-right">'
                +'<label class="switch"><input type="checkbox" unchecked onclick="serviceStatusUpdate('+service.serviceId+');"><span class="slider round"></span></input></label></div></li>';
        }

        document.querySelector('#wrap-list').innerHTML = serviceContent;
    }

    // ==================================================================================================
    // ==================================== CREATE LIST DOM / END ====================================
    // ==================================================================================================


    // ==================================================================================================
    // ========================================= PAGINATION =============================================
    // ==================================================================================================
    function resetPagination(page, size, totalCount) {

        console.log("page = ", page)
        console.log("size = ", size)
        console.log("totalCount = ", totalCount);


        const pagination = document.getElementById('pagination');
        while (pagination.hasChildNodes()) {
            pagination.removeChild(pagination.firstChild);
        }

        const totalPage = Math.floor((totalCount + size - 1) / size);
        const beginPage = Math.floor(page / 10) * 10 + 1;
        const endPage = (beginPage + 10 > totalPage ? totalPage : beginPage + 10);
        console.log('page = ', page);
        console.log('beginPage = ', beginPage);
        console.log('endPage = ', endPage);


        pagination.appendChild(addPageItem(1, size, false, true));

        pagination.appendChild(addPageItem(page > 1 ? page -1 : 1, size, false, false, false, true, false));

        for (let i = beginPage; i <= endPage; i++) {
            pagination.appendChild(addPageItem(i, size, (i == page)));
        }

        pagination.appendChild(addPageItem(page < totalPage ? page +1 : totalPage, size, false, false, false, false, true));

        pagination.appendChild(addPageItem(totalPage, size, false, false, true));
    }

    function addPageItem(page, size, active, first = false, last = false, prev = false, next =  false) {
        const pageItem = document.createElement('li')
        pageItem.classList.add('page-item');
        if (active) {
            pageItem.classList.add('active');
        }
        pageItem.appendChild(addPageLink(page, size, first, last, prev, next));
        return pageItem;
    }

    function addPageLink(page, size, first, last, prev, next) {
        const pageLink = document.createElement('a');
        pageLink.classList.add('page-link');
        //pageLink.setAttribute('href', '?page=' + page + '&size=' + size);
        pageLink.setAttribute('onclick', 'paginationRequest('+page+');');

        if (first || last) {
            const spanItem = document.createElement('span');
            spanItem.setAttribute('aria-hidden', 'true');
            spanItem.appendChild(document.createTextNode(first ? '<<' : '>>'));
            pageLink.appendChild(spanItem);

        } else if(prev || next){
            const spanItem = document.createElement('span');
            spanItem.setAttribute('aria-hidden', 'true');
            spanItem.appendChild(document.createTextNode(prev ? '<' : '>'));
            pageLink.appendChild(spanItem);

        } else {
            pageLink.appendChild(document.createTextNode(page));
        }
        return pageLink;
    }

    function paginationRequest(page) {

        const reqJson = new Object();
        reqJson.req = "화이팅 !!!!!!!!!!!!!";
        Apis.postRequest(`/provider/active-listing/`+page, reqJson).then(response => {
            console.log("여기에 들어왔니?");
            console.log(typeof response, response);
            filterExpiredList(response.items);
            resetPagination(response.page, response.size, response.totalCount);
            console.log( page +"번째 Active Listing 페이지를 요청한다.");
        });
    }
    // ==================================================================================================
    // ====================================== PAGINATION / END =========================================
    // ==================================================================================================
</script>
</body>
</html> --%>
<%@ page import="org.springframework.security.core.Authentication"%>
<%@ page
	import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@ page import="com.pap.bucketclass.entity.Role"%>
<%@ page import="java.util.Set"%>
<%@ page import="java.util.HashSet"%>
<%@ page import="com.pap.bucketclass.entity.Member"%>
<%@ page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	Object principal = auth.getPrincipal();
	Set<Role> userRole = new HashSet<>();
	String memberNickname = null;
	String memberImgUri = null;

	if (principal != null && principal instanceof Member) {
		userRole = ((Member) principal).getRoles();
		memberNickname = ((Member) principal).getMemberNickname();
		memberImgUri = ((Member) principal).getMemberImg();
		System.out.println(memberImgUri);
	}
	String roleStr = null;
	Iterator<Role> itr = userRole.iterator();
	while (itr.hasNext()) {
		roleStr = itr.next().getRoleName();
	}
%>
<!DOCTYPE html>
<html>
<head>

<!-- Basic Page Needs
    ================================================== -->
<title>Bucket Class</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- CSS
    ================================================== -->
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="/css/main-color.css" id="colors">


</head>

<body>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header Container
    ================================================== -->

		<!-- Header Container / End -->
	<header id="header-container">

    <!-- Header -->
    <div id="header">
        <div class="container">

            <!-- Left Side Content -->
            <div class="left-side">

                <!-- Logo -->
                <div id="logo">
                    <a href="/"><img src="/img/logo.png" alt=""></a>
                </div>

                <!-- Mobile Navigation -->
                <div class="mmenu-trigger">
                    <button class="hamburger hamburger--collapse" type="button">
						<span class="hamburger-box">
							<span class="hamburger-inner"></span>
						</span>
                    </button>
                </div>

            </div>
            <!-- Left Side Content / End -->

            <!-- Right Side Content / End -->
            <div class="right-side">
                <!-- Header Widget -->
                <div class="header-widget">

                    <!-- User Menu -->
                    <div class="user-menu" id="user-menu">
                        <!------------------------------------------------->
                        <!------------- user menu content ----------------->
                        <!------------------------------------------------->
                    </div>
                </div>
                <!-- Header Widget / End -->
            </div>
            <!-- Right Side Content / End -->

        </div>
    </div>
    <!-- Header / End -->

</header>
<div class="clearfix"></div>
		
		<a href="#" class="dashboard-responsive-nav-trigger"><i
			class="fa fa-reorder"></i> Dashboard Navigation</a>

		<div class="dashboard-nav">
			<div class="dashboard-nav-inner">
				<ul id="sidebar">
					<!------------------------------------------------->
					<!------------- side bar content ------------------>
					<!------------------------------------------------->
				</ul>
			</div>
		</div>

		<!-- Navigation / End -->

		<script type="text/javascript">
	// 세션에서 받은 유저 권한
	var userRole ="<%=roleStr%>";
	console.log("사이드바>>>", userRole);

	if(userRole === "ROLE_CUSTOMER"){

		var customerSideBarContent =
				'<ul data-submenu-title="">'
				+'<li><a id="sideBarBookmarks" href="#"><i class="sl sl-icon-heart"></i> 나의 수강 관리</a></li>'
				+'<li class="active"><a id="sideBarMyPage" href="/customer/mypage"><i class="sl sl-icon-user"></i> 마이페이지</a></li>'
				+'<li><a id="sideBarLogout" href="/logout"><i class="sl sl-icon-power"></i> 로그아웃</a></li></ul>';

		document.querySelector('#sidebar').innerHTML = customerSideBarContent;

	} else if(userRole === "ROLE_PROVIDER"){

		var providerSideBarContent =

				'<ul data-submenu-title="">'
				+'<li class="active"><a><i class="sl sl-icon-layers"></i> 나의 수업 관리</a>'
				+'<ul><li><a href="/provider/pending-listing"><span class="nav-tag green"></span>&nbsp;&nbsp;&nbsp;&nbsp;대기중 </a></li>'
				+'<li><a href="/provider/active-listing"><span class="nav-tag yellow"></span>&nbsp;&nbsp;&nbsp;&nbsp;진행중 </a></li>'
				+'<li><a href="/provider/expired-listing"><span class="nav-tag red"></span>&nbsp;&nbsp;&nbsp;&nbsp;완료  </a></li></ul></li>'
				+'<li><a id="sideBarAddListing" href="/provider/add-service"><i class="sl sl-icon-plus"></i> 수업 추가하기</a></li>'
				+'<li class="active"><a id="sideBarMyPage" href="/provider/mypage"><i class="sl sl-icon-user"></i>마이페이지</a></li>'
				+'<li><a id="sideBarLogout" href="/logout"><i class="sl sl-icon-power"></i> 로그아웃</a></li></ul>';

		document.querySelector('#sidebar').innerHTML = providerSideBarContent;
	}
</script>

		<!-- Dashboard -->
		<div class="container" id="dashboard">

			<!-- Navigation
        ================================================== -->

			<!-- Content
        ================================================== -->
			<div class="dashboard-content">

				<!-- Titlebar -->
				<div id="titlebar">
					<div class="row">
						<div class="col-md-12">
							<h2>나의 수업 관리</h2>
							<!-- Breadcrumbs -->
							<nav id="breadcrumbs">
								<ul>
									<li><a href="#">메인</a></li>
									<li><a href="#">마이페이지</a></li>
									<li>나의 수업 관리</li>
								</ul>
							</nav>
						</div>
					</div>
				</div>

				<div class="row">

					<!-- Listings -->
					<div class="col-lg-12 col-md-12">
						<div class="dashboard-list-box margin-top-0">
							<h4>진행중인 수업 목록</h4>
							<ul id="wrap-list">
								<%--===============================================--%>
								<%--=============== CREATE DOM AREA ===============--%>
								<%--===============================================--%>
							</ul>
						</div>
					</div>

					<!-- Pagination -->
					<div class="clearfix"></div>
					<div class="row">
						<div class="col-md-12">
							<!-- Pagination -->
							<div class="pagination-container margin-top-20 margin-bottom-40">
								<nav class="pagination">
									<ul id="pagination">
										<!--=====================================================-->
										<!-- ==============Pagination Context ================== -->
										<!--=====================================================-->
									</ul>
								</nav>
							</div>
						</div>
					</div>
					<!-- Pagination / End -->

				</div>
			</div>
			<!-- Content / End -->
		</div>
		<!-- Dashboard / End -->
	</div>
	<!-- Wrapper / End -->


	<!-- Scripts
================================================== -->
	<script type="text/javascript" src="/js/jquery-2.2.0.min.js"></script>
	<script type="text/javascript" src="/js/mmenu.min.js"></script>
	<script type="text/javascript" src="/js/chosen.min.js"></script>
	<script type="text/javascript" src="/js/slick.min.js"></script>
	<script type="text/javascript" src="/js/rangeslider.min.js"></script>
	<script type="text/javascript" src="/js/magnific-popup.min.js"></script>
	<script type="text/javascript" src="/js/waypoints.min.js"></script>
	<script type="text/javascript" src="/js/counterup.min.js"></script>
	<script type="text/javascript" src="/js/jquery-ui.min.js"></script>
	<script type="text/javascript" src="/js/tooltips.min.js"></script>
	<script type="text/javascript" src="/js/custom.js"></script>
	<script type="text/javascript" src="/js/apis.js"></script>
	<script>

    var userRoleData ="<%=roleStr%>";
    var getNickName = "<%=memberNickname%>";
    var getImgUri = "<%=memberImgUri%>";

    console.log("대쉬보드버전>>>", userRoleData);
    console.log("대쉬보드버전>>>", getNickName);
    console.log("대쉬보드버전>>>", getImgUri);

    if (userRoleData === "ROLE_CUSTOMER") {

        var headerContentCustomer = '<div class="user-name"><span><img src="../img/' + getImgUri + '" alt=""></span>'
            + getNickName
            + '님에게 맞는 수업을 만나보세요!</div>'
            + '<ul><li><a href="/customer/mypage"><i class="sl sl-icon-settings"></i> 마이페이지</a></li>'
            + '<li><a href=#><i class="fa fa-calendar-check-o"></i> 나의 수강 관리</a></li>'
            + '<li><a href="/logout"><i class="sl sl-icon-power"></i> 로그아웃</a></li></ul>';

        console.log(headerContentCustomer);
        document.querySelector('#user-menu').innerHTML = headerContentCustomer;

    } else if (userRoleData === "ROLE_PROVIDER") {

        var headerContentProvider = '<div class="user-name"><span><img src="../img/' + getImgUri + '" alt=""></span>'
            + getNickName
            + '님만의 수업을 개설해보세요!</div>'
            + '<ul><li><a href="/provider/mypage"><i class="sl sl-icon-settings"></i> 마이페이지</a></li>'
            + '<li><a href="/provider/active-listing"><i class="fa fa-calendar-check-o"></i> 나의 수업 관리</a></li>'
            + '<li><a href="/logout"><i class="sl sl-icon-power"></i> 로그아웃</a></li></ul>';

        console.log(typeof headerContentProvider, headerContentProvider);
        document.querySelector('#user-menu').innerHTML = headerContentProvider;

    } else {
        var headerContent = '<a href="/login" class="sign-in">로그인</a>'
            + '<a href="/signup" class="sign-in">회원가입</a>';

        console.log(headerContent);
        document.querySelector('#user-menu').innerHTML = headerContent;
    }
	</script>
	<script>

    var mock = false;

    $(document).ready(function(){
        ajax();
    });

    function ajax() {
        if(mock) startXhr();
        else initFetch();
    }

    function initFetch() {
        const reqJson = new Object();
        reqJson.req = "화이팅 !!";
        Apis.postRequest("/provider/active-listing", reqJson).then(response => {
            console.log("여기에 들어왔니?");
            console.log(typeof response.items, response.items);
            resetPagination(response.page, response.size, response.totalCount);
            filterExpiredList(response.items);
        });
    }

    var xhr;
    function startXhr() {
        xhr = new XMLHttpRequest();
        xhr.open("GET", "/data/my-listing.json");
        xhr.send();
        xhr.onreadystatechange = function () {
            if(xhr.readyState == 4){
                if(xhr.status == 200){
                    console.log("데이터 불러오기 성공");
                    serializeData();
                } else {
                    console.log("데이터 불러오기 실패");
                }
            }
        }
    }

    function serializeData() {

        var serviceData = JSON.parse(xhr.responseText);
        filterExpiredList(serviceData.items);
        resetPagination(serviceData.page, serviceData.size, serviceData.totalCount);
    }

    // ==================================================================================================
    // ======================================= LIST HANDLER ==========================================
    // ==================================================================================================

function filterExpiredList(services) {

        console.log("services 들어온것", typeof services, services);
        console.log("services 들어온것", typeof services[0], services[0]);
        console.log("services 들어온것", typeof services[1], services[1]);
        console.log("services 들어온것", typeof services[2], services[2]);
        console.log("services 들어온것", typeof services[3], services[3]);

        var date = new Date();
        var currentDate = Number(date.getFullYear() + ("0" + (date.getMonth() + 1)).slice(-2) + ("0" + date.getDate()).slice(-2));

        var ArrService = new Array();
        // var forInService = new Array();
        for (var i = 0; i < services.length; i++) {
            ArrService[i] = services[i];
            console.log(ArrService[i]);
        }

        for (var ii = ArrService.length - 1; ii >= 0; ii--) {
            const endDate = Number((ArrService[ii].serviceEndDate).substr(0, 10).replace(/-/gi, '')); // 20190831 20190901
            // expired는 endDate < currentDate / active는 endDate > currentDate
            if (endDate > currentDate) {
                console.log("endDate"+endDate);
                console.log("currentDate"+currentDate);
                console.log("endDate가 current보다 커요");
                // 서비스 종료일이 도래하지 않은 경우 Expired List에서 삭제함
                console.log("ii값", ii)
            } else {
                console.log("else문 들어감");
                ArrService.splice(ii, 1);
                continue;
            }
        }

        console.log(ArrService);

        showServiceItem(ArrService)
        // var date = new Date();
        // var currentDate = Number(date.getFullYear() + ("0"+(date.getMonth()+1)).slice(-2) + ("0"+date.getDate()).slice(-2));


        // for(var service of services){
        //     var i = 0;
        //     const endDate = Number((service.serviceEndDate).substr(0, 10).replace(/-/gi, '')); // 20190901
        //     if(currentDate < endDate){
        //         console.log(typeof service, service, "splice 전");
        //         // 서비스 종료일이 도래하지 않은 경우 Expired List에서 삭제함
        //         services.splice(i, 1);
        //         console.log(typeof service, service, "splice 후");
        //
        //     }
        //     i++;
        // }
        // showServiceItem(services);

    }


    function serviceDelete(serviceId){

        if(mock === false){
            Apis.deleteRequest("/provider/my-listing/" +serviceId + "/delete").then(response =>{
                initFetch();
            });
        } else {
            <!-- delete 누를시 화면에서만 listings 삭제 -->

        }
    }

    function serviceReadOnly(serviceId){
        location.href = "/provider/my-listing/" + serviceId + "/read";
    }

    function serviceStatusUpdate(serviceId){

        // 가라로 화면에서만 보여준다
        const tagItem = document.getElementById('li-'+serviceId);
        tagItem.getAttribute("style") != null ? tagItem.removeAttribute("style") :
            tagItem.setAttribute("style", "pointer-event:none; opacity:0.6; cursor:default");

    }

    // ==================================================================================================
    // ======================================= CREATE LIST DOM ==========================================
    // ==================================================================================================

    function filterActiveList(services){

        // Initialize Global Variable that Creating DOM
        var serviceContent = "";

        for(const service of services){

            if(service.serviceRegisterIsActive === true){
                showActiveItem(service);

            } else if(service.serviceRegisterIsActive === false){
                showDeactiveItem(service);
            }
        }

        function showActiveItem(service) {

            serviceContent += '<li id="li-'+service.serviceId+'"><div class="list-box-listing"><div class="list-box-listing-img">'
                +'<a href="" onclick="serviceReadOnly('+ service.serviceId +');"><img src="' + service.serviceImgUri + '" alt=""></a></div>'
                +'<div class="list-box-listing-content"><div class="inner"><h3><a  onclick="serviceReadOnly('+service.serviceId+');">'
                +service.serviceTitle+'</a></h3><span>'+service.serviceAddress.addressState+'</span>&nbsp;<span>'+service.serviceAddress.addressCity
                +'</span>&nbsp;<span>'+service.serviceAddress.addressDong+'</span></div></div></div><div class="buttons-to-right">'
                +'<label class="switch"><input type="checkbox" checked onclick="serviceStatusUpdate('+service.serviceId+');"><span class="slider round"></span></input></label></div></li>';

        }

        function showDeactiveItem(service) {

            console.log(typeof service, service);

            serviceContent += '<li id="li-'+service.serviceId+'" style="pointer-event:none; opacity:0.6; cursor:default;"><div class="list-box-listing"><div class="list-box-listing-img">'
                +'<a href="" onclick="serviceReadOnly('+service.serviceId+');"><img src="'+service.serviceImgUri+'" alt=""></a></div>'
                +'<div class="list-box-listing-content"><div class="inner"><h3><a  onclick="serviceReadOnly('+service.serviceId+');">'
                +service.serviceTitle+'</a></h3><span>'+service.serviceAddress.addressState+'</span>&nbsp;<span>'+service.serviceAddress.addressCity
                +'</span>&nbsp;<span>'+service.serviceAddress.addressDong+'</span></div></div></div><div class="buttons-to-right">'
                +'<label class="switch"><input type="checkbox" unchecked onclick="serviceStatusUpdate('+service.serviceId+');"><span class="slider round"></span></input></label></div></li>';
        }

        document.querySelector('#wrap-list').innerHTML = serviceContent;
    }

    // ==================================================================================================
    // ==================================== CREATE LIST DOM / END ====================================
    // ==================================================================================================
	// ==================================================================================================
    // ==================================== CREATE LIST DOM / END ====================================
    // ==================================================================================================

    function showServiceItem(services) {

        // Initialize Global Variable that Creating DOM
        var serviceContent = "";

        for(var service of services){
            var a = true;
            if(service.serviceTitle =="" ||
                service.accountBank =="" ||
                service.accountNumber =="" ||
                service.serviceDescription ==""
            ){
                a= "templateRegistBack";
            }else{
                a= "templateRegistGo";
            }

            serviceContent += '<li id="li-'+service.serviceTemplateId+'"><div class="list-box-listing"><div class="list-box-listing-img">'
                +'<a onclick="templateReadOnly('+service.serviceTemplateId+');"><img src="'+service.serviceImgUri+'" alt=""></a></div>'
                +'<div class="list-box-listing-content"><div class="inner"><h3><a href="#" onclick="templateReadOnly('+service.serviceTemplateId+');">'
                +service.serviceTitle+'</a></h3></div></div></div><div class="buttons-to-right">'
                // +'<a class="button gray" onclick="templateRegist('+serviceTemplateId+');"><i class="sl sl-icon-action-redo"></i> 등록</a>'
                +'<a class="button gray" onclick="'+a+'('+service.serviceTemplateId+');"><i class="sl sl-icon-action-redo"></i> 등록</a>'
                +'<a class="button gray" onclick="templateEdit('+service.serviceTemplateId+');"><i class="sl sl-icon-note"></i> 수정</a>'
                +'<a class="button gray" onclick="templateDelete('+service.serviceTemplateId+');"><i class="sl sl-icon-close"></i> 삭제</a></div></li>'
        }


        document.querySelector('#wrap-list').innerHTML = serviceContent;

    }

    // ==================================================================================================
    // ========================================= PAGINATION =============================================

    // ==================================================================================================
    // ========================================= PAGINATION =============================================
    // ==================================================================================================
    function resetPagination(page, size, totalCount) {

        console.log("page = ", page)
        console.log("size = ", size)
        console.log("totalCount = ", totalCount);


        const pagination = document.getElementById('pagination');
        while (pagination.hasChildNodes()) {
            pagination.removeChild(pagination.firstChild);
        }

        const totalPage = Math.floor((totalCount + size - 1) / size);
        const beginPage = Math.floor(page / 10) * 10 + 1;
        const endPage = (beginPage + 10 > totalPage ? totalPage : beginPage + 10);
        console.log('page = ', page);
        console.log('beginPage = ', beginPage);
        console.log('endPage = ', endPage);


        pagination.appendChild(addPageItem(1, size, false, true));

        pagination.appendChild(addPageItem(page > 1 ? page -1 : 1, size, false, false, false, true, false));

        for (let i = beginPage; i <= endPage; i++) {
            pagination.appendChild(addPageItem(i, size, (i == page)));
        }

        pagination.appendChild(addPageItem(page < totalPage ? page +1 : totalPage, size, false, false, false, false, true));

        pagination.appendChild(addPageItem(totalPage, size, false, false, true));
    }

    function addPageItem(page, size, active, first = false, last = false, prev = false, next =  false) {
        const pageItem = document.createElement('li')
        pageItem.classList.add('page-item');
        if (active) {
            pageItem.classList.add('active');
        }
        pageItem.appendChild(addPageLink(page, size, first, last, prev, next));
        return pageItem;
    }

    function addPageLink(page, size, first, last, prev, next) {
        const pageLink = document.createElement('a');
        pageLink.classList.add('page-link');
        //pageLink.setAttribute('href', '?page=' + page + '&size=' + size);
        pageLink.setAttribute('onclick', 'paginationRequest('+page+');');

        if (first || last) {
            const spanItem = document.createElement('span');
            spanItem.setAttribute('aria-hidden', 'true');
            spanItem.appendChild(document.createTextNode(first ? '<<' : '>>'));
            pageLink.appendChild(spanItem);

        } else if(prev || next){
            const spanItem = document.createElement('span');
            spanItem.setAttribute('aria-hidden', 'true');
            spanItem.appendChild(document.createTextNode(prev ? '<' : '>'));
            pageLink.appendChild(spanItem);

        } else {
            pageLink.appendChild(document.createTextNode(page));
        }
        return pageLink;
    }

    function paginationRequest(page) {

        const reqJson = new Object();
        reqJson.req = "화이팅 !!!!!!!!!!!!!";
        Apis.postRequest(`/provider/active-listing/`+page, reqJson).then(response => {
            console.log("여기에 들어왔니?");
            console.log(typeof response, response);
            filterExpiredList(response.items);
            resetPagination(response.page, response.size, response.totalCount);
            console.log( page +"번째 Active Listing 페이지를 요청한다.");
        });
    }
    // ==================================================================================================
    // ====================================== PAGINATION / END =========================================
    // ==================================================================================================
</script>
<script>

    var userRoleData ="<%=roleStr%>";
    var getNickName = "<%=memberNickname%>";
    var getImgUri = "<%=memberImgUri%>";

    console.log("대쉬보드버전>>>", userRoleData);
    console.log("대쉬보드버전>>>", getNickName);
    console.log("대쉬보드버전>>>", getImgUri);

    if (userRoleData === "ROLE_CUSTOMER") {

        var headerContentCustomer = '<div class="user-name"><span><img src="../img/' + getImgUri + '" alt=""></span>'
            + getNickName
            + '님에게 맞는 수업을 만나보세요!</div>'
            + '<ul><li><a href="/customer/mypage"><i class="sl sl-icon-settings"></i> 마이페이지</a></li>'
            + '<li><a href=#><i class="fa fa-calendar-check-o"></i> 나의 수강 관리</a></li>'
            + '<li><a href="/logout"><i class="sl sl-icon-power"></i> 로그아웃</a></li></ul>';

        console.log(headerContentCustomer);
        document.querySelector('#user-menu').innerHTML = headerContentCustomer;

    } else if (userRoleData === "ROLE_PROVIDER") {

        var headerContentProvider = '<div class="user-name"><span><img src="../img/' + getImgUri + '" alt=""></span>'
            + getNickName
            + '님만의 수업을 개설해보세요!</div>'
            + '<ul><li><a href="/provider/mypage"><i class="sl sl-icon-settings"></i> 마이페이지</a></li>'
            + '<li><a href="/provider/active-listing"><i class="fa fa-calendar-check-o"></i> 나의 수업 관리</a></li>'
            + '<li><a href="/logout"><i class="sl sl-icon-power"></i> 로그아웃</a></li></ul>';

        console.log(typeof headerContentProvider, headerContentProvider);
        document.querySelector('#user-menu').innerHTML = headerContentProvider;

    } else {
        var headerContent = '<a href="/login" class="sign-in">로그인</a>'
            + '<a href="/signup" class="sign-in">회원가입</a>';

        console.log(headerContent);
        document.querySelector('#user-menu').innerHTML = headerContent;
    }
</script>
<script type="text/javascript">
	// 세션에서 받은 유저 권한
	var userRole ="<%=roleStr%>";
	console.log("사이드바>>>", userRole);

	if(userRole === "ROLE_CUSTOMER"){

		var customerSideBarContent =
				'<ul data-submenu-title="">'
				+'<li><a id="sideBarBookmarks" href="#"><i class="sl sl-icon-heart"></i> 나의 수강 관리</a></li>'
				+'<li class="active"><a id="sideBarMyPage" href="/customer/mypage"><i class="sl sl-icon-user"></i> 마이페이지</a></li>'
				+'<li><a id="sideBarLogout" href="/logout"><i class="sl sl-icon-power"></i> 로그아웃</a></li></ul>';

		document.querySelector('#sidebar').innerHTML = customerSideBarContent;

	} else if(userRole === "ROLE_PROVIDER"){

		var providerSideBarContent =

				'<ul data-submenu-title="">'
				+'<li class="active"><a><i class="sl sl-icon-layers"></i> 나의 수업 관리</a>'
				+'<ul><li><a href="/provider/pending-listing"><span class="nav-tag green"></span>&nbsp;&nbsp;&nbsp;&nbsp;대기중 </a></li>'
				+'<li><a href="/provider/active-listing"><span class="nav-tag yellow"></span>&nbsp;&nbsp;&nbsp;&nbsp;진행중 </a></li>'
				+'<li><a href="/provider/expired-listing"><span class="nav-tag red"></span>&nbsp;&nbsp;&nbsp;&nbsp;완료  </a></li></ul></li>'
				+'<li><a id="sideBarAddListing" href="/provider/add-service"><i class="sl sl-icon-plus"></i> 수업 추가하기</a></li>'
				+'<li class="active"><a id="sideBarMyPage" href="/provider/mypage"><i class="sl sl-icon-user"></i>마이페이지</a></li>'
				+'<li><a id="sideBarLogout" href="/logout"><i class="sl sl-icon-power"></i> 로그아웃</a></li></ul>';

		document.querySelector('#sidebar').innerHTML = providerSideBarContent;
	}
</script>

</body>
</html>
