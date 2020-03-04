<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>e-Store</title>
</head>
<body>
<div class="menu">
	<jsp:include page="estoremenu.jsp"></jsp:include>
</div>

<div>
	<font color="red" face="Verdana, Geneva, sans-serif" size="+1">Shopping Cart</font>
</div>

<div id="demo">
	<input type="button" name="data" onclick="getcartdata()" value="click" />
</div>
</br></br>
<div align="center">
	<input type="button" name="order" onclick="location.href='/estore/JSP/order.jsp'" value="Place Your Order" />
</div>

<script>
function getcartdata() {
  var xmlhttp, myObj, x, txt="";
  var base_url = window.location.origin;
  //var url = base_url + "/estore/api/cart/10225";
  var url = base_url + "/estore/api/last/10500"
  xmlhttp = new XMLHttpRequest(); 
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
    {
     myObj = JSON.parse(xmlhttp.response);
     txt += "<table align='center'>"
     txt += "<tr width = 40% bgcolor='#808080'><th> <h3> Product </h3> </th>";
     txt += "<th width = 20%> <h3> Price </h3> </th>";
     txt += "<th width = 20%> <h3> Quantity </h3> </th>";
     txt += "<th width = 20%> </th></tr>";
      for (x in myObj) {
      //  txt += "<tr><td>" + myObj[x].firstName + "</td></tr>";
    	  txt += "<tr bgcolor='#C0C0C0'>";
    /*	  txt += "<td>" + myObj[x].cart_id + "</td>";
    	  txt += "<td width = 40%>" + myObj[x].itemid + "</td>";
    	  txt += "<td width = 20%>" + myObj[x].cart_id + "</td>";
    	  txt += "<td width = 20%>" + myObj[x].quantity + "</td>";
    */
    
    //  txt += "<td>" + myObj[x].cart_id + "</td>";
	  txt += "<td width = 40%>" + myObj[x].productname + "</td>";
	  txt += "<td width = 20%>" + myObj[x].unit_price + "</td>";
	  txt += "<td width = 20%>" + myObj[x].quantity + "</td>";
    
    	  txt += "<td width = 20%> <input name='cart' onclick='javascript:DeleteCartItem(" + JSON.stringify(myObj[x].item_id) + ")' type='button' value='Delete'</td>";
    	  txt += "<tr>";
      }
      txt += "</table>"    
      document.getElementById("demo").innerHTML = txt;
      }
    };
  xmlhttp.open("GET", url, true);
      
  //xmlhttp.open("GET", "https://estore-rranjan6.experiential-squad-na-56325c34021cf286d0e188cc291cdca2-0001.us-east.containers.appdomain.cloud/estore/api/cart/10225", true);
    
  //xmlhttp.open("GET", "http://127.0.0.1:8080/estore/api/cart/10500", true);
  //xmlhttp.open("GET", "http://10.213.15.222:8080/estore/api/cart/10225", true);
  xmlhttp.send();
}
window.onload = getcartdata;
</script>

<script>

function DeleteCartItem(productid)
{ 
	  var base_url = window.location.origin;
	  //var url = base_url + "/estore/api/cart/10500";
	  var url = base_url + "/estore/api/cart/";
	  var xmlhttp = new XMLHttpRequest(); 
	  var customerid = "10500";
	  var itemid = productid.replace(/\"/g, "");
	  
	  url = url + customerid + "/" + itemid;
		
	  xmlhttp.onload = function() {
            // alert product added to the cart
            alert("product deleted from cart");
            location.href="../JSP/cart.jsp";
        }; 
        
    xmlhttp.open("DELETE", url, true);    
	xmlhttp.send();		
	  
}

</script>

<script>
/*
function getdata() {
  var xmlhttp, myObj, x, txt="";
  xmlhttp = new XMLHttpRequest(); 
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
    {
     myObj = JSON.parse(xmlhttp.response);
     txt += "<table border='1'>"
      for (x in myObj) {
      //  txt += "<tr><td>" + myObj[x].firstName + "</td></tr>";
    	  txt += "<tr>";
    	  txt += "<td>" + myObj[x].id + "</td>";
    	  txt += "<td>" + myObj[x].productId + "</td>";
    	  txt += "<td>" + myObj[x].productName + "</td>";
    	  txt += "<td>" + myObj[x].partNo + "</td>";
    	  txt += "<td>" + myObj[x].imageLink + "</td>";
    	  txt += "<td>" + myObj[x].productShortDesc + "</td>";	 
    	  txt += "<td>" + myObj[x].quantity + "</td>";
    	  txt += "<tr>";
      }
      txt += "</table>"    
      document.getElementById("demo").innerHTML = txt;
      }
    };
  xmlhttp.open("GET", "cart.json", true);
  xmlhttp.send();
}
window.onload = getdata;

*/
</script>
</body>
</html>

