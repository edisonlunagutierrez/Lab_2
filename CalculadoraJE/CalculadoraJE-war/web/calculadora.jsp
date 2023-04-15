<%-- 
    Document   : calculadora
    Created on : 11/04/2023, 11:03:58 PM
    Author     : brayl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Calculadora</title>
	<style>
		.calculator {
			margin: 0 auto;
			width: 400px;
			text-align: center;
		}
		input[type=text], button {
			padding: 10px;
			margin: 5px;
			border: none;
			border-radius: 5px;
			background-color: #f1f1f1;
			font-size: 18px;
			width: 50%;
			display: inline-block;
			text-align: center;
			box-sizing: border-box;
		}
		button {
			background-color: #008CBA;
			color: white;
		}
		p {
			font-size: 20px;
			margin-top: 20px;
		}
	</style>
</head>
<body>
	<div class="calculator">
		<h1>Calculadora</h1>
		<form method="post" action="calcular">
			<label for="num1">Número 1:</label>
			<input type="text" name="num1"><br>
			<label for="num2">Número 2:</label>
			<input type="text" name="num2"><br> 
			<button type="submit" name="operacion" value="sumar">Sumar</button>
			<button type="submit" name="operacion" value="restar">Restar</button>
			<button type="submit" name="operacion" value="multiplicar">Multiplicar</button>
			<button type="submit" name="operacion" value="dividir">Dividir</button>
			<button type="submit" name="operacion" value="modulo">Modulo</button>
		</form>
		<p>Resultado: ${requestScope.resultado} </p>
	</div>
</body>
</html>


