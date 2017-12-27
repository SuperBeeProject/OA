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
	            			<td>供应商名称</td>
	            			<td>物品名称</td>
	            			<td>数量</td>
	            			<td>成交金额</td>
	            			<td>生成日期</td>
	            			<td>发起人</td>
	            			<td>状态</td>
	            			<td>操作</td>
	            		</tr>	
	            		<c:forEach var="procurement" items="${requestScope.listProcurement}">
	            		<tr>
	            			<td style="display: none" class="procurementid">${procurement.procurementid}</td>
	            			<td>${procurement.ordernumber}</td>
	            			<td>${procurement.provider.providername}</td>
	            			<td>${procurement.material.materialname}</td>
	            			<td>${procurement.quantity}</td>
	            			<td>${procurement.price}</td>
	            			<td>${procurement.datetime}</td>
	            			<td>${procurement.employeeByOriginator.name}</td>
	            			<td>${procurement.state.statename}</td>
	            			<td><a href="javascript:void(0)" class="pass">审核</a>/<a href="javascript:void(0)" class="cancel">取消</a></td>
	            		</tr>
	            		
	            		</c:forEach>
	            		            		
	            	</table>
	            	<table>
	            		<tr>
	            		<td><a href="javascript:void(0)" class="first">首页</a></td>	            		
	            		<td><a href="javascript:void(0)" class="next">上一页</a></td>	            		
	            		<td><a href="javascript:void(0)" class="back">下一页</a></td>            		
	            		<td><a href="javascript:void(0)" class="last">末页</a></td>	
	            		</tr>            		
	            	</table>
