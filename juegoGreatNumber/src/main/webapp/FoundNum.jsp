<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2>I am thinking of a number between 1 and 100</h2></center>
<center><h3>Take a guess!</h3></center>
<form style="margin-left:400px;" name = randomInt action= FoundNumber method="POST">
<input style="text-align:center; height: 180px; color:green;"  type="text" name="randomInt" value="was the number!"/>
<p></p>
<input style="margin-left:40px;" type="submit" value="Play again!" value="submit"/>
</form>
</body>
</html>