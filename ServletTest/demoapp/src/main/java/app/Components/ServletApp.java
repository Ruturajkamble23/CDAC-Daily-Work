package app.Components;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Add")
public class ServletApp extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String empid = request.getParameter("empid");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String location = request.getParameter("location");
        

        response.setContentType("text/html");


        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "rutu")) {
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO emp (name, empid, salary, location) VALUES (?, ?, ?, ?)");
        pstmt.setString(1, name);
        pstmt.setString(2, empid);
        pstmt.setDouble(3, salary);
        pstmt.setString(4, location);
        pstmt.executeUpdate();
        response.getWriter().write("Employee added successfully.");
    } catch (SQLException e) {
        System.out.println("added");
        e.printStackTrace();
        response.getWriter().write("Invalid: " + e.getMessage());
    }
}
}
