package org.irri.breedingtool.rjava.pbtoolsanalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestSingleEnvironment3 {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		// test for BIMS dataset
		
		//supply path and name of active data
		//String dataFileName = DATA_PATH + "12DS_MET2_Complete_Data.csv";
		//supply path and name of text file where text output is going to be saved
		//String outFileName = DATA_PATH + "SEA_outputBIMS4.txt";
		
		//supply path where the graphs will be saved
		String resultFolderPath = DATA_PATH;

		//specify parameters
		// TEST RUN FOR RCBD
		String dataFileName = DATA_PATH + "DRT-IRRIHQ-MAP-2014-DS-4_HT_CONT_20.csv";
		String outFileName = DATA_PATH + "SEA_RCBDoutput_HT_CONT.txt";
//		String dataFileName = DATA_PATH + "BIOFORT-IRRIHQ-OYT-2014-DS-1_HT_CONT_35.csv";
//		String outFileName = DATA_PATH + "SEA_RCBDoutput_HT_CONT2.txt";
		String[] respvars = {"HT_CONT"};
		
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-MAP-2014-DS-4_FLW_CONT_22.csv";
//		String outFileName = DATA_PATH + "SEA_RCBDoutput_FLWcont.txt";
//		String dataFileName = DATA_PATH + "BIOFORT-IRRIHQ-OYT-2014-DS-1_FLW_CONT_34.csv";
//		String outFileName = DATA_PATH + "SEA_RCBDoutput_FLW_cont2.txt";
//		String[] respvars = {"FLW_CONT"};
		
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-MAP-2014-DS-4_AYLD_CONT_21.csv";
//		String outFileName = DATA_PATH + "SEA_RCBDoutput_ayldcont.txt";
//		String dataFileName = DATA_PATH + "BIOFORT-IRRIHQ-OYT-2014-DS-1_AYLD_CONT_31.csv";
//		String outFileName = DATA_PATH + "SEA_RCBDoutput_ayldcont2.txt";
//		String[] respvars = {"AYLD_CONT"};

		int design = 0;
		String environment = "NULL";
		String[] environmentLevels = {};
		String genotype = "Designation";
		String block = "Blk";
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
		boolean genotypeRandom = true;
		boolean excludeControls = false;
		boolean genoPhenoCorrelation = false;
		boolean specifiedContrast = false;
		String contrastFileName = null;

		
		// TEST RUN FOR AUGMENTED DESIGN
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-46_AYLD_CONT_27.csv";
//		String outFileName = DATA_PATH + "SEA_AUGRCBDoutput_AYLD_CONT.txt";
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-60_AYLD_CONT_24.csv";
//		String outFileName = DATA_PATH + "SEA_AUGRCBDoutput_AYLD_CONT1.txt";
//		String dataFileName = DATA_PATH + "IRSEA-IRRIHQ-OYT-2014-DS-1_AYLD_CONT_9.csv";
//		String outFileName = DATA_PATH + "SEA_AUGRCBDoutput_AYLD_CONT2.txt";
//		String[] respvars = {"AYLD_CONT"};
		
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-46_FLW_CONT_28.csv";
//		String outFileName = DATA_PATH + "SEA_AUGRCBDoutput_FLW_cont.txt";
//		String dataFileName = DATA_PATH + "IRSEA-IRRIHQ-OYT-2014-DS-1_FLW_CONT_8.csv";
//		String outFileName = DATA_PATH + "SEA_AUGRCBDoutput_FLW_cont2.txt";
//		String[] respvars = {"FLW_CONT"};

//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-46_HT_CONT_26.csv";
//		String outFileName = DATA_PATH + "SEA_AUGRCBDoutput_HT_CONT.txt";
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-60_HT_CONT_23.csv";
//		String outFileName = DATA_PATH + "SEA_AUGRCBDoutput_HT_CONT2.txt";
//		String[] respvars = {"HT_CONT"};

//		int design = 1;
//		String environment = "NULL";
//		String[] environmentLevels = {};
//		String genotype = "Designation";
//		String block = "Blk";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = true;
//		boolean histogramRawData = true;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULLL";
//		boolean diagnosticPlot = true;
//		boolean genotypeFixed = true;
////		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {}; 
//		String[] controlLevels = {};
//		boolean compareControl = false;
////		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = false;
//		boolean genoPhenoCorrelation = false;
//		boolean specifiedContrast = false;
//		String contrastFileName = null;
		

		// design: ALPHA LATTICE
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-4_AYLD_CONT_19.csv";
//		String outFileName = DATA_PATH + "SEA_AlphaOutput_AYLD_CONT1.txt";
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-6_AYLD_CONT_16.csv";
//		String outFileName = DATA_PATH + "SEA_AlphaOutput_AYLD_CONT2.txt";
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-45_AYLD_CONT_3.csv";
//		String outFileName = DATA_PATH + "SEA_AlphaOutput_AYLD_CONT3.txt";
//		String[] respvars = {"AYLD_CONT"};
		
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-6_HT_CONT_14.csv";
//		String outFileName = DATA_PATH + "SEA_AlphaOutput_HT_CONT1.txt";
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-4_HT_CONT_18.csv";
//		String outFileName = DATA_PATH + "SEA_AlphaOutput_HT_CONT2.txt";
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-45_HT_CONT_2.csv";
//		String outFileName = DATA_PATH + "SEA_AlphaOutput_HT_CONT3.txt";
//		String[] respvars = {"HT_CONT"};

//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-6_FLW_CONT_15.csv";
//		String outFileName = DATA_PATH + "SEA_AlphaOutput_FLW_CONT1.txt";
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-4_FLW_CONT_17.csv";
//		String outFileName = DATA_PATH + "SEA_AlphaOutput_FLW_CONT2.txt";
//		String dataFileName = DATA_PATH + "DRT-IRRIHQ-AGR-2014-DS-45_FLW_CONT_4.csv";
//		String outFileName = DATA_PATH + "SEA_AlphaOutput_FLW_CONT3.txt";
//		String[] respvars = {"FLW_CONT"};
//		int design = 3;
//		String environment = "NULL";
//		String[] environmentLevels = {};
//		String genotype = "Designation";
//		String block = "Blk";
//		String rep = "Rep";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = true;
//		boolean histogramRawData = true;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULLL";
//		boolean diagnosticPlot = true;
//		boolean genotypeFixed = true;
////		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {}; 
//		String[] controlLevels = {};
//		boolean compareControl = false;
////		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = false;
//		boolean genoPhenoCorrelation = false;
//		boolean specifiedContrast = false;
//		String contrastFileName = null;

		// DESIGN: ROW-COLUMN DESIGN
//		String dataFileName = DATA_PATH + "IRSEA-IRRIHQ-PYT-2014-DS-1_HT_CONT_11.csv";
//		String outFileName = DATA_PATH + "SEA_RowColOutput_HT_CONT1.txt";
//		String dataFileName = DATA_PATH + "IRSEA-IRRIHQ-AGR-2014-DS-2_HT_CONT_29.csv";
//		String outFileName = DATA_PATH + "SEA_RowColOutput_HT_CONT2.txt";
//		String[] respvars = {"HT_CONT"};
		
//		String dataFileName = DATA_PATH + "IRSEA-IRRIHQ-PYT-2014-DS-1_FLW_CONT_12.csv";
//		String outFileName = DATA_PATH + "SEA_RowColOutput_FLW_CONT1.txt";
//		String dataFileName = DATA_PATH + "IRSEA-IRRIHQ-AGR-2014-DS-2_FLW_CONT_30.csv";
//		String outFileName = DATA_PATH + "SEA_RowColOutput_FLW_CONT2.txt";
//		String[] respvars = {"FLW_CONT"};
//		
//		String dataFileName = DATA_PATH + "IRSEA-IRRIHQ-PYT-2014-DS-1_AYLD_CONT_13.csv";
//		String outFileName = DATA_PATH + "SEA_RowColOutput_AYLD_CONT1.txt";
//		String[] respvars = {"AYLD_CONT"};
//		
//		int design = 4;
//		String environment = "NULL";
//		String[] environmentLevels = {};
//		String genotype = "Designation";
//		String block = "NULL";
//		String rep = "Rep";
//		String row = "Row";
//		String column = "Col";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = true;
//		boolean histogramRawData = true;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULLL";
//		boolean diagnosticPlot = true;
//		boolean genotypeFixed = true;
////		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {}; 
//		String[] controlLevels = {};
//		boolean compareControl = false;
////		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = false;
//		boolean genoPhenoCorrelation = false;
//		boolean specifiedContrast = false;
//		String contrastFileName = null;

		
		//specify parameters
//		String dataFileName = DATA_PATH + "AugRCBD_Data from BIMS1.csv";
//		String outFileName = DATA_PATH + "SEA_output.txt";
//		int design = 1;
//		String[] respvars = {"YLD1"};
//		String environment = "NULL";
//		String[] environmentLevels = {};
//		String genotype = "Designation";
//		String block = "Rep..no.";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = true;
//		boolean histogramRawData = true;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULLL";
//		boolean diagnosticPlot = true;
//		boolean genotypeFixed = true;
////		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {}; 
//		String[] controlLevels = {};
//		boolean compareControl = false;
////		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = false;
//		boolean genoPhenoCorrelation = false;
//		boolean specifiedContrast = false;
//		String contrastFileName = null;
		
//		String dataFileName = DATA_PATH + "AugmentedRCBD_From BIMS2.csv";
//		String outFileName = DATA_PATH + "SEA_output.txt";
//		int design = 1;
//		String[] respvars = {"YLD1"};
//		String environment = "NULL";
//		String[] environmentLevels = {};
//		String genotype = "Trmt";
//		String block = "Block";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = true;
//		boolean histogramRawData = true;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULLL";
//		boolean diagnosticPlot = true;
//		boolean genotypeFixed = true;
////		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {}; 
//		String[] controlLevels = {};
//		boolean compareControl = false;
////		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = false;
//		boolean genoPhenoCorrelation = false;
//		boolean specifiedContrast = false;
//		String contrastFileName = null;
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolAnalysisManager().doSingleEnvironmentAnalysis2(dataFileName, outFileName, resultFolderPath, design, respvars, 
				environment, environmentLevels, genotype, block, rep, row, column, descriptiveStat, varianceComponents, 
				boxplotRawData, histogramRawData, heatmapResiduals, heatmapRow, heatmapColumn, diagnosticPlot, 
				genotypeFixed, pairwiseAlpha, genotypeLevels, controlLevels, compareControl, specifiedContrast, contrastFileName,
				genotypeRandom, excludeControls, genoPhenoCorrelation);
		
	}
}