<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>List of data</title>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class "Container">
            <table class="table table-dark">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Package Name</th>
                        <th> Package Cost</th>
                        <th>Book Package</th>
                        
                    </tr>

                </thead>
                <tbody>
                    <c:forEach items="${student}" var="lists">
                        <tr>
                        <td>${lists.pid}</td>
                        <td>${lists.packagename}</td>
                        <td>${lists.cost}</td>
                        <td><td><a type="button" class="btn btn-success" href="/flights">Book</a></td></td>
                        
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    
            <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
            <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        </div>
    </body>
</html>