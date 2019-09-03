<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<!-- Basic Page Needs
================================================== -->
<title>Bucket Class</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- CSS
================================================== -->
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="/css/main-color.css" id="colors">
<link rel="icon" type="image/png" sizes="32x32" href="/img/favicon-32x32.png">
<link rel="stylesheet" href="/css/googlecal.css" />
<link href='/css/DayGridView.css' rel='stylesheet' />
<link href='/css/listView.css' rel='stylesheet' />

<!-- Google Calender JSe
================================================== -->
<script src='/js/FullCalendarCorePackage.js'></script>
<script src='/js/FullCalendarInteractionPlugin.js'></script>
<script src='/js/FullCalendarDayGridPlugin.js'></script>
<script src='/js/FullCalendarListViewPlugin.js'></script>
<script src='/js/FullCalendarGoogleCalendarPlugin.js'></script>
<script type="/js/locales-all.js"></script>

</head>

<body>

<!-- Wrapper -->
<div id="wrapper">

<!-- Header Container
================================================== -->
<header id="header-container">

   <!-- Header -->
   <div id="header" class="not-sticky">
      <div class="container">

         <!-- Left Side Content -->
         <div class="left-side">
            <!-- Logo -->
            <div id="logo">
               <a href="index.html"><img src="/img/logo.png" alt=""></a>
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

                  <li><a class="current" href="#">Listings</a>
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

                  <li><a href="#">User Panel</a>
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
            <div class="header-widget">
               <a href="#sign-in-dialog" class="sign-in popup-with-zoom-anim"><i class="sl sl-icon-login"></i> Sign In</a>
               <a href="dashboard-add-listing.html" class="button border with-icon">Add Listing <i class="sl sl-icon-plus"></i></a>
            </div>
         </div>
         <!-- Right Side Content / End -->

         <!-- Sign In Popup -->
         <div id="sign-in-dialog" class="zoom-anim-dialog mfp-hide">

            <div class="small-dialog-header">
               <h3>Sign In</h3>
            </div>

            <!--Tabs -->
            <div class="sign-in-form style-1">

               <ul class="tabs-nav">
                  <li class=""><a href="#tab1">Log In</a></li>
                  <li><a href="#tab2">Register</a></li>
               </ul>

               <div class="tabs-container alt">

                  <!-- Login -->
                  <div class="tab-content" id="tab1" style="display: none;">
                     <form method="post" class="login">

                        <p class="form-row form-row-wide">
                           <label for="username">Username:
                              <i class="im im-icon-Male"></i>
                              <input type="text" class="input-text" name="username" id="username" value="" />
                           </label>
                        </p>

                        <p class="form-row form-row-wide">
                           <label for="password">Password:
                              <i class="im im-icon-Lock-2"></i>
                              <input class="input-text" type="password" name="password" id="password"/>
                           </label>
                           <span class="lost_password">
                              <a href="#" >Lost Your Password?</a>
                           </span>
                        </p>

                        <div class="form-row">
                           <input type="submit" class="button border margin-top-5" name="login" value="Login" />
                           <div class="checkboxes margin-top-10">
                              <input id="remember-me" type="checkbox" name="check">
                              <label for="remember-me">Remember Me</label>
                           </div>
                        </div>

                     </form>
                  </div>

                  <!-- Register -->
                  <div class="tab-content" id="tab2" style="display: none;">

                     <form method="post" class="register">

                     <p class="form-row form-row-wide">
                        <label for="username2">Username:
                           <i class="im im-icon-Male"></i>
                           <input type="text" class="input-text" name="username" id="username2" value="" />
                        </label>
                     </p>

                     <p class="form-row form-row-wide">
                        <label for="email2">Email Address:
                           <i class="im im-icon-Mail"></i>
                           <input type="text" class="input-text" name="email" id="email2" value="" />
                        </label>
                     </p>

                     <p class="form-row form-row-wide">
                        <label for="password1">Password:
                           <i class="im im-icon-Lock-2"></i>
                           <input class="input-text" type="password" name="password1" id="password1"/>
                        </label>
                     </p>

                     <p class="form-row form-row-wide">
                        <label for="password2">Repeat Password:
                           <i class="im im-icon-Lock-2"></i>
                           <input class="input-text" type="password" name="password2" id="password2"/>
                        </label>
                     </p>

                     <input type="submit" class="button border fw margin-top-10" name="register" value="Register" />

                     </form>
                  </div>

               </div>
            </div>
         </div>
         <!-- Sign In Popup / End -->

      </div>
   </div>
   <!-- Header / End -->

