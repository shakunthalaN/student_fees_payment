/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author win10
 */
public class Login extends HttpServlet {

   PrintWriter pr;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        pr = response.getWriter();
        String un = request.getParameter("email");
        String pw = request.getParameter("password");

        User user=new User();
        Hibernate co = new Hibernate();
        user.setEmail(un);
        user.setPassword(pw);
        
        user = co.getLoginDetails(user);
        if(user.getEmail().equals(un) && user.getPassword().equals(pw)){
            
            response.sendRedirect("welcome.jsp");
           //pr.println("Valid User");
           //pr.println("User id :"+user.getUid());
           // pr.println("Email :"+user.getEmail());
        }else{
             response.sendRedirect("index.jsp");
            pr.println("Invalid User!!!");
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
         pr = response.getWriter();
         String fn = request.getParameter("firstname");
        String ln = request.getParameter("lastname");
        String un = request.getParameter("email");
        String pw = request.getParameter("password");
        
        Hibernate hib = new Hibernate();
        hib.addUSer(fn,ln,un,pw);
        //pr.Show("hgf");
       
       pr.println("<html>");  
       pr.println("<head>");    
       pr.println("<title>Added Successful</title>");   
       pr.println("</head>");  
       pr.println("<body>");  
       pr.println("<center>");  
       pr.println("<h1>Added Successfully</h1>");  
       pr.println("To login with new UserId and Password<a href=index.jsp>Click here</a>");
       } 
        
        
    }
    
