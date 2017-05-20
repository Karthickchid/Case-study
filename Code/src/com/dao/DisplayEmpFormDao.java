package com.dao;

import java.util.ArrayList;

import com.beans.Common_Employee;
import com.beans.Employee;
import com.beans.Joining_Emp;
import com.beans.Login;
import com.beans.Mbu_Employee;



public interface DisplayEmpFormDao {
	
	public ArrayList<Employee> forms(Employee emp);
	//public boolean fetchData(Login log);
	//public ArrayList<Joining_Emp> forms(Joining_Emp je);
	//public boolean validate(String username, String password);
	public Joining_Emp getemp(String username, String password);

	public ArrayList<Common_Employee> forms1(Common_Employee ce);
	
	public ArrayList<Common_Employee> refer(Common_Employee ce);
	
	public ArrayList<Mbu_Employee> alloted(Mbu_Employee me);
}
