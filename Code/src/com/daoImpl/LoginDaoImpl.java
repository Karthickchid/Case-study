package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.beans.Login;
import com.dao.LoginDao;
import com.utilities.JdbcConnection;

public class LoginDaoImpl implements LoginDao{

	@Override
	public String validateUser(Login login) {
		
        Connection conn = JdbcConnection.getConnection();
        PreparedStatement pst=null;
        
        String query="select * from login where username=? and password=?";
        String role ="";
        try {
			pst=conn.prepareStatement(query); 
			
			pst.setString(1, login.getUserName());
			pst.setString(2, login.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()==true)
			{
			    role=rs.getString(3);
			return role;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return role;
	
	}

}
