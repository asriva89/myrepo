package com.nokia.day4;

public class Report {
	private String header;
	private int passed;
	private int failed;

	public Report(String header) {
		super();
		this.header = header;
		
	}

	public void incrementPassCount() {
		passed++;
	}

	public void incrementFailCount() {
		failed++;
	}
	
	private double testCasePassedPercentage()
	{
		return (double)passed/(passed+failed)*100;
	}
	
	public String generateReport(){
		StringBuilder data=new StringBuilder();
		data.append("************************").append("\n").
		append("Number of test case passed : "+passed).append("\n").
		append("Number of test case failed : "+failed).append("\n").
		append("Passed Percentage : "+testCasePassedPercentage());
		System.out.println(testCasePassedPercentage());
		
		return data.toString();
	}

	@Override
	public String toString() {
		return "Report [header=" + header + ", passed=" + passed + ", failed=" + failed + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
