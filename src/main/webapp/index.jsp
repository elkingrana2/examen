<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Examen</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	<div class="global-container">
		<div class="card login-form">
		<div class="card-body">
			<h3 class="card-title text-center">Inicio de Sesión</h3>
			<div class="card-text">
				<!--
				<div class="alert alert-danger alert-dismissible fade show" role="alert">Incorrect username or password.</div> -->
				<form>
					<!-- to error: add class "has-danger" -->
					<div class="form-group">
						<label for="exampleInputEmail1">Correo</label>
						<input type="email" class="form-control form-control-sm" id="exampleInputEmail1" aria-describedby="emailHelp">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">contraseña</label>
						<a href="#" style="float:right;font-size:12px;">Olvidó su contraseña?</a>
						<input type="password" class="form-control form-control-sm" id="exampleInputPassword1">
					</div>
					<button type="submit" class="btn btn-primary btn-block">Entrar</button>
					
				</form>
			</div>
		</div>
	</div>
	</div>
</body>
</html>