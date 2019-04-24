<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<jsp:include page="/index"></jsp:include>

<form class="form-horizontal" action="realEstateAgent" method="post">
    <fieldset>
     <div class="x_panel">
      <div class="col-md-12">
		<div class="col-md-3"></div>
		<div class="col-md-6">
        <!-- Form Name -->
        <h1 align="center">İşletme Bilgileri Giriş Formu </h1>
        </br>
          <p style="color:red;" align="center" >${displayArea}</p>
        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="reaname">İşletme Adı : </label>

            <div class="col-md-8">
                <input id="reaname" name="reaname" type="text" placeholder="İşletme Adı Giriniz" class="form-control input-md" required="">
                <p style="color:red;">Zorunlu Alan</p>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="ownernamesurname">İşletme Yetkilisi : </label>

            <div class="col-md-8">
                <input id="ownernamesurname" name="ownernamesurname" type="text" placeholder="" class="form-control input-md"  required="">
                 <p style="color:red;">Zorunlu Alan</p>
            </div>
        </div>
          <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="mobilePhone">Cep Telefonu : </label>

            <div class="col-md-8">
                <input id="mobilephone" name="mobilephone" type="text" placeholder="" class="form-control input-md"    >
            </div>
        </div>
          <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="fax">Fax : </label>

            <div class="col-md-8">
                <input id="fax" name="fax" type="text" placeholder="" class="form-control input-md"  >
            </div>
        </div>

        <!-- Textarea -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="address">Adres : </label>

            <div class="col-md-8">
                <textarea class="form-control" id="address" name="address"></textarea>
            </div>
        </div>
        <!-- Button (Double) -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="saveBtn"></label>

            <div class="col-md-8">
                <button id="saveBtn" name="saveBtn" class="btn btn-success">Kaydet</button>
            </div>
        </div>
		</div>
		  <div class="col-md-3"></div>
  </div>
  </div>
    </fieldset>

</body>