<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<script src="${pageContext.request.contextPath }/jst/public.js"></script>
<%@include file="../common/js.jsp" %>
<c:forEach items="${ requestScope.listemps }" var="emp">
	<option value="${ emp.name }">${ emp.name }</option>
</c:forEach>

