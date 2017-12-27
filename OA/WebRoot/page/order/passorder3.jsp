<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/production.js"></script>
			<h2 class="text-center">生产任务单</h2>
	            	<hr>
	            	<form action="javascript:void(0)" id="productOrder">
	            		<table class="table">
		            		<tr>	            				
	            				<td>订单号：</td>
	            				<td><input type="text" value="${requestScope.waitpass.ordernumber}"> 
	            					<input type="hidden" id="ordersorderid" name="orders.orderid" value="${requestScope.waitpass.orderid}">
	            				</td>
	            				<td>客户名称：</td>
	            				<td><input type="text" value="${requestScope.waitpass.customer.customername}"></td>
	            			</tr>	
	            			<tr>
	            				<td>生产批号：</td>
	            				<td><input type="text" name="proorder.productno"></td>
	            				<td>发起时间：</td>
	            				<td><input type="date" name="proorder.datetime"></td>
	            			</tr>       		
	            			<tr>
	            				<td>产品名称：</td>
	            				<td><input type="text" value="${requestScope.waitpass.product.productname}"></td>
	            				<td>产品规格：</td>
	            				<td><input type="text" value="${requestScope.waitpass.product.productno}"></td>
	            				<td>包装方式：</td>
	            				<td><input type="text" name="proorder.packing"></td>
	            			</tr>
	            			<tr>
	            				<td>单位：</td>
	            				<td><input type="text" value="${requestScope.waitpass.product.unit}"></td>	
	            				<td>数量：</td>
	            				<td><input type="text" value="${requestScope.waitpass.quantity}"></td>	     				
	            			</tr>
	            			<tr>
	            				<td>任务单负责人：${sessionScope.employee.name} </td>
	            				<td><input type="hidden" name="employee.employeeid" value="1" <%-- ${sessionScope.employee.employeeid} --%>></td>
	            				<td>备注：</td>
	            				<td><input type="text" name="proorder.remarks"></td>	            				
	            			</tr>
		            	</table>
		            	<input class="btn btn-primary" id="orderdown" type="button" value="下单" style="position: relative; left: 45%;">
	            	</form>