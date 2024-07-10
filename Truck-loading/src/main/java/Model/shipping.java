package Model;

public class shipping {
	private String shipping_from, shipping_to, date, vehicle;
	private int bid, uid;

	public String getShipping_from() {
		return shipping_from;
	}

	public void setShipping_from(String shipping_from) {
		this.shipping_from = shipping_from;
	}

	public String getShipping_to() {
		return shipping_to;
	}

	public void setShipping_to(String shipping_to) {
		this.shipping_to = shipping_to;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "shipping [shipping_from=" + shipping_from + ", shipping_to=" + shipping_to + ", date=" + date
				+ ", vehicle=" + vehicle + ", bid=" + bid + ", uid=" + uid + "]";
	}

}
