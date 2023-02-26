package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Documenets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String document_name;
	private String document_number;
	@OneToOne
	private Customer customer;
	public Documenets(int id, String document_name, String document_number, Customer customer) {
		super();
		this.id = id;
		this.document_name = document_name;
		this.document_number = document_number;
		this.customer = customer;
	}
	public Documenets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDocument_name() {
		return document_name;
	}
	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}
	public String getDocument_number() {
		return document_number;
	}
	public void setDocument_number(String document_number) {
		this.document_number = document_number;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
