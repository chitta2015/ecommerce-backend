package org.oops;

class Company
{
	final public String companyName="XYZ pvt.co";
	
	 void test()
	{
		System.out.println("Company test method");
	}
	
	
}

class Organization extends Company
{
	void test()
	{
		System.out.println("Organization test method");
	}
}



public class Finalvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company company=new Company();
		//company.companyName="ABC pvt. co";
		System.out.println(company.companyName);

	}

}
