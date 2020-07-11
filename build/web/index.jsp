<%-- 
    Document   : index
    Created on : Apr 23, 2020, 6:07:09 AM
    Author     : win10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Login</title>

	<link rel="stylesheet" href="CSS/main.css">
	<link rel="stylesheet" href="CSS/login-register.css">
        
	
</head>

<body>

    <div class="main-content">

        <form class="form-register" action="Login" method="get">

            <div class="form-register-with-email">

                <div class="form-white-background">

                    <div class="form-title-row">
                        <h1>Login</h1>
                    </div>
				
		
                    <div class="form-row">
                        <label>
                            <span>Email</span>
                            <input type="text" name="email"  placeholder="enter email">
                        </label>
                    </div>

                    <div class="form-row">
                        <label>
                            <span>Password</span>
                            <input type="password" name="password" placeholder="enter password">
                        </label>
                    </div>
                         <div>
                             <input type="submit" value="Login"><br><br><br>
                    
                	<a href="register.jsp" class="form-log-in-with-existing">You Don't have an account? <b> Register here </b></a>
    
                
                
                </div>
                </div>
			
            </div>

        </form>

    </div>

</body>

</html>
