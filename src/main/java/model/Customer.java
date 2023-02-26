package model;

import javax.persistence.*;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String contact;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Address address;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Documenets documenets;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Loan loan;
	
	public Customer(int id, String name, String email, String contact, String password, Address address,
			Documenets documenets, Loan loan) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.address = address;
		this.documenets = documenets;
		this.loan = loan;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Documenets getDocumenets() {
		return documenets;
	}
	public void setDocumenets(Documenets documenets) {
		this.documenets = documenets;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
	
	
}
