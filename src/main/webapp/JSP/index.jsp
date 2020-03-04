<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>e-Store</title>
</head>
<body>

<div class="header-brand" style="background-color:lightblue">
	<img src="/estore/Images/e-store.jpg" height="50">
		<!--  	<h3 align="left">e-Store</h3> -->
</div>


<div align="center">
		 <img src="/estore/Images/single_user.jpg"> 
</div>

<div align="center">
<form>
	<br />
    <input type="text" placeholder="Username" id="text1" /><br /><br />
    <input type="password" placeholder="Password" id="text2" /><br /><br />
    <input type="button" value="Login"  onclick="javascript:validate()" />
    <br /> <br /> <br />
</form>
</div>

<div class="header-menu-wrap">
    <h3>  </h3>
</div>
	
</body>
</html>

<script type="text/javascript">
function validate()
{
    if(   document.getElementById("text1").value == "demo"
       && document.getElementById("text2").value == "demo@123" )
    {
        alert( "validation succeeded" );
     <%   
        String user = "demo";
        String customerid = "10225";
        String cart_id = "250";
        session.setAttribute("user",  user);
        session.setAttribute("customerid",  customerid);
        session.setAttribute("cart_id",  cart_id);
      %>  
        location.href="/estore/JSP/product.jsp";
    }
    else
    {
        alert( "validation failed" );
        location.href="/estore/JSP/product.jsp";
    }
}
</script>