</header>
<div class="clearfix"></div>
<!-- Header Container / End -->

<!-- Slider
================================================== -->
<div class="listing-slider mfp-gallery-container margin-bottom-0" id="service_img_uri"></div>

   <!-- Content
    ================================================== -->
   <div class="container">
      <div class="row sticky-wrapper">
         <div class="col-lg-8 col-md-8 padding-right-30" >

            <!-- Titlebar -->
            <div id="titlebar" class="listing-titlebar">
               <div class="listing-titlebar-title">
                  <h2 id="service_title" style="font-size: xx-large; margin-bottom: 15px" >
                            <span id="category_subject" style="font-size: large" class="listing-tag"></span>&nbsp;&nbsp;&nbsp;</h2>
                  <span>
                  <a href="#listing-location" class="listing-address" id="location-data">
                     <i class="fa fa-map-marker"></i>
                     <span id="address_state" ></span>&nbsp;<span id="address_city"></span>&nbsp;<span id="address_dong"></span>
                  </a>
               </span>
                  <div id="hashTag"></div>
               </div>
            </div>

            <!-- Listing Nav -->
            <div id="listing-nav" class="listing-nav-container">
               <ul class="listing-nav">
                  <li><a href="#listing-overview" class="active">어떤 수업인가요?</a></li>
                  <li><a href="#listing-location">위치</a></li>
                  <li><a href="#listing-schedule">일정</a></li>
                  <li><a href="#listing-pricing-list">결제하기</a></li>
               </ul>
            </div>

            <!-- Service Description -->
            <div id="listing-overview" class="listing-section">
               <p id="service_description"></p>
               <div class="clearfix"></div>
            </div>
            <!-- Service Description / END -->


                <!-- Gallery -->
