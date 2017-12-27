<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@include file="common/header.jsp" %>
<%@include file="common/js.jsp" %>
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
				            </ul>
				        </div>
				    </div>
				</div>
	        </div>
	        
	        <div class="col-md-8 panel" style="background-color: #f8f8f8; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <%@include file="common/public.jsp" %>
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