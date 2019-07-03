package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class StatementExampleTwo {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1.load the Driver

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/testyantra_db";
			con = DriverManager.getConnection(dburl, "root", "root");

			// 3.issue "sql query via connection.
			String query = "insert into EMPLOYEE_INFO values " + "(112,'MANJA',23,'MALE',24000,3463463,"
					+ " '2011-04-13',53122525,'MANJA@GMAIL.COM','DEVELOPER','1999-08-11',3,103)";

			stmt = con.createStatement();
			int res = stmt.executeUpdate(query);

			// 4.process the result returned by sql queries
			if (res != 0) {
				log.info("updated");
			}

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {

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
