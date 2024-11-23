import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.nimbus.State;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","rutu");
            Statement stmt= conn.createStatement();
            String query="select * from student";
            ResultSet rs= stmt.executeQuery(query);

            req.setAttribute("resultset",rs);
            req.getRequestDispatcher("Show.jsp").forward(req,resp);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch(SQLException e)
        {
            System.out.println(e);
        }

    }
}













