<%-- 
    Document   : orderinsert
    Created on : Sep 13, 2021, 12:39:05 PM
    Author     : USER
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body{
       background-image: url('https://files.wallpaperpass.com/2019/10/food%20wallpaper%20198%20-%201600x1000.jpg');
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
    
        
        <%
            int f = 0;
            PreparedStatement pst = null;
            
            
            String nm = request.getParameter("name");
            String add = request.getParameter("address");
            String cell = request.getParameter("cellno");
            String email = request.getParameter("emailid");
            
            
           
            try{
                
                int s = 0 ;
            
        String sql = "insert into customer" +
                    "(slno,name,address,cellno,emailid)" +
                    "values(?,?,?,?,?)";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","raihan158851");  
        //Statement stmt = con.createStatement();
        
        Statement stmt = con.createStatement();
        String q1 = "select slnoseq.nextval as nextval from dual";
        ResultSet rs = stmt.executeQuery(q1);
        while(rs.next())
        {
               s = rs.getInt(1);
        }
        
        
        
         
        pst = con.prepareStatement(sql);
        
        //stmt.executeUpdate(q1);
        
        pst.setInt(1,s);
        pst.setString(2,nm);
        pst.setString(3,add);
        pst.setString(4,cell);
        pst.setString(5,email);
        
        pst.executeUpdate();
        con.close();
        
            }
            catch(Exception e)
            {
                 f = 1;
            %>
                <p align="center"><b><font size="15" face="Times" color="red">Enter Correct Values</font></b></p><br><br>
             <%
                
            }
        
            if(f==0){  %>
        <form action="order.jsp" align="center"> 
        
        <p align="center"><b><font size="25" face="Times" color="red">Added Successfully</font></b></p><br><br>
        
        <br><br><br><br><br><br> <input type="submit"  value="      Back       " style="font-size:20pt;color:white;background-color:tomato;border:2px solid #FF4C33;padding:3px">

       </form> 
                <%
                }
            %>
    </body>
</html>
