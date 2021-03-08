<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Customize Your Pizza!</h1><hr>

<form method="POST" action="pizza-order">
    <h3>Select Your Crust</h3>
    <label>
        <select name="crust">
            <option value="hand">Hand Tossed</option>
            <option value="thin">Thin Crust</option>
            <option value="stuff">Stuffed Crust</option>
        </select>
    </label><br><br>
    <h3>Select Your Size</h3>
    <label>
        <select name="size">
            <option value="sm">Small</option>
            <option value="md">Medium</option>
            <option value="lg">Large</option>
        </select>
    </label><br><br>
    <label>
        <h3>Select Your Toppings</h3>
            <input type="checkbox" name="toppings" id="pep" value="pep">Pepperoni<br>
            <input type="checkbox" name="toppings" id="pin" value="pin">Pineapple<br>
            <input type="checkbox" name="toppings" id="ham" value="ham">Ham<br>
            <input type="checkbox" name="toppings" id="veg" value="veg">Veggies
    </label><br><br>
    <label for="address">
        <h3>Delivery Address</h3>
    </label>
            <input id="address" type="text" name="address" placeholder="Enter delivery address">
    <br><br><br>

    <button type="submit">Submit Order</button>
    <div>
        Address Entered: ${address}
    </div>
</form>

</body>
</html>