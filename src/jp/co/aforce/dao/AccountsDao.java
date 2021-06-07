package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Accounts;

public class AccountsDao extends DAO{
	public Accounts search(int id, String password) throws Exception{
		Accounts accounts = null;
		
		Connection con = getConnection();
	 
		PreparedStatement st;
		 
		st= con.prepareStatement(
				"select * from accounts where id = ? and password = ?");
		st.setInt(1, id);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
			 
		while (rs.next()) {
			accounts = new Accounts();
			accounts.setId(rs.getInt("id"));
			accounts.setPassword(rs.getString("password"));
			accounts.setName(rs.getString("name"));
		}
		
		st.close();
		con.close();
		return accounts;
	 }
}
