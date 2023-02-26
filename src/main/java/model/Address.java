package model;

import javax.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String landmark;
	@OneToOne
	private Customer costomer;
	
	public Address(int id, String city, String state, String country, String pincode, String landmark,
			Customer costomer) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.landmark = landmark;
		this.costomer = costomer;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public Customer getCostomer() {
		return costomer;
	}
	public void setCostomer(Customer costomer) {
		this.costomer = costomer;
	}
	
	
}
