




<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<a href="/">
        <div class="top">
          <img class="logo" src="img/abc.png" alt="">
          <h3 class="title">ABC Travels-TRIP</h3>
        </div>
        </a>
	<nav class="navbar sticky-top" style="background:none;">
        <ul class="nav">
        <c:if test="${sessionScope.role eq 'User' }">
        
        </c:if>
        <c:if test="${sessionScope.role eq 'Admin'}">
        
        <li class="nav-item">
          <a class="nav-link active" href="users">USERS</a>
        </li>
        </c:if>
        <li class="nav-item">
          <a class="nav-link active" href="pack">PACKAGES</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="flights">BOOKING</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="hotels">HOTELS</a>
        </li>
        
        <c:if test="${sessionScope.userid eq null }">
        <li class="nav-item">
          <a class="nav-link" href="login">LOGIN</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="alogin">ADMIN LOGIN</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="register">REGISTER</a>
        </li>
        </c:if>
        <c:if test="${sessionScope.userid ne null }">
        <li class="nav-item">
          <a class="nav-link active" href="logout">LOGOUT</a>
        </li>
        </c:if>
      </ul>
    </nav>