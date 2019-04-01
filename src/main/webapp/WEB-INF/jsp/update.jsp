<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact</title>
<script type="text/javascript" src='<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></c:url>'></script>
<script type="text/javascript" src='<c:url value="/js/main.js"></c:url>'></script>
</head>
<body>
<h1>Add Contact</h1>


<div id="form-user">
Insert : 
Name : <input id="name" type="text" placeholder="Name"> 
Email : <input id="email" type="email" placeholder="Email">
Phone : <input id="phone" type="text" placeholder="Phone">
<input id="id" type="hidden">
<button id="update"   onclick="updateContact()" type="submit">Save</button>
</div>


</body>
</html>