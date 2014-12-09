package demo;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

import com.openmarket.gatorbulk.objects.BulkLoader;

import wcs.java.util.Util;
import COM.FutureTense.Interfaces.ICS;
import au.com.bytecode.opencsv.CSVReader;

public class Setup extends wcs.java.Setup {

	@Override
	public Class<?>[] getAssets() {
		return Util.classesFromResource(Config.site, "elements.txt");
	}


	@Override
	public String exec(ICS ics, String sitename, String username, String password) {
		String retMessage = super.exec(ics,sitename,username,password); // IMPORTANT!!!

		Setup.print("sitename: " + sitename);
		//TODO: write csv bulk uploader here
		StringBuilder sb = new StringBuilder();

		try{
			Reader rdr = new FileReader(new File(this.getClass().getResource("Page.csv").toURI()));
			CSVReader reader = new CSVReader(rdr);
			String [] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				// nextLine[] is an array of values from the line
				System.out.println(Arrays.deepToString(nextLine));
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

		/*
		 HERE ADD THE IMPORTER
		 */

		// EXAMPLE
		//		BulkLoader loader = new BulkLoader();
		//sb.append(loader.import(ics, "/demo/Page.csv"));
		//		loader.doImport(); //??
		try{
			String args[] = {
					"config=D:\\work\\AgileSites\\AgileSites\\app\\src\\main\\resources\\demo\\csvImporterConfig.properties",
					"action=insert",
					"validate=no"
			};
			BulkLoader.main(args);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return sb.toString();
		// note: ics is the Facade to access fatwire api
	}

	private static final boolean debug = true;
	public static void print(Object obj){
		if(debug) System.out.println(obj);
	}
}
