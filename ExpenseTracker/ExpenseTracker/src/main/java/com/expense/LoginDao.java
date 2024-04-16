package com.expense;
import java.sql.*;
public class LoginDao {
String url="jdbc:mysql://localhost:3306/profdb",user="root",pass="root";
Connection con=null;
PreparedStatement ps;
ResultSet rs;

public LoginDao() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	con=DriverManager.getConnection(url,user,pass);
}
public boolean validate(Login bean) throws SQLException {
	ps=con.prepareStatement("select * from login where uname=? and pass=?");
	ps.setString(1, bean.getUname());
	ps.setString(2, bean.getPass());
	
  rs=ps.executeQuery();
  if(rs.next())
	  return true;
  else
	  return false;
}
public boolean saveUser(Login bean) throws SQLException {
	ps=con.prepareStatement("insert into login values(?,?)");
	ps.setString(1, bean.getUname());
	ps.setString(2, bean.getPass());
	
  int r=ps.executeUpdate();
  if(r>0)
	  return true;
  else
	  return false;
}

}
