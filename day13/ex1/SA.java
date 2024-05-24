class SA extends Company {
//Field,
	private int lcd;
//Constructor,
	SA(String name ,int lcd) {
		super(name);
		this.lcd=lcd;
	}
//Method,set-er/get-er
	void setLcd(int lcd) {
		this.lcd=lcd;
		//this may make many lines
		//and a set-er may isolated each ,maybe is better
	}

//Method,some else
	String show() {
		return super.show()+"\t這是SA.show\tlcd:"+lcd;
	}

//Method of other samelevel class,  use below to make more beautiful
/*
	void setRam(int ram){}
	void setmouse(int mouse){}
*/
//absMethod of superClass for other subClass with likely-same function,
	void set(int lcd) {	//in this example, the likely-same function is a set-er
		setLcd(lcd);	//so just make set-er alone above, use this sameNoteFunc"set()",
	}					//to do (likely-same function)set-er in each subClass,
						//who has same superClass




}