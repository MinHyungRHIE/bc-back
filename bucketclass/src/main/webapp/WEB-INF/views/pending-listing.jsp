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
							<h4>대기중인 수업 목록</h4>
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
        Apis.postRequest(`/provider/pending-listing`, reqJson).then(response => {
            console.log("여기에 들어왔니?");
            console.log(typeof response, response);
            showServiceItem(response.items);
            resetPagination(response.page, response.size, response.totalCount);
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
        showServiceItem(serviceData.items);
        resetPagination(serviceData.page, serviceData.size, serviceData.totalCount);
    }
</script>

<%--
    // ==================================================================================================
    // ======================================= LIST HANDLER ==========================================
    // ==================================================================================================
--%>

    <script>
        function templateRegistBack(serviceTemplateId){
            alert("수업을 개설하기 위해서는 모든 항목이 입력되어야 합니다. 수업 수정 페이지로 이동합니다.");
            templateEdit(serviceTemplateId);
        }
    </script>


    <script>
        function templateRegistGo(serviceTemplateId){
            alert("수업을 개설하기 위해 등록 페이지로 이동합니다.");
            location.href = "/provider/my-template/"+ serviceTemplateId + "/regist";
        }
    </script>




    <script>

        // function templateRegist(serviceTemplateId){
        //
        //
        // 	// console.log(typeof service, service);
        // 	//
        //     // delete service.serviceCategory;
        //     // delete service.hashTag;
        //     // delete service.serviceImgUri;
        //     //
        //     // var validateRegister = true;
        //     //
        //     // for(key in service){
        //     //     if(service[key] == null){
        //     //         validateRegister == false;
        //     //         break;
        //     //     }
        //     // }
        //
        //     // if(validateRegister == false){
        //     //     alert("수업을 개설하기 위해서는 모든 항목이 입력되어야 합니다. 수업 수정 페이지로 이동합니다.");
        //     //     templateEdit(serviceTemplateId);
        //     // } else {
        //         alert("수업을 개설하기 위해 등록 페이지로 이동합니다.");
        //         location.href = "/provider/my-template/"+ serviceTemplateId + "/regist";
        //     // }
        // }

        function templateEdit(serviceTemplateId){
            location.href = "/provider/my-template/"+ serviceTemplateId + "/update";
        }

        function templateDelete(serviceTemplateId){


            var confirmUser = confirm("나의 수업 기록에서 정말 삭제하시겠습니까?");
            const prentItem = document.getElementById('wrap-list');
            const childItem = document.getElementById('li-'+serviceTemplateId);
            if(confirmUser){
                prentItem.removeChild(childItem);
            }

            // Apis.deleteRequest("/provider/my-template/"+ serviceTemplateId + "/delete").then(response =>{
            //     initFetch();
            // });
        }

        function templateReadOnly(serviceTemplateId){
            location.href = "/provider/my-template/"+ serviceTemplateId + "/read";
        }
    </script>

<%--
    // ==================================================================================================
    // ======================================= CREATE LIST DOM ==========================================
    // ==================================================================================================
--%>

    <script>
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
        Apis.postRequest(`/provider/pending-listing/`+page, reqJson).then(response => {
            console.log("여기에 들어왔니?");
            console.log(typeof response, response);
            showServiceItem(response.items);
            resetPagination(response.page, response.size, response.totalCount);
            console.log( page +"번째 My Listing 페이지를 요청한다.");
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
