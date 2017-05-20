package com.dao;

import com.beans.Common_Employee;
import com.beans.Mbu_Employee;

public interface MbuDao {

	
	public boolean insert(Mbu_Employee me);
	public boolean delete (String id);
	boolean insertCommonEmployee (String empid);

}
