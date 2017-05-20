package com.dao;

import com.beans.Login;

public interface LoginDao {
	public abstract String validateUser(Login login);

}
