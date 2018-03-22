<%@page import="com.ipartek.formacion.nidea.pojo.Mesa"%>
<jsp:include page="templates/head.jsp"></jsp:include>
<jsp:include page="templates/navbar.jsp"></jsp:include> 


<%
	// Recoger atributo del controlador, si es que existe
	Mesa mesa = (Mesa)request.getAttribute("mesa");
	if ( mesa == null ){
		mesa = new Mesa();
	}
	
%>

<p>Precio: <%=mesa.getPrecio() %> &euro; </p>


<form action="generar-mesa" method="post">

	<label for="patas">Numero de patas:</label>
	<input type="number" name="patas" value="4" required>
	<br>
	<label for="dimension">Dimension:</label>
	<input type="number" name="dimension" value="1" required>
	<br>
	<label for="color">Color:</label>
	<input type="checkbox" id="color-checkbox" name="color-checkbox">
	<input name="paleta-color" type="color"/>
	<br>
	<label for="material">Material:</label>
	<div class="btn-group" role="group">
    	<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
      Elija material
     		<span class="caret"></span>
    	</button>
   		<ul class="dropdown-menu">
      		<li><a href="#">Madera</a></li>
     		 <li><a href="#">Acero</a></li>
     		 <li><a href="#">Aluminio</a></li>
     		 <li><a href="#">Plastico</a></li>
    	</ul>
 	</div>
	<br>
	<br>
	<input type="submit" value="Calcular Precio">

</form>

<jsp:include page="templates/footer.jsp"></jsp:include> 