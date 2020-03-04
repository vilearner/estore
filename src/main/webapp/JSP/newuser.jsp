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
<div class="header-brand" style="background-color:lightblue">
	<a class="header-brand__link" aria-label="eStoreMenu">
		<div class="header-brand__logo"  >
			<h3 aling="right">e-Store</h3>
		</div>
	</a>
</div>
<h1>New Users Registration  -- UNDER CONSTRUCTION ...!</h1> 
</br>
<div class="mainContainer" >
	     <div class="container" id="container" style="background-color:white">
		 <form name="userForm" class="userForm" id="userForm" accept-charset="utf-8" >
	  <header class="heading"> User-Form</header><hr></hr>
      
	 <!--- For Name---->
         <div class="form-group">
            
          	         <label class="firstname">First Name :</label>
		             <input type="text" name="firstName" id="fname" placeholder="Enter your First Name" class="form-control " required>
		 </div>		 
         <div class="form-group">
                     <label class="lastname">Last Name :</label>
		             <input type="text" name="lastName" id="lname" placeholder="Enter your Last Name" class="form-control last" required>
		 </div>
		<div class="form-group">
                     <label class="middlename">Middle Name :</label>				
		             <input type="text" name="middleName" id="mname" placeholder="Enter your Middle Name" class="form-control last">              
		 </div>		 
		  <div class="form-group">		     
                     <label class="mobileNo">Mobile No :</label>				 
		             <input type="text" name="mobileNumber" id="mobileNo" placeholder="Enter your Mobile Name" class="form-control last">                
		 </div>		 
     <!-----For email---->
		 <div class="form-group">	     
		             <label class="mail" >Email :</label>			     
			          <input type="email" name="email"  id="email"placeholder="Enter your email" class="form-control" >		        
		 </div>		 
		  <div class="form-group">		     
                     <label class="isActive">Is Active :</label>				 
		             <select name="isActive" id="isActive" placeholder="Is Active" class="form-control last">
		             <option value="1">Yes</option>
		             <option value="0">No</option>
		             </select>               
		 </div>		 
 		  <div class="form-group">		    
                     <label class="languagecode">Langauge Code :</label>					 
		             <select name="langCode" id="isActive" placeholder="language code" class="form-control last">
		             <option value="EN">EN</option>
		             <option value="IT">IT</option>
		             </select>              
		 </div>	
		</br></br>
		<div class="form-group">
		         <!-- <div class="btn btn-warning">Submit</div> -->
		         <input type="submit" name="insertUserBtn" class="insertUserBtn" id="insertUserBtn" value="Save" onClick=""></input>
		   </div>
</div>
</form>


</body>
</html>