<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Basic Page Needs -->
    <title>BucketClass</title>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- CSS -->
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/main-color.css" id="colors">
    <link rel="icon" type="image/png" sizes="32x32" href="/img/favicon-32x32.png">
</head>


<body>
<!-- Wrapper -->
<div id="wrapper">

    <!-- Header Container -->
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
                    <div class="clearfix"></div>
                    <!-- Main Navigation / End -->
                </div>
                <!-- Left Side Content / End -->

                <!-- Right Side Content / End -->
                <div class="right-side">
                    <div class="header-widget">
                        <a href="/login" class="sign-in">로그인</a>
                    </div>
                </div>
                <!-- Right Side Content / End -->
            </div>
        </div>
        <!-- Header / End -->
    </header>

    <style>
        .notify {
            font-family: "HelveticaNeue", "Helvetica Neue", Helvetica, Arial,
            sans-serif;
            font-size: 10px !important;
        }
    </style>

    <!-- container -->
    <div id="container">
        <!-- Sign In -->
        <div id="sign-in-dialog" class="zoom-anim-dialog">
            <div class="small-dialog-header" align="center">
                <h3>BucketClass</h3>
            </div>
            <!--Tabs -->
            <div class="sign-in-form style-1">
                <div class="tabs-container alt">
                    <!-- Register -->
                    <div class="tab-content" id="tab2" style="display: none;">
                        <form method="post" class="register">
                            <p class="form-row form-row-wide">
                                <label for="username">아이디:
                                    <i class="im im-icon-Male"></i>
                                    <input type="text" class="input-text" id="username" name="username" onkeyup="registerValidation(this.value, this.id)"/>
                                </label>
                                <label id="id-notify" class="notify"></label>
                            </p>

                            <p class="form-row form-row-wide">
                                <label for="nickname">닉네임:
                                    <i class="im im-icon-Male-2"></i>
                                    <input type="text" class="input-text" id="nickname" name="nickname" onkeyup="registerValidation(this.value, this.id)"/>
                                </label>
                                <label id="nick-notify" class="notify"></label>
                            </p>

                            <p class="form-row form-row-wide">
                                <label for="email">이메일:
                                    <i class="im im-icon-Mail"></i>
                                    <input type="text" class="input-text" name="email" id="email" onkeyup="registerValidation(this.value, this.id)" />
                                </label>
                                <label id="email-notify" class="notify"></label>
                            </p>

                            <p class="form-row form-row-wide">
                                <label for="password1">비밀번호:
                                    <i class="im im-icon-Lock-2"></i>
                                    <input class="input-text" type="password" name="password1" id="password1" onkeyup="registerValidation(this.value, this.id)" />
                                </label>
                                <label id="pw1-notify" class="notify"></label>
                            </p>

                            <p class="form-row form-row-wide">
                                <label for="password2">비밀번호 확인:
                                    <i class="im im-icon-Lock-2"></i>
                                    <input class="input-text" type="password" name="password2" id="password2" onkeyup="registerValidation(this.value, this.id)" />
                                </label>
                                <label id="pw2-notify" class="notify"></label>
                            </p>

                            <div>
                                <input type="button" id="customerRegist" class="button border fw margin-top-10" name="customer"
                                       onclick="registerInputValidity(this.id);" value="이용자로 가입"/>
                                <input type="button" id="providerRegist" class="button border fw margin-top-10" name="provider"
                                       onclick="registerInputValidity(this.id);" value="제공자로 가입" style="background-color: #4682B4" />
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- Sign In Popup / End -->
    </div>

   <!-- Footer -->
<div id="footer" class="sticky-footer">
	<!-- Main -->
	<div class="container">
		<div class="row">
			<div class="col-md-5 col-sm-6">
				<img class="footer-logo" src="img/logo.png" alt="">
				<br><br>
				<span>(주)버킷클래스 (대표이사: 송인진)</span><br>
				<span>사업자등록번호: 111-22-33333</span><br>
				<span>개인정보책임관리자: THE-PAP</span><br>
				<span>서울특별시 서초구 서초4동 강남대로 459 B1 5강의실</span><br>
				<span>고객센터: 1234-4321</span>
			</div>

			<div class="col-md-4 col-sm-6 ">
				<h4>Helpful Links</h4>
				<ul class="footer-links">
					<li><a href="/login">로그인</a></li>
					<li><a href="/signup">회원가입</a></li>
					<li><a href="#">My Account</a></li>
					<li><a href="#">Add Listing</a></li>
					<li><a href="#">Pricing</a></li>
					<li><a href="#">Privacy Policy</a></li>
				</ul>

				<ul class="footer-links">
					<li><a href="#">FAQ</a></li>
					<li><a href="#">Blog</a></li>
					<li><a href="#">Our Partners</a></li>
					<li><a href="#">How It Works</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
				<div class="clearfix"></div>
			</div>

			<div class="col-md-3  col-sm-12">
				<h4>Contact Us</h4>
				<div class="text-widget">
					<span>서울 마포구 마포대로 89 포스트타워 14층</span> <br>
					전화번호: <span>(02) 123-456 </span><br>
					이메일:<span> <a href="#">THE-PAP@pap.com</a> </span><br>
				</div>
			</div>

		</div>

		<!-- Copyright -->
		<div class="row">
			<div class="col-md-12">
				<div class="copyrights">© 2019 Bucket Class. All Rights Reserved.</div>
			</div>
		</div>

	</div>

</div>
<!-- Footer / End -->

</div>
<!-- Wrapper / End -->
<!-- Scripts -->
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
<script type="text/javascript" src="/js/register-validation.js"></script>
<script type="text/javascript" src="/js/member-register.js"></script>
<script type="text/javascript" src="/js/apis.js"></script>
<!-- Style Switcher -->
<script src="/js/switcher.js"></script>
</body>
</html>