<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@include file="common/header.jsp" %>
<%@include file="common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/production.js"></script>
	<section>
		<div id="content" class="row-fluid" style="overflow:hidden;">
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <div class="container">
				    <div class="row">
				        <div class="span2">
				            <ul class="nav nav-pills nav-stacked">
				                <li id="mi" class="active"><a href="javascript:void(0)">账号信息</a></li>
				                <li id="fat"><a href="javascript:void(0)">查看出勤</a></li>
				                <li id="fan"><a href="javascript:void(0)">发布公告</a></li>
				                <li id="fc"><a href="javascript:void(0)">内部联络</a></li>
				                <li id="te"><a href="javascript:void(0)">审核订单</a></li>
				                <li id="ar"><a href="javascript:void(0)">生产任务单</a></li>
				                <li id="ir"><a href="javascript:void(0)">生产记录</a></li>
				               	<li id="pr"><a href="javascript:void(0)">查看生产记录</a></li>
				            </ul>
				        </div>
				    </div>
				</div>
	        </div>
	        
	        <div class="col-md-8 panel" style="background-color: #f8f8f8; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <%@include file="common/public.jsp" %>
	            <div id="teo" style="display: none;">
	            	<h2 class="text-center">审核订单</h2>
	            	<hr>
	            	<div id="allorder">
		            
	            	</div>
	            	<div id="order" style="display: none;">
	            		
	            	</div>
	            </div>
	            <!--任务单部分  -->
	            <div id="ars" style="display: none;">
	            	         	
	            </div>
	            
	            <div id="addproductorder" style="display: none;">
	            	
	            </div>
	            
	            <!--添加生产记录  -->
	            <div id="irs" style="display: none;">
	            	     	
	            </div>
	           	<div id="irsmonti" style="display: none;">
	           	 
	           	</div>
	            <!--查看生产记录  -->	
	           	<div id="prsmonti" style="display: none;">
	           	 	
	           	</div>
	        </div>
	        
	        <div class="col-md-2 panel" style="background-color: #e7e7e7; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <div>
	            	<h3>个人信息</h3>
	            	<ul class="list-unstyled">
	            		<li><label>姓名：</label>${ sessionScope.employee.name }</li>
	            		<li><label>部门：</label>${ sessionScope.employee.department.departmentname }</li>
	            		<li><label>职位：</label>${ sessionScope.employee.post.postname }</li>
	            		<li><label>入职时间：</label><fmt:formatDate value="${ sessionScope.employee.entrytime }" pattern="yyyy-MM-dd"/></li>
	            	</ul>
	            </div>
	        </div>
    	</div>
	</section>
<%@include file="common/footer.jsp" %>  