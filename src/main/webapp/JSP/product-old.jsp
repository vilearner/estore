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
<h1>eStore Products</h1>
</div>

<div id="demo">
	<input type="button" name="data" onclick="getdata()" value="click" />
</div>


<script>
function getproductdata() {
  var xmlhttp, myObj, x, txt="";
  xmlhttp = new XMLHttpRequest(); 
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
    {
     myObj = JSON.parse(xmlhttp.response); 
     txt += "<div class='row'>"
      for (x in myObj) {
  	      txt += "<div class='thumbnail'>";
    	  txt += "<img src='" + myObj[x].imageLink + "' style='height:100px;'>";
    	  txt += "<h3>Product Name:" + myObj[x].productName  + "</h3>";
    	  txt += "<p><strong>Price : </strong>" +  myObj[x].unitprice ;
    	  txt += "<strong style='margin-left: 20px;'> Stock :</strong>"  + myObj[x].stock "</p>";
    	//  txt += "<button class='btn btn-primary' (click)='addToCart(product)'>Add To Cart</button>";
    	//  txt += "<button class='btn btn-primary' (click)='addToCart(product)' disabled>Add To Cart</button>";  
    	  txt += "</div>";
      }    
      txt += "</div>"	
      document.getElementById("demo").innerHTML = txt;
      }
    };
  xmlhttp.open("GET", "product.json", true);
  xmlhttp.send();
}
//window.onload = getproductdata;

</script>

<script>

function getdata() {
  var xmlhttp, myObj, x, txt="";
  xmlhttp = new XMLHttpRequest(); 
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
    {
     myObj = JSON.parse(xmlhttp.response);
     txt += "<table align = 'center'>"
      for (x in myObj) {
      //  txt += "<tr><td>" + myObj[x].firstName + "</td></tr>";
    	  txt += "<tr>";
    	  txt += "<td width = 20%> <img src='" + myObj[x].imageLink + "' style='height:100px;'> </td>";
      //  txt += "<td>" + myObj[x].id + "</td>";
      //  txt += "<td>" + myObj[x].productId + "</td>";
    	  txt += "<td width = 30%>" + myObj[x].productName + "</br>";
    	  txt +=  myObj[x].productShortDesc + "</td>";    	  
      //  txt += "<td>" + myObj[x].partNo + "</td>";   	    	 
    	  txt += "<td width = 30%><h3><strong> Price: " + myObj[x].unitprice + "</br>";
      //	  txt += "In Stock Units Left: " + myObj[x].stock + "</strong></h3></td>";
      	 txt += "In Stock Units Left:  Available </strong></h3></td>";
    	  txt += "<td width = 20%> <input name='cart' onclick='return AddToCart()' type='button' value='Add to Cart'</td>";
    	  
    	  txt += "<tr>";
      }
      txt += "</table>"    
      document.getElementById("demo").innerHTML = txt;
      }
    };
  xmlhttp.open("GET", "product.json", true);  
  //xmlhttp.open("GET", "http://127.0.0.1:6060/estore/api/product/eLnc5A4YT", true);
  xmlhttp.send();
}

window.onload = getdata;

</script>

<script>
    function AddToCart() {
        // Form fields, see IDs above
        var base_url = window.location.origin;
        var url = base_url + "/estore/api/cart";
        
        const params = {
            /*cart_id: document.querySelector('#cart_id').value,
            customerid: document.querySelector('#customerid').value,
            itemid: document.querySelector('#itemid').value,
            quantity: document.querySelector('#quantity').value */
            "cart_id": "200","customerid": "10225","itemid": "Real-2","quantity": 1
        };
        
        const http = new XMLHttpRequest();
        
        http.open('POST', url, true);
        //http.open('POST', 'https://estore-rranjan6.experiential-squad-na-56325c34021cf286d0e188cc291cdca2-0001.us-east.containers.appdomain.cloud/estore/api/cart', true);
        //http.open('POST', 'http://127.0.0.1:8080/estore/api/cart')
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