package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public class InsertIntoAWSDB {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 1.load the Driver

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://awsmysql.czmykesal13x.ap-south-1.rds.amazonaws.com" + ":3306/awstestyantra_db";
			con = DriverManager.getConnection(dburl, "root", "rootroot");

			// 3.issue "sql query via connection.
			String query = "insert into employee_info values " + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
			pstmt.setInt(5, Integer.parseInt(args[4]));
			pstmt.setInt(6, Integer.parseInt(args[5]));
			pstmt.setString(7, args[6]);
			pstmt.setInt(8, Integer.parseInt(args[7]));
			pstmt.setString(9, args[8]);
			pstmt.setString(10, args[9]);
			pstmt.setString(11, args[10]);
			pstmt.setInt(12, Integer.parseInt(args[11]));
			pstmt.setInt(13, Integer.parseInt(args[12]));

			int res = pstmt.executeUpdate();
			// 4.process the result returned by sql queries
			log.info("updated" + rs);

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {

			log.info("" + e);

		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
