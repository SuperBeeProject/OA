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

				<table class="table">
	            			<tr>
	            				
	            				<td>订单号：</td>
	            				<td>${requestScope.waitpass.ordernumber}</td>
	            				<td>客户名称：</td>
	            				<td>${requestScope.waitpass.customer.customername}</td>
	            				<td>发起时间：</td>
	            				<td>${requestScope.waitpass.datetime}</td>
	            			</tr>
	            			<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>
	            			<tr>
	            				<td>产品名称</td>
	            				<td>产品规格</td>
	            				<td>单位</td>
	            				<td>数量</td>
	            				<td>单价</td>
	            				<td>合计</td>
	            				<td>发起人</td>
	            			</tr>
	            			<tr>
	            				<td>${requestScope.waitpass.product.productname}</td>
	            				<td>${requestScope.waitpass.product.productno}</td>
	            				<td>${requestScope.waitpass.product.unit}</td>
	            				<td>${requestScope.waitpass.quantity}</td>
	            				<td>${requestScope.waitpass.product.productprice}</td>
	            				<td>${(requestScope.waitpass.quantity)*(requestScope.waitpass.product.productprice)}</td>
	            				<td>${requestScope.waitpass.employeeByOriginator.name}</td>
	            			</tr>
	            		</table>
	            		<input type="hidden" id="waitpassid" value="${requestScope.waitpass.orderid}">
	            		<input id="yes" class="btn btn-primary" type="button" value="通过">
	            		<input id="no" class="btn btn-primary" type="button" value="驳回">
	            		<input id="bo" class="btn btn-primary pull-right" type="button" value="返回">