package Tumpangz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import Tumpangz.connection.ConnectionManager;
import Tumpangz.model.Customer;

public class CustomerDAO {
	static Connection con = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	
	

	
	
	
	//get customer by id
	public static Customer getCustomer(String CustomerID) {
		Customer customer = new Customer();
		
		try {
			//call getConnection() method from ConnectionManager class
			con = ConnectionManager.getConnection();
			
			//3. create statement
			String sql = "SELECT * FROM customer WHERE CustomerID=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, CustomerID);
			
			//4. execute query
			rs = ps.executeQuery();
			
			if(rs.next()) {
				customer.setCustomerID(rs.getString("CustomerID"));
				customer.setCustomerName(rs.getString("CustomerName"));
				customer.setCustomerEmail(rs.getString("CustomerEmail"));
				customer.setCustomerAddress(rs.getString("CustomerAddress"));
				customer.setCustomerPhoneNum(rs.getString("CustomerPhoneNum"));
	
			
			//5.close connection
			//con.close();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return customer;
	}
	
	
	

}


