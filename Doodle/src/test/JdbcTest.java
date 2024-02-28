package test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // drvier class 파일 있는지 확인.
			// DriverManager
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "scott", "TIGER");
			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select id, last_name from emp");
			int result = stmt.executeUpdate("UPDATE EMP SET LAST_NAME = 'KIM' WHERE ID = '10000'");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null)
					rset.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
