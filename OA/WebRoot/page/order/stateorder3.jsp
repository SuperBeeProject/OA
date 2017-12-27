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
				<h2 class="text-center">查看生产记录</h2>
	            	<hr>
				<table class="table table-hover table-bordered">
		            		<tr>
		            			<td>订单编号</td>
		            			<td>客户名称</td>
		            			<td>产品名称</td>
		            			<td>产品规格</td>
		            			<td>产品批号</td>		
		            			<td>数量</td>		            			
		            			<td>开始时间</td>
		            			<td>结束时间</td>
		            			<td>生产负责人</td>
		            			<td>任务单负责人</td>		            			
		            			<td>生产情况描述</td>	            					            					            			
		            		</tr>
		            	<c:forEach var="mon" items="${requestScope.monlist}">
		            		<tr>
		            			<%-- <td style="display: none;" class="thisorderid">${mon.proorderid}</td> --%>
		            			<td>${mon.orders.ordernumber}</td>
		            			<td>${mon.orders.customer.customername}</td>
		            			<td>${mon.orders.product.productname}</td>
		            			<td>${mon.orders.product.productno}</td>
		            			<td>${mon.productno}</td>
		            			<td>${mon.quantity}</td>
		            			<td>${mon.starttime}</td>
		            			<td>${mon.endtiem}</td>
		            			<td>${mon.employeeByProducter.name}</td>		            			
		            			<td>${mon.employeeByProorderpeople.name}</td>
		            			<td>${mon.situation}</td>
		            		</tr>     	
		            	</c:forEach>	
		            		
		            	</table>