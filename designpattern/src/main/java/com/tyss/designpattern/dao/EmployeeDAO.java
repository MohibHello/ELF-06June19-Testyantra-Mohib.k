package com.tyss.designpattern.dao;

import java.util.ArrayList;

import com.tyss.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();

	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

}