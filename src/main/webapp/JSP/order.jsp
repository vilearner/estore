<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>e-Store</title>
	</head>
	<body>
	<div class="menu">
			<jsp:include page="estoremenu.jsp"></jsp:include>
	</div>		
		
	<div>
		<font color="red" face="Verdana, Geneva, sans-serif" size="+1"> Order Details ... under construction ...</font>
	</div>	
	
	<div id="demo">
		<input type="button" name="data" onclick="getdata()" value="click" />
	</div>

<script>
function getdata() {
  var xmlhttp, myObj, x, txt="";
  xmlhttp = new XMLHttpRequest(); 
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
    {
     myObj = JSON.parse(xmlhttp.response);
     txt += "<table align = center>"
      for (x in myObj) {
      //  txt += "<tr><td>" + myObj[x].firstName + "</td></tr>";
    	  txt += "<tr>";
    	  txt += "<td width = 20%> <img src='" + myObj[x].imageLink + "' style='height:100px;'> </td>";
      	  txt += "<td width = 30%><font face='Verdana, Geneva, sans-serif'>" + myObj[x].productName + "</br>";
    	  txt +=  myObj[x].productShortDesc + "</font></td>";  
      //	  txt += "<td>" + myObj[x].productName + "</td>";
      //	  txt += "<td>" + myObj[x].imageLink + "</td>";
  
     //  txt += "<td>" + myObj[x].productShortDesc + "</td>";
    	  txt += "<td width = 25%> <h3><strong><font face='Verdana, Geneva, sans-serif'> Total Units Purchased: " + myObj[x].quantity + "</font></strong><h3></td>";
    	  txt += "<td width = 25%><h3><strong><font face='Verdana, Geneva, sans-serif'> Total Cost:" + myObj[x].cost + "</font></td>";
    	  
    	  txt += "<tr>";
      }
      txt += "</table>"    
      document.getElementById("demo").innerHTML = txt;
      }
    };
  xmlhttp.open("GET", "order.json", true);
  xmlhttp.send();
}
window.onload = getdata;
</script>
	
<div align="center">
</br></br>
	<input type="button" name="payment" onclick="payment_alert()" value="Payment Gateway" />
</div>	

<script>
function payment_alert()
{
      alert( "Thanks you for shoping with us ..!" );
      location.href="/estore/JSP/product.jsp";
 
}
</script>		
		
</body>
</html>
