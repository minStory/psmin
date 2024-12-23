package com.cinema.model;

public class MovieReviewDTO {
	
	private int movie_review_no;
	private String movie_review_writer_no;
	private String movie_review_writer_id;
	private int movie_review_movie_no;
	private String movie_review_movie_title;
	private String movie_review_content;
	private String movie_review_created_date;
	private int movie_review_recommend;
	private int movie_review_rating;
	
	public int getMovie_review_no() {
		return movie_review_no;
	}
	public void setMovie_review_no(int movie_review_no) {
		this.movie_review_no = movie_review_no;
	}
	public String getMovie_review_writer_no() {
		return movie_review_writer_no;
	}
	public void setMovie_review_writer_no(String movie_review_writer_no) {
		this.movie_review_writer_no = movie_review_writer_no;
	}
	public String getMovie_review_writer_id() {
		return movie_review_writer_id;
	}
	public void setMovie_review_writer_id(String movie_review_writer_id) {
		this.movie_review_writer_id = movie_review_writer_id;
	}
	public int getMovie_review_movie_no() {
		return movie_review_movie_no;
	}
	public void setMovie_review_movie_no(int movie_review_movie_no) {
		this.movie_review_movie_no = movie_review_movie_no;
	}
	public String getMovie_review_movie_title() {
		return movie_review_movie_title;
	}
	public void setMovie_review_movie_title(String movie_review_movie_title) {
		this.movie_review_movie_title = movie_review_movie_title;
	}
	public String getMovie_review_content() {
		return movie_review_content;
	}
	public void setMovie_review_content(String movie_review_content) {
		this.movie_review_content = movie_review_content;
	}
	public String getMovie_review_created_date() {
		return movie_review_created_date;
	}
	public void setMovie_review_created_date(String movie_review_created_date) {
		this.movie_review_created_date = movie_review_created_date;
	}
	public int getMovie_review_recommend() {
		return movie_review_recommend;
	}
	public void setMovie_review_recommend(int movie_review_recommend) {
		this.movie_review_recommend = movie_review_recommend;
	}
	public int getMovie_review_rating() {
		return movie_review_rating;
	}
	public void setMovie_review_rating(int movie_review_rating) {
		this.movie_review_rating = movie_review_rating;
	}
}
