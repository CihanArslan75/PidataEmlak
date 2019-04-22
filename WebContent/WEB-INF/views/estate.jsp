<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<jsp:include page="/index"></jsp:include>
<form class="form-horizontal"  action="estate" method="post">
<fieldset>

<!-- Form Name -->
<h1 align="center">Emlak Bilgileri Giriş Formu</h1>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="estateid">Yetkili İşletme Adı :</label>
  <div class="col-md-4">
   <select name="agentid" id="agentid"  class="select2_single form-control"   >
	
			<c:forEach items="${listRea}" var="rea">
				<option value="${rea.id}">${rea.agentName}</option>
			</c:forEach>
  </select>
    			
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="customerid">Müşteri Adı Soyadı :</label>
  <div class="col-md-4">
   <select name="customerid"  class="select2_single form-control"  >
		
			<c:forEach items="${listC}" var="cus">
				<option value="${cus.id}">${cus.name}</option>
			</c:forEach>
  </select>
  </div>
</div>
<div class="form-group">
	<label class="control-label col-md-4">Emlak Tipi :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="estatetype" name="estatetype">
		<option value="0">KONUT</option>
  		<option value="1">İŞYERİ</option>
	</select>
	</div>
</div>

<div class="form-group">
	<label class="control-label col-md-4">Emlağın Durumu :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="estatestate" name="estatestate">
		<option value="0">SATILIK</option>
  		<option value="1">KİRALIK</option>
	</select>
	</div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="size">MetreKaresi :</label>  
  <div class="col-md-4">
  <input id="size" name="size" class="form-control input-md" type="text">
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="roomnumber">Oda Sayısı :</label>  
  <div class="col-md-4">
  <input id="roomnumber" name="roomnumber" class="form-control input-md" type="text">
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="floor">Katı :</label>  
  <div class="col-md-4">
  <input id="floor" name="floor" class="form-control input-md" type="text">
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="buildingage">Emlağın Yaşı :</label>  
  <div class="col-md-4">
  <input id="buildingage" name="buildingage" class="form-control input-md" type="text">
  </div>
</div>
<div class="form-group">
	<label class="control-label col-md-4">Yapı Tipi :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="buildingtype" name="buildingtype">
		<option value="0">BETONARME</option>
  		<option value="1">KARKAS</option>
  		<option value="2">AHŞAP</option>
	</select>
	</div>
</div>
<div class="form-group">
	<label class="control-label col-md-4">Isınma Tipi :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="warmingtype" name="warmingtype">
		<option value="0">MERKEZİ</option>
  		<option value="1">DOGALGAZ</option>
  		<option value="2">KAT KALORİFERİ</option>
	</select>
	</div>
</div>


<div class="form-group">
	<label class="control-label col-md-4">Tapunun Türü :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="deedtype" name="deedtype">
		<option value="0">KAT MÜLKİYETİ</option>
  		<option value="1">KAT İRTIFAKI</option>
  		<option value="2">TAPUSUZ</option>
	</select>
	</div>
</div>

<!-- Textarea -->
<div class="form-group">
  <label class="col-md-4 control-label" for="address">Adres :</label>
  <div class="col-md-4">                     
    <textarea class="form-control" id="address" name="address"></textarea>
  </div>
</div>

<!-- Button (Double) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="button1id"></label>
  <div class="col-md-8">
    <button id="button1id" name="button1id" class="btn btn-success">Kaydet</button>
  </div>
</div>

</fieldset>
</form>
