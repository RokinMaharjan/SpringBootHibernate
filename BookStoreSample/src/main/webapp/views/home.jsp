<%@include file="shared/header.jsp"%>
<title>Home</title>
</head>
<body>
	<div class="container">

		<h1>WELCOME!</h1>
		<br> <br>

		<h1>User</h1>
		<a href="${SITE_URL}/users/login" class="btn btn-success btn-lg">Login</a> 
		<a href="${SITE_URL}/users/signup" class="btn btn-primary btn-lg">SignUp</a>
		<a href="${SITE_URL}/users/" class="btn btn-primary btn-lg">All Users</a>

		<hr>

	</div>
</body>
<%@include file="shared/footer.jsp"%>