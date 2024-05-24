class Add1Order
{
	public static void main(String[] args) {
		OrderSubA c1=new OrderSubA("a",10);//is-a OrderSubA , is-a Order
		OrderSubB c2=new OrderSubB("b",20);//is-a OrderSubB , is-a Order

		//System.out.println(c1.show()+"\t"+c1.name);
		System.out.println(c1.show()+"\t尺:"+c1.getRuler());
		System.out.println(c2.show());

		System.out.println("====================");
		//c1.setName("qq");
		//c1.setRuler(100);

		c1.change("yyy");

		//c2.setName("oo");
		System.out.println(c1.show()+"\t尺:"+c1.getRuler());
		System.out.println(c2.show());

		System.out.println("====================");

		c1.skill();
		System.out.println(c1.cal(10,20));
	}
}