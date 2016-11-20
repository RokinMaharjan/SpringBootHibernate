<%@include file="shared/header.jsp"%>
<title>Login</title>
</head>
<body>
	<div class="container">
		<center>
			<h1>Login</h1>
			<br>
			<form method="post" action="${SITE_URL}/users/access">

				<div class="form-group">
					<label>Username</label> <input type="text" name="username" />
				</div>

				<div class="form-group">
					<label>Password</label> <input type="text" name="password" />
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</center>
	</div>
</body>
</html>