<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>
<!DOCTYPE html><html>
<head>
<title>Giriş</title>
<link rel="stylesheet" href="resources/css/halhesapstyles.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script type="text/javascript" src="resources/js/datepicker/js/jquery-1.10.2.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

</head>
<body onload="align()">
	<div class ="background_img"  >
		<div class="container-fluid">
		 	<div class="row-fluid">
 				  <div class="col-lg-4 col-md-6 col-sm-12" style="float: none; margin: 15% auto;">
					<form action="login" method="post">
						<table id="loginTable" class="table-warning">
						    <tr>
						    	<td colspan="2" align="center" ><b><p class="text-danger"> CİHAN ARSLAN</p></b></td>
						    </tr>
						    <tr>
						    	<td colspan="2" align="center" ><b><p class="text-danger"> JAVA PROJESİ</p></b></td>
						    </tr>
							<tr>
								<td class="formlabel" style="height: 30px;"><p class="text-danger">Kullanıcı Adı<p></td>
								<td><input type="text" id="un" name="username"  value="cihan" style="width: 200px;font-size: 20px;" autofocus="autofocus"/></td>
								<c:if test="${error != null}"><td>${error}</td></c:if>
							</tr>
							<tr>
								<td class="formlabel" style="height: 30px;">Şifre</td>
								<td><input type="password" id="p" name="password"  value="cihan" style="width: 200px;font-size: 20px;"/></td>
							</tr>
							<tr>
								<td colspan="3" style="text-align: center; height: 35px;">
								<input type="submit" value="Giriş" style="width: 80px;height: 35px;background-color: #58ACFA;color: white;border: solid 1px grey;font-size: 20px;" /></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
