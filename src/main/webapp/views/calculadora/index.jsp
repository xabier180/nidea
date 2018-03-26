<!-- FORMULARIO CALCULAR -->

<%@page import="com.ipartek.formacion.nidea.controller.CalculadoraController"%>
<jsp:include page="/templates/head.jsp"></jsp:include>
<jsp:include page="/templates/navbar.jsp"></jsp:include> 

<jsp:include page="/templates/alerts.jsp"></jsp:include> 




<h2>Calculadora</h2>


<form action="calculadora" method="post">

<div class="form-group">
	<label for="num1">Opcion 1</label>
    <input type="text" class="form-control" name="num1" style="width: 300px" placeholder="Por favor, introduzca un numero">
    <label for="num2">Opcion 2</label>
    <input type="text" class="form-control" name="num2" style="width: 300px" placeholder="Por favor, introduzca un numero">
  </div>

	<select name="operacion">
		<option value="<%=CalculadoraController.OP_SUMAR%>">Sumar</option>
		<option value="<%=CalculadoraController.OP_RESTAR%>">Restar</option>
		<option value="<%=CalculadoraController.OP_MULTIPLICAR%>">Multiplicar</option>
		<option value="<%=CalculadoraController.OP_DIVIDIR%>">Dividir</option>
	</select>
	<input type="submit" value="Calcular">
</form>

<jsp:include page="/templates/footer.jsp"></jsp:include> 