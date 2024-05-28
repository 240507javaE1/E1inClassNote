class OrderSubA extends Order{
	private int ruler;
//consturctor
	OrderSubA(String name,int ruler)
	{
		super(name);
		this.ruler=ruler;
	}
//method
	String show() {
		return super.show()+"+\ttab SubA.show尺:"+ruler;
	}
	/*void setRuler(int ruler) {
		this.ruler=ruler;
	}*/

	void change(int ruler) {
		this.ruler=ruler;
	}

	int getRuler() {
		return ruler;
	}

	void skill() {
		System.out.println("new CA skill");
	}
	public int cal(int a,int b) {
		return a*b*10;
	}

}