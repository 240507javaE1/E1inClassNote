abstract class Company {
//Field,
	private String name;
	final double pi=3.14;
//Constructor,
	Company(String name) {
		this.name=name;
	}
//Method,
	String show(){
		return "這是Company.show,姓名:"+name+"Company.show結束";
	}

//abstract Method of subclass,	make as less as possible with likely-same function

	/*
	abstract void setLcd(int lcd);
	abstract void setRam(int Ram);
	abstract void setmouse(int mouse);
	*/	//this are likely-same fuction,make as less as possible with below

		//use below to make more beautiful
	abstract void set(int product);

}