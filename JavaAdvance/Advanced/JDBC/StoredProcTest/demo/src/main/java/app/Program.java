package app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;


    
    public static void main(String[] args) throws Exception {
        String customerId = args[0].toUpperCase();
        int productNo = Integer.parseInt(args[1]);
        int quantity = Integer.parseInt(args[2]);
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@/URl", "root", "Root");
        CallableStatement cstmt = con.prepareCall("{call place_order(?, ?, ?, ?)}");
        cstmt.setString(1, customerId);
        cstmt.setInt(2, productNo);
        cstmt.setInt(3, quantity);
        cstmt.registerOutParameter(4, Types.INTEGER);
        try{
            cstmt.execute();
            System.out.printf("New Order Number: %d%n", cstmt.getInt(4));
        }catch(SQLException e){
            System.out.printf("Order Failed: %s%n", e.getMessage());
        }
        cstmt.close();
 
}

