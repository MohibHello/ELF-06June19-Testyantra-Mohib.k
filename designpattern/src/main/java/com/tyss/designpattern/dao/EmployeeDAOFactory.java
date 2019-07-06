package com.tyss.designpattern.dao;

public class EmployeeDAOFactory {

	private static String dbInstancetype = "hibernate";

	private EmployeeDAOFactory() {
	}

	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbInstancetype.equals("jdbc")) {
			dao = new EmployeeDAOJDBCImpl();
		} else if (dbInstancetype.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl2();
		}
		return dao;
	}// End of get
}
