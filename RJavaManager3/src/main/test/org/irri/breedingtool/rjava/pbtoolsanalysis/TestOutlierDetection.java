package org.irri.breedingtool.rjava.pbtoolsanalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestOutlierDetection {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path and name of text file where text output is going to be saved
		String outputPath = DATA_PATH; 
		
		//supply path and name of active data
		String dataFileName = DATA_PATH + "2013DSRYT_rowcol.csv"; 
		//specify parameters
		String respvar = "GRNYLD.Y.ha.";
		String trmt = "ENTRY.";
		String rep = "REP.";
		
		
		//supply path and name of active data
//		String dataFileName = DATA_PATH + "BIOFORT-IRRIHQ-OYT-2014-DS-1_AYLD_CONT_31.csv"; 
//		//specify parameters
//		String respvar = "AYLD_CONT";
//		String trmt = "Designation";
//		String rep = "Blk";
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolAnalysisManager().doOutlierDetection(dataFileName, outputPath, respvar, trmt, rep);
	}

}
