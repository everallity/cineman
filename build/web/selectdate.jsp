<%-- 
    Document   : selectdate
    Created on : Apr 6, 2022, 12:29:58 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/navbar.css">
        <link rel="stylesheet" type="text/css" href="css/headerfooter.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" />
        <script>
            function getShowtime(){
                var date=document.getElementById("showDate");
                var showDate=date.toString();
               // document.location.href="ShowTimeControl?="+showDate;
            }
            function confirmTicket(){
                var movieid=GetURLParameter('movieid');
                var url="BookingControl?movieid"+movieid;
                document.getElementById("confirmticket").action=url;
            }
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
    </head>
    <body>
        <a href="clienthomepage.jsp"><button class="button">Cancel</button></a>
        <form action="ShowTimeControl" method="post">
            <div><!-- comment -->
        <div class="content-box">
            <h1>Select a date:</h1>
            <form action="ShowTimeControl" method="post">
                <input type="date" name="showDate" id="showDate">
            <!--    <input type="submit" class="button" value="Confirm">-->
        </div>
        <div class="content-box">
            <h1>Select a showtime:</h1>
          <!--  <form action="ShowTimeControl" method="post">-->
                <select name="showTime" id="showTime">
                    <option value="7h30">7h30</option>
                    <option value="10h30">10h30</option>
                    <option value="16h30">16h30</option>
                    <option value="20h">20h30</option>
                </select>
           <!--     <input type="submit" class="button" value="Confirm">-->
          <!--  </form>-->
        </div>
            <div class="content-box">
                <h1>Confirm Date and Showtime?</h1>
            <input type="reset" class="button" value="Reset">
            <input type="submit" class="button" onlick="confirmticket()" value="Confirm">
            </div>
        </form>
            
        <div class="content-box">
            
            <h1>Select a seat:</h1>
            <form action="BookingControl" method="post" id="confirmticket">
                <input type="hidden" id="movieid" name="movieid" value="${sessionScope.movie.id}">
                <input type="hidden" id="clientid" name="clientid" value="${sessionScope.clientid}">
                <input type="hidden" id="showTime" name="showTime" value="${sessionScope.showtime}">
                <input type="hidden" id="showdate" name="showdate" value="${sessionScope.showdate}">
                <select name="Seat" id="Seat">
                    <c:forEach items="${sessionScope.listS}" var="s">
                        <option value="${s.seatid}">${s.seatcol}${s.seatrow}</option>
                        <a href="selectdate.jsp"></a>
                    </c:forEach>
                </select>
                <input type="reset" class="button" value="Reset">
            <input type="submit" class="button" value="Confirm">
            
            </form>
        </div>    

    </body>
</html>
