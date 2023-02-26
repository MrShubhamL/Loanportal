package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private long total_loan;
	private long total_due_loan;
	private long total_emis;
	private long emi;
	private String date;
	private String time;
	
	@OneToOne
	private Customer customer;

	public Loan(int id, long total_loan, long total_due_loan, long total_emis, long emi, String date, String time,
			Customer customer) {
		super();
		this.id = id;
		this.total_loan = total_loan;
		this.total_due_loan = total_due_loan;
		this.total_emis = total_emis;
		this.emi = emi;
		this.date = date;
		this.time = time;
		this.customer = customer;
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getTotal_loan() {
		return total_loan;
	}

	public void setTotal_loan(long total_loan) {
		this.total_loan = total_loan;
	}

	public long getTotal_due_loan() {
		return total_due_loan;
	}

	public void setTotal_due_loan(long total_due_loan) {
		this.total_due_loan = total_due_loan;
	}

	public long getTotal_emis() {
		return total_emis;
	}

	public void setTotal_emis(long total_emis) {
		this.total_emis = total_emis;
	}

	public long getEmi() {
		return emi;
	}

	public void setEmi(long emi) {
		this.emi = emi;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
