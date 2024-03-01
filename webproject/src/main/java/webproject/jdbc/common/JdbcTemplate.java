package webproject.jdbc.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTemplate {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@locahost:1521:xe", "scott", "TIGER");
			if (conn != null) {
				System.out.println("¿¬°áµÊ");
			} else {
				System.out.println("¿¬°á¾ÈµÊ");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public static void autocommit(Connection conn, boolean autocommit) {
		try {
			if (conn != null) {
				conn.setAutoCommit(autocommit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void commit(Connection conn) {
		try {
			if (conn != null) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void rollback(Connection conn) {
		try {
			if (conn != null) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void close(PreparedStatement pstmt) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void close(ResultSet rset) {
		try {
			if (rset != null) {
				rset.close();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
