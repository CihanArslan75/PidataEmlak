<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<jsp:include page="/index"></jsp:include>
<form class="form-horizontal" action="customer" method="post">
    <fieldset>

        <!-- Form Name -->
        <h1 align="center">Müşteri Bilgileri Giriş Formu </h1>
 		</br>
          <p style="color:red;" align="center" >${displayArea}</p>
        <!-- Text input-->
		<!-- Select Basic -->
		<div class="form-group">
		  <label class="col-md-4 control-label" for="estateid">Alıcı/Satıcı :</label>
		  <div class="col-md-4">
		    <select id="customertype" name="customertype" class="form-control">
		      <option value="0">Alıcı</option>
  			  <option value="1">Satıcı</option>
		    </select>
		  </div>
		</div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="reaname">Müşteri Adı : </label>
            <div class="col-md-5">
                <input id="name" name="name" type="text" placeholder="Müşterinin Adını Giriniz" class="form-control input-md"  required="">
                <p style="color:red;font-size=10px">Zorunlu Alan</p>
            </div>
        </div>
        
         <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="reaname">Müşteri Soyadı : </label>
            <div class="col-md-5">
                <input id="surname" name="surname" type="text" placeholder="Müşterinin Soyadı Giriniz" class="form-control input-md"  required="">
                <p style="color:red;">Zorunlu Alan</p>
            </div>
        </div>
      
          <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="mobilephone">Cep Telefonu : </label>

            <div class="col-md-5">
                <input id="mobilephone" name="mobilephone" type="text" placeholder="" class="form-control input-md"    >
            </div>
        </div>
          <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="email">Email : </label>

            <div class="col-md-5">
                <input id="email" name="email" type="text" placeholder="" class="form-control input-md"  >
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
</form>l>