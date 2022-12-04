<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Family Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
 	<style>  
body{  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  
.container {  
    padding: 50px;  
  background-color: lightblue;  
}  
  
input[type=text], input[type=password], textarea {  
  width: 100%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus {  
  background-color: orange;  
  outline: none;  
}  
 div {  
            padding: 10px 0;  
         }  
hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 100%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
  opacity: 1;  
}  
</style>
 
  </head>
  <body>
    <h1>Family Registration Form  :</h1>
    <hr>
    
    
    <br>
     
</head>  
<body>  
<form action="familyDetails">  
  <div class="container">  
  <center>  <h1><u> Family Registeration Form</u></h1> </center>  
  <hr>  
  <label> Name :</label>   
<input type="text" name="name" placeholder= "Firstname" size="15" required />   
  
<div>  
<label for="age"><b>Age :</b></label>  
 <input type="number" placeholder="Enter Age" name="age" required>
<label>   
Gender :  
</label><br>  
<input type="radio" value="Male" name="gender" checked > Male   
<input type="radio" value="Female" name="gender"> Female   
  
</div>  
<label>   
Contact Number :  
</label>    
<input type="tel" name="contactNumber" placeholder="phone no." required>   
 <label for="email"><b>Address :</b></label>  
 <input type="text" placeholder="Enter Email" name="address" required>
 <label for="city"><b>City :</b></label>  
 <input type="text" placeholder="Enter City" name="city" required> 
 <label for="country"><b>Profession :</b></label>  
 <input type="text" placeholder="Enter Country" name="profession" required>
 <label for="pincode"><b>Qualification : </b></label>  
 <input type="text" placeholder="Enter Pincode" name="qualification" required>   
    <button type="submit" class="registerbtn">Register</button>    
</form>  
</body>  
</html> 
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>