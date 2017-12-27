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
				<h2 class="text-center">查看生产任务单</h2>
	            	<hr>
				<table class="table table-hover table-bordered">
		            		<tr>
		            			<td>订单编号</td>
		            			<td>客户名称</td>
		            			<td>产品名称</td>
		            			<td>产品规格</td>
		            			<td>产品批号</td>		
		            			<td>数量</td>
		            			<td>交货日期</td>
		            			<td>包装方式</td>
		            			<td>任务单负责人</td>		            			
		            			<td>备注</td>	            			
		            			<td>操作</td>		            			
		            		</tr>
		            	<c:forEach var="prooder" items="${requestScope.Proorder}">
		            		<tr>
		            			<td style="display: none;" class="thisorderid">${prooder.proorderid}</td>
		            			<td>${prooder.orders.ordernumber}</td>
		            			<td>${prooder.orders.customer.customername}</td>
		            			<td>${prooder.orders.product.productname}</td>
		            			<td>${prooder.orders.product.productno}</td>
		            			<td>${prooder.productno}</td>
		            			<td>${prooder.orders.quantity}</td>
		            			<td>${prooder.time}</td>
		            			<td>${prooder.packing}</td>
		            			<td>${prooder.employee.name}</td>		            			
		            			<td>${prooder.remarks}</td>
		            			<td>	            			
		            			<input id="jilu" type="button" value="生产记录">
		            			</td>
		            		</tr>     	
		            	</c:forEach>	
		            		
		            	</table>