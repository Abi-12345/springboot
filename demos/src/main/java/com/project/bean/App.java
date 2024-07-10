package com.project.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.ServiceRegistry;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
    	
    	busroutedetails br = new busroutedetails();
    	br.setBusroute("karur to mumbai");
    	br.setBusno(9);
    	
    	Studentregistration ru = new Studentregistration();
    	ru.setName("abi");
    	ru.setDept("cse");
    	
    	Configuration c = new Configuration().configure().addAnnotatedClass(Studentregistration.class).addAnnotatedClass(busroutedetails.class);
    	ServiceRegistry s = new StandardServiceRegistryBuilder()
    		    .applySettings(c.getProperties())
    		    .build();

    	SessionFactory sf = c.buildSessionFactory(s);
    	Session session = sf.openSession();
    	Transaction txn = session.beginTransaction();
    	
    	session.save(ru);
    	txn.commit();
    	
    	session.close(); // Close the session
    	sf.close(); // Close the session factory
    }
}
