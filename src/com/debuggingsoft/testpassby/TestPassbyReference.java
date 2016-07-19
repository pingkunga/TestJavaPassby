package com.debuggingsoft.testpassby;

public class TestPassbyReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.setCompanyName("COMSWU");
		System.out.println("First >> " + company.getCompanyName());
		ChangeNameVer1(company);
		System.out.println("Second >> " + company.getCompanyName());
		ChangeNameVer2(company);
		System.out.println("Third >> " + company.getCompanyName());
		ChangeNameVer3(company);
		company = null;
		System.out.println("Fourth >> " + company.getCompanyName());
	}
	
	public static void ChangeNameVer1(Company pCompany)
	{
		pCompany.setCompanyName("DebuggingSoft");
	}
	
	public static void ChangeNameVer2(Company pCompany)
	{
		pCompany = new Company();
		pCompany.setCompanyName("Chatri Soft");
	}
	
	public static void ChangeNameVer3(Company pCompany)
	{
		pCompany = null;
	}
}
