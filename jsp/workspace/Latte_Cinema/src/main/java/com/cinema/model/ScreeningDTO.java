package com.cinema.model;

public class ScreeningDTO {
	
	private int screening_no;
	private String screening_region;
	private String screening_location;
	private int screening_movie_no;
	private String screening_movie_title;
	private String screening_movie_start_date;
	private String screening_movie_start_time;
	private int screening_hall;
	private boolean screening_seat_status;
	
	public int getScreening_no() {
		return screening_no;
	}
	public void setScreening_no(int screening_no) {
		this.screening_no = screening_no;
	}
	public String getScreening_region() {
		return screening_region;
	}
	public void setScreening_region(String screening_region) {
		this.screening_region = screening_region;
	}
	public String getScreening_location() {
		return screening_location;
	}
	public void setScreening_location(String screening_location) {
		this.screening_location = screening_location;
	}
	public int getScreening_movie_no() {
		return screening_movie_no;
	}
	public void setScreening_movie_no(int screening_movie_no) {
		this.screening_movie_no = screening_movie_no;
	}
	public String getScreening_movie_title() {
		return screening_movie_title;
	}
	public void setScreening_movie_title(String screening_movie_title) {
		this.screening_movie_title = screening_movie_title;
	}
	public String getScreening_movie_start_date() {
		return screening_movie_start_date;
	}
	public void setScreening_movie_start_date(String screening_movie_start_date) {
		this.screening_movie_start_date = screening_movie_start_date;
	}
	public String getScreening_movie_start_time() {
		return screening_movie_start_time;
	}
	public void setScreening_movie_start_time(String screening_movie_start_time) {
		this.screening_movie_start_time = screening_movie_start_time;
	}
	public int getScreening_hall() {
		return screening_hall;
	}
	public void setScreening_hall(int screening_hall) {
		this.screening_hall = screening_hall;
	}
	public boolean isScreening_seat_status() {
		return screening_seat_status;
	}
	public void setScreening_seat_status(boolean screening_seat_status) {
		this.screening_seat_status = screening_seat_status;
	}
}
