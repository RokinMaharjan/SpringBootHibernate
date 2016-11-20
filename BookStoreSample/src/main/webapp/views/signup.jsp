<%@include file="shared/header.jsp"%>
<title>Sign Up</title>
</head>
<body>
	<div class="container">
		<h1>Sign Up</h1>

		<form method="post" action="${SITE_URL}/user/register">

			<div class="form-group">
				<label>Name</label> <input type="text" name="name"
					class="form-control" />
			</div>

			<div class="form-group">
				<label>Address</label> <input type="text" name="address"
					class="form-control" />
			</div>

			<div class="form-group">
				<label>Phone Number</label> <input type="text" name="phone"
					class="form-control" />
			</div>

			<div class="form-group">
				<label>Email</label> <input type="text" name="email"
					class="form-control" />
			</div>

			<div class="form-group">
				<label>Username</label> <input type="text" name="username"
					class="form-control" />
			</div>

			<div class="form-group">
				<label>Password</label> <input type="text" name="password"
					class="form-control" />
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>

		</form>
	</div>
</body>

<%@include file="shared/footer.jsp"%>