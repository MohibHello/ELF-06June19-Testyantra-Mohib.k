package com.tyss.designpattern.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tyss.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		String dbUrl = "jdbc:mysql://localhost:3306/testyantra_db";
		String query = "select * from employee_info";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery(query);) {
			// 1.Load the Driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			ArrayList<EmployeeInfoBean> beans = new ArrayList<>();
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber(rs.getInt("ACCOUNT_NUMBER"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MGR_ID"));

				beans.add(bean); // Adding to ArrayList;
			}
			return beans;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}// end of getEmployeeInfo(String id)

	public EmployeeInfoBean getEmployeeInfo(int id) {

		Connection con = null;
		String query = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			// 1.Load the Driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);

			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}

			// 2. Get the "DB Connection" via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/testyantra_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			log.info("Connection Details " + con.getClass());

			// 3.Issue the "SQL queries" via connection
			query = "select * from employee_info" + " where id=?;";
			log.info("Query :::::::::::: ****" + query);
			pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();

			// 4.Process the result returned by "SQL Queries"
			EmployeeInfoBean bean = new EmployeeInfoBean();
			while (rs.next()) {
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber(rs.getInt("ACCOUNT_NUMBER"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MGR_ID"));
			}

			return bean;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// end of getEmployeeInfo

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return false;
	}
}
