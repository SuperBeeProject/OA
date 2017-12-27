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
			<h2 class="text-center">生产记录</h2>
	            	<hr>
	            	<form action="javascript:void(0)" id="productionrecords">
	            		<table class="table">
		            		<tr>	            				
	            				<td>订单号：</td>
	            				<td><input type="text" value="${requestScope.proorder.orders.ordernumber}"> 
	            					<input type="hidden" id="ordersorderid" name="orders.orderid" value="${requestScope.proorder.orders.orderid}">
	            				</td>
	            				<td>任务单负责人：</td>
	            				<td>${requestScope.proorder.employee.name}
	            					<input type="hidden" name="employeeByProorderpeople" value="${requestScope.proorder.employee.employeeid}">
	            				</td>
	            			</tr>	
	            			<tr>
	            				<td>生产负责人：</td>
	            				<td>
	            					<input type="text" name="employeeByProducter" value="${sessionScope.employee.employeeid}">	            				
	            					
	            				</td>
	            				<td>生产开始时间：</td>
	            				<td><input type="date" name="monitoring.starttime"></td>
	            			</tr>       		
	            			<tr>
	            				<td>生产结束时间：</td>
	            				<td><input type="date" name="monitoring.endtiem"></td>
	            				<td>生产情况描述：</td>
	            				<td><input type="text" name="monitoring.situation"></td>
	            				<td>生产数量：</td>
	            				<td><input type="number" name="monitoring.quantity"></td>
	            			</tr>
	            			<tr>
	            				<td>批号：</td>
	            				<td><input type="text" name="monitoring.productno" value="${requestScope.proorder.productno}"></td>		 	  				
	            			</tr>
	            			
		            	</table>
		            	<input class="btn btn-primary" id="addmon" type="button" value="记录" style="position: relative; left: 45%;">
	            	</form>