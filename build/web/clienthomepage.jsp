<%-- 
    Document   : clienthomepage
    Created on : Apr 6, 2022, 5:10:51 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ClientHomePage</title>
    <style>
            .content-table{
                border-collapse:collapse;
                margin:25px 0;
                font-size:0.9em;
                min-width: 400px;
                overflow: hidden;
            }
            .content-table thead tr{
                background-color: #FAE4C4;
                text-align: center;
                font-weight: bold;
            }
            .content-table th
            .content-table td{
                padding: 12px 15px;
            }
            .content-table tbody tr{
                border-bottom: 1px solid #dddddd;
            }
            .content-table tbody tr:nth-of-type(even){
                background-color: #f3f3f3;
            }
            .content-table tbody tr:last-of-type{
                border-bottom: 2px solid #FAE4C4
            }
        </style>
        <script>
            function GetURLParameter(sParam)
            {
    var sPageURL = window.location.search.substring(1);
    var sURLVariables = sPageURL.split('&');
    for (var i = 0; i < sURLVariables.length; i++) 
    {
        var sParameterName = sURLVariables[i].split('=');
        if (sParameterName[0] == sParam) 
        {
            return sParameterName[1];
        }
    }
}​
           
        </script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/navbar.css">
        <link rel="stylesheet" type="text/css" href="css/headerfooter.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <div class="accountmanage">
            <a href="LogoutControl"><button class="button">Log out</button></a>
            </div><!-- comment -->
        <header>
            <div class="logobox">
                <a href="#"><img src="image/clapperboard.png" alt="Cinnext logo"></a>
            </div>
            <div> 
                <h1>CINNEXT</h1>
            </div>
        </header>
        <div class="navbar">
            <nav>
            <ul class="nav-links">
                <li><a href="#">Home</a></li>
                <li><a href="#">Movies</a></li>
                <li><a href="#">Member</a></li>
                <li><a href="#">Deals</a></li>
            </ul>
            </nav>
        </div>
        <div id="banner-box">
            <img src="image/banner.jpg" alt="banner">
        </div>
            <div class="container">
                <div class="col-sm-9">
                <div class="row">
                    <h1>Inshowing movies: </h1><!-- comment -->
                    <c:forEach items="${sessionScope.listM}" var="o">
                        <div class="col-12 col-md-6 col-lg-4">
                            <div class="card">
                                <img class="card-img-top" src="${o.image}" alt="Card image cap" height="150">
                                <div class="card-body">
                                    <h4 class="card-title">${o.name}</h4>
                                    <a href="#" class="btn btn-outline-warning button" style="float:left">Detail</a>
                                    <button class="button" onclick="location.href='ShowDateControl?movieid=${o.id}'">Buy ticket</button>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
            
            
                    
            </div>
    
        <jsp:include page="footer.jsp"/> 
        
       
    </body>
</html>

