<%-- 
    Document   : register
    Created on : Apr 23, 2020, 6:17:26 AM
    Author     : win10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
		
	<title>Register</title>

	<link rel="stylesheet" href="CSS/main.css">
	<link rel="stylesheet" href="CSS/login-register.css">
	
	</head>

<body>

    <div class="main-content">

        <form class="form-register" action="Login" method="post" >

            <div class="form-register-with-email">

                <div class="form-white-background">

                    <div class="form-title-row">
                        <h1>Register</h1>
                        </div>
				   
					<p style="color:green">				   		
					<%
					if(request.getAttribute("successMsg")!=null)
					{
						out.println(request.getAttribute("successMsg")); //register success message
					}
					%>
					</p>
				   
                        <br><br>
                    <div class="form-row">
                        <label>
                            <span>First name</span>
                            <input type="text" name="firstname" placeholder="enter firstname" required="True">
                        </label>
                    </div>
					<div class="form-row">
                        <label>
                            <span>Last name</span>
                            <input type="text" name="lastname"  placeholder="enter lastname" required="True">
                        </label>
                    </div>

                    <div class="form-row">
                        <label>
                            <span>Email</span>
                            <input type="text" name="email" placeholder="enter email" required="true">
                        </label>
                    </div>

                    <div class="form-row">
                        <label>
                            <span>Password</span>
                            <input type="password" name="password"  placeholder="enter password" required="true">
                        </label>
                    </div>
                    <div>
                        <input type="submit" value="Add"><br><br><br><br>
					
                </div>
                        <div>	
                <a href="index.jsp" class="form-log-in-with-existing">Already have an account? <b> Login here </b></a>

            </div>
                </div>
            </div>
            </div>
        </form>

    </div>

</body>

</html>
