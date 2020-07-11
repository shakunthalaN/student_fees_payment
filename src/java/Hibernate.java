
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Hibernate {
    
    
    Session session = null;
    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public User getLoginDetails(User user) {

        boolean flag = false;
        session = sessionFactory.openSession();
        session.beginTransaction();
        String firstname = user.getFirstname();
        String lastname = user.getLastname();
        String email = user.getEmail();
        String password = user.getPassword();
        String SQL_QUERY = "From User where email='" + email + "' and password='" + password + "'";
        Query query = (Query) session.createQuery(SQL_QUERY);
        System.out.println("Query : " + query);
        for (Iterator it = query.iterate(); it.hasNext();) {

            User u = (User) it.next();
           user.setUid(u.getUid());
            user.setFirstname(u.getFirstname());
            user.setLastname(u.getLastname());
            user.setEmail(u.getEmail());
            user.setPassword(u.getPassword());
          
            flag = true;
        }
        session.getTransaction().commit();
        session.close();
        if (!flag) {
            user.setEmail("");
            user.setPassword("");
        }

        return user;
    }

    public void addUSer(String fname,String lname,String email, String pass) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        User u = new User();
        u.setFirstname(fname);
        u.setLastname(lname);
        u.setEmail(email);
        u.setPassword(pass);
        session.save(u);
        session.getTransaction().commit();
        session.close();
    }

    

    
    
    
}
