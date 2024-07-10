package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DBconnection;
import Model.user;

public class userDAO {
	public static Boolean cheackmail(String email)

	{
		Boolean flag = false;
		try {
			System.out.println("inside DAO cheack mail");
			Connection conn = DBconnection.driverConnection();
			String sql = "select * from user where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("email already Exist");
				flag = true;
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public static void userregister(user u1) {
		try {
			System.out.println("inside DAO");
			Connection conn = DBconnection.driverConnection();
			String sql = "insert into user(name,contact,email,address,password)values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u1.getName());
			pst.setLong(2, u1.getContact());
			pst.setString(3, u1.getEmail());
			pst.setString(4, u1.getAddress());
			pst.setString(5, u1.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static user userlogin(user u) {
		user u1 = null;
		try {
			Connection conn = DBconnection.driverConnection();
			String sql = "select*from user where email=? and password=? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				u1 = new user();
				u1.setId(rs.getInt("id"));
				u1.setName(rs.getString("name"));
				u1.setAddress(rs.getString("address"));
				u1.setEmail(rs.getString("email"));
				u1.setContact(rs.getLong("contact"));
				u1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u1;
	}
	
	public static void updateuser(user u)
	{
		try {
			System.out.println("DAO update starts");
			Connection conn = DBconnection.driverConnection();
			String sql = "update user set name=?,contact=?,email=?,address=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,u.getName());
			pst.setLong(2,u.getContact());
			pst.setString(3,u.getEmail());
			pst.setString(4,u.getAddress());
			pst.setInt(5,u.getId());
			pst.executeUpdate();
			System.out.println(u.getName());
			System.out.println(u.getId());
			System.out.println("data updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
