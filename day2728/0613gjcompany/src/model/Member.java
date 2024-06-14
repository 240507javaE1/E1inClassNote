package model;

public class Member {
	private Integer id;
	private String memberno;
	private String username;
	private String password;
	private String membername;
	private String address;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String memberno, String username, String password, String membername, String address) {
		super();
		this.memberno = memberno;
		this.username = username;
		this.password = password;
		this.membername = membername;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMemberno() {
		return memberno;
	}
	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
