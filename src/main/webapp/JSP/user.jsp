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
<h1>e-Store Users Portal</h1>
</div>
</br>

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
    	  txt += "<tr color='#C0C0C0'>";
    	  txt += "<td>" + myObj[x].firstName + "</td>";
    	  txt += "<td>" + myObj[x].lastName + "</td>";
    	  txt += "<td>" + myObj[x].middleName + "</td>";
    	  txt += "<td>" + myObj[x].mobileNumber + "</td>";
    	  txt += "<td>" + myObj[x].email + "</td>";
    	  txt += "<td>" + myObj[x].isActive + "</td>";
    	  txt += "<td>" + myObj[x].langCode + "</td>";    	  
    	  txt += "<tr>";
      }
      txt += "</table>"    
      document.getElementById("demo").innerHTML = txt;
      }
    };
  //xmlhttp.open("GET", "data.json", true);
  xmlhttp.open("GET", "user.json", true);
  xmlhttp.send();
}
window.onload = getdata;
</script>



</body>
</html>