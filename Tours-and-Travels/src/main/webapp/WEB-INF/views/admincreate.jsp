<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Show user</title>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <form action="/pack" object="${student}" method="post">
            <div class="form-group">
                <label for="pid">Package ID:</label>
                <input type="text" class="form-control" id="pid" name="pid">
            </div>
            <div class="form-group">
                <label for="packagename">Package Name:</label>
                <input type="text" class="form-control" id="packagename" name="packagename">
            </div>
            <div class="form-group">
                <label for="cost">Package Cost:</label>
                <input type="text" class="form-control" id="cost" name="cost">
            </div>
            
            <button type="submit" class="btn btn-success">Submit</button>

        </form>
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </body>
</html>