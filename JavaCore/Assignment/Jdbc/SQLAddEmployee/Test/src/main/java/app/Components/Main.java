package app.Components;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Empid");
        String empid =sc.nextLine();
        System.out.println("enter Salary");
        double salary =sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter location");
        String location = sc.nextLine();

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","rutu");
        PreparedStatement pstmt = con.prepareStatement("insert into emp values(?, ?, ?, ?)");
        try{

            pstmt.setString(1, name);
            pstmt.setString(2, empid);
            pstmt.setDouble(3, salary);
            pstmt.setString(4, location);
            pstmt.execute();

           // con.commit(); by default, a connection in JDBC is in autocommit mode
            System.out.println("Employee added successfully ");
            pstmt.close();
        }catch(SQLException e){
           //con.rollback();
            System.out.println("Invalid Values... ");

        }
        sc.close();
        con.close();

    }

}

