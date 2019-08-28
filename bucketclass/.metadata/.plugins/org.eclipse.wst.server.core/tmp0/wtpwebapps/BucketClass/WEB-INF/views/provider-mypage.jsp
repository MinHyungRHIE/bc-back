<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>

<!-- Basic Page Needs
================================================== -->
<title>BucketClass-Provider-profile</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- CSS
================================================== -->
<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" href="../css/main-color.css" id="colors">
<link rel="icon" type="image/png" sizes="32x32" href="../img/favicon-32x32.png">


</head>

<body>

<!-- Wrapper -->
<div id="wrapper">

<!-- Header Containerd
================================================== -->
<header id="header-container" class="fixed fullwidth dashboard">

	<!-- Header -->
	<div id="header" class="not-sticky">
		<div class="container">
			
			<!-- Left Side Content -->
			<div class="left-side">
				
				<!-- Logo -->
				<div id="logo">
<!--					<a href="index.html"><img src="../img/logo.png" alt=""></a>-->
					<a href="index.html" class="dashboard-logo"><img onclick="javascript:location.href='http://메인페이지';" src="../img/logo.png" alt=""></a>
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
<!--							<ul>-->
<!--								<li><a href="index.html">Home 1</a></li>-->
<!--								<li><a href="index-2-airbnb.html">Home 2 (Airbnb)</a></li>-->
<!--								<li><a href="index-3.html">Home 3</a></li>-->
<!--								<li><a href="index-4.html">Home 4</a></li>-->
<!--								<li><a href="index-5.html">Home 5</a></li>-->
<!--								<li><a href="index-6.html">Home 6</a></li>-->
<!--							</ul>-->
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
<!--								<li><a href="dashboard.html">Dashboard</a></li>-->
<!--								<li><a href="dashboard-messages.html">Messages</a></li>-->
<!--								<li><a href="dashboard-bookings.html">Bookings</a></li>-->
<!--								<li><a href="dashboard-wallet.html">Wallet</a></li>-->
								<li><a href="dasboard-mylisting.html">My Listing</a></li>
<!--								<li><a href="dashboard-reviews.html">Reviews</a></li>-->
<!--								<li><a href="dashboard-bookmarks.html">Bookmarks</a></li>-->
								<!-- <li><a href="dashboard-add-listing.html">Add Listing</a></li> -->
								<li><a href="dashboard-profile.html">마이페이지</a></li>
<!--								<li><a href="dashboard-invoice.html">Invoice</a></li>-->
							</ul>
						</li>

<!--						<li><a href="#">Pages</a>-->
<!--							<div class="mega-menu mobile-styles three-columns">-->

<!--									<div class="mega-menu-section">-->
<!--										<ul>-->
<!--											<li class="mega-menu-headline">Pages #1</li>-->
<!--											<li><a href="pages-user-profile.html"><i class="sl sl-icon-user"></i> User Profile</a></li>-->
<!--&lt;!&ndash;											<li><a href="pages-booking.html"><i class="sl sl-icon-check"></i> Booking Page</a></li>&ndash;&gt;-->
<!--											&lt;!&ndash; <li><a href="pages-add-listing.html"><i class="sl sl-icon-plus"></i> Add Listing</a></li> &ndash;&gt;-->
<!--											<li><a href="pages-blog.html"><i class="sl sl-icon-docs"></i> Blog</a></li>-->
<!--										</ul>-->
<!--									</div>-->
<!--		-->
<!--									<div class="mega-menu-section">-->
<!--&lt;!&ndash;										<ul>&ndash;&gt;-->
<!--&lt;!&ndash;											<li class="mega-menu-headline">Pages #2</li>&ndash;&gt;-->
<!--&lt;!&ndash;											<li><a href="pages-contact.html"><i class="sl sl-icon-envelope-open"></i> Contact</a></li>&ndash;&gt;-->
<!--&lt;!&ndash;											<li><a href="pages-coming-soon.html"><i class="sl sl-icon-hourglass"></i> Coming Soon</a></li>&ndash;&gt;-->
<!--&lt;!&ndash;											<li><a href="pages-404.html"><i class="sl sl-icon-close"></i> 404 Page</a></li>&ndash;&gt;-->
<!--&lt;!&ndash;											<li><a href="pages-masonry-filtering.html"><i class="sl sl-icon-equalizer"></i> Masonry Filtering</a></li>&ndash;&gt;-->
<!--&lt;!&ndash;										</ul>&ndash;&gt;-->
<!--									</div>-->

