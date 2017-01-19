package com.nokia.day4;

public class TestCaseReportGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCaseParser parser=new TestCaseParser("D:\\eclipse\\eclipse\\Workplace\\Training_basic\\src\\com\\nokia\\day4\\testcase.txt");
		Report rp=parser.parse();
		System.out.println(rp.generateReport());

		ReportGenerator r=new ReportGenerator("D:\\eclipse\\eclipse\\Workplace\\Training_basic\\src\\com\\nokia\\day4\\testresult.txt");
		r.generateReport(rp);
		
		

	}

}
