<%-- 
    Document   : demohome
    Created on : Mar 23, 2022, 10:46:07 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-sm-9">
                    <div class="row">
                        <c:forEach items="${sessionScope.listM}" var="o">
                            <div class="col-12 col-md-6 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top" src="${o.image}" alt="Card image cap" height="150">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt"><a href="#" title="View Product">${o.name}</a></h4>
                                        <p class="card-text show_txt">${o.description}
                                        </p>
                                        <div class="row">
                                            <div class="col">
                                                <p class="btn btn-danger btn-block">${o.price}</p>
                                            </div>
                                            <div class="col">
                                                <a href="addtocart?id=${o.id}" class="btn btn-success btn-block">Add to cart</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
    </body>
</html>
