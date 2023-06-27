<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>add user</title>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <form action="/studentspage" object="${student}" method="post">
            <div class="form-group">
                <label for="vehicle">Vehicle:</label>
                <input type="text" class="form-control"  id="vehicle" name="vehicle">
            </div>
            <div class="form-group">
                <label for="trav">Number Of Travellers:</label>
                <input type="text" class="form-control"  id="trav" name="trav">
            </div>
            <div class="form-group">
                <label for="children">Number Of children:</label>
                <input type="text" class="form-control" id="children" name="children">
            </div>
            <div class="form-group">
                <label for="adults">Number of adults:</label>
                <input type="text" class="form-control"   id="adults" name="adults">
            </div>
            <div class="form-group">
                <label for="place">Place:</label>
                <input type="text" class="form-control" id="place" name="place">
            </div>
            <div class="form-group">
                <label for="bdate">Booking date:</label>
                <input type="date" class="form-control" id="bdate" name="bdate">
            </div>
            <button type="submit" class="btn btn-success">Submit</button>

        </form>
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </body>
</html>