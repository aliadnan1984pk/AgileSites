package importer.csv;

import java.sql.Timestamp;

import com.openmarket.gatorbulk.interfaces.IPopulateDataSlice;

/**
 * To be implemented by Oracle Corporation Interface to populate a dataSlice by
 * the client. BulkLoader creates an object implementing this interface and then
 * hands it over to the client, which uses this interface's methods to populate
 * that object with input data records.
 */
public class CSVPopulateDataSliceImpl implements IPopulateDataSlice {

	public CSVPopulateDataSliceImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Creates a new input data object to hold all the data for a flex asset and
	 * makes it the current object. This method is invoked repetitively to
	 * populate this object with flex asset input data. Each invocation is to be
	 * followed by Set..() methods and AddAttribute..() methods to supply data
	 * for one flex asset.
	 */

	public void AddNewRow() {
	}

	/**
	 * Specify a unique identifier for flex asset input data
	 * 
	 * @param id
	 *            user-specific unique identifier
	 * @exception java.lang. Exception
	 *                thrown if any unique-id validation is enabled.
	 */

	public void SetAssetUniqueId(String id) {
	}

	/**
	 * Specify the name of the site with which the current flex asset is created
	 * or to be created under.
	 * 
	 * @param sitename
	 *            name of the site
	 */

	public void SetSiteName(String sitename) {
	}

	/**
	 * Set the asset type for the flex asset.
	 * 
	 * @param flexAssetType
	 *            asset type as defined in WebCenter Sites system
	 */

	public void SetFlexAssetType(String flexAssetType) {
	}

	/**
	 * Specify the name of the parent for the current flex asset. Use this
	 * method repeatedly to add a list of parent names.
	 * 
	 * @param groupName
	 *            name of a parent that the current asset inherits some of its
	 *            attributes from.
	 */

	public void AddParentGroup(String groupName) {
	}

	/**
	 * Specify the name of the parent to be deleted for the current flex asset.
	 * Use this method repeatedly to add a list of parent names.
	 * 
	 * @param groupName
	 *            - name of a parent that the current asset inherited some of
	 *            its attributes from.
	 */

	public void AddParentGroupForDelete(String groupName) {
	}

	/**
	 * Specify definition asset name for the current flex asset.
	 * 
	 * @param definitionAssetName
	 *            name of the flex definition asset
	 */

	public void SetDefinitionAssetName(String definitionAssetName) {
	}

	/**
	 * Specify name of the flex asset.
	 * 
	 * @param name
	 *            - name of the flex asset.Should be unique in a flex asset
	 *            family
	 */

	public void SetAssetName(String name) {
	}

	/**
	 * Specify description for the flex asset
	 * 
	 * @param description
	 *            description
	 */

	public void SetAssetDescripiton(String description) {
	}

	/**
	 * Specify WebCenter Sites username with which this flex asset is being
	 * processed
	 * 
	 * @param username
	 *            WebCenter Sites username
	 */

	public void SetCreatedByUserName(String userName) {
	}

	/**
	 * Set WebCenter Sites status code for this asset
	 * 
	 * @param status
	 */

	public void SetAssetStatus(String status) {
	}

	/**
	 * Set template name
	 * 
	 * @param template
	 *            WebCenter Sites template name
	 */

	public void SetRenderTemplateName(String template) {
	}

	/**
	 * Specify startMenu for workflow participation
	 * 
	 * @param startMenuName
	 *            start menu name for this flex asset
	 */

	public void SetStartMenuName(String startMenuName) {
	}

	/**
	 * WebCenter Sites Specify publish approval target name
	 * 
	 * @param targetName
	 *            approval target name
	 */

	public void SetApprovalTargetName(String targetName) {
	}

	/**
	 * Add a name/value pair to specify a WebCenter Sites attribute of type
	 * 'text' for the current input object. Call this method more than once, if
	 * this is a multi-valued attribute.
	 * 
	 * @param attrName
	 *            attribute name as defined in the WebCenter Sites database for
	 *            the flex asset being processed
	 * @param value
	 *            java.lang.String
	 */

	public void AddAttributeValueString(String attrName, String value) {
	}

	/**
	 * Add a name/value pair to specify a WebCenter Sites attribute of type
	 * 'date' for the current input object. Call this method more than once, if
	 * this is a multi-valued attribute.
	 * 
	 * @param attrName
	 *            attribute name as defined in the WebCenter Sites database for
	 *            the flex asset being processed
	 * @param value
	 *            java.sql.Timestamp
	 */

	public void AddAttributeValueDate(String attrName, Timestamp value) {
	}

	/**
	 * Add a name/value pair to specify an attribute for the current input
	 * object. Call this method more than once, if this is a multi-valued
	 * *attribute
	 * 
	 * @param attrName
	 *            attribute name as defined in WebCenter Sites database for the
	 *            flex asset being processed
	 * @param value
	 *            java.lang.Double
	 */

	public void AddAttributeValueDouble(String attrName, Double value) {
	}

	/**
	 * Add a name/value pair to specify a WebCenter Sites attribute of type
	 * 'money' for the current input object Call this method more than once if
	 * this is a multi-valued attribute
	 * 
	 * @param attrName
	 *            attribute name as defined in WebCenter Sites database for the
	 *            flex asset being processed
	 * @param value
	 *            java.lang.Float
	 */

	public void AddAttributeValueFloat(String attrName, Float value) {
	}

	/**
	 * Add a name/value pair to specify a WebCenter Sites attribute of type
	 * 'int' for the current input object. Call this method more than once, if
	 * this is a multi-valued attribute.
	 * 
	 * @param attrName
	 *            attribute name as defined in WebCenter Sites database for the
	 *            flex asset being processed
	 * @param value
	 *            java.lang.Integer
	 */

	public void AddAttributeValueInteger(String attrName, Integer value) {
	}

	/**
	 * Add a name/value pair to specify any WebCenter Sites attribute for the
	 * current input object. Use the datatype-specific methods above instead of
	 * this method, as this one is for supporting any other new types in future.
	 * Call this method more than once, if this is a multi-valued attribute
	 * 
	 * @param attrName
	 *            attribute name as defined in the WebCenter Sites database for
	 *            the flex asset being processed.
	 * @param value
	 *            java.lang.Object
	 */

	@Override
	public void AddAttributeValueObject(String attrName, Object value) {

	}

}
