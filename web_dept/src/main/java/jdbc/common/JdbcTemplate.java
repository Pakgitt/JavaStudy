package jdbc.common;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.catalina.filters.ExpiresFilter.XServletOutputStream;

public class JdbcTemplate {
	private JdbcTemplate() {

	}

	public static Connection getConnection() {
		Connection conn = null;
		Properties prop = new Properties();

		try {
			String currentPath = JdbcTemplate.class.getResource("").getPath();
//			System.out.println(currentPath);	// 위치 확인
			prop.load(new FileReader(currentPath + "driver.properties")); // 연결
//			System.out.println(prop.getProperty("jdbc.url"));	// 출력 확인
			Class.forName(prop.getProperty("jdbc.driver"));
			conn = DriverManager.getConnection(prop.getProperty("jdbc.url"), prop.getProperty("jdbc.username"),
					prop.getProperty("jdbc.password"));
			System.out.println((conn != null) ? "연결 성공" : "연결 실패");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

	public static void autoCommit(Connection conn, boolean autocommit) {
		try {
			if (conn != null)
				conn.setAutoCommit(autocommit);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void commit(Connection conn) {
		try {
			if (conn != null)
				conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection conn) {
		try {
			if (conn != null)
				conn.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(PreparedStatement pstmt) {
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rset) {
		try {
			if (rset != null)
				rset.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
