package com.pgm.mongo_pro01.dto;

public class BoardVO {
	private double bno;
	private String writer;
	private String title;
	private String content;
	
	public double getBno() {
		return bno;
	}
	public void setBno(double bno) {
		this.bno = bno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", writer=" + writer + ", title=" + title + ", content=" + content + "]";
	}

}