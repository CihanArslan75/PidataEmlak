<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<form class="form-horizontal">
    <fieldset>

        <!-- Form Name -->
        <legend>İşletme Bilgileri Giriş Formu </legend>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="reaname">İşletme Adı : </label>

            <div class="col-md-5">
                <input id="reaname" name="reaname" type="text" placeholder="İşletme Adı Giriniz" class="form-control input-md" required="">
              
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="ownernamesurname">İşletme Yetkilisi : </label>

            <div class="col-md-5">
                <input id="ownernamesurname" name="ownernamesurname" type="text" placeholder="" class="form-control input-md"  required="">
            </div>
        </div>
          <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="mobilePhone">Cep Telefonu : </label>

            <div class="col-md-5">
                <input id="mobilePhone" name="mobilePhone" type="text" placeholder="" class="form-control input-md"    >
            </div>
        </div>
          <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="fax">Fax : </label>

            <div class="col-md-5">
                <input id="fax" name="fax" type="text" placeholder="" class="form-control input-md"  >
            </div>
        </div>

        <!-- Textarea -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="address">Adres : </label>

            <div class="col-md-4">
                <textarea class="form-control" id="address" name="description"></textarea>
            </div>
        </div>
        <!-- Button (Double) -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="saveBtn"></label>

            <div class="col-md-8">
                <button id="saveBtn" name="saveBtn" class="btn btn-success">Kaydet</button>
            </div>
        </div>

    </fieldset>
</form>