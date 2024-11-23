<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Employee</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }
        .form-label {
            font-size: 16px;
            margin-bottom: 5px;
        }
        .form-input {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .submit-button {
            padding: 10px 15px;
            background-color: #4caf50;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
        }
        .submit-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Add Employee</h2>
        <form action="Add" method="POST">
            <div>
                <label class="form-label" for="name">Name:</label><br>
                <input class="form-input" type="text" id="name" name="name" required><br>
            </div>
            <div>
                <label class="form-label" for="empid">Employee ID:</label><br>
                <input class="form-input" type="text" id="empid" name="empid" required><br>
            </div>
            <div>
                <label class="form-label" for="salary">Salary:</label><br>
                <input class="form-input" type="number" id="salary" name="salary" required><br>
            </div>
            <div>
                <label class="form-label" for="location">Location:</label><br>
                <input class="form-input" type="text" id="location" name="location" required><br>
            </div>
            <input class="submit-button" type="submit" value="Add Employee">
        </form>
    </div>

</body>
</html>
