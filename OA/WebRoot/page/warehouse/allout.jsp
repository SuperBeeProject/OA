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
			var nowpageno = $("#allout-nowpageno").text();
			var maxpageno = $("#allout-maxpageno").text();
			if(nowpageno == 1){
				$("#allout-first").attr({"disabled":"disabled"});
				$("#allout-up").attr({"disabled":"disabled"});
			}
			if(nowpageno == maxpageno){
				$("#allout-down").attr({"disabled":"disabled"});
				$("#allout-last").attr({"disabled":"disabled"});
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
	<c:forEach var="allout" items="${ requestScope.allOut }">
		<tr>
			<td>${ allout.ordernumber }</td>
			<td>${ allout.employeeByOriginator.name }</td>
			<td>${ allout.datetime }</td>
			<td>
				<input type="hidden" value="${ allout.ordernumber }">
			    <input type="button" value="查看" class="gout">
			</td>
		</tr>
	</c:forEach>
</table>
<div class="text-center">
	<input id="allout-first" class="btn btn-default" type="button" value="首页">
	<input id="allout-up" class="btn btn-default" type="button" value="上一页">
	<span>第<span id="allout-nowpageno">${ requestScope.nowpageno }</span>/<span id="allout-maxpageno">${ requestScope.countNo }</span>页</span>
	<input id="allout-down" class="btn btn-default" type="button" value="下一页">
	<input id="allout-last" class="btn btn-default" type="button" value="末页">
</div>
		            	

