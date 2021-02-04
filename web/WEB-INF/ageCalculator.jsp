<%-- 
    Document   : ageCalculator
    Created on : Feb 2, 2021, 9:43:47 PM
    Author     : 709488
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    
  
    <body>
        <h1>Age Calculator</h1>
        <form action="ageCalculator" method="POST">
        Enter your age: <input type="text" name="inputAge" value=""><br/>
        <input type="submit" name="ageCalc" value="Age Next Birthday"><br/>
        </form>
        <p>
            ${input_Age}
        </p>
        
    </body>
    <a href="arithmeticCalculator">Arithmetic Calculator</a>
</html>
