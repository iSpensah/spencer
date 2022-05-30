
package jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedSQL {
	
	public Connection getSQLConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "atos123$");
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public void updateStudent(int sid, String newCity) { //updateStudent
		try {
			Connection con = getSQLConnection();
			PreparedStatement pstat;
			pstat = con.prepareStatement("update StudentData set scity = ? where sid = ?");
			
			pstat.setString(1, newCity);
			pstat.setInt(2, sid);
			pstat.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("New Record Updated");
	}

	public void deleteStudent(int sid) { //deleteStudent
		try {
			Connection con = getSQLConnection();
			PreparedStatement pstat;
			pstat = con.prepareStatement("delete from StudentData where sid = ?");
			
			pstat.setInt(1,sid);
			pstat.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Record Deleted");
	}

	public void insertStuent(int sid, String sname, String scity, String sphone, int sfees) { //Insert Data
		try {
			Connection con = getSQLConnection();
			PreparedStatement pstat;
			pstat = con.prepareStatement("insert into studentdata values(?,?,?,?,?)");
			pstat.setInt(1, sid);
			pstat.setString(2, sname);
			pstat.setString(3, scity);
			pstat.setString(4, sphone);
			pstat.setInt(5, sfees);
			pstat.executeUpdate();
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("New Record Inserted...");
	}

	public void searchStudent(int sid) {
		try {
			ResultSet result = getSQLConnection().createStatement()
					.executeQuery("Select * from Studentdata where sid = " + sid);
			if (result.next())
				System.out.print("Student found");
			else
				System.out.println("STudent not available");
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		PreparedSQL obj = new PreparedSQL();
//obj.searchStudent(60);;
		Scanner sc = new Scanner(System.in);
		System.out.println("press i for insert, u for update");
		String operations = sc.next();
	
		switch (operations) {
		case"i":
			System.out.println("Enter sid, sname, scity, sphone, sfees");
			int sid= sc.nextInt();
			String sname = sc.next();
			String scity = sc.next();
			String  sphone = sc.next();
			int sfees = sc.nextInt();
			obj.insertStuent(sid, sname, scity, sphone, sfees);
			break;
		case"u":
			int sid1 = sc.nextInt();
			String scity1 = sc.next();
			obj.updateStudent(sid1, scity1);
			break;
		}
	}
}