/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class User {
    
    
    int uid;
    String email,password,firstname,lastname;

    public int getUid() {
       return uid;
   }

    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getFirstname(){
        return firstname;
    }
     public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
      public String getLastname(){
        return lastname;
    }
     public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   
    
    
}
