package jdbc;

import java.sql.*;

public class jdbcExample { // has many codes

	Connection con;
	Statement stat;

	public Connection getConnection() {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "atos123$");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public Statement getSQLStatement() {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "atos123$");
			Statement stat = con.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stat;
	}

	public void select() {
		try {
			// step-1 --establish connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "atos123$");
			// step-2 --create statement object
			Statement stat = con.createStatement();
			// step-03 --fire select statement
			ResultSet result = stat.executeQuery("Select * from StudentData");
			// step-4 -- read result set
			while (result.next()) {
				System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getString(4) + " " + result.getString(5));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Select Done");
	}

	public void insert() {

		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "atos123$");
			Statement stat = con.createStatement();
			int ret = stat.executeUpdate("Insert into StudentData values(10,'Sam','Pune','343434',90000)");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Insert Done");
	}

	public void update() {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "atos123$");
			Statement stat = con.createStatement();
			int ret = stat.executeUpdate("Update StudentData set scity = 'N-York' where sid =1");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Update Done");
	}

	public void delete() { // delete from StudentData where scity = 'Manila';
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "atos123$");
			Statement stat = con.createStatement();
			int ret = stat.executeUpdate("delete from StudentData where scity = 'Manila'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Delete Done");
	}

	public static void main(String s[]) {
		jdbcExample obj = new jdbcExample();
		obj.delete();
		obj.select();
	}
}