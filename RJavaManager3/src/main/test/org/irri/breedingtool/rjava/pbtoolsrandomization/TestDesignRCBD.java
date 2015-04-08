package org.irri.breedingtool.rjava.pbtoolsrandomization;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestDesignRCBD {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		// revised by AAGulles for PBTools version 1.5 and up and BIMS
		String path = DATA_PATH;
		String fieldBookName = "fieldbookPBToolsRCBD";
		String[] factorName = {"EntryNo"}; // for PBTools Version 1.5 and up and BIMS, only one factor should be entered
		String[] factorID = {"V"};
		Integer[] factorLevel = {24};
		Integer blk = 2;
		Integer trial = 2;
		Integer numFieldRow = 4;
		Integer rowPerBlk = 4;
		String fieldOrder = "Serpentine";
			
	
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolRandomizationManager().doDesignRCBD(path, fieldBookName, factorName, factorID, factorLevel,
				blk, trial, numFieldRow, rowPerBlk, fieldOrder);
	}

}
