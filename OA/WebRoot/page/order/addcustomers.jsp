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
				   <form action="order20!addCustomer" method="post">
						<thead>添加客户资料</thead>
						
	            		<tr>
	            			<td>客户名称：</td>
	            			<td><input type="text" name="customer.customername"> </td>	
	            		</tr>	
	            	    <tr>
	            			<td>地址：</td>
	            			<td><input type="text" name="customer.address"> </td>	
	            		</tr>	
	            		<tr>
	            			<td>客户级别：</td>
	            			<td><input type="text" name="customer.levels"> </td>	
	            		</tr>	
	            		<tr>
	            			<td>电话：</td>
	            			<td><input type="text" name="customer.phone"> </td>	
	            		</tr>	
	            		<tr>
	            			<td>联系人：</td>
	            			<td><input type="text" name="customer.contacts"> </td>	
	            		</tr>	
	            		<tr>
	            			<td>备注：</td>
	            			<td><input type="text" name="customer.remarks"> </td>	
	            		</tr>
	            		<tr>	            			
	            			<td><input type="submit" value="提交" > </td>	
	            		</tr>
	            	  </form>	      		
	            	</table>