<!--									<div class="mega-menu-section">-->
<!--										<ul>-->
<!--											<li class="mega-menu-headline">Other</li>-->
<!--											<li><a href="pages-elements.html"><i class="sl sl-icon-settings"></i> Elements</a></li>-->
<!--											<li><a href="pages-pricing-tables.html"><i class="sl sl-icon-tag"></i> Pricing Tables</a></li>-->
<!--											<li><a href="pages-typography.html"><i class="sl sl-icon-pencil"></i> Typography</a></li>-->
<!--											<li><a href="pages-icons.html"><i class="sl sl-icon-diamond"></i> Icons</a></li>-->
<!--										</ul>-->
<!--									</div>-->
<!--									-->
<!--							</div>-->
<!--						</li>-->
						
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
						<div class="user-name"><span><img id= "member_img" alt="" /></span>Hi! </div>
						<ul>
<!--							<li><a href="dashboard.html"><i class="sl sl-icon-settings"></i> Dashboard</a></li>-->
							<li><a herf="dashboard-my-listings.html"><i class="sl sl-icon-layers"></i>My Listing</a></li>
<!--							<li><a href="dashboard-messages.html"><i class="sl sl-icon-envelope-open"></i> Messages</a></li>-->
<!--							<li><a href="dashboard-bookings.html"><i class="fa fa-calendar-check-o"></i> Bookings</a></li>-->
							<li><a href="index.html"><i class="sl sl-icon-power"></i> Logout</a></li>
						</ul>
					</div>

					<!-- <a href="dashboard-add-listing.html" class="button border with-icon">Add Listing <i class="sl sl-icon-plus"></i></a> -->
				</div>
				<!-- Header Widget / End -->
			</div>
			<!-- Right Side Content / End -->

		</div>
	</div>
	<!-- Header / End -->

</header>

<!--	<style>-->
<!--		.check {-->
<!--			font-family: "HelveticaNeue", "Helvetica Neue", Helvetica, Arial, sans-serif;-->
<!--			font-size: 10px !important;-->
<!--		}-->
<!--	</style>-->


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

<!--			<ul data-submenu-title="Main">-->
<!--				<li><a href="dashboard.html"><i class="sl sl-icon-settings"></i> Dashboard</a></li>-->
<!--&lt;!&ndash;				<li><a href="dashboard-messages.html"><i class="sl sl-icon-envelope-open"></i> Messages <span class="nav-tag messages">2</span></a></li>&ndash;&gt;-->
<!--&lt;!&ndash;				<li><a href="dashboard-bookings.html"><i class="fa fa-calendar-check-o"></i> Bookings</a></li>&ndash;&gt;-->
<!--&lt;!&ndash;				<li><a href="dashboard-wallet.html"><i class="sl sl-icon-wallet"></i> Wallet</a></li>&ndash;&gt;-->
<!--			</ul>-->
			
			<ul data-submenu-title="">
				<li><a id="sideBarMyList"><i class="sl sl-icon-layers"></i> My Listing</a></li>

<!--					<ul>-->
<!--						<li><a href="active-service.html">Active</a></li> &lt;!&ndash;<span class="nav-tag yellow">1</span> &ndash;&gt;-->
<!--						<li><a href="pending-service.html">Pending </a></li>-->
<!--						<li><a href="expired-service.html">Expired </a></li>-->
<!--					</ul>-->

