import java.sql.*;

public class JDBCConnection {
public static void main(String args[])
{
	String URL="jdbc:mysql://localhost:3306/demo?characterEncoding=utf8";
	String username="root";
	String password="password";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	
		Connection con = DriverManager.getConnection(URL,username,password);
	
		Statement stat = con.createStatement();
		
		ResultSet resultset = stat.executeQuery("select*from employee");
	
		
		while(resultset.next()) {
			System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getInt(3));
			
		}
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}