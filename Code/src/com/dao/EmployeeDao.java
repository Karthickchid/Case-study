package com.dao;

import java.util.List;

import com.beans.Common_Employee;
import com.beans.Employee;
import com.beans.Joining_Emp;






public interface EmployeeDao {
	boolean insert (Employee p);
	List<Employee> display();
	boolean insertDate (Joining_Emp je);
	boolean deleteDate (int app_id );
	boolean insertCommonEmployee (Common_Employee je);
	boolean insertCommonEmployee1 (Common_Employee je);
	boolean deleteCommonEmployee (int app_id);
	boolean insertReferEmployee (Common_Employee ce);

}
