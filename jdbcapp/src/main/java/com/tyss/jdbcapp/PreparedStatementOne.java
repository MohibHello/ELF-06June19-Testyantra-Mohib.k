package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public class PreparedStatementOne {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 1.load the Driver

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/testyantra_db";
			con = DriverManager.getConnection(dburl, "root", "root");

			// 3.issue "sql query via connection.
			String query = "select * from EMPLOYEE_INFO " + " where ID=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			rs = pstmt.executeQuery();

			// 4.process the result returned by sql queries

			while (rs.next()) {

				log.info("ID 		        ---" + rs.getInt("ID"));
				log.info("NAME			    ---" + rs.getString("NAME"));
				log.info("AGE 			    ---" + rs.getInt("AGE"));
				log.info("GENDER			---" + rs.getString("GENDER"));
				log.info("SALARY  		    ---" + rs.getInt("SALARY"));
				log.info("PHONE  		  	---" + rs.getLong("PHONE"));
				log.info("JOINING_DATE	    ---" + rs.getDate("JOINING_DATE"));
				log.info("ACCCOUNT_NUMBER   ---" + rs.getInt("ACCCOUNT_NUMBER"));
				log.info("EMAIL  			---" + rs.getString("EMAIL"));
				log.info("DESIGNATION  	    ---" + rs.getString("DESIGNATION"));
				log.info("DOB        		---" + rs.getDate("DOB"));
				log.info("DEPT_NO (FK)   	---" + rs.getInt("DEPT_NO"));
				log.info("MGR_ID			---" + rs.getInt("MGR_ID"));
			}

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
