package webproject.jdbc.model.dao;

import java.sql.Connection;
import static webproject.jdbc.common.JdbcTemplate.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import webproject.jdbc.model.vo.Salgrade;

public class SalgradeDao {

	public void selectOne() {
	}

	public List<Salgrade> selectList(Connection conn) {
		List<Salgrade> result = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			String sql = "select * from Salgrade";
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			result = new ArrayList<Salgrade>();
			while (rset.next()) {
				Salgrade vo = new Salgrade();
				vo.setGrade(rset.getInt("grade"));
				vo.setLosal(rset.getInt("losal"));
				vo.setHisal(rset.getInt("hisal"));

				result.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			close(rset);
			close(pstmt);
		}
		return result;
	}

	public int insert(Connection conn, Salgrade vo) {
		int result = -1;
		String sql = "insert into salgrade values(?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getGrade());
			pstmt.setInt(2, vo.getLosal());
			pstmt.setInt(3, vo.getHisal());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);

		}
		return result;

	}

	public void delete() {

	}

}
