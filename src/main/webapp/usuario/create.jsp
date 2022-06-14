<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link href="assets/libs/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/style.css">
    <title>Healthtrack</title>
  </head>
  <body>
  		<%
         	String mensagemSucesso = (String) session.getAttribute("sucesso");
  		
  			String mensagemErro = (String) session.getAttribute("erro");
        
     		PrintWriter output = response.getWriter();
     		
     		session.removeAttribute("sucesso");
     		session.removeAttribute("erro");
        	
        %>
    <div class="container">
        <div class="row my-4 justify-content-md-center">
            <div class="col-md-6 col-xs-4 d-flex justify-content-end">
                <h2 class="page-title flex-fill">Faça seu Cadastro</h2>
                <a class="btn-back" href="home.html">
                    <i class="fa-solid fa-angle-left"></i>
                </a>
            </div>
        </div>
        <div class="row justify-content-md-center">
        	<div class="col-md-6">
	        	<% if (mensagemSucesso != null) { %>
		       		<div class="alert alert-success">
		       			<% out.println(mensagemSucesso); %>
		    		</div>
	    		<% } %>
	    		
	    		<% if (mensagemErro != null) { %>
		       		<div class="alert alert-danger">
		       			<% out.println(mensagemErro); %>
		    		</div>
	    		<% } %>
    		</div>
        </div>
        <form action="<% out.print(request.getContextPath() + "/registrar-usuario"); %>" method="post">
        	<div class="row justify-content-md-center">
                <div class="col-md-6 col-xs-4 mb-3">
                    <div class="form-check form-check-inline">
					  <input class="form-check-input" type="radio" name="genero" value="MASCULINO">
					  <label class="form-check-label" for="Masculino">Masculino</label>
					</div>
					<div class="form-check form-check-inline">
					  <input class="form-check-input" type="radio" name="genero" value="FEMININO">
					  <label class="form-check-label" for="Feminino">Feminino</label>
					</div>
					<div class="form-check form-check-inline">
					  <input class="form-check-input" type="radio" name="genero" value="OUTRO">
					  <label class="form-check-label" for="Outro">Outro</label>
					</div>
                </div>
            </div>
            <div class="row justify-content-md-center">
                <div class="col-md-6 col-xs-4 mb-3">
                    <input name="nome" class="form-control form-control-lg" type="text" placeholder="Digite seu nome">
                </div>
            </div>
            <div class="row justify-content-md-center">
                <div class="col-md-6 col-xs-4 mb-3">
                    <input name="email" class="form-control form-control-lg" type="text" placeholder="Digite seu email">
                </div>
            </div>
            <div class="row justify-content-md-center">
                <div class="col-md-6 col-xs-4 mb-3">
                    <input name="idade" class="form-control form-control-lg" type="text" placeholder="Digite sua idade">
                </div>
            </div>
            <div class="row justify-content-md-center">
                <div class="col-md-6 col-xs-4 mb-3">
                    <input name="senha" class="form-control form-control-lg" type="password" placeholder="Digite sua senha">
                </div>
            </div>
            <div class="row justify-content-md-center">
                <div class="col-md-6 col-xs-4 mb-3">
                    <input name="peso" class="form-control form-control-lg" type="text" placeholder="Digite seu peso atual">
                </div>
            </div>
            <div class="row justify-content-md-center">
                <div class="col-md-6 col-xs-4 mb-3">
                    <input name="altura" class="form-control form-control-lg" type="text" placeholder="Digite sua altura">
                </div>
            </div>
            <div class="row justify-content-md-center">
                <div class="col-md-6 col-xs-4">
                    <button type="submit" class="btn btn-lg btn-dark w-100 mb-3">
                        <i class="fa fa-save"></i>
                        Cadastrar
                    </button>
                </div>
            </div>
        </form>
    </div>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
</body>
</html>