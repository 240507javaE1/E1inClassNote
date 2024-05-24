class AddMember {
	public static void main(String[] args) {
		Member m=new Member("teacher","uuuu");
		System.out.println("名:"+m.name+"\t帳號:"+m.username);
		m.name="uuooo";
		m.username="pppp";
		System.out.println("名:"+m.name+"\t帳號:"+m.username);
	}
}