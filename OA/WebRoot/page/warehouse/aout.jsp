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
<table class="table table-hover table-bordered">
  <tr>
    <td>单号</td>
    <td>发起人</td>
    <td>客户</td>
    <td>日期</td>
  </tr>
  <tr>
    <td>${ requestScope.order.ordernumber }</td>
    <td>${ requestScope.order.employeeByOriginator.name }</td>
    <td>${ requestScope.order.customer.customername }</td>
    <td>${ requestScope.order.datetime }</td>
  </tr>
</table>
<table class="table table-hover table-bordered">
  <tr>
    <td>产品名称</td>
    <td>产品数量</td>
    <td>产品规格</td>
    <td>产品型号</td>
  </tr>
  <tr>
    <td>${ requestScope.order.product.productname }</td>
    <td>${ requestScope.order.quantity }${ requestScope.order.product.unit }</td>
    <td>${ requestScope.order.product.productno }</td>
    <td>${ requestScope.order.product.productmodel }</td>
  </tr>
</table>
<input id="bout" class="btn btn-primary pull-right" type="button" value="返回">

