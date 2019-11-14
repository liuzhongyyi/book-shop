<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>好书吧</title>
		<link href="framework/css/bootstrap.min.css" rel="stylesheet">
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
					<a class="navbar-brand" href="index.html">BOOK</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="bookList.html">全部</a></li>
						<li><a href="bookList.html">java语言</a></li>
						<li><a href="bookList.html">C语言</a></li>
						<li><a href="bookList.html">C#语言</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="login.html">登陆</a></li>
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
		
		<div class="container"  style="margin-top: 70px;margin-bottom: 50px;"> 
			<div class="row">
				<div class="col-xs-4">
					<img src="img/${book.bookPicture}" width="300" height="400">
				</div>
				<div class="col-xs-6">
					<ul class="list-group">
						<li class="list-group-item">书籍编号: ${book.bookId}</li>
  						<li class="list-group-item">书籍名称：${book.bookName}</li>
  						<li class="list-group-item">作者：${book.bookAuthor}</li>
  						<li class="list-group-item">分类：${book.bookTypeName}</li>
  						<li class="list-group-item">价格：${book.bookPrice}</li>
					</ul>
					<div class="panel panel-default">
  						<div class="panel-heading">
    						<h3 class="panel-title">内容简介</h3>
  						</div>
  						<div class="panel-body">
    						${book.bookContent}
  						</div>
					</div>
					<a class="btn btn-primary" href="cart.html" role="button">放入购物车</a>
				</div>
			</div>
		</div>
		
		
		<div class="jumbotron">
			<div class="container">
  				<p style="font-size: 16px;">知识的殿堂，文化的盛宴，精神的家园。知识改变未来，阅读决定人生。</p>
  				<p style="font-size: 16px;">文明的传播者，人生的加油站。为好书找读者，为读者找好书</p>
  				<p style="font-size: 16px;">&nbsp;</p>
  				<p style="font-size: 16px;text-align: center;">版权所有 @copy yuhongjun www.yuzhou.com</p>
  			</div>
		</div>

		<script type="text/javascript" src="framework/js/jquery-1.11.3.js"></script>
		<script type="text/javascript" src="framework/js/bootstrap.min.js"></script>
	</body>

</html>