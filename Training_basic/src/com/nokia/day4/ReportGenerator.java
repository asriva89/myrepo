package com.nokia.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {

	private String reportFileName;

	public ReportGenerator(String testCaseFile) {
		super();
		this.reportFileName = testCaseFile;
	}

	public void generateReport(Report report) {
		BufferedWriter bw=null;
		try {
			FileWriter fWriter = new FileWriter(reportFileName);
			bw = new BufferedWriter(fWriter);
			bw.write(report.generateReport());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Report Generation Failed....");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// return null;
	}

}
