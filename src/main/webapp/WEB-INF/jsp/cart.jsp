<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>好书吧</title>
		<link href="../../framework/css/bootstrap.min.css" rel="stylesheet">
	</head>

	<body>

		<div class="container page-header">
			<h1>好书吧 <small>计算机书籍的集散地</small></h1>
		</div>

		<nav class="navbar navbar-default">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        				<span class="sr-only">Toggle navigation</span>
        				<span class="icon-bar"></span>
        				<span class="icon-bar"></span>
        				<span class="icon-bar"></span>
        			</button>
					<a class="navbar-brand" href="WEB-INF/jsp/index.jsp">BOOK</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="bookList.jsp">全部</a></li>
						<li><a href="bookList.jsp">java语言</a></li>
						<li><a href="bookList.jsp">C语言</a></li>
						<li><a href="bookList.jsp">C#语言</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="login.jsp">登陆</a></li>
						<li><a href="reg.html">注册</a></li>
					</ul>
					<!--
					<ul class="nav navbar-nav navbar-right">
						<li><a>欢迎：XXX</a></li>
						<li><a href="#">我的购物车</a></li>
					</ul>
					-->
				</div>
			</div>
		</nav>
		
		<div class="container" style="margin-top: 70px;margin-bottom: 50px;">
			<table class="table table-striped" >
  				<tr>
  					<th>书籍编号</th>
  					<th>书籍名称</th>
  					<th>书籍单价</th>
  					<th>购买数量</th>
  					<th>金额小计</th>
  					<th></th>
  				</tr>
  				<tr>
  					<td>1</td>
  					<td>C程序设计</td>
  					<td>55</td>
  					<td>
  						<a class="btn btn-xs btn-info" href="#">-</a>
  						<input type="text" size="2" value="10">
  						<a class="btn btn-xs btn-info" href="#">+</a>
  					</td>
  					<td>550</td>
  					<td><a href="">删除</a></td>
  				</tr>
  				<tr>
  					<td>1</td>
  					<td>C程序设计</td>
  					<td>55</td>
  					<td>
  						<a class="btn btn-xs btn-info" href="#">-</a>
  						<input type="text" size="2" value="10">
  						<a class="btn btn-xs btn-info" href="#">+</a>
  					</td>
  					<td>550</td>
  					<td><a href="">删除</a></td>
  				</tr>
  				<tr>
  					<td>1</td>
  					<td>C程序设计</td>
  					<td>55</td>
  					<td>
  						<a class="btn btn-xs btn-info" href="#">-</a>
  						<input type="text" size="2" value="10">
  						<a class="btn btn-xs btn-info" href="#">+</a>
  					</td>
  					<td>550</td>
  					<td><a href="">删除</a></td>
  				</tr>
  				<tr>
  					<td colspan="3">总计：1500</td>
  					<td colspan="3">
  						<a class="btn btn-danger" href="payment.jsp" role="button">确认购买</a>
  						<a class="btn btn-primary" href="bookList.jsp" role="button">返回购物</a>
  					</td>
  				</tr>
			</table>
		</div>
		
		<div class="jumbotron">
			<div class="container">
  				<p style="font-size: 16px;">知识的殿堂，文化的盛宴，精神的家园。知识改变未来，阅读决定人生。</p>
  				<p style="font-size: 16px;">文明的传播者，人生的加油站。为好书找读者，为读者找好书</p>
  				<p style="font-size: 16px;">&nbsp;</p>
  				<p style="font-size: 16px;text-align: center;">版权所有 @copy yuhongjun www.yuzhou.com</p>
  			</div>
		</div>

		<script type="text/javascript" src="../../framework/js/jquery-1.11.3.js"></script>
		<script type="text/javascript" src="../../framework/js/bootstrap.min.js"></script>
	</body>

</html>