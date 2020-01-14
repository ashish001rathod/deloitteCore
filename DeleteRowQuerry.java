package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class DeleteRowQuerry {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver= new OracleDriver();
		DriverManager.registerDriver(driver);
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url,"scott","tiger");
		System.out.println("Connected");
		
		String qry="update employee set employeeName=? , employeeSalary=? where employeeId=?";
		PreparedStatement pst = conn.prepareStatement(qry);
		pst.setString(1, "DELOITTE");
		pst.setDouble(2, 9000);
		pst.setInt(3, 123);
		int rows = pst.executeUpdate();
		System.out.println(rows);
		conn.close();
	}
}
