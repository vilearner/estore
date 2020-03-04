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
<font color="red" face="Verdana, Geneva, sans-serif" size="+1">eStore Products</font>
</div>

<div id="demo">
	<input type="button" name="data" onclick="getdata()" value="click" />
</div>


<script>
/*
function getcacheproductdata() {
	
	  var xmlhttp, myObj, x, txt="";
	  var prodid="";
	  var product="";

	  
	  xmlhttp = new XMLHttpRequest(); 
	  xmlhttp.onreadystatechange = function() {
	    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
	    {
	     myObj = JSON.parse(xmlhttp.response);
	     txt += "<table align = 'center' id='product_tbl'>"
	      for (x in myObj) {
	      product= 'Real-2';
	      prodid = "";
	      prodid = "prod" + x;
	    	  txt += "<tr>";
	          txt += "<td width = 20%> <img src='" + myObj[x].imageLink + "' style='height:100px;'> </td>";
	      	  txt += "<td width = 30% >" + myObj[x].productname + "</br>";
	          txt +=  myObj[x].productShortDesc + "</td>";   	 
	          txt += "<td width = 20%><h3><strong> Price: " + myObj[x].unitprice + "</br>";
	      //  txt += "In Stock Units Left: " + myObj[x].stock + "</strong></h3></td>";
	      	  txt += "In Stock Units Left:  Available </strong></h3></td>";
	    	  txt += "<td width = 20%> <input name='cart' onclick='return AddToCart("+ JSON.stringify(myObj[x].productName) +")' type='button' value='Add to Cart'</td>";   	  
	    	  txt += "<tr>";
	      }
	      txt += "</table>"    
	      document.getElementById("demo").innerHTML = txt;
	      }
	    };
	  xmlhttp.open("GET", "product.json", true);  
	  xmlhttp.send();
	}
*/
	// window.onload = getcacheproductdata;

</script>

<script>

function getproductdata() {
	
  var xmlhttp, myObj, x, txt="";
  var quantity = "2";
  var itemid = "";
  var base_url = window.location.origin;
  var url_prod = base_url + "/estore/api/first";
  
  xmlhttp = new XMLHttpRequest(); 
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
    {
     myObj = JSON.parse(xmlhttp.response);
     txt += "<table align = 'center' id='product_tbl'>"
      for (x in myObj) {
		//  itemid = myObj[x].item_id;
    	  txt += "<tr>";
          txt += "<td width = 20%> <img src='" + myObj[x].image + "' style='height:100px;'> </td>";
      	  txt += "<td width = 30% > <font face='Verdana, Geneva, sans-serif'>" + myObj[x].productname + "</br>";
          txt +=  myObj[x].prod_desc + "</font></td>"; 
      	  txt += "<td width = 20%><h3><strong> <font face='Verdana, Geneva, sans-serif'> Price: " + myObj[x].unit_price + "</br>";
      //  txt += "In Stock Units Left: " + myObj[x].stock + "</strong></h3></td>";
      	  txt += "In Stock Units Left:  Available </font></strong></h3></td>";
    	  txt += "<td width = 20%> <input name='cart' onclick='return AddToCart("+ JSON.stringify(myObj[x].item_id) + "," + quantity +")' type='button' value='Add to Cart'</td>";   	    
    	  txt += "<tr>";
      }
      txt += "</table>"    
      document.getElementById("demo").innerHTML = txt;
      }
    };
  xmlhttp.open("GET", url_prod , true);
  xmlhttp.send();
}

window.onload = getproductdata;

</script>

<script>
    function AddToCart(productid, quantity) {
        // Form fields, see IDs above
        var base_url = window.location.origin;
        var url = base_url + "/estore/api/cart";
        
        var cart_id = "250";
        var customerid = "10500";
	  //  var itemid = JSON.stringify(productid);
	    var itemid = productid.replace(/\"/g, "");
        var quantity = quantity;
 
        var params = {      	
                 cart_id: cart_id,
                 customerid: customerid,
                 itemid: itemid,
                 quantity: quantity
             } 
                
        
        const http = new XMLHttpRequest();
        
        http.open('POST', url, true);
        http.setRequestHeader('Content-type', 'application/json');
        http.send(JSON.stringify(params)) // Make sure to stringify
        http.onload = function() {
            // alert product added to the cart
            alert("product added to cart");
        };
    }
</script>


</body>
</html>