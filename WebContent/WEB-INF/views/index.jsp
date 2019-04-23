<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>

<html lang="tr" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
	xmlns:h="http://xmlns.jcp.org/jsf/html"
	xmlns:f="http://xmlns.jcp.org/jsf/core"
	xmlns:p="http://primefaces.org/ui"
	xmlns:c="http://java.sun.com/jsp/jstl/core">

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
	

    <title>	EMLAK SİTESİ  </title>

  
    <link type="text/css" rel="stylesheet" 	href="resources/vendors/bootstrap/dist/css/bootstrap.min.css?ln=css" />
    <link type="text/css" rel="stylesheet" 	href="resources/vendors/font-awesome/css/font-awesome.min.css?ln=css" /> 
    <link type="text/css" rel="stylesheet" 	href="resources/vendors/nprogress/nprogress.css?ln=css" />
    <link type="text/css" rel="stylesheet" 	href="resources/vendors/iCheck/skins/flat/green.css?ln=css" />
	<link type="text/css" rel="stylesheet"	href="resources/vendors/google-code-prettify/bin/prettify.min.css?ln=css" />
    <link type="text/css" rel="stylesheet"	href="resources/vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css?ln=css" />
	<link type="text/css" rel="stylesheet"	href="resources/vendors/jqvmap/dist/jqvmap.min.css?ln=css" />
	<link type="text/css" rel="stylesheet"	href="resources/vendors/bootstrap-daterangepicker/daterangepicker.css?ln=css" />
	<link type="text/css" rel="stylesheet"	href="resources/build/css/custom.min.css?ln=css" />

</head>

<body class="nav-md ">
 <form id="frmdefault" method="post" action="estateprocess">
  <div class="hide">
	   <button id="btnurl" name="btnurl"  type="submit" value="URL ver" /> 
	   <input id="txtId" name="txtId" />
  </div>
  <div class="container body ">
      <div class="main_container">
         <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.jsp" class="site_title"><i class="fa fa-shopping-cart"></i> <span>Emlak Paneli</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="resources/images/img.jpg" alt="..." class="img-circle profile_img" />
              </div>
              <div class="profile_info">
                <span>Hoşgeldin, ${loginUser} </span>
                <h2><outputLabel value="1"/> </h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
             
                <ul class="nav side-menu">
                  <li><a href="#" onclick="url(1)"><i class="fa fa-desktop"></i> İşyeri Yeni Kayıt </a></li>
                  <li><a href="#" onclick="url(2)"><i class="fa fa-table"></i> Müşteri Yeni Kayıt </a></li>
                  <li><a href="#" onclick="url(3)"><i class="fa fa-bar-chart-o"></i> Emlak Girişi </a></li>
                  <li><a href="#" onclick="url(4)"><i class="fa fa-clone"></i> Emlak Listeleme  </a></li>
                  <li><a><i class="fa fa-desktop"></i> Özel İşlemler <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="#" onclick="url(4)">Excel e Aktar</a></li>
                      <li><a href="#" onclick="url(5)">Ürünleri XML e Aktar</a></li>
                      <li><a href="#" onclick="url(6)">PDF Olarak Rapor  Çıkart</a></li>
                     </ul>
                  </li>
                </ul>
              </div>
              
              </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.jsp">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="resources/images/img.jpg" alt="" />John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Help</a></li>
                    <li><a href="login.jsp"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <div class="text-center">
                        <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->
      
      
           
        </div>
        
      </div>
 </div>

	<script type="text/javascript" src="resources/vendors/jquery/dist/jquery.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/bootstrap/dist/js/bootstrap.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/fastclick/lib/fastclick.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/nprogress/nprogress.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Chart.js/dist/Chart.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/gauge.js/dist/gauge.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/bootstrap-progressbar/bootstrap-progressbar.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/iCheck/icheck.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/skycons/skycons.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Flot/jquery.flot.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Flot/jquery.flot.pie.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Flot/jquery.flot.time.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Flot/jquery.flot.stack.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/Flot/jquery.flot.resize.js?ln=js"></script>
	
	<script type="text/javascript" src="resources/vendors/flot.orderbars/js/jquery.flot.orderBars.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/flot-spline/js/jquery.flot.spline.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/flot.curvedlines/curvedLines.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/DateJS/build/date.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/jqvmap/dist/jquery.vmap.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/jqvmap/dist/maps/jquery.vmap.world.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/moment/min/moment.min.js?ln=js"></script>
	<script type="text/javascript" src="resources/vendors/bootstrap-daterangepicker/daterangepicker.js?ln=js"></script>
	<script type="text/javascript" src="resources/build/js/custom.min.js?ln=js"></script>
    <script type="text/javascript" src="resources/vendors/jquery.tagsinput/src/jquery.tagsinput.js?ln=js"></script>
    <script type="text/javascript" src="resources/vendors/bootstrap-wysiwyg/js/bootstrap-wysiwyg.min.js?ln=js"></script>
    <script type="text/javascript" src="resources/vendors/jquery.hotkeys/jquery.hotkeys.js?ln=js"></script>
    <script type="text/javascript" src="resources/vendors/google-code-prettify/src/prettify.js?ln=js"></script>
   <script>
   
  function url(id){
	  console.log("id:"+id);
      document.getElementById('txtId').value=id;
	  document.getElementById('btnurl').click();
  }
  
  </script>
  
  </form>
</body>


</html>
