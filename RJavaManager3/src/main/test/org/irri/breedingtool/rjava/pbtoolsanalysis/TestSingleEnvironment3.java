package org.irri.breedingtool.rjava.pbtoolsanalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestSingleEnvironment3 {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path and name of active data
		//String dataFileName = DATA_PATH + "12DS_MET2_Complete_Data.csv";
		//supply path and name of text file where text output is going to be saved
		String outFileName = DATA_PATH + "SEA_outputBIMS2.txt";
		//supply path where the graphs will be saved
		String resultFolderPath = DATA_PATH;
		
		//specify parameters
		String dataFileName = DATA_PATH + "AugRCBD_Data from BIMS1.csv";
		int design = 1;
		String[] respvars = {"FLW"};
		String environment = "NULL";
		String[] environmentLevels = {};
		String genotype = "Designation";
		String block = "Rep. no.";
		String rep = "NULL";
		String row = "NULL";
		String column = "NULL";
		boolean descriptiveStat = true; 
		boolean varianceComponents = true;
		boolean boxplotRawData = true;
		boolean histogramRawData = true;
		boolean heatmapResiduals = false;
		String heatmapRow = "NULL";
		String heatmapColumn = "NULLL";
		boolean diagnosticPlot = true;
		boolean genotypeFixed = true;
//		boolean performPairwise = false;
		String pairwiseAlpha = "0.05";
		String[] genotypeLevels = {}; 
		String[] controlLevels = {};
		boolean compareControl = false;
//		boolean performAllPairwise = false;
		boolean genotypeRandom = false;
		boolean excludeControls = false;
		boolean genoPhenoCorrelation = false;
		boolean specifiedContrast = false;
		String contrastFileName = null;
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolAnalysisManager().doSingleEnvironmentAnalysis2(dataFileName, outFileName, resultFolderPath, design, respvars, 
				environment, environmentLevels, genotype, block, rep, row, column, descriptiveStat, varianceComponents, 
				boxplotRawData, histogramRawData, heatmapResiduals, heatmapRow, heatmapColumn, diagnosticPlot, 
				genotypeFixed, pairwiseAlpha, genotypeLevels, controlLevels, compareControl, specifiedContrast, contrastFileName,
				genotypeRandom, excludeControls, genoPhenoCorrelation);
		
	}

}