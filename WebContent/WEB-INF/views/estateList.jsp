<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<jsp:include page="/index"></jsp:include>
<form class="form-horizontal"  action="estateList" method="post" id="estateList">
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
					  <select class="select2_single form-control" id="estateType1"  name="estateType1">
					    <option value=""></option>
						<option value="KONUT"  <c:if test='${estateType1 == "KONUT"}'> selected </c:if> >KONUT</option>
				  		<option value="İŞYERİ" <c:if test='${estateType1 == "İŞYERİ"}'> selected </c:if>  >İŞYERİ</option>
					</select>
					  </div>
					</div>
					
					<div class="form-group">
					  <label class="col-md-4 control-label" for="estateState1">Emlağın Türü :</label>  
					  <div class="col-md-4">
					  <select class="select2_single form-control" id="estateState1"  name="estateState1">
					     <option value=""></option>
						<option value="SATILIK" <c:if test='${estateState1 == "SATILIK"}'> selected </c:if> >SATILIK</option>
				  		<option value="KİRALIK" <c:if test='${estateState1 == "KİRALIK"}'> selected </c:if> >KİRALIK</option>
				  		
					</select>
					 </div>
					
					 
					</div>
					<div class="form-group  col-md-6">
					  <label class="col-md-6 control-label" for="price1">Fiyat Aralığı :</label>  
					  <div class="col-md-6">
					 	<input id="price1" name="price1" value="${price1}" class="form-control input-md" type="text" >
					  </div>
					</div>
					<div class="form-group  col-md-6">
					    <div class="col-md-6">
					  	<input id="price2" name="price2" value="${price2}" class="form-control input-md" type="text">
					  </div>
					</div>
					
					  <div class="form-group col-md-2">
						   <div class="col-md-6" align="center">
						  
						  </div>
					  </div>
					  <div class="form-group col-md-5">
						   <div class="col-md-6" align="center">
						    <button id="buttonSearch" name="buttonSearch"  class="btn btn-success">Emlak Ara</button>
						  </div>
					  </div>
					  <div class="form-group  col-md-5">
						
						  <div class="col-md-6" align="center">
						    <button id="buttonExcel" name="buttonExcel"  value="excel" class="btn btn-success">Emlak Kayıtlarını Excele Aktar </button>
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
									<th style="text-align: left" class="control-label">PDF</th>	
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
									  <td style="text-align: right">
										<div>
											<button  name="buttonPDF"
												class="btn btn-round btn-success col-lg-6 " onclick="pdf(${ls.id})" value="PDF" >PDF</button>
										</div>
									</td>
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
