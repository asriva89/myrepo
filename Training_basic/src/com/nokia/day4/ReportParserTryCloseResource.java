package com.nokia.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReportParserTryCloseResource {

	private String testCaseFile;

	public ReportParserTryCloseResource(String testCaseFile) {
		super();
		this.testCaseFile = testCaseFile;
	}

	public Report parse() {
		//BufferedReader br = null;
		Report report = new Report("**SYSTEM GENERATED REPORT*********");
		
		try(BufferedReader br2=new BufferedReader(new FileReader(testCaseFile));)
		{
			//FileReader fReader = new FileReader(testCaseFile);
			//br = new BufferedReader(fReader);

			String data = br2.readLine();
			String[] testdata = null;
			String execResult = null;
			while (data != null) {
				updateReport(report, data);
				data = br2.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			FileReader fReader = new FileReader(testCaseFile);
//			br = new BufferedReader(fReader);
//
//			String data = br.readLine();
//			String[] testdata = null;
//			String execResult = null;
//			while (data != null) {
//				updateReport(report, data);
//				data = br.readLine();
//			}
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Report Generation Failed....");
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		return report;
	}

	private void updateReport(Report report, String data) {
		String[] testdata;
		String execResult;
		testdata = data.split(":");
		execResult = testdata[1].trim();

		if ("passed".equalsIgnoreCase(execResult))
			report.incrementPassCount();
		else if ("failed".equalsIgnoreCase(execResult))
			report.incrementFailCount();
		else
			throw new IllegalArgumentException("Invalid Value passed in Exeution result");
	}



}
