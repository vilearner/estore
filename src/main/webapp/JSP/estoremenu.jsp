<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>e-Store Menu</title>

<link rel="stylesheet" href="CSS/estore.css"/>
</head>
<body>
<header>

	<div class="header-brand" style="background-color:lightblue">
	<img src="/estore/Images/e-store.jpg" height="50">
		<!--  	<h3 align="left">e-Store</h3> -->
	</div>
	
	<div align="right">
		<!--  	<a href='../JSP/user.jsp'><span>[User]&nbsp;&nbsp;</span></a> -->
			<a href='/estore/JSP/product.jsp'><span>[Products]&nbsp;&nbsp;</span></a>
			<a href='/estore/JSP/cart.jsp'><span>[Cart]&nbsp;&nbsp;</span></a>
			<a href='/estore/JSP/order.jsp'><span>[Order]&nbsp;&nbsp;</span></a>
			<a href='/estore/JSP/index.jsp'><span>[Sign Out]</span></a>
			<!-- <a href='http://127.0.0.1:6060/eStoreUI/'><span>[Sign Out]</span></a> -->
			 <!-- <a href='http://10.213.15.222:8080/eStoreUI/'><span>[Sign Out]</span></a> 	-->
	</div>
 </header> 
 
 <%
 String user=(String)session.getAttribute("user"); 
 String customerid = (String)session.getAttribute("customerid"); 
 String cart_id = (String)session.getAttribute("cart_id"); 
 
 if (session == null) {
 //if (user.equals("")) {
	 response.sendRedirect("/estore/");
 }
 
//out.print("Hello User: You have entered the name: "+user); 
 
 %>
 
 
                
</body>
</html>
