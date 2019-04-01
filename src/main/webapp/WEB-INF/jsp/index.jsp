<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trang Chu</title>

</head>
<body>
<h1 align="center">My Contact</h1>
<script type="text/javascript" src='<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></c:url>'></script>
<script type="text/javascript" src='<c:url value="/js/main.js"></c:url>'></script>
<input placeholder="Search By Name" type="text" id="textSearch"> <span><button id="search"><a href="#">Search</a></button></span>
<button style="text-align: right;" ><a href='<c:url value="new-contact"></c:url>'>New Contact</a></button>

<div>
        
        <table border = "1" id = "table">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
 
            </tbody>
        </table>
        
  </div>












</body>
</html>