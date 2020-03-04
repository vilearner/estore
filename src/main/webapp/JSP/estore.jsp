<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>e-Store</title>
	<link rel="stylesheet" href="CSS/abox.css"/>
	<link rel="stylesheet" href="CSS/base.css" />
	<link rel="stylesheet" href="CSS/prettify.css" />
	<link rel="stylesheet" href="CSS/style.css" />
	<link rel="stylesheet" href="CSS/pagination.css" />
	<script src="javascript/jquery.min.js"></script>
	<link rel="stylesheet" href="CSS/bootstrap.min.css">
	<script src="javascript/popper.min.js"></script>
	<script src="javascript/bootstrap.min.js"></script>
	<script src="javascript/loadTicketDetail.js"></script>
	</head>
	<body class="mainBody" id="ticketDetailsBody" class="ticketDetailsBody">
		<div class="menu">
			<jsp:include page="estoremenu.jsp"></jsp:include>
		</div>
		<div class="mainContainer">
			<div class="container" id="container" style="background-color: white">
			</div>
			<div class="paginationjs" id="paginationjs">
				<div class="paginationjs-pages" id="paginationjs-pages"></div>
			</div>
		</div>
		</br></br></br></br>
		<div align="center">
		 <img src="/estore/Images/estore.jpg"> 
		</div>
		
	</body>
</html>
