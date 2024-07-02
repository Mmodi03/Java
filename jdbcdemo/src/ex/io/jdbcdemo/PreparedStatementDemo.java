package ex.io.jdbcdemo;

import java.sql.*;

public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/databl";
		String username="root";
		String password="mmodi.03";
		int id=103;
		String name="mahi";
		
		String query="insert into tab values (?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //completed
		Connection con = DriverManager.getConnection(url,username,password); //completed
		PreparedStatement st = con.prepareStatement(query); //completed
		
		st.setInt(1, id);
		st.setString(2, name);
		
		int rs = st.executeUpdate(); //completed
		System.out.println(rs+" row/s affected");
		
		//Connection
		st.close();  //completed
		con.close();  //completed
		
	}

}