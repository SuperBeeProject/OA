<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@include file="common/header.jsp" %>
<%@include file="common/js.jsp" %>
<script src="${pageContext.request.contextPath }/jst/personnel.js"></script>
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
				                <li id="np"><a href="javascript:void(0)">新增员工</a></li>
				                <li id="mp"><a href="javascript:void(0)">管理员工</a></li>
				            </ul>
				        </div>
				    </div>
				</div>
	        </div>
	        
	        <div class="col-md-8 panel" style="background-color: #f8f8f8; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <%@include file="common/public.jsp" %>
	            <div id="add" style="display: none;" class="text-center">
	            	<h2 class="text-center">增加员工</h2>
					<hr>
					<form action="">
						<table class="table table-condensed">
							<tr>
								<td>职工号：</td>
								<td></td>
							</tr>
							<tr>
								<td>姓名：</td>
								<td><input type="text" name="name"></td>
							</tr>
							<tr>
								<td>性别：</td>
								<td>
									<input type="checkbox" name="sex" value="男">男
									<input type="checkbox" name="sex" value="女">女
								</td>
							</tr>
							<tr>
								<td>民族：</td>
								<td><input type="text" name="nation"></td>
							</tr>
							<tr>
								<td>生日：</td>
								<td><input type="date" name="birthday"></td>
							</tr>
							<tr>
								<td>部门：</td>
								<td>
									<select name="departmentid">
										<option value="1">生产</option>
										<option value="2">仓库</option>
										<option value="3">人事</option>
										<option value="4">财务</option>
										<option value="5">质检</option>
										<option value="6">业务</option>
									</select>
								</td>
							</tr>
							<tr>
								<td>职务：</td>
								<td>
									<select name="postid">
										<option value="1">员工</option>
										<option value="2">主任</option>
									</select>
								</td>
							</tr>
							<tr>
								<td>学历：</td>
								<td>
									<select name="education">
										<option value="1">专科</option>
										<option value="2">本科</option>
									</select>
								</td>
							</tr>
							<tr>
								<td>电话：</td>
								<td><input type="text" name="phone"></td>
							</tr>
							<tr>
								<td>地址：</td>
								<td><input type="text" name="address"></td>
							</tr>
							<tr>
								<td>基础工资：</td>
								<td><input type="text" name="money"></td>
							</tr>
							<tr>
								<td>密码：</td>
								<td></td>
							</tr>
							<tr>
								<td>调休时数：</td>
								<td><input type="text" name="resttime"></td>
							</tr>
							<tr>
								<td>车间：</td>
								<td>
									<select name="workshopid">
										<option value="1">一号</option>
										<option value="2">二号</option>
									</select>
								</td>
							</tr>
							<tr>
								<td>班组：</td>
								<td>
									<select name="teamid">
										<option value="1">一组</option>
										<option value="2">二组</option>
									</select>
								</td>
							</tr>
						</table>
						<input type="submit" value="录入" class="btn btn-primary">
					</form>
	            </div>
	            <div id="manage" style="display: none;">
	            	<h2 class="text-center">管理员工</h2>
					<hr>
					<div id="allstaff">
		            	<table class="table table-hover table-bordered">
		            		<tr>
		            			<td>职工号</td>
		            			<td>姓名</td>
		            			<td>职位</td>
		            			<td>联系电话</td>
		            			<td>操作</td>
		            		</tr>
		            		<tr>
		            			<td></td>
		            			<td></td>
		            			<td></td>
		            			<td></td>
		            			<td>
		            				<input id="cs" type="button" value="修改">
		            				<input id="ds" type="button" value="删除">
		            			</td>
		            		</tr>
		            	</table>
	            	</div>
	            	<div id="cstaff" style="display: none;">
	            		<table class="table table-hover">
							<tr>
								<td><label>职工号：</label></td>
								<td> </td>
		            			<td></td>
							</tr>
							<tr>
								<td><label>姓名：</label></td>
								<td> </td>
		            			<td></td>
							</tr>
							<tr>
								<td><label>性别：</label></td>
								<td> </td>
		            			<td></td>
							</tr>
							<tr>
								<td><label>民族：</label></td>
								<td> </td>
		            			<td></td>
							</tr>
							<tr>
								<td><label>生日：</label></td>
								<td> </td>
		            			<td></td>
							</tr>
							<tr>
								<td><label>所属部门：</label></td>
								<td> </td>
								<td><input id="departmentid" type="button" value="修改"></td>
							</tr>
							<tr>
								<td><label>入职时间：</label></td>
								<td></td>
		            			<td></td>
							</tr>
							<tr>
								<td><label>职务：</label></td>
								<td> </td>
								<td><input id="postid" type="button" value="修改"></td>
							</tr>
							<tr>
								<td><label>学历：</label></td>
								<td> </td>
								<td><input id="education" type="button" value="修改"></td>
							</tr>
							<tr>
								<td><label>电话：</label></td>
								<td> </td>
								<td><input id="phone" type="button" value="修改"></td>
							</tr>
							<tr>
								<td><label>地址：</label></td>
								<td> </td>
								<td><input id="address" type="button" value="修改"></td>
							</tr>
							<tr>
								<td><label>调休时数：</label></td>
								<td> </td>
								<td><input id="resttime" type="button" value="修改"></td>
							</tr>
						</table>
						<input id="bcs" class="btn btn-primary pull-right" type="button" value="返回">
	            	</div>
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