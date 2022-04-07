<%-- 
    Document   : managepage
    Created on : Apr 4, 2022, 9:33:56 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <button type="button" class="btn btn-primary btn-lg btn-block" onclick="location.href='moviestats.jsp'">View Movies Statistic</button>
       <button type="button" class="btn btn-primary btn-lg btn-block" onclick="location.href='clientstats.jsp'">View Clients Statistic</button> 
    </body>
</html>
