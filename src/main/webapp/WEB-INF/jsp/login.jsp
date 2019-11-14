<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>登陆</title>
		<link href="../../framework/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="css/common.css" />
		<link rel="stylesheet" href="css/login.css" />
	</head>

	<body>
		<div style="width: 400px;height: 300px;margin: 0 auto;margin-top: 100px;">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">登陆</h3>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" action="/login" method="post">
						<div class="form-group">
							<label class="col-sm-3 control-label">用户名</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name="username" placeholder="用户名">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 control-label">密码</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" name="password">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<input type="submit" class="btn btn-primary">登陆</input>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>

		<script type="text/javascript" src="../../framework/js/jquery-1.11.3.js"></script>
		<script type="text/javascript" src="../../framework/js/bootstrap.min.js"></script>
	</body>

</html>