package testcasesusingpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;
import wdMethods.AnnotationsForReporter;

public class TC001_CreateLead extends AnnotationsForReporter {

	@BeforeTest
	public void setValues() {
		excelFilename="createlead";
		testName="Create Lead";
		testDesc="Create a New Lead";
		category="smoke";
		author="Harsha";
		moduleName="Leads";
		
	}
		
		@Test(dataProvider="fetchData")
		public void CreateLead(String cName,String fName,String lName) {
			
			new MyHomePage()
			.clickLeads()
			.clickCreateLead()
			.typeCompanyName(cName)
			.typeFirstName(fName)
			.typeLastName(lName)
			.clickSubmit()
			.clickViewLead(fName);
					
			
		}
		
	}
	

