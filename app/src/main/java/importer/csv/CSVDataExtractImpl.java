package importer.csv;

import au.com.bytecode.opencsv.CSVReader;

import com.openmarket.gatorbulk.interfaces.IDataExtract;
import com.openmarket.gatorbulk.interfaces.IFeedback;
import com.openmarket.gatorbulk.interfaces.IPopulateDataSlice;

import demo.Setup;

public class CSVDataExtractImpl implements IDataExtract {

	private CSVReader csvReader = null;
	private String siteName;
	private String userName; 
	private String password;
	
	public CSVDataExtractImpl(String configFileName){
		this(null,"Demo","fwadmin");
		Setup.print(configFileName);
	}
	
	public CSVDataExtractImpl(CSVReader csvReader, String siteName, String userName) {
		this.csvReader = csvReader;
		this.siteName = siteName;
		this.userName = userName;
	}

	/**
	 * Begin requesting input data; tells the client to
	 * start the database query, get a cursor, etc.
	 * @param requestType
	 *    IDataExtract.INSERT_ASSETS,
	 *    IDataExtract.VOID_ASSETS,
	 *    IDataExtract.UPDATE_ASSETS
	 * @param sliceOrNot  true/false
	 * true - if data will be requested in batches 
	 * false - data will be requested all in one attempt
	 * @param sliceSize  >0 number of rows to be 
	 * retrieved in one data set
	 * @return none
	 * @exception java.lang.Exception
	 */

	@Override
	public void InitRequestInputData(int requestType, boolean sliceOrNot, int sliceSize) throws Exception {
		Setup.print("** IN InitRequestInputData ** "+ requestType);
	}

	/**
	 * Get a set/slice of input data records.
	 * @param dataSlice object to be populated using the
	 * methods from IPopulateDataSlice 
	 * @return IDataExtract.HAS_DATA when dataSlice has some data,
	 *    IDataExtract.NO_DATA when there is no data,
	 *    IDataExtract.ERROR when there is an error
	 * @exception java.lang.Exception    
	 */

	@Override
	public int GetNextInputDataSet(IPopulateDataSlice dataSlice) throws Exception {
		Setup.print(" ** IN GetNextInputDataSet ** ");
		
		/*
		dataSlice.AddNewRow();
		
		dataSlice.SetSiteName(siteName);
		
		dataSlice.SetFlexAssetType("Complex Asset");//PageDefinition ?
//		dataSlice.AddParentGroup(arg0);	 // no parent
		dataSlice.SetDefinitionAssetName("PageDefinition");
	
		dataSlice.SetAssetName("ContentTest");
		dataSlice.SetAssetDescripiton("ContentTestDescription");
		dataSlice.SetCreatedByUserName(this.userName);
//		dataSlice.SetAssetStatus("Created");//??
		
		dataSlice.AddAttributeValueString("ContentTestTitle", "titleValue");
		*/

		return IDataExtract.NO_DATA;
	}

	/**
	 * Signal the end of extracting data for given request type
	 * @param requestType
	 *    IDataExtract.INSERT_ASSETS,
	 *    IDataExtract.VOID_ASSETS,
	 *    IDataExtract.UPDATE_ASSETS
	 * @return none
	 * @exception java.lang.Exception
	 */

	@Override
	public void EndRequestInputData(int requestType) throws Exception {
		Setup.print(" ** IN EndRequestInputData ** ");
	}

	/**
	 * Update the client as to what happened to input data
	 * processing. Note that this method would be called by multiple
	 * threads, with each thread passing its own IFeedback
	 * handle. The implementor of this method should write
	 * thread-safe code.
	 * @param requestType
	 *    IDataExtract.InsertAsset,
	 *    IDataExtract.VoidAsset,
	 *    IDataExtract.UpdateAsset
	 * @param processingStatus - An object containing processing
	 * status for all items in one dataset. The implementor of this
	 * interface should invoke the IFeedback interface
	 * methods on processingStatus to get status for individual
	 * rows. This method will be invoked by multiple BulkLoader
	 * threads, so make sure this method is implemented in a
	 * thread-safe way.
	 * @return none
	 * @exception java.lang.Exception    
	 */

	@Override
	public void UpdateStatus(int requestType, IFeedback processingStatus) throws Exception {
		
		synchronized (this.getClass()) {
			Setup.print(" ** IN EndRequestInputData ** ");
		}
	}

}
