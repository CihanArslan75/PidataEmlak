<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<jsp:include page="/index"></jsp:include>
<form class="form-horizontal"  action="estate" method="post">
<fieldset>
 <div class="x_panel">
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
		<option value="KONUT">KONUT</option>
  		<option value="İŞYERİ">İŞYERİ</option>
	</select>
	</div>
</div>

<div class="form-group">
	<label class="control-label col-md-4">Emlağın Durumu :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="estatestate" name="estatestate">
		<option value="SATILIK">SATILIK</option>
  		<option value="KİRALIK">KİRALIK</option>
	</select>
	</div>
</div>

<div class="form-group">
	<label class="control-label col-md-4">Emlağın Fiyatı</label>
	<div class="col-md-4">
	<input  type="text" class="form-control has-feedback-left" id="price" name="price"
		onkeyup="var pos=this.selectionStart;
		 	     var size = this.value.length;	
							this.value=this.value.replace(/,/g,'.').replace(/[^0-9,'.']+/g, '');
             				if(this.value.indexOf('.')!=this.value.lastIndexOf('.'))
								this.value=this.value.substring(0,size-1);
							"
							onfocus="
							this.value=''
							" />
	<span class="fa fa-try form-control-feedback left"  aria-hidden="true"></span>
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
		<option value="BETONARME">BETONARME</option>
  		<option value="KARKAS">KARKAS</option>
  		<option value="AHŞAP">AHŞAP</option>
	</select>
	</div>
</div>
<div class="form-group">
	<label class="control-label col-md-4">Isınma Tipi :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="warmingtype" name="warmingtype">
		<option value="MERKEZİ">MERKEZİ</option>
  		<option value="DOGALGAZ">DOGALGAZ</option>
  		<option value="KAT KALORİFERİ">KAT KALORİFERİ</option>
	</select>
	</div>
</div>


<div class="form-group">
	<label class="control-label col-md-4">Tapunun Türü :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="deedtype" name="deedtype">
		<option value="KAT MÜLKİYETİ">KAT MÜLKİYETİ</option>
  		<option value="KAT İRTİFAKI">KAT İRTİFAKI</option>
  		<option value="TAPUSUZ">TAPUSUZ</option>
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
</div>
</fieldset>
</form>
