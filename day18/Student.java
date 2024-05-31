class Check extends Exception { //so,check is a subclass kind of exception
	Check(String errMsg) {
		System.out.println(errMsg);
	}
}
class Student {
	private String name;
	private int chi;
	private int eng;
//Construtor,							//Exception errrrrrr= new Exception()
	Student(String name,int chi,int eng) throws Exception {
		if(chi>=0 && eng>=0) {			//if not add here, exception dies in bracket else{}
			this.name=name;				//just think like a keyword ,if inside has exception
			this.chi=chi;				//then outside just add "throws"
			this.eng=eng;
		} else {//kind as Exception ?=new Check;
			//throw new Check("自訂--new出錯,國文與英文需>=0");
			//Exception nnnnnnnnn=new Exception();
			throw new Exception();//must be try-catch "in main" 

			/*
			try {
				System.out.println("inCons新增國文與英文需>=0========\n\n");
				throw new Exception();
			} catch(Exception e) {
				System.out.println("inCons新增國文與英文需>=0   \n\n");
				System.out.println("==以下是java提供的錯誤訊息=====  \n\n");
				e.printStackTrace();
				System.out.println("==以上是java提供的錯誤訊息=====  \n\n");
			}

			*/
		}
	}
//set-er/get-er,
	Sting setChi(int chi) throws Exception{
		if(chi>=0) this.chi=chi;
		else throw new Exception("setChi出錯,不給你填負數");
	}
	void setEng(int eng) throws Check {

		if(eng>=0) this.eng=eng;
		else throw new Check("修改英文需>=0");
		
	}
//Method,
	void show(){
		System.out.println("姓名:"+name+"\t國文:"+chi+"\t英文:"+eng);
	}

	String String_show(){
		return "姓名:"+name+"\t國文:"+chi+"\t英文:"+eng;
	}
	

}