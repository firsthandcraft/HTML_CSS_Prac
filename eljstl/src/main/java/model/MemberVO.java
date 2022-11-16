package model;

public class MemberVO {
	private String id;
	private String password;
	private String address;
	public MemberVO(String id, String password, String address) {
		super();
		this.id = id;
		this.password = password;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", address=" + address + "]";
	}

}
