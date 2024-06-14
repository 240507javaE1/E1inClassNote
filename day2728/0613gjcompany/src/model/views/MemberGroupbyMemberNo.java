package model.views;

public class MemberGroupbyMemberNo {
	private String memberno;
	private String 筆數;
	private Integer 成交數量;
	private Double 平均;
	public String getMemberno() {
		return memberno;
	}
	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}
	public String get筆數() {
		return 筆數;
	}
	public void set筆數(String 筆數) {
		this.筆數 = 筆數;
	}
	public Integer get成交數量() {
		return 成交數量;
	}
	public void set成交數量(Integer 成交數量) {
		this.成交數量 = 成交數量;
	}
	public Double get平均() {
		return 平均;
	}
	public void set平均(Double 平均) {
		this.平均 = 平均;
	}
}