<!--				<li><a href="dashboard-reviews.html"><i class="sl sl-icon-star"></i> Reviews</a></li>-->
<!--				<li><a href="dashboard-bookmarks.html"><i class="sl sl-icon-heart"></i> Bookmarks</a></li>-->
				 <li><a id="sideBarAddListing"><i class="sl sl-icon-plus"></i> Add Listing</a></li>
			</ul>

			<ul data-submenu-title="">
				<li class="active"><a id="sideBarMyPage"><i class="sl sl-icon-user"></i>마이페이지</a></li>
				<li><a id="sideBarLogout"><i class="sl sl-icon-power"></i> Logout</a></li>
			</ul>

	</div>
	</div>
	<!-- Navigation / End -->


	<!-- Content
	================================================== -->
	<div class="dashboard-content">

		<!-- Titlebar -->
		<div id="titlebar">
			<div class="row">
				<div class="col-md-12">
					<h2>마이페이지</h2>
					<!-- Breadcrumbs -->
					<nav id="breadcrumbs">
						<ul>
							<li><a href="#">Home</a></li>
<!--							<li><a href="#">Dashboard</a></li>-->
							<li>마이페이지</li>
						</ul>
					</nav>
				</div>
			</div>
		</div>

		<div class="row">

			<!-- Profile -->
			<div class="col-lg-6 col-md-12">
					<div class="dashboard-list-box margin-top-0">
					<h4 class="gray">마이페이지 변경</h4>
						<div class="col-fs-6" align="" style="color:#c8c8c8; font-size:0.8em">가입일 : <span id="member_join_date" name=${member_join_date} style="color:#c8c8c8"></span></div>
					<div class="dashboard-list-box-static">

						<!-- Avatar -->
						<div class="edit-profile-photo">
							<span> <img id="member_img1" alt="" > </span>
							<div class="change-photo-btn">
								<div class="photoUpload">
								    <span><i class="fa fa-upload"></i> 사진 업로드</span>
								    <input type="file" class="upload" />
								</div>
							</div>
						</div>
	
						<!-- 프로필 세부사항 -->
						<div class="my-profile">

							<label>닉네임</label>
							<input type="text" name=${member_nickname} id="member_nickname" placeholder="닉네임을 입력하세요" value="" onKeyUp="nickValidity(this.value)" />
							<label id = "checknick" class="check"></label>

<!--							<label> 전화번호</label>-->
<!--							<input type="text" name=${userphonenum} id="userphonenum" style="DISPLAY: none" placeholder="전화번호를 입력하세요" />-->

							<label>E-mail</label>
							<input type="email" name=${member_email} id="member_email" placeholder="E-Mail 을 입력하세요" onKeyUp="emailValidity(this.value)" />
							<label id = "checkemail" class="check" ></label>

							<label>경력</label>
							<input type="text" name=${career} id="career" placeholder="경력을 입력하세요" />

							<label>자격증</label>
							<input type="text" name=${certi} id="certi" placeholder="자격증을 입력하세요" />

							<label>자기소개</label>
							<textarea name=${introduce} id="introduce" cols="30" rows="10" onKeyUp="checkByte(this.form, 500)"></textarea>

							<p class="data_count" style="font-size: smaller"><em id="introbyte" >0</em>/250 글자</p>

<!--							<textarea name="introduce"  cols="30" rows="10" >-->
<!--								자기소개 입력란 입니다-->
<!--							</textarea>-->

<!--							<label><i class="fa fa-twitter"></i> Twitter</label>-->
<!--							<input placeholder="https://www.twitter.com/" type="text">-->

<!--							<label><i class="fa fa-facebook-square"></i> Facebook</label>-->
<!--							<input placeholder="https://www.facebook.com/" type="text">-->

<!--							<label><i class="fa fa-google-plus"></i> Google+</label>-->
<!--							<input placeholder="https://www.google.com/" type="text">-->
						</div>
	
						<button id='buttonProfile' class='button margin-top-15'>마이페이지 수정</button>

					</div>
				</div>
			</div>

			<!-- Change Password -->
			<div class="col-lg-6 col-md-12">
				<div class="dashboard-list-box margin-top-0">
					<h4 class="gray">비밀번호 변경</h4>
					<div class="dashboard-list-box-static">

						<!-- Change Password -->
						<div class="my-profile" id="my-profile-password">

							<label class="margin-top-0">현재 비밀번호</label>
							<input type="password" name=${member_Password} id="member_Password" placeholder="현재 비밀번호 입력"  />
