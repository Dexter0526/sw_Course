package com.exam;

public class PersonVO {
	private int id;
	private String name;
	private String company;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PersonVO(int id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("personVO [id=").append(id).append(", name=").append(name).append(", company=").append(company)
				.append("]");
		return builder.toString();
	}
	public PersonVO() {
		// TODO Auto-generated constructor stub
	}
	
}
