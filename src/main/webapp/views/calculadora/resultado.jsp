<!-- SOY UN RESULTADO -->

<jsp:include page="/templates/head.jsp"></jsp:include>
<jsp:include page="/templates/navbar.jsp"></jsp:include> 

<%
	float resul = (Float)request.getAttribute("resultado");
%>


<h2>El resultado de la operación es <%=resul%></h2>





<jsp:include page="/templates/footer.jsp"></jsp:include> 