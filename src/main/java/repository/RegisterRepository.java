package repository;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conn.DBConnection;
import controller.RegistrationController;
import model.Address;
import model.Customer;
import model.Documenets;
import model.Loan;

@WebServlet("/register")
public class RegisterRepository extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String contact = req.getParameter("contact");
		String password = req.getParameter("password");

		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		String pincode = req.getParameter("pincode");
		String landmark = req.getParameter("landmark");

		String doc_name = req.getParameter("doc_name");
		String doc_number = req.getParameter("doc_number");

		Long total_amount = Long.parseLong(req.getParameter("total_loan"));
		Long total_emi = Long.parseLong(req.getParameter("total_emi"));
		Long monthly_emi = Long.parseLong(req.getParameter("monthly_emi"));
		Long remaining_amount = Long.parseLong(req.getParameter("remaining_amount"));
		String date = LocalDate.now().toString();
		String time = LocalTime.now().toString();

		Customer cust = new Customer();
		Address add = new Address();
		Documenets docs = new Documenets();
		Loan loan = new Loan();

		cust.setName(name);
		cust.setEmail(email);
		cust.setContact(contact);
		cust.setPassword(password);
		cust.setAddress(add);
		cust.setDocumenets(docs);
		cust.setLoan(loan);

		add.setCity(city);
		add.setState(state);
		add.setCountry(country);
		add.setPincode(pincode);
		add.setLandmark(landmark);
		add.setCostomer(cust);

		docs.setDocument_name(doc_name);
		docs.setDocument_number(doc_number);
		docs.setCustomer(cust);

		loan.setTotal_loan(total_amount);
		loan.setTotal_emis(total_emi);
		loan.setEmi(monthly_emi);
		loan.setTotal_due_loan(remaining_amount);
		loan.setCustomer(cust);
		loan.setDate(date);
		loan.setTime(time);

		System.out.println(cust.toString());

		RegistrationController rc = new RegistrationController(DBConnection.getFact());
		boolean b = rc.register_now(cust);
		if (b) {
			System.out.println("Success");

		} else {
			System.out.println("error...");
		}

	}

}
