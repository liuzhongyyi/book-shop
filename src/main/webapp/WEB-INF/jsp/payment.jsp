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
		
		<!-- 这里到订单系统，生成订单，生成订单明细，如果付款成功，还要删除购物车中的商品等等 -->
		<div class="container" style="margin-top: 70px;margin-bottom: 50px;width: 50%;">
			<ul class="list-group">
				<li class="list-group-item">${orderInfo.orderId}</li>
  				<li class="list-group-item">用户名称：${sessionScope.username}</li>
  				<li class="list-group-item">订单总金额：${orderInfo.total}</li>
  				<li class="list-group-item">订单日期：${orderInfo.createTime}</li>
  				<li class="list-group-item"><a class="btn btn-danger" href="payment_success.html" role="button">付款</a></li>
			</ul>
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