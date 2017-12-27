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
				<table class="table table-hover table-bordered">
		            		<tr>
		            			<td>订单编号</td>
		            			<td>客户名称</td>
		            			<td>业务员</td>
		            			<td>生成日期</td>		            			
		            			<td>操作</td>
		            		</tr>
		            	<c:forEach var="state" items="${requestScope.stateOrderlist}">
		            		<tr>
		            			<td style="display: none;" class="thisorderid">${state.orderid}</td>
		            			<td>${state.ordernumber}</td>
		            			<td>${state.customer.customername}</td>
		            			<td>${state.employeeByOriginator.name}</td>
		            			<td>${state.datetime}</td>
		            			<td><input id="examine" type="button" value="审核"></td>
		            		</tr>     	
		            	</c:forEach>	
		            		
		            	</table>