package controller;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Customer;

public class CustomerController {
	private SessionFactory fact;

	public CustomerController(SessionFactory fact) {
		super();
		this.fact = fact;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers() {
		List<Customer> cust = null;
		Session session = fact.openSession();
		Query query = session.createQuery("FROM Customer");
		cust = query.getResultList();
		return cust;
	}
}
