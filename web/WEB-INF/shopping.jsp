<%-- 
    Document   : shopping
    Created on : 26-Feb-2023, 11:18:33 PM
    Author     : kaurr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        
        <h1>Shopping List</h1>
        
        <p>Hello, ${username}</p>
        
        <a href="ShoppingList?action=logout">Logout</a>
        
        
         <form action="" method="post">
            <h2>List</h2>
            Add item: <input type="text" name="item">
             <input type="hidden" name="action" value="add">
            <input type="submit" value="Add">
         
        </form>
        
         <form action="" method="post">
             <ul>
                 <c:forEach items="${items}" var="item">
                     <li> <input type="radio" name ="foodName" value="${item}">${item}</li>
                 </c:forEach>
             </ul>
            <input type="submit" value="Delete">
            <input type="hidden" name="action" value="delete">
        </form>
                 
    </body>
</html>
