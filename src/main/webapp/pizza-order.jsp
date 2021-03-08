<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Customize Your Pizza!</h1><hr>

<form method="POST">
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
            <input type="checkbox" name="toppings" value="a">Pepperoni<br>
            <input type="checkbox" name="toppings" value="b">Pineapple<br>
            <input type="checkbox" name="toppings" value="c">Ham<br>
            <input type="checkbox" name="toppings" value="d">Veggies
    </label><br><br>
    <label>
        <h3>Delivery Address</h3>
            <input type="text" name="address" placeholder="Enter delivery address">
    </label><br><br><br>

    <button type="submit">Submit Order</button>

</form>
</body>
</html>