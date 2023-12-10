import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class create_data {
    public static void main(String[] args) throws SQLException
    {
//1. create connection
        Connection
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","sqlpass");
//2. create statement/Query
        Statement stmt=con.createStatement();
        String q="insert into student values(50002561,'Ranjit',7.5)";
//String q="update student set cgpa=8.9 where name=‘Ranjit'";
//String q="delete from student where name='raj'";
//3. Execute statement/Query
        stmt.execute(q);
        con.close();
        System.out.println("Query Executed");
    }
}