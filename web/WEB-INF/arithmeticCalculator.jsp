<%-- 
    Document   : arithmeticCalculator
    Created on : Feb 2, 2021, 9:44:12 PM
    Author     : 709488
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmeticCalculator" method="POST">
            First: <input type="text" name ="first" value=""><br/>
            Second: <input type="text" name="second" value=""><br/>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
            
            
            
        </form>
        <br/>
        <div>
            Result: ${mathDone}
        </div>
        <div>
            <a href="ageCalculator">Age Calculator</a>
        </div>
    </body>
</html>
