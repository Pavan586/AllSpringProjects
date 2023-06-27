<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
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
	<h4 class="p-2 text-white">Bookings Page</h4>
	
	<div class="row">
			<div class="col-sm-5 mx-auto">
				<form method="post" class="card shadow">
					<div class="card-body">
						<div class="form-group">
							<label>Select vehicle</label>
							<select name="vehicle" class="form-control" required>
								<option value="">Select Vehicle</option>
								<option>Bus</option>
								<option>Car</option>
								<option>Auto</option>
								<option>Train</option>
								<option>Flight</option>
								<option>Bycycle</option>
							</select>
						</div>
						<div class="form-group">
							<label>Number of travellers </label>
							<input type="text" name="trav" class="form-control" required>
						</div>
						<div class="form-group">
							<label>Number of children</label>
							<input type="text" name="children" class="form-control" required>
						</div>
						<div class="form-group">
							<label>Number of Adults</label>
							<input type="text" name="adults" class="form-control" required>
						</div>
						<div class="form-group">
							<label>Select Place you want to book</label>
							<select name="place" class="form-control" required>
								<option value="">Select Place</option>
								<option>Banglore</option>
								<option>Chennai</option>
								<option>Hyderabad</option>
								<option>Pune</option>
								<option>kolakata</option>
								<option>Mumbai</option>
								<option>Goa</option>
							</select>
						</div>
						<div class="form-group">
							<label for="insurance">Booking Date</label>
							<input type="date"class="form-control" name="bdate">
						</div>
            
						<button class="btn btn-primary
						 float-right">Book</button>
					</div>
				</form>
			</div>
		</div>
		
	</div>
</div>
</body>
</html>