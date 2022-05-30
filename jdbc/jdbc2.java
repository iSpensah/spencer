
package jdbc;

import java.sql.*;

public class jdbc2 { //has fewer codes
	Connection con;
	Statement stat;

	public Connection getSQLConnection() {
		try {
		/*	Connection */ con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "atos123$");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public Statement getSQLStatement() {
		try {
			/* Statement */ stat = getSQLConnection().createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stat;
	}
	
	public void insertStatement() {
		try {
			int ret = getSQLStatement()
					.executeUpdate("Insert into studentdata values(12,'Sam','Mumbai','343434',90000)");
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("student record inserted done...");
	}

	public void updateStaement() {
		try {
			int ret = getSQLStatement().executeUpdate("update studentdata set scity='N-york' where sid = 1");
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("student record updated done...");
	}

	public void deleteStatement() {
		try {
			int ret = getSQLStatement().executeUpdate("delete from studentdata where scity = 'Manila'");
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("student record updated done...");
	}

	public void selectStatement() {
		try {
			ResultSet result = getSQLStatement().executeQuery("Select * from StudentData");
			while (result.next()) {
				System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getString(4) + " " + result.getString(5));
			}
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done...");
	}
	public static void main(String s[]) {
		jdbc2 obj = new jdbc2();
//obj.insertStatement();
		obj.selectStatement();
	}
}