<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ministere de l'Agriculture RDC</title>
<style type="text/css">
body {
 background-image: url("leaf.jpg");
 background-position: right top;
}
div.c1 {
border: 5px solid purple;
font-family: georgia,garamond,serif;
font-size: 30px;
padding: 10px;
text-align: center;
}
.header {
    font-size: 30px;
    background-color: #80ff80;
    opacity: 0.7;
    text-align: center;
}
.row:after {
    content: "";
    display: table;
    clear: both;
}
.column {
    float: left;
    padding: 15px;
    text-align: left;
}
.column.side {
    width: 25%;
}
</style>

</head>
<body>
<div class="header">
              <p><img alt="" src="../../agri_images/drapeau.jpg" style="width:60px;height:60px;margin-left:15px;"/> MINISTERE DE L'AGRICULTURE PECHE ET ELEVAGE DE LA RDC</p>
        </div>

<div class="row">

<div class="column side">
<div class="c1">Connection pour Agriculteurs</div>
<h1> </h1>
    
<form action="j_security_check" method="POST">
    <div id="loginBox">
        <p><strong style="color:blue;font-size: 20px;">Nom Utilisateur:</strong>
            <input type="text" size="30" style="height:20px;font-size:15pt;padding: 5px;" name="j_username"></p>
        <p><strong style="color:blue;font-size: 20px;">Mot de pass:</strong>
            <input type="password" size="30" style="height:20px;font-size:15pt;padding: 5px;" name="j_password"></p>
        <p><input type="submit" value="connecter" style="color:blue;font-size: 20px;"></p>
    </div>
</form>


</div>

</div>

</body>
</html>