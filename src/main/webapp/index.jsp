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
					<a class="navbar-brand" href="index.jsp">BOOK</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav" id="bookType">

						<%--<li><a href="bookList.jsp">java语言</a></li>--%>
						<%--<li><a href="bookList.jsp">C语言</a></li>--%>
						<%--<li><a href="bookList.jsp">C#语言</a></li>--%>
					</ul>



					<ul class="nav navbar-nav navbar-right">

                        <c:if test="${username==null}">
						<li ><a href="/getLogin">登陆</a></li>
						<li><a href="/getReg">注册</a></li>
                        </c:if>
					</ul>

					<ul class="nav navbar-nav navbar-right">
                        <c:if test="${username!=null}">
                            <li>欢迎${username}</li>
                        </c:if>
						<li><a href="/getShopCart">我的购物车</a></li>
					</ul>

				</div>
			</div>
		</nav>
		
		<div class="container" style="margin-top: 70px;margin-bottom: 50px;">
			<div class="row">
  				<%--<div class="col-xs-3">--%>
    				<%--<div class="thumbnail">--%>
      					<%--<a href="../../book.jsp"><img src="../../img/c01.jpg" alt="..." style="width:200px;height:260px"></a>--%>
      					<%--<div class="caption">--%>
        					<%--<h4><a href="../../book.jsp">C程序设计</a></h4>--%>
        					<%--<p><a href="../../cart.jsp">放入购物车</a></p>--%>
      					<%--</div>--%>
    				<%--</div>--%>
  				<%--</div>--%>
  				<%--<div class="col-xs-3">--%>
    				<%--<div class="thumbnail">--%>
      					<%--<a href="../../book.jsp"><img src="../../img/java01.jpg" alt="..." style="width:200px;height:260px"></a>--%>
      					<%--<div class="caption">--%>
        					<%--<h4><a href="../../book.jsp">java编程基础</a></h4>--%>
        					<%--<p><a href="../../cart.jsp">放入购物车</a></p>--%>
      					<%--</div>--%>
    				<%--</div>--%>
  				<%--</div>--%>
  				<%--<div class="col-xs-3">--%>
    				<%--<div class="thumbnail">--%>
      					<%--<a href="../../book.jsp"><img src="../../img/java04.jpg" alt="..." style="width:200px;height:260px"></a>--%>
      					<%--<div class="caption">--%>
        					<%--<h4><a href="../../book.jsp">javaWeb开发技术详解</a></h4>--%>
        					<%--<p><a href="../../cart.jsp">放入购物车</a></p>--%>
      					<%--</div>--%>
    				<%--</div>--%>
  				<%--</div>--%>
  				<%--<div class="col-xs-3">--%>
    				<%--<div class="thumbnail">--%>
      					<%--<a href="../../book.jsp"><img src="../../img/c02.jpg" alt="..." style="width:200px;height:260px"></a>--%>
      					<%--<div class="caption">--%>
        					<%--<h4><a href="../../book.jsp">C语言基础教程</a></h4>--%>
        					<%--<p><a href="../../cart.jsp">放入购物车</a></p>--%>
      					<%--</div>--%>
    				<%--</div>--%>
  				<%--</div>--%>
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

		<script type="text/javascript" src="../../framework/js/jquery-1.11.3.js"></script>
		<script type="text/javascript" src="../../framework/js/bootstrap.min.js"></script>
        <script src="./js/jQuery-3.4.1.min.js"></script>
        <script>
            $(function () {
                //请求所有的图书
                $.ajax({
                    url:"/getAllBook",
                    success:function(d){
                        var div = "";

                        $.each(d,function(i,v){
                            div += "<div class='col-xs-3'><div class='thumbnail'><a href='book.jsp?bookid="+v.bookId+"'><img src='img/"+v.bookPicture+"' style='width:200px;height:260px'></a><div class='caption'><h4><a href='book.jsp?bookid="+v.bookId+"'>"+v.bookName+"</a></h4><p><a href="+v.bookId+"'WEB-INF/jsp/cart.jsp?bookid='>放入购物车</a></p></div></div></div>";
                        });

                        $(".row").html(div);
                    }
                })
                $.ajax({
                    url:"/getAllBookType",
                    success:function (d) {
                        var li ="<li><a href='/getBookByType?bookTypeId=0'>全部</a></li>";
                        $.each(d,function (i,v) {

                            li+="<li><a href='/getBookByType?bookTypeId="+v.bookTypeId+"'>"+v.bookTypeName+"</a></li>"
                        });
                        $("#bookType").html(li)


                    }
                })
            })
        </script>
	</body>

</html>