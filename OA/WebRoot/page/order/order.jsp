<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/business.js"></script>
				<table class="table table-hover table-bordered">
	            		<tr>
	            			<td style="display: none">订单表序号</td>
	            			<td>订单编号</td>
	            			<td>客户名称</td>
	            			<td>产品名称</td>
	            			<td>数量</td>
	            			<td>成交金额</td>
	            			<td>生成日期</td>
	            			<td>发起人</td>
	            			<td>状态</td>
	            			<td>操作</td>
	            		</tr>	
	            		<c:forEach var="order" items="${requestScope.listOrders}">
	            		<tr>
	            			<td style="display: none" class="orderid">${order.orderid}</td>
	            			<td>${order.ordernumber}</td>
	            			<td>${order.customer.customername}</td>
	            			<td>${order.product.productname}</td>
	            			<td>${order.quantity}</td>
	            			<td>${order.price}</td>
	            			<td>${order.datetime}</td>
	            			<td>${order.employeeByOriginator.name}</td>
	            			<td>${order.state.statename}</td>
	            			<td><a href="javascript:void(0)" class="pass">审核</a>/<a href="javascript:void(0)" class="cancel">取消</a></td>
	            		</tr>
	            		
	            		</c:forEach>
	            		            		
	            	</table>
	        <!--     	<table>
	            		<tr>
	            		<td><a href="javascript:void(0)" class="first">首页</a></td>	            		
	            		<td><a href="javascript:void(0)" class="next">上一页</a></td>	            		
	            		<td><a href="javascript:void(0)" class="back">下一页</a></td>            		
	            		<td><a href="javascript:void(0)" class="last">末页</a></td>	
	            		</tr>            		
	            	</table> -->
