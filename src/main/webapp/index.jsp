<jsp:include page="templates/head.jsp"></jsp:include>
<jsp:include page="templates/navbar.jsp"></jsp:include> 
 

<%

	// Scriplet < % ... % >
	// Varias sentencias
	String nombre = "Pepe";
	String hora = "10:15";
	
%>

<h2>Hello <%=nombre%> </h2>
<p> <%=hora%> </p>

<a href="generar-mesa"> ¿Quieres comprar una mesa? </a>

<jsp:include page="templates/footer.jsp"></jsp:include> 

