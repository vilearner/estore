<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>

  <div class="row">
  <div class="thumbnail">
       <img src="https://assets.gadgets360cdn.com/shop/assets/products/realme-2-pro_1546511706.jpeg" alt="" style="height:200px;">
       <h3>Product Name: Real-2</h3>
        <p>
            Product Description: 2 GB RAM | 16 GB ROM | Expandable Upto 256 GB 15.49 cm (6.1 inch) HD+ Display 13MP + 2MP | 5MP Front Camera
        </p>
        <p>
            <strong>Price :</strong> $ 200
            <strong style="margin-left: 20px;">Stock :</strong> 10
            </p>
             <p>
             <button *ngIf="product.quantity != 'Temporarily Out of Stock'" class="btn btn-primary" (click)="addToCart(product)">Add To Cart</button>
             <button *ngIf="product.quantity == 'Temporarily Out of Stock'" class="btn btn-primary" (click)="addToCart(product)" disabled>Add To Cart</button>
             </p>
    </div>
    </div>
 


<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>


<input id="cart_id" type="text" name="cart_id" placeholder="cart_id">
<input id="customerid" type="text" name="customerid" placeholder="customerid">
<input id="itemid" type="text" name="itemid" placeholder="itemid">
<input id="quantity" type="text" name="quantity" placeholder="quantity">
<input type="submit" name="insertUserBtn" class="insertUserBtn" id="insertUserBtn" value="Save" onClick="return AddToCart()"></input>

<h1>"The value for param is: " <span id="myText"></span></h1>

<h1>"base url is: " <span id="baseurl"></span></h1>

<div id=demo>


</div>

<script>
    function AddToCart() {
        // Form fields, see IDs above
        //const params = {	
        //var params = {	
       
        /*		
        var params = "";
        //params += "{cart_id: 1800,customerid: 10500,";
        //"cart_id" : "250,"customerid": "10500",	
          cart_id: document.querySelector('#cart_id').value,
          customerid: document.querySelector('#customerid').value,
          itemid: document.querySelector('#itemid').value,
        //params +=   "itemid:" + document.querySelector('#itemid').value ;
          quantity: document.querySelector('#quantity').value
        //params += ", quantity: 1}";
            //"cart_id": "800","customerid": "10500","itemid": "7Zlrc8sPB","quantity": 1
       // }
       */ 
        
       
           var cart_id = "250";
           var customerid = "10225";
           var quantity = "1";
           
           var params = {
                	
                    cart_id: cart_id,
                    customerid: customerid,
                    itemid: document.querySelector('#itemid').value,
                    quantity: quantity
                } 
           
           /*
           var params = "";
           //params += "{cart_id: 1800,customerid: 10500,";
           //"cart_id" : "250,"customerid": "10500",	
           params += "cart_id:" +  document.querySelector('#cart_id').value + ",";
           params += "customerid:" + document.querySelector('#customerid').value + ",";
           params += "itemid:" + document.querySelector('#itemid').value +  ",";
           params += "quantity:" + document.querySelector('#quantity').value;
           */
           
            //  params += ", quantity: 1}";
               //"cart_id": "800","customerid": "10500","itemid": "7Zlrc8sPB","quantity": 1
          // } 
        
        var params1 = {
               // "cart_id" : "250,"customerid": "10500",	
                cart_id: document.querySelector('#cart_id').value,
                customerid: document.querySelector('#customerid').value,
                itemid: document.querySelector('#itemid').value,
                quantity: document.querySelector('#quantity').value
               //"quantity": 1
                //"cart_id": "800","customerid": "10500","itemid": "7Zlrc8sPB","quantity": 1
            } 

        //const sep = "</br> </br>";
        //document.getElementById("demo").innerHTML = params;
        //document.getElementById("demo").innerHTML = sep;
        //document.getElementById("demo").innerHTML = params1;
        
        document.getElementById("myText").innerHTML = params;
        
        
        const http = new XMLHttpRequest()
        http.open('POST', 'http://127.0.0.1:6060/estore/api/cart')
        http.setRequestHeader('Content-type', 'application/json')
        http.send(JSON.stringify(params)) // Make sure to stringify
        http.onload = function() {
            // Do whatever with response
            alert(" item added to the cart");
        }
    }
