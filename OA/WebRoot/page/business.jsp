<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/header.jsp" %>
<%@include file="common/js.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<script src="${pageContext.request.contextPath }/jst/business.js"></script>
	<section>
		<div id="content" class="row-fluid" style="overflow:hidden;">
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <div class="container">
				    <div class="row">
				        <div class="span2">
				            <ul class="nav nav-pills nav-stacked">
				                <li id="mi" class="active"><a href="javascript:void(0)">账号信息</a></li>
				                <li id="fat"><a href="javascript:void(0)">查看出勤</a></li>
				                <li id="fan"><a href="javascript:void(0)">发布公告</a></li>
				                <li id="fc"><a href="javascript:void(0)">内部联络</a></li>
				                <li id="fo"><a href="javascript:void(0)">查看订单</a></li>
				                <li id="ao"><a href="javascript:void(0)">生成业务订单</a></li>
				                <li id="cg"><a href="javascript:void(0)">生成采购订单</a></li>
				                <li id="mc"><a href="javascript:void(0)">管理客户</a></li>
	            				<li id="ms"><a href="javascript:void(0)">管理供应商</a></li>	            				
				            </ul>
				        </div>
				    </div>
				</div>
	        </div>
	        
	        <div class="col-md-8 panel" style="background-color: #f8f8f8; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <%@include file="common/public.jsp" %>
	            <div id="forder" style="display: none;">
	            	<h2 class="text-center">查看订单</h2>
	            &nbsp;&nbsp;&nbsp;&nbsp;
	            <a href="javascript:void(0)" class="sale">销售</a> &nbsp;&nbsp;&nbsp;&nbsp; 
	            <a href="javascript:void(0)" class="buy">采购</a>
	            	<hr>
	            <div id="chakan">
	            </div>
	            </div>
	            <div id="aorder" style="display: none;">
	            	<h2 class="text-center">生成业务订单</h2>
	            	<hr>
	            	<form action="javascript:void(0);"  id="orderAdd">
	            		<table class="table">
	            			<tr>
	            				<td>订单号：</td>
	            				<td> 
	            				<input type="text" name="orders.ordernumber" class="orderno"> 
	            				<input type="hidden" name="department.departmentid" value="2" >
	            				<input type="hidden" name="type.typeid" value="1">
	            				<input type="hidden" name="state.stateid" value="1"> 
	            				<input type="hidden" name="employee.employeeid" value="1">	            				
	            				</td>
	            				<td>客户名称：</td>
	            				<td>
								<select style="width:150px" class="cutomerNo" name="customer.customerid">	
	            				</select></td>
	            				<td>发起时间：</td>
	            				<td><input name="orders.datetime" type="date">    </td>
	            			</tr>
	            			<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>
	            			<tr>
	            				
	            				<td>产品名称</td>
	            				<td>单位</td>
	            				<td>数量</td>
	            				<td>单价</td>
	            				<td>合计</td>
	            				<td>备注</td>
	            			</tr>
	            			<tr>
	            				
	            				<td>
	            				<select style="width:150px" class="productid" name="product.productid">	
	            				</select>
	            				</td>			
	            				<td class="unit"></td>
	            				<td><input type="text" name="orders.quantity" class="quantity"></td>
	            				<td class="productprice"></td>
	            				<td><input type="text" name="orders.price" class="totalprice"></td>
	            				<td><input type="text" name="orders.orderremarks"></td>
	            			</tr>
	            		
	            		</table>
	            		<input id="addOrder" class="btn btn-primary" type="button" value="提交订单" style="position: relative; left: 45%;">
	            	</form>
	            </div>
	            
	            
	           <div id="cgrder" style="display: none;">
	            	<h2 class="text-center">生成采购订单</h2>
	            	<hr>
	            	<form action="javascript:void(0);"  id="Procurement">
	            		<table class="table">
	            			<tr>
	            				<td>订单号：</td>
	            				<td> 
	            				<input type="text" name="procurement.ordernumber" class="Procurementnum"> 	            				
								<input type="hidden" name="department.departmentid" value="2" >
	            				<input type="hidden" name="type.typeid" value="1">
	            				<input type="hidden" name="state.stateid" value="1"> 
	            				<input type="hidden" name="employee.employeeid" value="1">			            				</td>
	            				<td>供应商名称：</td>
	            				<td>
								<select style="width:150px" class="providerNo" name="provider.providerid">	
	            				</select></td>
	            				<td>发起时间：</td>
	            				<td><input name="procurement.datetime" type="date">    </td>
	            			</tr>
	            			<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>
	            			<tr>	            				
	            				<td>物品名称</td>
	            				<td>单位</td>
	            				<td>数量</td>
	            				<td>单价</td>
	            				<td>合计</td>
	            				<td>备注</td>
	            			</tr>
	            			<tr>	            				
	            				<td>
	            				<select style="width:150px" class="materialid" name="material.materialid">	
	            				</select>
	            				</td>			
	            				<td class="Procurementunit"></td>
	            				<td><input type="text" name="procurement.quantity" class="Procurementquantity"></td>
	            				<td class="Procurementprice"></td>
	            				<td><input type="text" name="procurement.price" class="Procurementtotalprice"></td>
	            				<td><input type="text" name="procurement.orderremarks"></td>
	            			</tr>
	            		
	            		</table>
	            		<input id="addprocurement" class="btn btn-primary1" type="button" value="提交订单" style="position: relative; left: 45%;">
	            	</form>
	            </div>
	            
	            <div id="customer" style="display: none;">
	            	<h2 class="text-center">管理客户</h2>
	            	<a href="${pageContext.request.contextPath}/page/order/addcustomers.jsp">添加客户</a>
	            	<hr>
	            <div id="allcustomer">
		            	<table class="table table-hover table-bordered" id="custable">
		            		<tr>
		            			<td>客户名称</td>
		            			<td>联系人</td>
		            			<td>电话</td>
		            			<td>地址</td>
		            			<td>客户级别</td>
		            			<td>备注</td>
		            			<td>操作</td>
		            		</tr>
		            		
		            	</table>
	            	</div>
	            	<div id="mcustomer" style="display: none;">
	            	  <form action="javascript:void(0)" id="updcustomer">
	            		<ul class="list-unstyled" style="padding: 50px;">	            		
	            			<li>
	            				请输入修改后的客户名称: 
	            				<input type="text" name="customer.customername" id="customername">	            				            				
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后的地址: 
	            				<input type="text" name="customer.address" id="customeraddress">          				
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后的客户级别: 
	            				<input type="text" name="customer.levels" id="levels">
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后的联系人: 
	            				<input type="text" name="customer.contacts" id="customercontacts">	            			
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后的联系电话: 
	            				<input type="text" name="customer.phone" id="customerphone">	            				
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后的备注: 
	            				<input type="text" name="customer.remarks" id="customerremarks">	            				
	            			</li>
	            			<br>
	            			<li><input class="change" type="button" value="修改"></li>            			
	            		</ul>
	            		</form>
	            		<input id="bc" class="btn btn-primary pull-right" type="button" value="返回">
	            		
	            	</div>
	            
	            </div>
	            <div id="supplier" style="display: none;">
	            	<h2 class="text-center">管理供应商</h2>
	            	<hr>
	            <div id="allsupplier">
		            	<table class="table table-hover table-bordered" id="protable">
		            		<tr>		       
		            			<td>供应商名称</td>
		            			<td>供应商类型</td>
		            			<td>地址</td>
		            			<td>联系电话</td>
		            			<td>联系人</td>
		            			<td>供应的产品</td>
		            			<td>备注</td>
		            			<td>操作</td>		        
		            		</tr>
		            		
		            	</table>
	            	</div>
	            	<div id="msupplier" style="display: none;">
	            	<form action="javascript:void(0)" id="updprovider">
	            		<ul class="list-unstyled" style="padding: 50px;">	            		
	            			<li>
	            				请输入修改后的供应商名称: 
	            				<input type="text" name="provider.providername" id="providername">	            				            				
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后的供应商类型: 
	            				<select style="width:150px"  name="type.typeid">
	            					<option value="2">原料</option>
	            					<option value="3">设备相关</option>
	            					<option value="4">办公用品</option>
	            					<option value="5">杂物</option>
	            				</select>          				
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后的地址: 
	            				<input type="text" name="provider.address" id="provideraddress">
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后的联系电话: 
	            				<input type="text" name="provider.phone" id="providerphone">	            			
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后的联系人: 
	            				<input type="text" name="provider.contacts" id="providercontacts">	            				
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后供应的产品: 
	            				<input type="text" name="provider.comments" id="providercomments">	            				
	            			</li>
	            			<br>
	            			<li>
	            				请输入修改后的备注: 
	            				<input type="text" name="provider.remarks" id="providerremarks">	            				
	            			</li>
	            			<br>
	            			<li><input class="change" type="button" value="修改"></li>            			
	            		</ul>
	            		</form>
	            		<input id="bc" class="btn btn-primary pull-right" type="button" value="返回">
	            	</div>
	            </div>
	            </div>
	        </div>
	        
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <div>
	            	<h3 class="text-center">个人信息</h3>
	            	<ul class="list-unstyled">
	            		<li><label>姓名：</label>${ sessionScope.employee.name }</li>
	            		<li><label>部门：</label>${ sessionScope.employee.department.departmentname }</li>
	            		<li><label>职位：</label>${ sessionScope.employee.post.postname }</li>
	            		<li><label>入职时间：</label><fmt:formatDate value="${ sessionScope.employee.entrytime }" pattern="yyyy-MM-dd"/></li>
	            	</ul>
	            </div>
	        </div>
    	
	</section>
<%@include file="common/footer.jsp" %>  