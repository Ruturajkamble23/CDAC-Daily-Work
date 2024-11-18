<jsp:useBean id="interest" class="app.Component.InterestBean" scope="session"></jsp:useBean>

<jsp:setProperty name="interest" property="amount" />
<jsp:setProperty name="interest" property="period" />
<jsp:setProperty name="interest" property="rate" />

<html>
<head>
    <title>Simple Interest Calculator</title>
    <style>
        
        body, html {
            height: 100%;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: Arial, sans-serif;
            background-color: #f4f4f9; 
        }

        .container {
            padding: 20px;
            border: 2px solid #ccc;
            border-radius: 8px;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 400px; 
            text-align: center; 
        }

        table {
            margin: 20px 0;
            width: 100%;
            text-align: left;
        }

        th, td {
            padding: 8px;
        }

        th {
            width: 100px;
        }

        input[type="text"] {
            padding: 5px;
            width: 150px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            padding: 8px 15px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .result {
            font-weight: bold;
            font-size: 18px;
            margin-top: 20px;
        }
    </style>
</head>
<body>

    <div class="container">
		
        <h1>Welcome Investor</h1>
        <form method="post">
            <table border="1">
                <tr>
                    <th><b>Amount:</b></th>
                    <td><input type="text" name="amount" value="${interest.amount}" /></td>
                </tr>
                <tr>
                    <th><b>Period:</b></th>
                    <td><input type="text" name="period" value="${interest.period}" /></td>
                </tr>
                <tr>
                    <th><b>Rate:</b></th>
                    <td><input type="text" name="rate" value="${interest.rate}" /></td>
                </tr>
            </table>
            <input type="submit" value="Calculate" />
        </form>

        
        <div class="result">
            <b>Simple Interest:</b> ${interest.interest}
            
        </div>
    </div>
    
</body>
</html>
