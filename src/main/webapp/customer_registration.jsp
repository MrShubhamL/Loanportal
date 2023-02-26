<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Admin Home</title>
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
					  <!-- /.login-logo -->
					  <form action="register" method="post">
						  <div class="card mt-2">
							  	<div class="card-header p-0 m-0 bg-info">
							      <p class="text-white text-bold px-2 m-2">Customer Personal Details</p>					  		
							  	</div>
							    <div class="card-body login-card-body">
							        <div class="row">
							        	<div class="col-6">
								        	<div class="input-group mb-3">
									          <input type="text" name="name" class="form-control" placeholder="Customer Name">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-user"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								        
								        <div class="col-6">
									        <div class="input-group mb-3">
									          <input type="text" name="email" class="form-control" placeholder="Customer Email">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-envelope"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								 		
								 		<div class="col-6">
									        <div class="input-group mb-3">
									          <input type="tel" name="contact" class="form-control" placeholder="Customer Contact">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-phone"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								        
								        <div class="col-6">  
									        <div class="input-group mb-3">
									          <input type="password" name="password" class="form-control" placeholder="Password">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-lock"></span>
									            </div>
									          </div>
									        </div>
								        </div>
							        </div>
						
							    </div>
						  </div>
						  
						  <div class="card mt-2">
							  	<div class="card-header p-0 m-0 bg-info">
							      <p class="text-white text-bold px-2 m-2">Customer Address Details</p>					  		
							  	</div>
							    <div class="card-body login-card-body">
							        <div class="row">
							        	<div class="col-6">
								        	<div class="input-group mb-3">
									          <input type="text" name="city" class="form-control" placeholder="City Name">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-home"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								        
								        <div class="col-6">
									        <div class="input-group mb-3">
									          <input type="text" name="state" class="form-control" placeholder="State Name">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-state"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								 		
								 		<div class="col-6">
									        <div class="input-group mb-3">
									          <input type="text" name="country" class="form-control" placeholder="Country Name">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-country"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								        
								        <div class="col-6">  
									        <div class="input-group mb-3">
									          <input type="tel" name="pincode" class="form-control" placeholder="Enter pincode">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-key"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								        
								        
								        <div class="col-6">  
									        <div class="input-group mb-3">
									          <input type="text" name="landmark" class="form-control" placeholder="Landmark">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-paper"></span>
									            </div>
									          </div>
									        </div>
								        </div>
							        </div>
							    </div>
						  </div>
						  
						  
						  <div class="card mt-2">
							  	<div class="card-header p-0 m-0 bg-info">
							      <p class="text-white text-bold px-2 m-2">Customer Document Details</p>					  		
							  	</div>
							    <div class="card-body login-card-body">
							        <div class="row">
							        	<div class="col-6">
								        	<div class="input-group mb-3">
									          <input type="text" name="doc_name" class="form-control" placeholder="Document Name">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-doc"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								        
								        <div class="col-6">
									        <div class="input-group mb-3">
									          <input type="text" name="doc_number" class="form-control" placeholder="Document Number">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-state"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								 		
								 		</div>
							    </div>
						  </div>
						  
						  
						  <div class="card mt-2">
							  	<div class="card-header p-0 m-0 bg-info">
							      <p class="text-white text-bold px-2 m-2">Customer Loan Details</p>					  		
							  	</div>
							    <div class="card-body login-card-body">
							        <div class="row">
							        	<div class="col-6">
								        	<div class="input-group mb-3">
									          <input type="number" name="total_loan" class="form-control" placeholder="Total Amount">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-doc"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								        
								        <div class="col-6">
									        <div class="input-group mb-3">
									          <input type="number" name="total_emi" class="form-control" placeholder="Number of EMI's">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-state"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								        
								        <div class="col-6">
									        <div class="input-group mb-3">
									          <input type="number" name="monthly_emi" class="form-control" placeholder="Montly EMI">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-state"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								        
								        <div class="col-6">
									        <div class="input-group mb-3">
									          <input type="number" name="remaining_amount" class="form-control" placeholder="Total Remaining Amount">
									          <div class="input-group-append">
									            <div class="input-group-text">
									              <span class="fas fa-state"></span>
									            </div>
									          </div>
									        </div>
								        </div>
								 		
								 		</div>
							        
							        <div class="row"> 
							          <!-- /.col -->
							          <div class="col-2">
							            <button type="submit" class="btn btn-primary btn-block">Create Account</button>
							          </div>
							          <div class="col-2">
							           <button type="reset" class="btn btn-secondary btn-block">Reset Form</button>
							          </div>
							        </div>
							    </div>
						  </div>
						  
					  </form>
					</div>
		        
		        
		        
		        </div>

		      </div>
		     </section>
  		  </div>
		
		
	</div>	

	<%@include file="resources/js_links.jsp"%>
</body>
</html>