<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@include file="common/header.jsp" %>
<%@include file="common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/financial.js"></script>
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
				                <li id="sm"><a href="javascript:void(0)">结算工资</a></li>
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
		            	<!-- <table class="table table-hover table-bordered">
		            		<tr>
		            			<td>订单编号</td>
		            			<td>客户编号</td>
		            			<td>业务员</td>
		            			<td>生成日期</td>
		            			<td>操作</td>
		            		</tr>
		            		<tr>
		            			<td></td>
		            			<td></td>
		            			<td></td>
		            			<td></td>
		            			<td><input id="examine" type="button" value="审核"></td>
		            		</tr>
		            	</table>-->
	             	</div>
	            	<div id="order" style="display: none;">
	            		<!-- <table class="table">
	            			<tr>
	            				<td>订单号：</td>
	            				<td></td>
	            				<td>客户编号：</td>
	            				<td></td>
	            				<td>发起时间：</td>
	            				<td></td>
	            			</tr>
	            			<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>
	            			<tr>
	            				<td>序号</td>
	            				<td>产品编号</td>
	            				<td>单位</td>
	            				<td>数量</td>
	            				<td>单价</td>
	            				<td>合计</td>
	            			</tr>
	            			<tr>
	            				<td></td>
	            				<td></td>
	            				<td></td>
	            				<td></td>
	            				<td></td>
	            				<td></td>
	            			</tr>
	            		</table>
	            		<input id="yes" class="btn btn-primary" type="button" value="通过">
	            		<input id="no" class="btn btn-primary" type="button" value="驳回">
	            		<input id="bo" class="btn btn-primary pull-right" type="button" value="返回"> -->
	            	</div>
	            </div>
	            <div id="smoney" style="display: none;">
	            	<h2 class="text-center">结算工资</h2>
	            	<hr>
	            
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