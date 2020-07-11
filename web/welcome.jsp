<%-- 
    Document   : welcome
    Created on : Apr 2, 2020, 10:09:36 AM
    Author     : win10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>welcome page</title>
</head>
<body>
<center>
      
       <h1>Welcome <%=request.getParameter("email") %></h1>
        <div>
            <a href="student.jsp"><h3>Student Details</h3></a><br>
            <a href="payment.jsp"><h3>Payment Details</h3></a><br>
            <a href="logout.jsp"><h3>Logout</h3></a>
		
        </div>
</center>
</body>

</html>