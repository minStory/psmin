package com.reply.model;

public class BbsReplyDTO {
	
	private int board_group;
	private String board_writer;
	private String board_reply;
	private String board_pwd;
	private String board_date;
	private int board_step;
	private int board_indent;
	
	public int getBoard_group() {
		return board_group;
	}
	
	public void setBoard_group(int board_group) {
		this.board_group = board_group;
	}
	
	public String getBoard_writer() {
		return board_writer;
	}
	
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	
	public String getBoard_reply() {
		return board_reply;
	}
	
	public void setBoard_reply(String board_reply) {
		this.board_reply = board_reply;
	}
	
	public String getBoard_pwd() {
		return board_pwd;
	}
	
	public void setBoard_pwd(String board_pwd) {
		this.board_pwd = board_pwd;
	}
	
	public String getBoard_date() {
		return board_date;
	}
	
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	
	public int getBoard_step() {
		return board_step;
	}
	
	public void setBoard_step(int board_step) {
		this.board_step = board_step;
	}
	
	public int getBoard_indent() {
		return board_indent;
	}
	
	public void setBoard_indent(int board_indent) {
		this.board_indent = board_indent;
	}
	
}
