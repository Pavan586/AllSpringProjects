<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Page</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <link rel="stylesheet" href="css/styleone.css">
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/css?family=Spicy+Rice&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Viga&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Fredoka+One&display=swap" rel="stylesheet">
</head>
<body>
<div class="main">
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="clearfix"></div>
	<div class="container mt-5">
	<h5 class="p-2 text-white float-right">Hi ! ${sessionScope.uname }</h5>	
	<h4 class="p-2 text-white">Payment Page</h4>
	
	<div class="row">
			<div class="col-sm-6">
				<div class="card shadow">
					<div class="card-header">
						<h5>Booking Details</h5>
					</div>
					<div class="card-body">
						<table class="table table-borderless table-sm">
							<tr>
								<th>Booking ID</th>
								<th>${bk.bid }</th>
								<th class="text-right">Fare</th>
							</tr>
							<tr>
								<th>Tour Package</th>
								<th>${bk.tour.pname }</th>
								<th class="text-right">&#8377; ${bk.tour.price }</th>
							</tr>
							<tr>
								<th>Flight Info</th>
								<th>${bk.flight.fname }</th>
								<th class="text-right">&#8377; ${bk.flight.fare }</th>
							</tr>
							<tr>
								<th>Hotel Info</th>
								<th>${bk.hotel.hname }</th>
								<th class="text-right">&#8377; ${bk.hotel.fare }</th>
							</tr>
							<tr>
								<th>Insurance</th>
								<th>${bk.insurance ? 'Yes':'No'}</th>
								<th class="text-right">&#8377; ${bk.insurance ? '1000':''}</th>
							</tr>
							<tr class="border-top border-bottom">
								<th colspan="2">Total Amount</th>
								<th class="text-right">&#8377; ${bk.tour.price+bk.flight.fare+bk.hotel.fare+ (bk.insurance ? 1000:0) }</th>								
							</tr>
						</table>
					</div>
				</div>
			</div>
			<div class="offset-1 col-sm-5">
				<form method="post" class="card shadow">
					<input type="hidden" name="userid" value="${sessionScope.userid }">
					<input type="hidden" name="bid" value="${param.bid }">
					<div class="card-body">
						<div class="form-group">
							<label>Amount</label>
							<input type="number" readonly value="${bk.tour.price+bk.flight.fare+bk.hotel.fare + (bk.insurance ? 1000:0)}" required name="amount" class="form-control">
						</div>
						
						
						<div class="form-group">
							<label>Select Payment Mode</label>
							<select required name="mode" class="form-control">
								<option value="">Select Payment Mode</option>
								<option>UPI Payment</option>
								<option>Paypal</option>
								<option>Internet Banking</option>
								<option>Debit/Credit Card</option>
							</select>
						</div>
						
						<div class="form-group">
							<label>Remarks</label>
							<input type="text" required name="remarks" class="form-control">
						</div>
						
						<button class="btn btn-primary float-right">Complete Booking</button>
					</div>
				</form>
			</div>
		</div>
		
	</div>
</div>
</body>
</html>