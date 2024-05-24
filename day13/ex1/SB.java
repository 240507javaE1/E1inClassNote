class SB extends Company {
//Field,
	private int ram;
//Constructor,
	SB(String name ,int ram) {
		super(name);
		this.ram=ram;
	}
//Method,
	void setRam(int ram) {
		this.ram=ram;
	}

	String show() {
		return super.show()+"\t這是SB.show\tram:"+ram;
	}

//Method of other samelevel class,
	void setLcd(int lcd){}
	void setmouse(int mouse){}




	
}