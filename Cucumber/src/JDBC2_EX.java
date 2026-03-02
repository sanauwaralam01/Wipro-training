package sanauwar;
import java.sql.*;
public class JDBC2_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wipro_db","root","root@001");
			Statement stmt =con.createStatement();
			/*CallableStatement cs = con.prepareCall("{CALL getAllEmployees()}");
			ResultSet rs =cs.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("salary"));
			}
			CallableStatement cs = con.prepareCall("{CALL insertEmployee(?,?,?)}");
			cs.setInt(1,3);
			cs.setString(2,"Aman");
			cs.setInt(3,40000);
			cs.execute();
			
			cs.setInt(1,4);
			cs.setString(2,"Subham");
			cs.setInt(3,45000);
			cs.execute();
			
			con.close();
			cs.close();*/

				// Step 3: Call procedures heh
				CallableStatement csInsert = con.prepareCall("call insertAllEmp()");
				csInsert.execute();

				CallableStatement cs = con.prepareCall("call getAllEmp()");
				ResultSet rs = cs.executeQuery();

				// Step 4: Print result bro
				System.out.printf("%-8s %-15s %-10s%n",
						"ID", "Name", "Salary");
				System.out.println("--------------------------------");

				while (rs.next()) {
					System.out.printf("%-8d %-15s %-10d%n",
							rs.getInt("id"),
							rs.getString("name"),
							rs.getInt("sal"));
				}

				con.close();
				cs.close();

			} catch (Exception e) {
				System.out.println(e);
			}
		}


}