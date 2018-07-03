<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account-Login</title>
<style type="text/css">
            div.css-section {border: 15px solid green;font-family: georgia,garamond,serif;
            font-size: 150px;text-shadow: 8px 4px 16px mediumorchid;text-align: center;}
            p.css-section {border: 4px solid blue;}
            a.css-section {border: 2px solid blue;font-size: 60px; background-color: yellow;}
        </style>

</head>
<body bgcolor="powderblue">
<div class="css-section">Ditel Network</div> 

    <h1> </h1>
    
<form action="j_security_check" method="POST">
    <div id="loginBox">
        <p><strong style="color:blue;font-size: 65px;">user name:</strong>
            <input type="text" size="10" style="height:80px;font-size:60pt;" name="j_username"></p>
        <p><strong style="color:blue;font-size: 65px;">password:</strong>
            <input type="password" size="10" style="height:80px;font-size:60pt;" name="j_password"></p>
        <p><input type="submit" value="submit" style="color:blue;font-size: 60px;"></p>
    </div>
</form>


</body>
</html>