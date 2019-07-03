package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class JDBCProgramForAWSDB {

	public static void main(String[] args) {

		String dburl = "jdbc:mysql://awsmysql.czmykesal13x.ap-south-1.rds.amazonaws.com:3306/awstestyantra_db";
		String query = "select * from employee_info";

		try (Connection con = DriverManager.getConnection(dburl, "root", "rootroot");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

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

		}
	}
}
