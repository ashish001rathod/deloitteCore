package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver= new OracleDriver();
		DriverManager.registerDriver(driver);
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url,"scott","tiger");
		System.out.println("Connected");
		
		/*Statement st= conn.createStatement();
		String qry="insert into employee values(123,'abcde',5000)";
		st.executeUpdate(qry);*/
		
		String qry="insert into employee values(?,?,?)";
		PreparedStatement pst= conn.prepareStatement(qry);
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++){
		   System.out.println("Enter the employeeId: ");
		   int employeeId=sc.nextInt();
		   System.out.println("Enter the employeeName: ");
		   String employeeName=sc.next();
		   System.out.println("Enter the employeeSalary: ");
		   int employeeSalary=sc.nextInt();
		pst.setInt(1,employeeId);
		pst.setString(2,employeeName);
		pst.setDouble(3,employeeSalary);
		int rows= pst.executeUpdate();
		
		System.out.println("inserted "+rows);
		}
		conn.close();
	}
}