<!--                <div id="listing-gallery" class="listing-section" style="margin-bottom: 30px">-->
<!--                    <div class="add-listing-headline">-->
<!--                        <h3 class="listing-desc-headline margin-top-70"><i class="sl sl-icon-camera"></i>갤러리</h3>-->
<!--                        <div class="listing-slider-small mfp-gallery-container margin-bottom-0" id="service_img_uri"></div>-->
<!--                    </div>-->
<!--                </div>-->
                <!-- Gallery / END -->

            <!-- Location -->
            <div id="listing-location" class="listing-section" style="margin-bottom: 30px">
               <div class="add-listing-headline">
                  <h3><i class="sl sl-icon-location"></i>위치</h3>
               </div>
               <div id="singleListingMap-container">
                  <div id="singleListingMap" data-latitude="40.70437865245596" data-longitude="-73.98674011230469" data-map-icon="im im-icon-Hamburger"></div>
                  <a href="#" id="streetView">Street View</a>
               </div>
            </div>
            <!-- Location / End -->

            <!-- Schedule -->
            <div id="listing-schedule" class="listing-section" style="margin-bottom: 30px">
               <div class="add-listing-headline">
                  <h3><i class="sl sl-icon-calender"></i> 일정</h3>
               </div>
               <div id='loading'>loading...</div>
               <div id='calendar'></div>
            </div>
            <!-- Schedule / End -->


            <!-- Price & Account -->
            <div id="listing-pricing-list" class="listing-section">
               <div class="add-listing-headline">
                  <h3><i class="sl sl-icon-credit-card"></i> 결제하기</h3>
               </div>
               <div class="pricing-list-container">
                  <ul>
                     <li>
                        <h5 id="service_price_description"></h5>
                        <p id="account_bank"><p id="account_number"></p></p>
                        <span id="service_price">\</span>
                     </li>
                  </ul>
               </div>
            </div>
            <!-- Price & Account / End -->
         </div>

         <!-- Sidebar ================================================== -->
         <div class="col-lg-4 col-md-4 margin-top-75 sticky">

            <!-- Contact -->
            <div class="boxed-widget margin-top-35" style="margin-left: 15px">
               <div class="hosted-by-title">
                  <h4 id="member_nickname"><span>선생님 소개</span></h4>
                  <a href="#" class="hosted-by-avatar" id="member_img"></a>

               </div>
               <!--  -->
               <ul class="listing-details-sidebar social-profiles">
                  <li><i class="sl sl-icon-emotsmile"></i><span>자기소개</span></li>
                  <li><blockquote><p id="introduce"></p></blockquote></li>
               </ul>
               <!-- 경력 -->
               <ul class="listing-details-sidebar social-profiles">
                  <li><i class="sl sl-icon-briefcase"></i><span>경력</span></li>
                  <li id="career"></li>
               </ul>
               <!-- 자격증 -->
               <ul class="listing-details-sidebar social-profiles">
                  <li><i class="sl sl-icon-trophy"></i><span>자격증</span></li>
                  <li id="certi"></li>
               </ul>
               <!-- 이메일 -->
               <ul class="listing-details-sidebar social-profiles">
                  <li><i class="sl sl-icon-envelope-open"></i><span>이메일</span></li>
                  <li id="member_email"></li>
               </ul>
            </div>
            <!-- Contact / End-->
         </div>
         <!-- Sidebar / End -->
      </div>
   </div>


<!-- Footer
================================================== -->
<div id="footer" class="margin-top-15">
   <!-- Main -->
   <div class="container">
      <div class="row">
         <div class="col-md-5 col-sm-6">
            <img class="footer-logo" src="/img/logo.png" alt="">
            <br><br>
            <p>Morbi convallis bibendum urna ut viverra. Maecenas quis consequat libero, a feugiat eros. Nunc ut lacinia tortor morbi ultricies laoreet ullamcorper phasellus semper.</p>
         </div>

         <div class="col-md-4 col-sm-6 ">
            <h4>Helpful Links</h4>
            <ul class="footer-links">
               <li><a href="#">Login</a></li>
               <li><a href="#">Sign Up</a></li>
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
               <span>12345 Little Lonsdale St, Melbourne</span> <br>
               Phone: <span>(123) 123-456 </span><br>
               E-Mail:<span> <a href="#">office@example.com</a> </span><br>
            </div>

            <ul class="social-icons margin-top-20">
               <li><a class="facebook" href="#"><i class="icon-facebook"></i></a></li>
               <li><a class="twitter" href="#"><i class="icon-twitter"></i></a></li>
               <li><a class="gplus" href="#"><i class="icon-gplus"></i></a></li>
               <li><a class="vimeo" href="#"><i class="icon-vimeo"></i></a></li>
            </ul>

         </div>

      </div>

      <!-- Copyright -->
      <div class="row">
         <div class="col-md-12">
            <div class="copyrights">© 2019 Listeo. All Rights Reserved.</div>
         </div>
      </div>

   </div>

</div>
<!-- Footer / End -->


<!-- Back To Top Button -->
<div id="backtotop"><a href="#"></a></div>


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

<!-- Maps -->
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
<script type="text/javascript" src="/js/infobox.min.js"></script>
<script type="text/javascript" src="/js/markerclusterer.js"></script>
<script type="text/javascript" src="/js/maps.js"></script>

<!-- Booking Widget - Quantity Buttons -->
<script src="/js/quantityButtons.js"></script>

