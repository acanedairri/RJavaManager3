package org.irri.breedingtool.rjava.pbtoolsanalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestQTL {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path and name of active data
		String dataFileName = DATA_PATH + "QTL_pheno.csv";
		//supply path and name of text file where text output is going to be saved
		String outFileName = DATA_PATH + "QTL_output.txt";
		//supply path where the graphs will be saved
		String resultFolderPath = DATA_PATH;
		//supply path and name of genotypic file
		String genotypicDataFileName = DATA_PATH + "QTL_geno.txt";
		//supply path and name of map file
		String mapFileName = DATA_PATH + "QTL_map.txt";
		
//		String dataFileName = DATA_PATH + "RIL_sim_pheno_withMissing.csv";
//		String genotypicDataFileName = DATA_PATH + "RIL_sim_geno_withMissing.txt";
//		String mapFileName = DATA_PATH + "RIL_sim_map_withMissing.txt";
		
		//specify parameters
		boolean isInputRawData = true;
		int designIndex = 0;
		String[] traits = {"FTIME"};
		String block = "REP";
		String rep = "NULL";
		String row = "NULL";
		String column = "NULL";
		String genotype = "GENOTYPE";
		String environment = "ENV";
		String[] environmentLevels = {"1", "2"};
		String selectedEnvironmentLevel = "1";
		boolean heterozygousPresent = true;
		String crossType ="riself";
		String step = "10";
		String windowSize = "20";
		String minDistance = "10";
		String qtlMethod = "CIM";
		boolean thresholdLiJi = false; 
		String thresholdNumericValue = "0.05";
		boolean estimatePlotMarkerMap = true; 
		double allelicDiffThreshold = 0.10;
		double cutOffMissingData = 0.10;
		double significanceLevelChiSquare = 0.05;
		
//		String dataFileName = DATA_PATH + "RCB_Multi.csv";
//		boolean isInputRawData = true;
//		int designIndex = 0;
//		String[] traits = {"Y1"};
//		String block = "Blk";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		String genotype = "Gen";
//		String environment = "Site";
//		String[] environmentLevels = {"Env1", "Env2"};
//		String selectedEnvironmentLevel = "Env1";
//		boolean heterozygousPresent = true;
//		String crossType ="riself";
//		String step = "10";
//		String windowSize = "20";
//		String minDistance = "10";
//		String qtlMethod = "CIM";
//		boolean thresholdLiJi = true; 
//		String thresholdNumericValue = "NULL";
//		boolean estimatePlotMarkerMap = true; 
//		double allelicDiffThreshold = 0.10;
//		double cutOffMissingData = 0.10;
//		double significanceLevelChiSquare = 0.05; 
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();

		rJavaManager.getPbToolAnalysisManager().doQtl(dataFileName, isInputRawData, outFileName, resultFolderPath, genotypicDataFileName, mapFileName, designIndex, traits, 
				block, rep, row, column, genotype, environment, environmentLevels, selectedEnvironmentLevel, 
				heterozygousPresent, crossType, step, windowSize, minDistance, qtlMethod, thresholdLiJi, thresholdNumericValue, 
				estimatePlotMarkerMap, allelicDiffThreshold, cutOffMissingData, significanceLevelChiSquare);

	}

}