package org.irri.breedingtool.rjava.stardesign;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestDesignAugmentedRCB {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path where the output will be saved
		String path = DATA_PATH; 
		// Case 1: 
		String fieldBookName = "fieldbookAugRCB1"; 		//supply the fieldbook name specified by the user 
		//specify parameters
		Integer numCheck = 6;
		Integer numNew = 60;
		String trmtName = null;
		Integer Blk = 4; 
		Integer trial = 2;
		Integer rowPerBlk = 7;
		Integer numFieldRow = 14;
		String fieldOrder = "Serpentine";
		String trmtLabel = null;
		String checkTrmt = null; 
		String newTrmt = null;

//		// Case 2: 
//		String fieldBookName = "fieldbookAugRCB2"; 		//supply the fieldbook name specified by the user 
//		//specify parameters
//		Integer numCheck = 6;
//		Integer numNew = 60;
//		String trmtName = "EntryNum";
//		Integer Blk = 4; 
//		Integer trial = 2;
//		Integer rowPerBlk = 7;
//		Integer numFieldRow = 14;
//		String fieldOrder = "Serpentine";
//		String trmtLabel = null;
//		String checkTrmt = null; 
//		String newTrmt = null;
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initStar();
		rJavaManager.getSTARDesignManager().doDesignAugRCB(path, fieldBookName, numCheck, numNew, trmtName, Blk, 
				trial, rowPerBlk, numFieldRow, fieldOrder, trmtLabel, checkTrmt, newTrmt);
		
		StringBuilder s = rJavaManager.getSTARDesignManager().getRscriptCommand();
		System.out.println("Script Command:\n" +s.toString());
	}

}
