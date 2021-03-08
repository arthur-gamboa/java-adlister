<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Customize Your Pizza!</h1><hr>

<form method="POST" action="/pizza-order">
    <label for="crust">Crust</label>
        <select name="crust" id="crust">
            <option value="Hand Tossed">Hand Tossed</option>
            <option value="Thin Crust">Thin Crust</option>
            <option value="Stuffed Crust">Stuffed Crust</option>
        </select><br><br>

    <label for="size">Size</label>
        <select name="size" id="size">
            <option value="Small">Small</option>
            <option value="Medium">Medium</option>
            <option value="Large">Large</option>
        </select><br><br>

    <label for="toppings">Select Your Toppings</label><br>
            <input type="checkbox" name="toppings" id="toppings" value="Pepperoni">Pepperoni<br>
            <input type="checkbox" name="toppings" id="toppings2" value="Pineapple">Pineapple<br>
            <input type="checkbox" name="toppings" id="toppings3" value="Ham">Ham<br>
            <input type="checkbox" name="toppings" id="toppings4" value="Veggies">Veggies
    <br><br>

    <label for="address">Delivery Address</label><br>
            <input id="address" type="text" name="address" placeholder="Enter delivery address">
    <br><br><br>

    <button type="submit">Submit Order</button><br><br>
    <div>
        Address Entered: ${address}
    </div>
</form>

</body>
</html>