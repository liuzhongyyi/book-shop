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
		<script src="./../../js/jQuery-3.4.1.min.js"></script>
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
		
		<div class="container"  style="margin-top: 70px;margin-bottom: 20px;"> 
			<form class="form-inline" action="/selectBook">
  				<div class="form-group">
    				<label >书籍名称</label>
    				<input type="text" class="form-control" name="bookName">
  				</div>
  				<div class="form-group">
    				<label >作者名称</label>
    				<input type="text" class="form-control" name="bookAuthor">
  				</div>
  				<button type="submit" class="btn btn-default">查询</button>
			</form>
		</div>
		
		<div class="container">
			<div class="row">
				<c:forEach items="${bookList}" var="book" >
                    <div class="col-xs-3">
                        <div class="thumbnail">
                            <a href="/getBookDetail?bookId=${book.bookId}"><img src="../../img/${book.bookPicture}" alt="..." style="width:200px;height:260px"></a>
                            <div class="caption">
                                <h4><a href="../../book.jsp">${book.bookName}</a></h4>
                                <p><a href="/addToCart?bookId=${book.bookId}">放入购物车</a></p>
                            </div>
                        </div>
                    </div>
                </c:forEach>

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
		<script>
		$.ajax({
            url:"/getAllBookType",
            success:function (d) {
            var li ="";
            $.each(d,function (i,v) {
            li+="<li><a href='/getBookByType?bookTypeId="+v.bookTypeId+"'>"+v.bookTypeName+"</a></li>"+"<li><a href='/getBookByType?bookTypeId=0'>全部</a></li>"
            });
            $("#bookType").html(li)


		}
		})

		</script>
	</body>

</html>