<!--							<label id="pw-notify"></label>-->

							<label>새 비밀번호</label>
							<input type="password" name=${newpassword} id="newpassword" placeholder="새 비밀번호 입력" value="" onkeyup="newPwValidity(this.value)" />
							<label id="new-pw-notify"></label>

							<label>새 비밀번호 확인</label>
							<input type="password" name=${confirmpassword} id="confirmpassword" placeholder="새 비밀번호 확인" value="" onkeyup="confirmPwValidity(this.value)" />
							<label id="confirm-pw-notify"></label>

							<button id='buttonPassword' class="button margin-top-15">비밀번호 변경</button>

						</div>

					</div>
				</div>
			</div>


			<!-- Copyrights -->
			<div class="col-md-12">
				<div class="copyrights">© 2019 Listeo. All Rights Reserved.</div>
			</div>

		</div>

	</div>
	<!-- Content / End -->


</div>
<!-- Dashboard / End -->


</div>
<!-- Wrapper / End -->


<!-- Scripts ====================================================================== -->
<script type="text/javascript" src="../js/jquery-2.2.0.min.js"></script>
<script type="text/javascript" src="../js/mmenu.min.js"></script>
<script type="text/javascript" src="../js/chosen.min.js"></script>
<script type="text/javascript" src="../js/slick.min.js"></script>
<script type="text/javascript" src="../js/rangeslider.min.js"></script>
<script type="text/javascript" src="../js/magnific-popup.min.js"></script>
<script type="text/javascript" src="../js/waypoints.min.js"></script>
<script type="text/javascript" src="../js/counterup.min.js"></script>
<script type="text/javascript" src="../js/jquery-ui.min.js"></script>
<script type="text/javascript" src="../js/tooltips.min.js"></script>
<script type="text/javascript" src="../js/custom.js"></script>
<script type="text/javascript" src="../js/provider-profile.js"></script>
<script type="text/javascript" src="../js/apis.js"></script>
<script type="text/javascript" src="../js/dropzone.js"></script>
<!-- =============================================================================== -->