<!-- Google Calender API JS -->
<script>

    document.addEventListener('DOMContentLoaded', function() {
        var calendarEl = document.getElementById('calendar');
        var calendar = new FullCalendar.Calendar(calendarEl, {

            // 한국어
            locale: 'ko',

            plugins: [ 'interaction', 'dayGrid', 'list', 'googleCalendar' ],

            // 달력날짜 클리 및 드레그
            selectable: false,
            selectHelper: true,
            editable: false,
            eventLimit: true,
            droppable: true,
            navLinks: true,


            header: {
                left: 'prev,next today',
                center: 'title',
                right: 'dayGridMonth,dayGridWeek,dayGridDay,listYear'
            },

            displayEventTime: true, // don't show the time column in list view

            // THIS KEY WON'T WORK IN PRODUCTION!!!
            // To make your own Google API key, follow the directions here:
            // http://fullcalendar.io/docs/google_calendar/
            googleCalendarApiKey: 'AIzaSyAf9FLGRYsetqTQlhM3XIDaS8OAFwBop88',

            eventSources: [
                {
                    //장재원 cal
                    //googleCalendarId: 'j1jang0525@gmail.com'
                },

                {
                    // 이은진 cal
                    googleCalendarId: 'd4ubr8at8721nbgccufo24le5k@group.calendar.google.com',
                    className: '이은진꺼',
                    color: 'yellow',
                    textColor: 'black',


                }

            ],

            // korean Holidays
            // events: 'en.south_korea#holiday@group.v.calendar.google.com',


            eventClick: function(arg) {
                // opens events in a popup window
                window.open(arg.event.url, 'google-calendar-event', 'width=700,height=600');

                arg.jsEvent.preventDefault() // don't navigate in main tab
            },

            loading: function(bool) {
                document.getElementById('loading').style.display =
                    bool ? 'block' : 'none';
            }

        });

        calendar.render();
    });


    var calendar = new Calendar(calendarEl, {
        events: [
            { // this object will be "parsed" into an Event Object
                title: "The Title", // a property!
                start: "2019-10-01", // a property!
                end: "2019-10-02" // a property! ** see important note below about 'end' **
            }
        ]
    });

</script>
<!-- Google Calender API JS / END-->


<!-- Replacing dropdown placeholder with selected time slot -->
<script>
$(".time-slot").each(function() {
   var timeSlot = $(this);
   $(this).find('input').on('change',function() {
      var timeSlotVal = timeSlot.find('strong').text();

      $('.panel-dropdown.time-slots-dropdown a').html(timeSlotVal);
      $('.panel-dropdown').removeClass('active');
   });
});
</script>


<!-- Style Switcher
================================================== -->
<script src="/js/switcher.js"></script>

<div id="style-switcher">
   <h2>Color Switcher <a href="#"><i class="sl sl-icon-settings"></i></a></h2>

   <div>
      <ul class="colors" id="color1">
         <li><a href="#" class="main" title="Main"></a></li>
         <li><a href="#" class="blue" title="Blue"></a></li>
         <li><a href="#" class="green" title="Green"></a></li>
         <li><a href="#" class="orange" title="Orange"></a></li>
         <li><a href="#" class="navy" title="Navy"></a></li>
         <li><a href="#" class="yellow" title="Yellow"></a></li>
         <li><a href="#" class="peach" title="Peach"></a></li>
         <li><a href="#" class="beige" title="Beige"></a></li>
         <li><a href="#" class="purple" title="Purple"></a></li>
         <li><a href="#" class="celadon" title="Celadon"></a></li>
         <li><a href="#" class="red" title="Red"></a></li>
         <li><a href="#" class="brown" title="Brown"></a></li>
         <li><a href="#" class="cherry" title="Cherry"></a></li>
         <li><a href="#" class="cyan" title="Cyan"></a></li>
         <li><a href="#" class="gray" title="Gray"></a></li>
         <li><a href="#" class="olive" title="Olive"></a></li>
      </ul>
   </div>
</div>
<!-- Style Switcher / End -->


