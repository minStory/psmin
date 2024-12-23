package com.cinema.model;

public class EventBoardDTO {
	
	private int event_board_no;
	private String event_board_writer_no;
	private String event_board_writer_id;
	private String event_board_title;
	private String event_board_content;
	private String event_board_file;
	private String event_board_created_date;
	private String event_board_updated_date;
	private int event_hit;
	
	public int getEvent_board_no() {
		return event_board_no;
	}
	public void setEvent_board_no(int event_board_no) {
		this.event_board_no = event_board_no;
	}
	public String getEvent_board_writer_no() {
		return event_board_writer_no;
	}
	public void setEvent_board_writer_no(String event_board_writer_no) {
		this.event_board_writer_no = event_board_writer_no;
	}
	public String getEvent_board_writer_id() {
		return event_board_writer_id;
	}
	public void setEvent_board_writer_id(String event_board_writer_id) {
		this.event_board_writer_id = event_board_writer_id;
	}
	public String getEvent_board_title() {
		return event_board_title;
	}
	public void setEvent_board_title(String event_board_title) {
		this.event_board_title = event_board_title;
	}
	public String getEvent_board_content() {
		return event_board_content;
	}
	public void setEvent_board_content(String event_board_content) {
		this.event_board_content = event_board_content;
	}
	public String getEvent_board_file() {
		return event_board_file;
	}
	public void setEvent_board_file(String event_board_file) {
		this.event_board_file = event_board_file;
	}
	public String getEvent_board_created_date() {
		return event_board_created_date;
	}
	public void setEvent_board_created_date(String event_board_created_date) {
		this.event_board_created_date = event_board_created_date;
	}
	public String getEvent_board_updated_date() {
		return event_board_updated_date;
	}
	public void setEvent_board_updated_date(String event_board_updated_date) {
		this.event_board_updated_date = event_board_updated_date;
	}
	public int getEvent_hit() {
		return event_hit;
	}
	public void setEvent_hit(int event_hit) {
		this.event_hit = event_hit;
	}
}
