<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>SuperBeeOA</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  	<%@include file="js.jsp" %>
  	<script src="${pageContext.request.contextPath }/jst/header.js"></script>
  </head>
  
  <body>
    <header>

	    <!-- Fixed navbar -->
	    <nav class="navbar navbar-default navbar-fixed-top">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="#">
	          	<img src="${pageContext.request.contextPath }/images/logo.png" alt="LOGO" style="width: 180; height: 40; position: relative; right: 50px; bottom: 10px">
	          </a>
	        </div>
	        <div id="navbar" class="navbar-collapse collapse">
	          <ul class="nav navbar-nav">
	            <li class="active"><a href="${pageContext.request.contextPath }/page/main.jsp">首页</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/business.jsp">业务</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/production.jsp">生产</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/financial.jsp">财务</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/personnel.jsp">人事</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/quality.jsp">质检</a></li>
	            <li><a href="${pageContext.request.contextPath }/page/warehouse.jsp">仓库</a></li>
	          </ul>
	          <ul id="ling" class="nav navbar-nav navbar-right">
	          	<li class="active"><a id="login" href="javascript:void(0)">登录</a></li>
	          </ul>
	          <ul id="led" class="nav navbar-nav navbar-right" style="display: none;">
	            <li><a href="javascript:void(0)">${sessionScope.employee.name}</a></li>
	            <li><a href="javascript:void(0)">签到</a></li>
	            <li><a href="javascript:void(0)">补签</a></li>
	            <li id="outlogin" class="active"><a href="javascript:void(0)">退出<span class="sr-only">(current)</span></a></li>
	          </ul>
	          <div id="log" class="vertical-center" style="display: none; height: 200px; width: 200px; background-color: white; padding: 20px;">
	          	<form action="login.action" method="post">
	          		职工号：<input type="text" name="employee.workid"><br>
	          		密码：<input type="text" name="employee.password"><br><br>
	          		<input type="submit" value="登录" class="btn btn-primary">
	          		<a href="javascript:void(0)" id="out">关闭</a>
	          	</form>
	          </div>
	          <script type="text/javascript">
	          	function login(name,password) {
					if(name!=null && password!=""){
						$("#ling").hide();
						$("#led").show();
					}else{
						$("#led").hide();
						$("#ling").show();
					}
				}
				
				login("${sessionScope.employee.name}","${sessionScope.employee.password}");
	          </script>
	        </div><!--/.nav-collapse -->
	      </div>
	    </nav>
	</header>

