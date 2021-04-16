package ola.com.booking.model;

import java.sql.Date;

public class Ride {

	@Override
	public String toString() {
		return "Ride [rideId=" + rideId + ", userId=" + userId + ", routeId=" + routeId + ", date=" + date
				+ "]";
	}
	private int rideId;
	private String userId;
	private String routeId;
	Date date;
	public int getRideId() {
		return rideId;
	}
	public void setRideId(int rideId) {
		this.rideId = rideId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	public Date getdate() {
		return date;
	}
	public void setdate(Date date) {
		this.date = date;
	}

	

}
