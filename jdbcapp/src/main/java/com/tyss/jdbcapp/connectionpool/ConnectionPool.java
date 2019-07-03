package com.tyss.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

import com.tyss.jdbcapp.PropertiesUtil;

public class ConnectionPool {

	private static ConnectionPool poolRef = null;
	private Vector<Connection> pool;
	private Connection con = null;
	private int poolSize;
	private String dburl;
	private String user;
	private String password;
	private String driverclassNM;

	private void getProperties() throws Exception {

		poolSize = Integer.parseInt(PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.POOL_SIZE));
		dburl = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DBURL);
		user = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.USER);
		password = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.PASSWORD);
		driverclassNM = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DRIVERCLASSNM);

	}

	private void initializePool() throws Exception {
		pool = new Vector<>();
		Class.forName(driverclassNM);
		for (int i = 0; i < poolSize; i++) {
			con = DriverManager.getConnection(dburl, user, password);
			pool.add(con);
		}
	}

	private ConnectionPool() throws Exception {
		getProperties();
		initializePool();

	}

	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef == null) {
			return new ConnectionPool();
		}
		return poolRef;
	}

	public Connection getConnectionFromPool() {
		return pool.remove(0);
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}

}
