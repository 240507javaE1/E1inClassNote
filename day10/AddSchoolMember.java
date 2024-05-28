class AddSchoolMember {
	public static void main(String[] args) {
		SchoolMember[][][] school=new SchoolMember[2][][];
		school[0]=new SchoolMember[2][];
		school[0][0]=new SchoolMember[2];
		school[0][1]=new SchoolMember[3];

		school[1]=new SchoolMember[3][];
		school[1][0]=new SchoolMember[2];
		school[1][1]=new SchoolMember[3];
		school[1][2]=new SchoolMember[4];

/*
		school[0][0][0]=new SchoolMember("a1","台北");
		school[0][0][1]=new SchoolMember("a2","台北");

		school[0][1][0]=new SchoolMember("b1","台北");
		school[0][1][1]=new SchoolMember("b2","台北");
		school[0][1][2]=new SchoolMember("b3","台北");

		school[1][0][0]=new SchoolMember("c1","台北");
		school[1][0][1]=new SchoolMember("c2","台北");

		school[1][1][0]=new SchoolMember("d1","台北");
		school[1][1][1]=new SchoolMember("d2","台北");
		school[1][1][2]=new SchoolMember("d3","台北");

		school[1][2][0]=new SchoolMember("e1","台北");
		school[1][2][1]=new SchoolMember("e2","台北");
		school[1][2][2]=new SchoolMember("e3","台北");
		school[1][2][3]=new SchoolMember("e4","台北");
*/
		System.out.println(school);
		for(int forGrade=0;forGrade<school.length;forGrade++) {
			System.out.println("\t"+school[forGrade]);
			for(int forClass=0;forClass<school[forGrade].length;forClass++) {
				System.out.println("\t\t"+school[forGrade][forClass]);
				for(int forWho=0;forWho<school[forGrade][forClass].length;forWho++) {
					System.out.println("\t\t\t"+school[forGrade][forClass][forWho]);
				}
			}
		}

		System.out.println("=======================================================");
		System.out.println(school);
		for(Member[][] oOo:school) {
			System.out.println("\t"+oOo);
			for(Member[] u:oOo)
			{
				System.out.println("\t\t"+u);
				for(Member v:u)
				{
					System.out.println("\t\t\t"+v);
				}
			}
		}
	}
}