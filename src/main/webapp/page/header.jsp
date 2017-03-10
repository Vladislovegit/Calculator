<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="webjars/jquery/3.1.1/jquery.min.js"></script>
<link href="css/header.css" rel="stylesheet">
<header>
    <nav>
        <div id="container">
            <div id="navbar-header">
                <a href="<c:url value="/index.jsp"/>">Calculator</a>
            </div>
            <div id="navbar">
                <ul>
                    <li><a id="home" href="<c:url value="/index.jsp"/>">Home</a></li>
                    <li><a id="calculator" href="<c:url value="/calculator.jsp"/>">Calculator</a></li>
                    <li><a id="statistics" href="<c:url value="/controller?command=GET_STATISTICS"/>">Statistics</a></li>
                </ul>
            </div>
        </div>
    </nav>
</header>

