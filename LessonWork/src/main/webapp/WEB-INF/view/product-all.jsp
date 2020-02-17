<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<body>
<h1>Product Form Result</h1>
<ul>
    <a href="/products/newProduct">new product</a>
    <br>
    <c:forEach var="item" items="${products}">
        <li>${item.title}</li>
    </c:forEach>
</ul>
</body>
</html>

