package org.irri.breedingtool.rjava.pbtoolsanalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestSingleEnvironmentPRep {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		String resultFolderPath = DATA_PATH;
		
		String dataFileName = DATA_PATH + "2013WSPYT_rawdata_prep.csv";
		String[] respvar = {"Plotyield.Adj"}; 
		String genotype = "ENTRY";
		String row = "ROW";
		String column = "COLUMN";
		String environment = null;
		boolean genotypeFixed = false;
		boolean genotypeRandom = true; 
		boolean excludeControls = false;
		String[] controlLevel = null; // c("CIHERANG","CIHERANGSUB1","IRRI105","IRRI119", "IRRI154","IRRI168") 
		boolean moransTest = false; // for BIMS always false
		String[] spatialStruc = {"none"}; // {"none", "CompSymm", "Gaus", "Exp", "Spher"}, for BIMS include the five choices, for standalone determine by the user
		boolean descriptiveStat = true;
		boolean varianceComponents = true; 
		boolean boxplotRawData = true;
		boolean histogramRawData = true;
		boolean heatmapResiduals = true; 
		boolean diagnosticPlot = true;
		
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolAnalysisManager().doSingleEnvironmentAnalysisPRep(dataFileName, resultFolderPath, respvar, genotype, row, column, 
				environment, genotypeFixed, genotypeRandom, excludeControls, controlLevel, moransTest, spatialStruc, descriptiveStat, varianceComponents, 
				boxplotRawData, histogramRawData, heatmapResiduals, diagnosticPlot);
		
	}

}