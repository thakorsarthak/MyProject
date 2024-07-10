package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBconnection;
import Model.shipping;

public class shippingDAO {
	public static void bookshipping(shipping s) {
		try {
			Connection conn = DBconnection.driverConnection();
			String sql = "insert into booking (uid,shipping_from,shipping_to,date,vehicle)values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1,s.getUid());
			pst.setString(2,s.getShipping_from());
			pst.setString(3,s.getShipping_to());
			pst.setString(4,s.getDate());
			pst.setString(5,s.getVehicle()); 
			pst.executeUpdate();
			System.out.println("booked seccessfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<shipping> bookingListByid(int uid) {
		
		List<shipping> list = new ArrayList<shipping>();
		try {
			Connection conn = DBconnection.driverConnection();
			String sql = "select*from booking where uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				shipping s = new shipping();
				s.setBid(rs.getInt("bid"));
				s.setUid(rs.getInt("uid"));
				s.setShipping_from(rs.getString("shipping_from"));
				s.setShipping_to(rs.getString("shipping_to"));
				s.setDate(rs.getString("date"));
				s.setVehicle(rs.getString("vehicle"));
				list.add(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
