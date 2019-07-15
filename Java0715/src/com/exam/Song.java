package com.exam;

public class Song {
	String title;
	String artist;
	int year;
	String country;
	public Song() {
		System.out.println("클래스 호출");
	}
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCountry() {
		return country;
	}
	public void setCounty(String country) {
		this.country = country;
	}
	
	void show() {
		System.out.println(year + "년 " + 
	country + "국적의 " + artist + "가 부른 " + title);
	}
}
