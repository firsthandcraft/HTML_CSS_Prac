package board;

import java.sql.Date;

public class Article {
	private int num;
	private int pwd;
	private String writer;
	private Date date;
	private String content;
	
	public Article(int num, int pwd, String writer, Date date, String content) {
		super();
		this.num = num;
		this.pwd = pwd;
		this.writer = writer;
		this.date = date;
		this.content = content;
	}
	public Article() {
		super();
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Article [num=" + num + ", pwd=" + pwd + ", writer=" + writer + ", date=" + date + ", content=" + content
				+ "]";
	}
	
}
