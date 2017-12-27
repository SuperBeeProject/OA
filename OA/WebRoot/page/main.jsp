<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
    <section>
    
    	<div id="content" class="row-fluid" style="overflow:hidden;">
	        <div class="col-md-3 panel" style="background-color: #e7e7e7; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <div>
	            	<h3>公司信息</h3>
	            	<ul class="list-unstyled">
	            		<li><label>名称：</label><br>xxx有限公司台江分部</li>
	            		<li><label>地址：</label><br>福州市台江区xx路xx大厦xx楼</li>
	            		<li><label>联系电话：</label><br>0591-xxxx-xxxx</li>
	            	</ul>
	            </div>
	            <script src="${pageContext.request.contextPath }/js/coda.js" type="text/javascript"> </script>
	            <link rel="stylesheet" href="${pageContext.request.contextPath }/css/master.css" type="text/css" media="screen"/>
	            <table class="master-table" cellspacing="0">
					<thead>
						<tr>
							<th>Mon</th><th>Tue</th><th>Wed</th>
							<th>Thu</th><th>Fri</th><th>Sat</th>
							<th>Sun</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="padding" colspan="3"></td>
							<td> 1</td>
							<td> 2</td>
							<td> 3</td>
							<td> 4</td>
						</tr>
						<tr>
							<td> 5</td>
							<td> 6</td>
							<td> 7</td>
							<td> 8</td>
							<td class="today"> 9</td>
							<td>10</td>
							<td>11</td>
						</tr>
						<tr>
							<td class="date_has_event">
								12
								<div class="events">
									<ul>
										<li>
											<span class="title">Event 1</span>
											<span class="desc">Lorem ipsum dolor sit amet, consectetu adipisicing elit.</span>
										</li>
									</ul>
								</div>
							</td>
							<td>13</td>
							<td>14</td>
							<td>15</td>
							<td>16</td>
							<td>17</td>
							<td>18</td>
						</tr>
						<tr>
							<td>19</td>
							<td>20</td>
							<td>21</td>
							<td class="date_has_event">
								22
								<div class="events">
									<ul>
										<li>
											<span class="title">Event 1</span>
											<span class="desc">Lorem ipsum dolor sit amet, consectetu adipisicing elit.</span>
										</li>
									</ul>
								</div>
							</td>
							<td>23</td>
							<td>24</td>
							<td>25</td>
						</tr>	
						<tr>
							<td>26</td>
							<td>27</td>
							<td>28</td>
							<td>29</td>
							<td>30</td>
							<td>31</td>
							<td class="padding"></td>
						</tr>
					</tbody>
					<tfoot>
						<th>Mon</th><th>Tue</th><th>Wed</th>
						<th>Thu</th><th>Fri</th><th>Sat</th>
						<th>Sun</th>
					</tfoot>
				</table>
	            <%-- <div style="position: relative; top:200px;">
		            <div id="datepicker" class="calendar"></div>
					<script src='${pageContext.request.contextPath }/js/jquery.js'></script>
					<script src='${pageContext.request.contextPath }/js/jquery-ui.js'></script>
					<script src="${pageContext.request.contextPath }/jst/main.js"></script>
	            </div> --%>
	        </div>
	        
	        <div class="col-md-6 panel" style="background-color: #f8f8f8; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <div>
	            	<h2 style="padding-left: 50px;">公司公告</h2>
		            <hr>
		            <ul id="announcement" class="list-unstyled" style="padding-left: 50px;">
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[财务]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[业务]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[人事]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[生产]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[仓库]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[质检]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>更多……</strong></a></li>
		            </ul>
		            
	            	<h2 style="padding-left: 50px;">部门公告</h2>
		            <hr>
		            <ul id="dannouncement" class="list-unstyled" style="padding-left: 50px;">
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[财务]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[财务]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[财务]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[财务]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[财务]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>[财务]</strong></a>&nbsp;<a href="#">吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦吧啦……<label>2017/11/24 9:20</label></a></li>
		            	<li style="margin-bottom : 5px;"><a href="#"><strong>更多……</strong></a></li>
		            </ul>
	            </div>
		        <%-- <div style="text-align:right; position: absolute; right:35px; top: 120px;">
		        	<img alt="广告1" src="${pageContext.request.contextPath }/images/gg_1.jpg" style="margin-bottom:25px; width:30%;height:30%;"><br>
		        	<img alt="广告2" src="${pageContext.request.contextPath }/images/gg_1.jpg" style="margin-bottom:25px; width:30%;height:30%;"><br>
		        	<img alt="广告3" src="${pageContext.request.contextPath }/images/gg_1.jpg" style="margin-bottom:25px; width:30%;height:30%;">
		        </div> --%>
	        </div>
	        
	        <div class="col-md-3 panel" style="background-color: #e7e7e7; height: auto; padding-bottom:3000px; margin-bottom:-3000px;">
	            <div>
	            	<h3>个人信息</h3>
	            	<ul class="list-unstyled">
	            		<li><label>姓名：</label>${ sessionScope.employee.name }</li>
	            		<li><label>部门：</label>${ sessionScope.employee.department.departmentname }</li>
	            		<li><label>职位：</label>${ sessionScope.employee.post.postname }</li>
	            		<li><label>入职时间：</label><fmt:formatDate value="${ sessionScope.employee.entrytime }" pattern="yyyy-MM-dd"/></li>
	            	</ul>
	            </div>
	            <div>
	            	<h3>查询员工</h3>
	            	<form class="form-horizontal" action="findEmployee.action">
	            		<label>姓名：</label><br/>
	            		<input type="text" name="employee.name"><br/>
	            		<label>职工号：</label><br/>
	            		<input type="text" name="employee.workid"><br/><br/>
	            		<input class="btn btn-primary" type="submit" value="查询">
	            	</form>
	            </div>
	            <div>
	            	<h3>查询结果</h3>
	            	<table class="table table-bordered table-hover">
	            		<tr>
	            			<td>姓名</td>
	            			<td>部门</td>
	            			<td>电话</td>
	            		</tr>
		            	<c:forEach var="emp" items="${ sessionScope.emplist }">
		            		<tr>
		            			<td>${ emp.name }</td>
		            			<td></td>
		            			<td>${ emp.phone }</td>
		            		</tr>
		            	</c:forEach>
	            	</table>
	            </div>
	        </div>
    	</div>
    
    </section>
<%@include file="common/footer.jsp" %>  
