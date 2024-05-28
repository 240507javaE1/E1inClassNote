class Company
{
	void skill()
	{
		System.out.println("Company skill");
	}
}
class Add6
{
	public static void main(String[] args) {
		Company c=new Company()	{
			void skill() {
				System.out.println("hello java");
			}
		};

		c.skill();
	}
}