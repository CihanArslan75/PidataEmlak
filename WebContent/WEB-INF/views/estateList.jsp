<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<jsp:include page="/index"></jsp:include>
<body class="hold-transition register-page">
<form class="form-horizontal"  action="estateList" method="post" >
<div class="col-md-12">
<div class="col-md-2"></div>
<div class="col-md-10">
	<div class="">
		<div class="clearfix"></div>
		<div class="row">
			<div class="col-md-12 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2 align="center">Emlak Bilgileri Listesi</h2>
						<div class="clearfix"></div>
					</div>
					<div class="form-group">
					  <label class="col-md-4 control-label" for="estateType1">Emlağın Tipi :</label>  
					  <div class="col-md-4">
					  <select class="select2_single form-control" id="estateType1" value="estateType1" name="estateType1">
						<option value="KONUT">KONUT</option>
				  		<option value="İŞYERİ">İŞYERİ</option>
					</select>
					  </div>
					</div>
					<div class="form-group">
					  <label class="col-md-4 control-label" for="estateState1">Emlağın Türü :</label>  
					  <div class="col-md-4">
					  <select class="select2_single form-control" id="estateState1" value="estateState1" name="estateState1">
						<option value="SATILIK">SATILIK</option>
				  		<option value="KİRALIK">KİRALIK</option>
					</select>
					  </div>
					</div>
					<div class="form-group  col-md-6">
					  <label class="col-md-6 control-label" for="price1">Fiyat Aralığı :</label>  
					  <div class="col-md-6">
					 	<input id="price1" name="price1" class="form-control input-md" type="text">
					  </div>
					</div>
					<div class="form-group  col-md-6">
					    <div class="col-md-6">
					  	<input id="price2" name="price2" class="form-control input-md" type="text">
					  </div>
					</div>
					
					  <div class="form-group">
						  <label class="col-md-4 control-label" for="button1id"></label>
						  <div class="col-md-4" align="center">
						    <button id="button1id" name="button1id" class="btn btn-success">Emlak Ara</button>
						  </div>
					  </div>
					 
					</div>
					<div class="x_content">
						<table id="example"	class="table table-striped responsive-utilities jambo_table" style="font-size: 13px">
							<thead>
								<tr class="control-label">
									<th style="text-align: left" class="control-label" >Emlağın Tipi</th>
									<th style="text-align: left" class="control-label">Emlağın Durumu</th>
									<th style="text-align: left" class="control-label">Emlağın Adresi</th>									
									<th style="text-align: left" class="control-label">Tapunun Türü</th>	
									<th style="text-align: right" class="control-label">Fiyatı</th>	
								</tr>
							</thead>
							<tbody>
								<c:forEach  var="ls" items="${listEstate}">
								 <tr>
									  <td>${ls.estateType}</td>  
									  <td>${ls.estateState}</td> 
									  <td>${ls.address}</td>
									  <td>${ls.deedType}</td>
									  <td style="text-align: right" >${ls.price}</td>
								 </tr>
								</c:forEach>
							</tbody>
						</table>					
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</form>
</body>