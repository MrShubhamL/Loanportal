<%@page import="model.Customer"%>
<%@page import="conn.DBConnection"%>
<%@page import="java.util.*"%>
<%@page import="controller.CustomerController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Customer List</title>
<%@include file="resources/css_links.jsp"%>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
	<div class="wrapper">
		<%@include file="navbar.jsp" %>
		<%@include file="sidebar.jsp" %>
		
		  <!-- Content Wrapper. Contains page content -->
  		  <div class="content-wrapper">
		    <section class="content">
		      <div class="container-fluid">
		        <div class="row">
					<div class="col-lg-12">
						<div class="card mt-3">
							<div class="card-header">
								<h3 class="card-title">All Customer Data</h3>
							</div>
							<!-- /.card-header -->
							<div class="card-body">
								<table id="example1" class="table table-bordered table-striped">
								<thead>
								<tr>
									<th>Name</th>
									<th>Email</th>
									<th>Contact</th>
									<th>Loan Amount</th>
									<th>Date</th>
								</tr>
								</thead>
								<tbody>
								<tr>
									<% 
										CustomerController cust = new CustomerController(DBConnection.getFact());
										List<Customer> c = cust.getAllCustomers();
										for(Customer cr:c){
											%>
											<td><%= cr.getName() %></td>
											<td><%= cr.getName() %></td>
											<td><%= cr.getName() %></td>
											<td><%= cr.getName() %></td>
											<td><%= cr.getName() %></td>
											<%
										}
									%>
								</tr>
								
								</tbody>
								<tfoot>
								<tr>
									<th>Rendering engine</th>
									<th>Browser</th>
									<th>Platform(s)</th>
									<th>Engine version</th>
									<th>CSS grade</th>
								</tr>
								</tfoot>
								</table>
							</div>
							<!-- /.card-body -->
						</div>
					</div>
					<!-- /.card -->
                </div>
              </div>
		    </section>
  		  </div>
		
	</div>	
	<%@include file="resources/js_links.jsp"%>
</body>
</html>