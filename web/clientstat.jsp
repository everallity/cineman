<%-- 
    Document   : clientstat
    Created on : Mar 21, 2022, 10:31:45 PM
    Author     : Admin
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/navbar.css">
        <link rel="stylesheet" type="text/css" href="css/headerfooter.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <div class="accountmanage">
            <a href="MovieControl"><button class="button">Log out</button></a>
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
        <div class="content-box">
        <h3>Select a time period:</h3>
        </div>   
        <div class="content-box-inline">
            <ul class="datepicker">
                <li><h4>Start:</h4></li>
                <li><div class="text-box">dfdf</div></li>
                <li><button class="fa fa-calendar" style="font-size:20px;color:red"></button> </li>
                <li><h4>End:</h4></li>
                <li><div class="text-box">dsds</div></li>
                <li><button class="fa fa-calendar" style="font-size:20px;color:red"></button> </li>
            </ul>
        </div>
        <div class="content-box">
        <h3>Customer</h3>
        <table class="content-table">
            <thead>
                <tr>
                    <th>ClientID</th>
                    <th>Name</th>
                    <th>Number of transactions</th>
                    <th>Total Sum</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th>BillID</th>
                    <th>Date</th>
                    <th>Price</th>
                    <th>Note</th>
                </tr>
                <tr>
                    <th>BillID</th>
                    <th>Date</th>
                    <th>Price</th>
                    <th>Note</th>
                </tr>
                <tr>
                    <th>BillID</th>
                    <th>Date</th>
                    <th>Price</th>
                    <th>Note</th>
                </tr>
            </tbody>   
                
        </table>
        
        </div>
        
            <jsp:include page="footer.jsp"/>
        
       
    </body>
</html>
