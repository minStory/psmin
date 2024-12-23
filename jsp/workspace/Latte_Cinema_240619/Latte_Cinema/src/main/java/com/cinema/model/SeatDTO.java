package com.cinema.model;

public class SeatDTO {
	
	private int seat_no;
	private int seat_booking_count;
	private String seat_booking_status;
	
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public int getSeat_booking_count() {
		return seat_booking_count;
	}
	public void setSeat_booking_count(int seat_booking_count) {
		this.seat_booking_count = seat_booking_count;
	}
	public String getSeat_booking_status() {
		return seat_booking_status;
	}
	public void setSeat_booking_status(String seat_booking_status) {
		this.seat_booking_status = seat_booking_status;
	}
}
