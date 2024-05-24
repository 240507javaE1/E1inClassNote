class Order {
	private String name;
//constructor
	Order(String name) {
		this.name=name;
	}
//method
	String show() {
		return "Order.show姓名 : " +name;
	}

	/*void setName(String name)	{
		this.name=name;
	}*/

	void change(String name) {
		this.name=name;
	}

	void skill() {
		System.out.println("Order skill");
	}

	protected int cal(int x,int y) {
		return x*y;
	}
}