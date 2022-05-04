<%-- 
    Document   : moviestats
    Created on : Apr 6, 2022, 8:52:22 AM
    Author     : Admin
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MovieStat</title>
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
            <div id="banner-box">
            <img src="image/banner.jpg" alt="banner">
        </div>
        <div class="content-box">
        <h3>Select a time period:</h3>
        </div>   
        <div class="content-box-inline">
            <form action="MovieStatControl" method="post" class="form-inline my-2 my-lg-0">
            <div class="form-group">
            <label>Start date</label>
            <input name="startdate" type="text" class="form-control" required>
            <button class="fa fa-calendar" style="font-size:20px;color:red"></button>
        </div>
        <div class="form-group">
            <label>End date</label>
            <input name="enddate" type="text" class="form-control" required>
            <button class="fa fa-calendar" style="font-size:20px;color:red"></button>
        </div>

        <input type="submit" class="button" value="View">
                    </form>
        </div>
        <div class="content-box">
        <h3>Movies Statistic</h3>
        <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>MovieID</th>
                            <th>Name</th>
                            <th>Revenue</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${sessionScope.listMs}" var="m">
                            <tr>
                                <td>${m.movieid}</td>
                                <td>${m.name}</td>
                                <td>${m.revenue}</td>
                                <td class="text-right"><button class="btn  btn-success" onclick="location.href = 'MovieDetailControl?movieid=${m.movieid}'" type ="button">View Details</button> </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
        </div>
        
            <jsp:include page="footer.jsp"/>
        
       <script src="js/manager.js" type="text/javascript"></script>
    </body>
</html>

