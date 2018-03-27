<jsp:include page="templates/head.jsp"></jsp:include>
<jsp:include page="templates/navbar.jsp"></jsp:include> 
<jsp:include page="templates/alerts.jsp"></jsp:include> 
 
 <div id="login">
 
 <form class="form-signin" action="Login" method="post" style="width:500px; margin:auto">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="text" name="usuario" class="form-control" placeholder="Nombre usuario" required autofocus="">
        <br>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password" class="form-control" placeholder="Contraseña" required>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
      
</div>

<jsp:include page="templates/footer.jsp"></jsp:include> 
