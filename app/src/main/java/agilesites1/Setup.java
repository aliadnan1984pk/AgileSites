package agilesites1;

import wcs.java.Asset;
import wcs.java.CSElement;
import wcs.java.SiteEntry;
import wcs.java.Template;

public class Setup extends wcs.java.Setup {

	@Override
	public Asset[] getAssets() {
		return new Asset[] {

				new CSElement("AwWrapper", agilesites1.typeless.Wrapper.class), //

				new CSElement("AwError", agilesites1.typeless.Error.class), //

				// typeless
				new Template("", "AwHeader", Template.INTERNAL,
						agilesites1.typeless.Header.class)
						.description("Header (Java)"), //

				new CSElement("AwFooter", agilesites1.typeless.Footer.class)
						.description("Footer (Java)"), //

				// for pages
				new Template("Page", "AwLayout", Template.LAYOUT,
						agilesites1.page.Layout.class)//
						.cache("false", "false") //
						.description("Page Layout (Java)"),

				new Template("Page", "AwLink", Template.LAYOUT,
						agilesites1.page.Link.class) //
						.cache("false", "false") //
						.description("Page Link (Java)"),

				new Template("Page", "AwImage", Template.INTERNAL,
						agilesites1.page.Image.class) //
						.cache("false", "false") //
						.description("Page Image (Java)"),

				new Template("Page", "AwDetail", Template.INTERNAL,
						agilesites1.page.Detail.class)//
						.cache("false", "false") //
						.description("Page Detail (Java)"), //

				new Template("Page", "AwSummary", Template.INTERNAL,
						agilesites1.page.Summary.class)//
						.cache("false", "false") //
						.description("Page Summary (Java)"), //

				new Template("Page", "AwFooter", Template.INTERNAL,
						agilesites1.page.Footer.class)//
						.cache("false", "false") //
						.description("Footer for Page (Java)"), //

				// test runner
				new CSElement("JUnitRunner", agilesites1.Tester.class), //
				new SiteEntry("JUnitRunner", false) };
		
		
	}
}
