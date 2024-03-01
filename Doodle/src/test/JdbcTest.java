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
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.219.101:1521:XE", "scott", "TIGER");
			if (conn != null) {
				stmt = conn.createStatement();
				rset = stmt.executeQuery("select * from emp");
				System.out.println("연결성공");
				while (rset.next()) {
					System.out.println();
					System.out.println(rset.getInt("empno"));
					System.out.println(rset.getString("ename"));
					System.out.println(rset.getDouble("sal"));

				}
				System.out.println("끝");
			}
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
