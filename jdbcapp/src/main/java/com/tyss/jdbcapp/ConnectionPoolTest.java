package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tyss.jdbcapp.connectionpool.ConnectionPool;

import lombok.extern.java.Log;

@Log
public class ConnectionPoolTest {

	public static void main(String[] args) {
		ConnectionPool pool = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			pool = ConnectionPool.getConnectionPool();
			con = pool.getConnectionFromPool();

			// 3.issue "sql query via connection.
			String query = "select * from EMPLOYEE_INFO";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

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

		} catch (Exception e) {

			log.info("" + e);

		} finally {
			try {

				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
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