<!--<script src="/js/apis.js"></script>-->
<script type="text/javascript" charset="UTF-8">

	var callpassword1;
	var res;
	// =============== Loading & Parsing JSON ==================
	var mock = false;
	$(document).ready(function () {
		if (mock) {
			startXhr();
			//startXhr2();
		} else {
			Apis.providerProfile(`/mypage/provider`).then( response =>{
				console.log(response);//promise객체로 옴. 이제 그걸 풀어서, 화면에 뿌려줘야함.
				showServiceItem(response);
				//serializeData();
			}); //getrequest로 요청보냄. return으로 response=>response.json()으로 받아짐.

		}
	});

	var xhr;

	function startXhr() {
		xhr = new XMLHttpRequest();
		xhr.open("GET", "../data/member_provider.json");
		xhr.send();
		xhr.onreadystatechange = function () {
			if (xhr.readyState == 4) {
				if (xhr.status == 200) {
					console.log("데이터 불러오기 성공");
					serializeData();
				} else {
					console.log("데이터 불러오기 실패");
				}
			}
		}
	};
	//Test

	// function serializeData() {
	// 	// var response = xhr.responseText;
	// 	// for(var i=0; i<response.length; i++){
	// 	//     for (var j=0; j<response[i].length; j++){
	// 	//         if(typeof response[i][j] ){
	// 	//         }
	// 	//     }
	// 	// }
	// 	var profileData = JSON.parse(res);//JSON.parse(xhr.responseText);
	// 						// res에 담긴(json)값을 profileData에 담아줌.
	//
	//
	// 	showServiceItem(profileData);
	// };

	// =============== Loading & Parsing JSON / END ==================
	// ==================== Tag & Value Mapping =======================
	var member_id;

	function showServiceItem(profileData) {
		console.log(profileData);

		if (mock) {
			member_id = 0;
		} else {
			serviceNo = '${service-id}';
		}

		insertValue('member_nickname', profileData[member_id].member_nickname);
		insertValue('member_email', profileData[member_id].member_email);
		insertValue('career', profileData[member_id].career);
		insertValue('certi', profileData[member_id].certi);
		insertValue('introduce', profileData[member_id].introduce);

		insertText('member_join_date', profileData[member_id].member_join_date);

		insertProfileImgResource('member_img', profileData[member_id].member_img);

		callPW(profileData[member_id].member_password);
	};

	// 1) 단일 값 맵핑
	function insertValue(tag, column) {
		if (column == null) {
			document.getElementById(tag).setAttribute('placeholder', '입력하세요');
		} else {
			document.getElementById(tag).setAttribute('value', column);
		}
	};

	function insertText(tag, column) {
		document.getElementById(tag).appendChild(document.createTextNode(column));
	};

	// 2) 프로필 이미지 소스 맵핑 //로직 다시 짜보기(ClassName :콜랙션으로 됨)
	function insertProfileImgResource(tag, column) {

		//document.getElementsByClassName(tag).setAttribute('src', column);
		document.getElementById(tag).setAttribute('src', column);
		var id2 = (tag + "1");
		document.getElementById(id2).setAttribute('src', column);
		// const imgTag = document.getElementById(tag);
		// const imgItem = document.createElement('img');
		// imgItem.setAttribute('src', column);
		// imgTag.appendChild(imgItem);
	};

	// // 3) 비밀번호 값 불러오기
	function callPW(column) {
		callpassword1 = column;


		return callpassword1;
	}
	// ==================== Tag & Data Mapping / END =======================


	//===================== SideBar Button Mapping Function====================

	//MyListing click-> MyListing page
	document.getElementById('sideBarMyList').addEventListener('click', clickMyListing);

	//클릭시, 페이지 변환(my listing페이지 endpoint요청하기) + 해당 페이지에 필요한 데이터 요청
	function clickMyListing(){
		Apis.buttonMyListing().then( response =>{
			if(response.d == true){
				window.location = "/mylisting/provider";
			}
		});
		//url로 경로를 지정하면, return 값이 response.json()으로 온 값
		//다시 반환된 그 값이 뭘까..

		//mypage
	}

	//addListing click-> AddListing page
	document.getElementById('sideBarAddListing').addEventListener('click', clickAddListing);

	//클릭시, 페이지 변환(my listing페이지 endpoint요청하기) + 해당 페이지에 필요한 데이터 요청
	function clickAddListing(){
		Apis.buttonAddListing().then( response =>{
			if(response.d == true){
				window.location = "/addlisting/provider";
			}

			//????
		});
		//url로 경로를 지정하면, return 값이 response.json()으로 온 값
		//다시 반환된 그 값이 뭘까..

		//mypage
	}

	//마이 페이지 click-> Mypage page
	document.getElementById('sideBarMyPage').addEventListener('click', clickMyPage);

	//클릭시, 페이지 변환(my listing페이지 endpoint요청하기) + 해당 페이지에 필요한 데이터 요청
	function clickMyPage(){
		Apis.buttonMyPage().then( response =>{
			console.log(response);
			if(response.d == true){
				window.location = "/mypage/provider";
				showServiceItem(response);
			}


		});


		//url로 경로를 지정하면, return 값이 response.json()으로 온 값
		//다시 반환된 그 값이 뭘까..

		//mypage
	}

	// const myForm = document.querySelector(“#myForm”);
	// myForm.addEventListener(‘submit’, function(e) {
	// 	e.preventDefault();
	// 	console.log(myForm);
	// 	const formData = new FormData(myForm);
	// 	loginRequest(formData)
	// 			.then(response => {
	// 				// 로그인 성공 여부 확인
	// 				console.log(‘response’, response);
	// 			});
	// });


</script>


</body>

</html>