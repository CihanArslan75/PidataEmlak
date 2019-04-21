<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Emlak Bilgileri Giriş Formu</legend>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="estateid">Yetkili İşletme Adı :</label>
  <div class="col-md-4">
    <select id="estateid" name="estateid" class="form-control">
      <option itemLabel="Bir Kayıt Seçmelisiniz..." />
	  <option value="listeC" var="liste" itemLabel="${liste.ad}" itemValue="${liste.id}"/>
    </select>
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="customerid">Müşteri Adı Soyadı :</label>
  <div class="col-md-4">
    <select id="customerid" name="customerid" class="form-control">
      <option itemLabel="Bir Kayıt Seçmelisiniz..." />
	  <option value="listeC" var="liste" itemLabel="${liste.ad}" itemValue="${liste.id}"/>
    </select>
  </div>
</div>
<div class="form-group">
	<label class="control-label col-md-4">Emlak Tipi :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="estatetype" name="estatetype">
		<option itemLabel="Bir Kayıt Seçmelisiniz..." />
		<option value="listeC" var="liste" itemLabel="${liste.ad}" itemValue="${liste.id}"/>
	</select>
	</div>
</div>

<div class="form-group">
	<label class="control-label col-md-4">Emlağın Durumu :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="estatestate" name="estatestate">
		<option itemLabel="Bir Kayıt Seçmelisiniz..." />
		<option value="listeC" var="liste" itemLabel="${liste.ad}" itemValue="${liste.id}"/>
	</select>
	</div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">MetreKaresi :</label>  
  <div class="col-md-4">
  <input id="size" name="size" class="form-control input-md" type="text">
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Oda Sayısı :</label>  
  <div class="col-md-4">
  <input id="roomnumber" name="roomnumber" class="form-control input-md" type="text">
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Katı :</label>  
  <div class="col-md-4">
  <input id="floor" name="floor" class="form-control input-md" type="text">
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Emlağın Yaşı :</label>  
  <div class="col-md-4">
  <input id="buildingage" name="buildingage" class="form-control input-md" type="text">
  </div>
</div>
<div class="form-group">
	<label class="control-label col-md-4">Yapı Tipi :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="buildingtype" name="buildingtype">
		<option itemLabel="Bir Kayıt Seçmelisiniz..." />
		<option value="listeC" var="liste" itemLabel="${liste.ad}" itemValue="${liste.id}"/>
	</select>
	</div>
</div>
<div class="form-group">
	<label class="control-label col-md-4">Isınma Tipi :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="warmingtype" name="warmingtype">
		<option itemLabel="Bir Kayıt Seçmelisiniz..." />
		<option value="listeC" var="liste" itemLabel="${liste.ad}" itemValue="${liste.id}"/>
	</select>
	</div>
</div>

<div class="form-group">
	<label class="control-label col-md-4">Tapunun Türü :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="deedtype" name="deedtype">
		<option itemLabel="Bir Kayıt Seçmelisiniz..." />
		<option value="listeC" var="liste" itemLabel="${liste.ad}" itemValue="${liste.id}"/>
	</select>
	</div>
</div>

<!-- Textarea -->
<div class="form-group">
  <label class="col-md-4 control-label" for="address">Adres :</label>
  <div class="col-md-4">                     
    <textarea class="form-control" id="address" name="textarea-4">.</textarea>
  </div>
</div>
<div class="form-group">
	<label class="control-label col-md-4">İl :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="province" name="province">
		<option itemLabel="Bir Kayıt Seçmelisiniz..." />
		<option value="listeC" var="liste" itemLabel="${liste.ad}" itemValue="${liste.id}"/>
	</select>
	</div>
</div>
<div class="form-group">
	<label class="control-label col-md-4">İlçe :</label>
	<div class="col-md-4 ">				
	<select class="select2_single form-control" id="ls" value="district" name="district">
		<option itemLabel="Bir Kayıt Seçmelisiniz..." />
		<option value="listeC" var="liste" itemLabel="${liste.ad}" itemValue="${liste.id}"/>
	</select>
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
