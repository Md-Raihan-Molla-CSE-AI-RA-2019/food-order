<%-- 
    Document   : firstpage
    Created on : Sep 12, 2021, 10:51:00 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body{
       background-image: url('https://images.unsplash.com/photo-1615996001375-c7ef13294436?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZmFzdGZvb2R8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80');
       background-repeat: no-repeat;
       background-attachment: fixed;
       background-size: 100% 100%;
        }
    </style>
    <style> 
    input[type=submit]{
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 16px 32px;
    text-decoration: none;
    margin: 4px 2px;
    cursor: pointer;
   }
   </style>
    <body>
        <form action="showorder.jsp" align="center">
        <p align="center"><b><font size="15" face="Times" color="red">Welcome to Good Food</font></b></p>
        <center><img src="https://www.chitchatmoney.com/wp-content/uploads/2020/10/Goodfood-logo.png" alt="what image shows" height="300" width="300"></center>
        <br><br><input type="submit"  value="       Next       " style="font-size:20pt;color:white;background-color:green;border:2px solid #336600;padding:3px">
    </form>
    </body>
</html>
