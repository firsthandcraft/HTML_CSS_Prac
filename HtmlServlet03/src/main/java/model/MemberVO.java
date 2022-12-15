package model;
/*--11107 
drop table member;
create table member(
    id varchar2(50) primary key,
    password varchar2(50) not null,
  name varchar2(50) not null,
     address varchar2(50)
);
insert into member(id,password,name,address) values('java','1234','손연재','수서');
insert into member(id,password,name,address) values('jdbc','abcd','백박사','판교');
insert into member(id,password,name,address) values('jsp','king','황정민','안양');
commit;*/
public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String address;
	public MemberVO(String id, String password, String name, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
