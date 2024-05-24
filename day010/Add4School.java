class Add4School {
	public static void main(String[] args) {
		CA c1=new CA("a",78);//is-a CA , is-a School

		//System.out.println(c1.chi); //資料chi被上鎖,不能我主動要c1的資料chi
		//System.out.println(c1.name); //
		System.out.println(c1.show());
		System.out.println("============================================");
		System.out.println("名:"+c1.getName()+"\tchi:"+c1.getChi());
		c1.change(100);
		System.out.println("名:"+c1.getName()+"\tchi:"+c1.getChi());

		System.out.println("=============================================");
		CB c2=new CB("test",50);//is-a CB , is-a School
		System.out.println("名:"+c2.getName()+"\teng:"+c2.getEng());
		c2.change(80);
		System.out.println("名:"+c2.getName()+"\teng:"+c2.getEng());
	}
}