<script>
   // =============== Loading & Parsing JSON ==================
    var mock = false;

    $(document).ready(function(){
        if(mock){
            startXhr();
        } else {
        	
            const url = document.location.href;
            const urlArray = url.split('/');
            const serviceId = urlArray[urlArray.length-2];
            var reqJson = new Object();
            reqJson.req = "메롱";
            console.log(serviceId);
             Apis.postRequest('/service-listing/'+serviceId+'/view', reqJson).then(response => {
                showServiceItem(response);
             });
        }
    });

    var xhr;

    function startXhr() {
        xhr = new XMLHttpRequest();
        xhr.open("GET", "/data/single-service.json");
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
        showServiceItem(serviceData);
    }

   // =============== Loading & Parsing JSON / END ==================

   // ==================== Tag & Value Mapping =======================

    var serviceNo;

    function showServiceItem(serviceData) {

       if(mock){
          serviceNo = 0;
      }

      insertValue('service_title', serviceData.serviceTitle);
      insertValue('category_subject', serviceData.categorySubject);
      insertValue('service_price_description', serviceData.serviceDateDescription);
      insertValue('account_bank', serviceData.accountBank);
      insertValue('account_number', serviceData.accountNumber);
      insertValue('service_price', serviceData.servicePrice);
      
      insertValue('member_nickname', serviceData.memberNickname);
      insertValue('career', serviceData.career);
      insertValue('certi', serviceData.certi);
      insertValue('member_email', serviceData.memberEmail);
      
      insertValue('address_state', serviceData.addressState);
      insertValue('address_city', serviceData.addressCity);
      insertValue('address_dong', serviceData.addressDong);
      insertProfileImgResource('member_img', serviceData.memberImg);
      insertNewLineValue('introduce', serviceData.introduce);
      insertNewLineValue('service_description', serviceData.serviceDescription);
 
      /*       insertServiceImgResource('service_img_uri', serviceData.serviceImgUri); */
/*       insertHashTag(serviceData); */

   }

   // 1) 단일 값 맵핑
   function insertValue(tag, column) {

      document.getElementById(tag).appendChild(document.createTextNode(column));

   }

   // 2) 해쉬태그 맵핑
   function insertHashTag(serviceData) {

       var hashTagItem = document.getElementById('hashTag');

      for (var i = 0; i < serviceData .hashTag.length; i++) {

         hashTagItem.appendChild(document.createTextNode(' #'));
         hashTagItem.appendChild(document.createElement('span')
                     .appendChild(document.createTextNode(serviceData.hashTag[i])));
      }
   }

   // 3) 서비스 이미지 소스 맵핑
   function insertServiceImgResource(tag, column) {

      var imgTag = document.getElementById(tag);

      for(var i = 0; i < column.length; i++){

         const serviceImg = document.createElement('a');
         serviceImg.setAttribute('href', column[i]);
         serviceImg.setAttribute('data-background-image', column[i]);
         serviceImg.setAttribute('class', 'item mfp-gallery');
         serviceImg.setAttribute('style','background-image: url("'+column[i]+'"); width: 476px;');
         imgTag.appendChild(serviceImg);

      }

   }

   // 4) 프로필 이미지 소스 맵핑
   function insertProfileImgResource(tag, column) {

      const imgTag = document.getElementById(tag);
      const imgItem = document.createElement('img');
      imgItem.setAttribute('src', column);
      imgTag.appendChild(imgItem);
   }


   // 5) 개행문자를 포함한 소스 맵핑
   function insertNewLineValue(tag, column) {
      var spliceStr = column.split('\n');

      for(var i in spliceStr) {
         var newpara = document.createElement('p');
         var sometext = document.createTextNode(spliceStr[i]);
         newpara.appendChild(sometext);
         var existingObjet = document.getElementById(tag);
         existingObjet.appendChild(newpara);
      }
   }


   // ==================== Tag & Data Mapping / END =======================
</script>
</body>
</html>