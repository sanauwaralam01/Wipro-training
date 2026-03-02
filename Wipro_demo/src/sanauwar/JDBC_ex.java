package sanauwar;

import java.sql.*;

public class JDBC_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root@001");
			String sql = "ALTER TABLE employee ADD pincode VARCHAR(10)";  // to enter a new column as a postal code for employee
			Statement stmt =con.createStatement();
			//stmt.executeUpdate(sql);
			//ResultSet rs =stmt.executeQuery("select * from employee");
			/*System.out.printf("%-8s %-10s %-10s %-10s %-10s%n", "Employee_ID ","First_Name","Last_name","Gender","Age");
			System.out.println(".................................................................");
			while(rs.next()) {
				//System.out.println(rs.getInt("Employee_ID")+" "+ rs.getString("First_name")+" "+rs.getString("Last_Name")+" "+rs.getString("gender")+" "+rs.getInt("Age")+" "+rs.getString("Address"));
				//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+"  "+rs.getString(4));
				System.out.printf( "%-8d %-15s %-10s %-10s %-10d%n",
						rs.getInt("Employee_ID"),
						rs.getString("First_name"),
						rs.getString("Last_Name"),
						rs.getString("gender"),
						rs.getInt("Age"));
			}
			con.close();*/
			String sql1 ="update employee SET pincode=? where Employee_ID=?";    // to update the pin code to the employee
					PreparedStatement ps=con.prepareStatement(sql1);
					ps.setString(1, "805110");
					ps.setInt(2,1);
					ps.executeUpdate();
					
					ps.setString(1, "805111");
					ps.setInt(2,2);
					ps.executeUpdate();
					
					ps.setString(1, "805120");
					ps.setInt(2,3);
					ps.executeUpdate();
					
					ps.setString(1, "805121");
					ps.setInt(2,4);
					ps.executeUpdate();
					System.out.println("printed");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
