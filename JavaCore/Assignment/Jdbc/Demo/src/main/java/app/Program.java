package app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;


public class Program {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String user_id = sc.nextLine();
        double salary = sc.nextDouble();
        String location = sc.nextLine();

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "rutu");

        CallableStatement cstmt = con.prepareCall("{call addEmp(?,?,?,?)}");
        cstmt.setString(1, name);
        cstmt.setString(2, user_id);
        cstmt.setDouble(3, salary);
        cstmt.setString(4, location);
        cstmt.registerOutParameter(5, Types.INTEGER);
        
        try {
            cstmt.execute();
            System.out.printf("Employee add " ,cstmt.getInt(5));
            
        } catch (SQLException e) {
            System.out.printf("Flied",e.getMessage());
        }
        cstmt.close();
        con.close();
    }

}

