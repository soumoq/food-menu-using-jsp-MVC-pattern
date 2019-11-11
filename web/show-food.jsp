
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu</title>
    </head>
    <body>
        <div class="col-sm-8">
                
                <div class="panel-body">
                    <h1 align="center">Food Menu</h1>
                    <table align="center" border="1" bordercolor="red" cellpadding="30%" width="30%" >
                        <thead>
                            <tr>
                                <th>id</th>
                                <th>Item</th>
                                <th>Price</th>
                                
                            </tr>
                            
                            
                              <c:forEach var="item" items="${foodItem}">
                                  <tr>
                                    <td> ${item.id} </td>
                                    <td> ${item.item} </td>
                                    <td> ${item.price} </td>
                                  </tr>
            
                              </c:forEach>
                            
                        </thead>
                    </table>
                </div>
        </div>
    </body>
</html>
