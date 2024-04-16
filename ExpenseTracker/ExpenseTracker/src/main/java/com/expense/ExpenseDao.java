package com.expense;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExpenseDao {

		String url="jdbc:mysql://localhost:3306/profdb",user="root",pass="root";
		Connection con=null;
		PreparedStatement ps;
		ResultSet rs;
		
		public ExpenseDao() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url,user,pass);
		}
		public boolean saveData(ExpensePage bean) throws SQLException {
			ps=con.prepareStatement("INSERT INTO expenses (date, money, description) VALUES (?, ?, ?)");
			ps.setDate(1, (Date) bean.getDate());
			ps.setInt(2,bean.getMoney());
			ps.setString(3,bean.getDesc());

		  int r=ps.executeUpdate();
		  if(r>0)
			  return true;
		  else
			  return false;
		}
}
