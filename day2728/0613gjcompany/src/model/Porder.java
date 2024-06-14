package model;

public class Porder {
	private Integer id;
	private String porderno;
	private String memberno;
	private Integer amount;
	private String employeeno;
	public Porder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Porder(String porderno, String memberno, Integer amount, String employeeno) {
		super();
		this.porderno = porderno;
		this.memberno = memberno;
		this.amount = amount;
		this.employeeno = employeeno;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPorderno() {
		return porderno;
	}
	public void setPorderno(String porderno) {
		this.porderno = porderno;
	}
	public String getMemberno() {
		return memberno;
	}
	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getEmployeeno() {
		return employeeno;
	}
	public void setEmployeeno(String employeeno) {
		this.employeeno = employeeno;
	}
}
