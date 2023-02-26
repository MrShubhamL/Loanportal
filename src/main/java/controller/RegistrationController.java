package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Customer;

public class RegistrationController{

	private SessionFactory fact;

	public RegistrationController(SessionFactory fact) {
		super();
		this.fact = fact;
	}
	
	
	public boolean register_now(Customer c) {
		boolean b = false;
		Session session = fact.openSession();
		Transaction tr = session.beginTransaction();
		session.save(c);
		tr.commit();
		if(session.isOpen()) {
			b = true;
		}
		return b;
	}
	
	
}
