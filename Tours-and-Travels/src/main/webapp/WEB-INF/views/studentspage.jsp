<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>List of data</title>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <td><a type="button" class="btn btn-success" href="/studentspage/add">Add</a></td>
        <div class "Container">
            <table class="table table-striped">
                <thead class="thead-dark">
                    <tr>
                        <th>Student Id</th>
                        <th>vehicle</th>
                        <th>Number of Travellers</th>
                        <th>Number of Children</th>
                        <th>Number of Adults</th>
                        <th>Place</th>
                        <th>Booking date</th>
                        <th>Action 1</th>
                        <th>Action 2</th>
                    </tr>

                </thead>
                <tbody>
                    <c:forEach items="${students}" var="student">
                        <tr>
                        <td>${student.id}</td>
                        <td>${student.vehicle}</td>
                        <td>${student.trav}</td>
                        <td>${student.children}</td>
                        <td>${student.adults}</td>
                        <td>${student.place}</td>
                        <td>${student.bdate}</td>
                        <td><a type="button" class="btn btn-success" href="/updatepage?id=${student.id}">Update</a></td>
                        <td><a type="button" class="btn btn-success" href="/deletepage?id=${student.id}">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
            <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        </div>
    </body>
</html>