</script>


<script>
var base_url = window.location.origin;
//"http://stackoverflow.com"

var host = window.location.host;
//stackoverflow.com

var pathArray = window.location.pathname.split( '/' );
//["", "questions", "21246818", "how-to-get-the-base-url-in-javascript"]

 document.getElementById("baseurl").innerHTML = base_url;
</script>



<script>
/*
$(function() {
$("#userForm").submit( function(e) {
    
	 e.preventDefault();
	
	    var o = {};
	    var a = $("#userForm").serializeArray();
	    $.each(a, function() {
	        if (o[this.name]) {
	            if (!o[this.name].push) {
	                o[this.name] = [o[this.name]];
	            }
	            o[this.name].push(this.value || '');
	        } else {
	            o[this.name] = this.value || '';
	        }
	    });
	    
	var data = JSON.stringify(o);
	// var url=window.location.protocol + '//' +window.location.hostname+':'+window.location.port;
	 var url='http://127.0.0.1:6060/estore';
       $.ajax({
        			url		:    url+'/api/cart',
        			contentType: "application/json; charset=utf-8",
        			dataType:    'json',
        			type	:    'POST',
        			data : data,
		            success:        function() {$("#userForm")[0].reset();},
		            error	:      function(error) {$("#userForm")[0].reset();}
        });
  });
*/
</script>

<script>
/*
function itemaddtocart()
{
var o = {"cart_id": "200","customerid": "10500","itemid": "7Zlrc8sPB","quantity": 1};
var data = JSON.stringify(o);
var url='http://127.0.0.1:6060/estore';
   $.ajax({
    			url		:    url+'/api/cart',
    			contentType: "application/json; charset=utf-8",
    			dataType:    'json',
    			type	:    'POST',
    			data : data,
	            success:       function() {alert( "Added to Cart" );},
	            error	:      function(error) {alert( "Not Added to Cart");}
    });
}
*/
</script>

    
<script>
/*
//const url='http://127.0.0.1:6060/estore/api/cart/';
cont data={"cart_id": "200","customerid": "10500","itemid": "7Zlrc8sPB","quantity": 1}
$(.addtocart).click(function(){
	$.post(url,data,function(data,status){
		alert( "Added to Cart" );
	});
})
*/
</script>


<script type="text/javascript">
function save(val1)
{
alert("you have saved Employee "+document.getElementById(val1).innerText);  
}
function del(val1)
{
    alert("you have deleted Employee "+document.getElementById(val1).innerText);    
}
</script>
<table border="1">
  <tr>
    <th>EmployeeID</th>
    <th>Name</th> 
    <th>Email</th>
     <th>Phone</th>
      <th>Option</th>
  </tr>
  <tr>
    <td>1590</td>
    <td id="c1">Venkatesh</td> 
    <td>venki@w3s.com</td>
    <td>9943243433</td>
    <td><input type="checkbox" name="chk" id="chk"></td>
    <td><input type="button" value="Delete" id="dlt1" name="dlt1" onclick="del('c1');"><input type="button" value="Save" id="sv1" name="sv1" onclick="save('c1');"></td>
  </tr>
 <tr>
    <td>1591</td>
    <td id="c2">amarnath</td> 
    <td>amar@w3s.com</td>
    <td>9943113433</td>
    <td><input type="checkbox" name="chk" id="chk"></td>
    <td><input type="button" value="Delete" id="dlt1" name="dlt1" onclick="del('c2');"><input type="button" value="Save" id="sv1" name="sv1" onclick="save('c2');"></td>
  </tr>
<tr>
    <td>1601</td>
    <td id="c3">naveen</td> 
    <td>navs@w3s.com</td>
    <td>9943113433</td>
    <td><input type="checkbox" name="chk" id="chk"></td>
    <td><input type="button" value="Delete" id="dlt1" name="dlt1" onclick="del('c3');"><input type="button" value="Save" id="sv1" name="sv1" onclick="save('c3');"></td>
  </tr>
</table>


</body>
</html>