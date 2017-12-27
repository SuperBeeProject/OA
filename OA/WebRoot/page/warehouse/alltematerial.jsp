<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/warehouse.js"></script>
<script type="text/javascript">
	$(function () {
		function pageNo() {
			var nowpageno = $("#tematerial-nowpageno").text();
			var maxpageno = $("#tematerial-maxpageno").text();
			if(nowpageno == 1){
				$("#tematerial-first").attr({"disabled":"disabled"});
				$("#tematerial-up").attr({"disabled":"disabled"});
			}
			if(nowpageno == maxpageno){
				$("#tematerial-down").attr({"disabled":"disabled"});
				$("#tematerial-last").attr({"disabled":"disabled"});
			}
		}
		pageNo();
	});
</script>
<table class="table table-hover table-bordered">
	<tr>
		<td>订单编号</td>
		<td>发起人</td>
		<td>时间</td>
		<td>操作</td>
	</tr>
	<c:forEach var="tematerial" items="${ requestScope.allTematerial }">
		<tr>
			<td>${ tematerial.ordernumber }</td>
			<td>${ tematerial.employeeByOriginator.name }</td>
			<td>${ tematerial.datetime }</td>
			<td>
				<input type="hidden" value="${ tematerial.ordernumber }">
				<input type="button" value="查看" class="gtematerial">
			</td>
		</tr>
	</c:forEach>
</table>
<div class="text-center">
	<input id="tematerial-first" class="btn btn-default" type="button" value="首页">
	<input id="tematerial-up" class="btn btn-default" type="button" value="上一页">
	<span>第<span id="tematerial-nowpageno">${ requestScope.nowpageno }</span>/<span id="tematerial-maxpageno">${ requestScope.countNo }</span>页</span>
	<input id="tematerial-down" class="btn btn-default" type="button" value="下一页">
	<input id="tematerial-last" class="btn btn-default" type="button" value="末页">
</div>
