package com.exam.vo;

import java.sql.Timestamp;

public class BoardVO {
	private int num;  // 게시글번호
	private String username; // 로그인아이디 또는 작성자이름
	private String passwd; // 게시글 패스워드. 로그인안한사용자가 입력함.
	private String subject;
	private String content;
	private String filename;
	private int readcount;
	private String ip;
	private Timestamp regDate;
	private int re_ref;
	private int re_lev;
	private int re_seq;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public int getRe_ref() {
		return re_ref;
	}
	public void setRe_ref(int re_ref) {
		this.re_ref = re_ref;
	}
	public int getRe_lev() {
		return re_lev;
	}
	public void setRe_lev(int re_lev) {
		this.re_lev = re_lev;
	}
	public int getRe_seq() {
		return re_seq;
	}
	public void setRe_seq(int re_seq) {
		this.re_seq = re_seq;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardVO [num=").append(num).append(", username=").append(username).append(", passwd=")
				.append(passwd).append(", subject=").append(subject).append(", content=").append(content)
				.append(", filename=").append(filename).append(", readcount=").append(readcount).append(", ip=")
				.append(ip).append(", regDate=").append(regDate).append(", re_ref=").append(re_ref).append(", re_lev=")
				.append(re_lev).append(", re_seq=").append(re_seq).append("]");
		return builder.toString();
	}
}
