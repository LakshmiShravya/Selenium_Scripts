package com.bt.fp.fos.ObjectRepository;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeePage {

	public static String einField = "//input[@id='textein']";
	public static String submitButton = "//input[@class='buttonStyle'][@value='Submit']";
	public static String skillsPwas = "//a[text()='Skills/PWAs']";
	public static String taskforce = "//a[text()='Taskforce']";
	public static String attendanceLink = "//a[contains(text(),'Attendance')]";
	public static String engDetailsLink = "//a[contains(text(),'Details')]";
	public static String manPowerPinInput = "//input[@id='baseServiceStartDate5']";

	public static String employeetab = "//div[@id='oCMenu_level0']";
	public static String person ="//div[@id='oCMenu_level00']";
	public static String find = "//div[@id='oCMenu_level000']";
	public static String einfield1="//input[@name='ein']";
	public static String find1= "//input[@name='browseEmployeesSubmitParms']";
	public static String radiobutton ="//input[@type='radio']";
    public static String  activate ="//input[@value='Activate']";
    public static String delete = "//input[@value='Delete']";
    public static String absence ="//input[@value='Absence']";
    public static String attendance="//input[@value='Attendance']";
    public static String tConfirmMsg="//font[contains(text(),'Activate employee request sent to Taskforce for')]";
    public static String dconfigMsg="//font[contains(text(),'Delete employee request sent to Taskforce for')]";
    public static String aconfigMsg="//font[contains(text(),'Absence data re-sent to Taskforce for')]";
    public static String atconfigMsg="//font[contains(text(),'Attendance data re-sent to Taskforce for ')]";
    public static String manageOvertimeTab="//div[@class='clLevel1' and @id='oCMenu_level002']";
    public static String attendanceTab1="//div[ @id='oCMenu_level02']";
    public static String taskForceTab="//div[@id='oCMenu_level005']";
    public static String calloutDetailsTab="//div[@id='oCMenu_level008']";
   // public static String uploadFile ="//input[@name='uploadedFile' and @id='filePath']";
    //public static String uploadbutton="//input[@name='uploadedFile']";
    public static String leaveCardTab="//div[@id='oCMenu_level002']";
    public static String queueTab="//div[@id='oCMenu_level003']";
    public static String amuMenuTab="//div[@id='oCMenu_level006']";
    
//Skills 
	public static String availableSkills_01 = "//input[@id='workType_0']";
	public static String availableSkills_02 = "//input[@id='workType_1']";
	public static String addSkillsButton = "//input[@name='addSkillsButton']";
	public static String saveButton = "//input[@id='addButton']";
	public static String skillsfield="//div[@id='oCMenu_level05']";
	public static String preferencesfield="//div[contains(text(),'Preferences')]";
	public static String checkbox ="//input[@name ='workType_1']";
	public static String button="//input[@name='addSkillsButton']";
	public static String savebutton ="//input[@title='Save changes']";
	public static String asconfigMsg="//td[@class='p_title']";
	public static String copytoein="//textarea[@name='cloneEin']";
	public static String clonebutton="//input[@id='cloneButton']";
	public static String calSkillSelect = "//select[@id='preference']";
	public static String createNewSkillBtn = "//input[@value='Create New']";
	public static String confirmMsgSkillPref = "//td[@class='confirmmessageGreen']";
	public static String saveSkillBtn = "//input[@value='Save']";
	public static String saveSkillMsg = "(//span[@class='confirmmessageGreen'])[1]";
	public static String skillGroup ="//div[@class='clLevel1' and @id='oCMenu_level004']";
	
	
//Rosterpattern
	public static String managefield ="//div[@id='oCMenu_level001']";
    public static String assignrosterpattern="//input[@name='assignedRosterPattern']";
   	public static String rosterpatterndate="//input[@name='rosterPatternEffectiveDate']";
	public static String weekNumber="//input[@name='weekIndex']";
	public static String add1="//input[@name='submit1']";
	public static String deleteradiobtn="//input[@name='deleteAssignment'and @type='checkbox']";
	public static String deleteSelected="//input[@name='submit2']";
	//public static String bulkuploadfile="//input[@name='uploadedFile' and @id='filePath']";
	public static String bulkuploadbutton="//input[@name='upload']";
	public static String rosterconfigMsg="//a[contains(text(),'ASGTSTA5')]";
	public static String rosterdelconfigMsg=" ";
	
//PWA
	public static String pwaName_01 = "//input[@id='addPWAList_0']";
	public static String pwaName_02 = "//input[@id='addPWAList_1']";
	public static String leftArrow = "//input[@name='addPWAsButton']";
	public static String preferenceDropdown_last = "(//td[@class='text1'])[1]/preceding::select[@id='preference][1]";
	public static String preferenceDropdown_2ndlast = "(//td[@class='text1'])[1]/preceding::select[@id='preference][2]";
	public static String startLocationDropdown_Last = "(//td[@class='text1'])[1]/preceding::select[@id='sel'][1]";
	public static String startLocationDropdown_2ndLast = "(//td[@class='text1'])[1]/preceding::select[@id='sel'][2]";
	public static String endLocationDropdown_Last = "(//td[@class='text1'])[1]/preceding::select[@id='end'][1]";
	public static String endLocationDropdown_2ndLast = "(//td[@class='text1'])[1]/preceding::select[@id='end'][2]";
	public static String checkbox_Last = "(//td[@class='text1'])[1]/preceding::select[@id='adtech'][1]";
	public static String checkbox_2ndLast = "(//td[@class='text1'])[1]/preceding::select[@id='adtech'][2]";
	public static String saveButton_pwa = "//input[@id='addButton']";

//Attendance
	public static String start_Overtime = "(//input[@name='newScheduledStartTime'])[2]";
public static String headTitle = "//td[@class='sectionheading2']";

//Absence
   public static String dateFieldDoc ="//input[@id='dateId']";
	public static String startDateField = "//input[@name='startDate']";
	public static String endDateField = "//input[@name='endDate']";
	public static String absenceTypeDropdown = "//select[@name='absenceCode']";
	public static String availableForCalloutDropdown = "//select[@name='callout']";
	public static String notesField = "//input[@name='notes']";
	public static String commentsField = "//input[@name='aamNotes']";
	public static String enterAbsenceButton = "//input[@id='subButton']";
	public static String startTimeField = "//input[@name='startTime']";
	public static String endTimeField = "//input[@name='endTime']";
	public static String confirmAbsenceButton = "//input[@id='subButton']";
	public static String absenceReferenceField = "//input[@name='refNo']";
	public static String cancelAbsenceButton = "//input[@name='submit']";
	public static String submitCancellationButton = "//input[@name='submit']";
	public static String findAbsence = "//input[@name='submit']";
    public static String balanceledger="//div[@id='oCMenu_level005']";
    public static String getRefNo = "(//td[@title='Ref No']//a)[1]";
    
    
//Sick
	public static String fromDateField = "//input[@name='startDate']";
	public static String sickReasonCodeDropdown = "//select[@name='sickReasonCode']";
	public static String workedTodayRadio ="//input[@type='radio' and @value='Y']";
	public static String voicedReasonField = "//input[@name='voicedReason']";
	public static String submitNewSickReportButton = "//input[@name='submit']";
	public static String confirmNewSickReportButton = "//input[@name='submitConfirm']";
	public static String submitSickReturnNotification = "//input[@name='submit']";
	public static String confirmSickReturn = "//input[@name='submitConfirm']";
	public static String reqSummaryBtn = "//input[@value='Request Summary']";

//Locations(PWA Preferences)
public static String confirmMsgPref = "//span[@class='confirmmessage']";
public static String confirmMsgCalPref = "//td[@class='confirmmessage']";
public static String noPWAAvailable = "//font[contains(text(),'No PWA(s) is/are available with the employee')]";
public static String availablePWA_0 = "//input[@id='addPWAList_0']";
public static String addPWABtn = "//input[@name='addPWAsButton']";
public static String prefDropdown_1 = "//textarea[@id='textein']//preceding::select[@id='preference'][1]";
public static String savePWAButton = "//input[@id='addButton'][@value='Save']";
public static String clonePWAButton = "//input[@id='addButton'][@value='Clone']";
public static String associatePWA_0 = "//input[@id='adtech_0']";
public static String copyToEIN = "//textarea[@id='textein']";
public static String newDateRangeImg = "//img[@src='/images/new_date_range.gif']";
/*public static String startDatePref = "//input[@id='startDate']";
public static String endDatePref = "//input[@id='endDate']";*/

//Locations(Calendarised PWA Preferences)
public static String startDatePref = "//img[@src='/images/date.gif'][1]";
public static String endDatePref = "(//img[@src='/images/date.gif'])[2]";
public static String foreverCheckBox = "//input[@name='foreverDefined']";
public static String currentDateClick = "//td[@class='cpCurrentDate']//a[@class='cpCurrentDate']";
public static String startDateById= "//input[@id='startDate']";
public static String endDateById ="//input[@id='endDate']";
public static String calPWASelect = "//select[@id='preference']";

public static String createNewPWABtn = "//input[@value='Create New']";
public static String saveNewPWABtn = "//input[@value='Save']";
public static String validationErrClass = "(//td[@class='validationError'])";
public static String noValidPWAErrorMsg = "No valid PWA preferences date range is found for technician. Please use the given 'New Date Range' tab to create new PWA preference date range.";
public static String deletePwaIcon = "//img[@src='/images/trash.gif'][1]";

//Locations - Quick PWA Skill Cal
public static String quickPwaEIN = "//input[@name='techId']";
public static String calBtn = "(//input[@value='Calendarised Values'])";
public static String workTypePrefsSelect = "(//select[@name='workTypePrefs'])";
public static String pwaPrefsSelect = "(//select[@name='areaPrefs'])";
public static String dataSaveMsg = "//span[contains(text(), 'Data Saved Successfully')]";
public static String sDateInput = "//input[@id='startDate']";

//Taskforce - SubmitChanges
public static String taskforcePinInput = "//input[@name='empItem[3].value']"; 
public static String prefWorkLocInput = "//input[@name='empItem[12].value']";
public static String submitChangesBtn = "//input[@value='Submit Changes']";
public static String confirmMsg = "(//span[@class='p_title' and text()[contains(.,'Details')]]/following-sibling::font)[2]";
public static String taskforceLink = "//a[contains(text(),'Taskforce')]";

//Taskforce - Add Instance
public static String addInstanceBtn = "//input[@value='Add']"; 
public static String tInstanceSelect = "//select[@name='wmInstance']";
public static String startDateInput = "//input[@name='startDate']";
public static String endDateInput = "//input[@name='endDate']";
public static String startLocInput =  "//input[@name='startLocation']";
public static String finishLocInput =  "//input[@name='finishLocation']";
public static String domainInput =  "//input[@name='domain']";
public static String pwaInput =  "//input[@name='pwa']";
public static String progModeSelect =  "//select[@name='progressionMode']";
public static String tLoanSelect =  "//select[@name='loan']";
public static String homeStartSelect =  "//select[@name='homeStart']";
public static String homePostcodeInput = "//input[@name='homePostcode']";
public static String loanedOucInput = "//input[@name='loanedOuc']";
public static String fjtfInput = "//input[@name='firstJobTravelFactor']";
public static String ljtfInput = "//input[@name='lastJobTravelFactor']";
public static String taskConfirmMsg = "//font[contains(text(),'Taskforce Mapping successfully added')]";

//Taskforce - Update Instance
public static String instanceLink = "(//tr[@class='alternatecolor']//a)[1]";
public static String updateInstanceBtn = "//input[@value='Upd']";
public static String uIConfirmMsg = "//font[contains(text(),'Taskforce Mapping successfully modified')]";

public static String deleteInstanceBtn = "//input[@value='Del']"; 
public static String dIConfirmMsg = "//font[contains(text(),'Taskforce Mapping successfully removed')]";

public static String newInstanceBtn = "//input[@value='New']"; 

//Taskforce - Build & Activate Resource
public static String radioCheck = "(//input[@name='destination'])[1]"; 
public static String buildBtn = "//input[@value='Build & Activate']";
public static String bConfirmMsg = "//font[contains(text(),'Build employee request sent to Taskforce for ')]";

//Taskforce - Modify Resource
public static String modifyBtn = "//input[@value='Modify']";
public static String mConfirmMsg = "//font[contains(text(),'Modify employee request sent to Taskforce for ')]";

//Taskforce - Suspend Resource
public static String suspendBtn = "//input[@value='Suspend']";
public static String sConfirmMsg = "//font[contains(text(),'Suspend employee request sent to Taskforce for ')]";

//Attendance - Modify
public static String saveChangesBtn = "//input[@value='Save Changes']";
public static String attendanceErrorClass = "//form[@name='attendanceForm']//tr//td//span[@class='errors']";

//Attendance - Add OD Ind
public static String roasterStartTimeInput = "(//input[@name='newRosteredStartTime'])";
public static String roasterEndTimeInput = "(//input[@name='newRosteredEndTime'])";
public static String otStartTimeInput = "(//input[@name='newScheduledStartTime'])";
public static String otEndTimeInput = "(//input[@name='newScheduledEndTime'])";
public static String odIndSelect = "(//select[@name='newOvertimeInd'])";

//Attendance - View Pattern
public static String patternColumnLink = "(//td[@title='Pattern']//a)[1]";

//Attendance - View Absence
public static String absenceColumnLink = "(//td[@title='Absences']//a)[1]";

//EmpSkillSavePreferences

public static String availableSkill_1="//input[@id='workType_1']";
public static String skilladdbutton ="//input[@name='addSkillsButton']";
public static String skilldropdown_1="//textarea[@id='textein']//preceding::select[@class='textField'][1]";
public static String savebtn="//input[@id='addButton']";
public static String skillconfirmMsgPref="//span[@class='confirmmessage']";
public static String cloneconfirmMsgPref="//span[@class='confirmmessage']";

//public static String attendanceDiaryBtn  = "//input[@value='Attendance Diary']";
//Duty Of Care

public static String dutyOfCareLink="//a[contains(text(),'Duty of Care')]";
public static String signOnbutton="//input[@id='signOn']";
public static String signOffbutton="//input[@id='signOff']";
public static String extendDay="//input[@name='extensionTime']";
public static String extendDaybtn="//input[@id='extendDay']";
public static String comebacktimedoc="(//input[@name='comebackTime'])[1]";
public static String location1="//input[@name='location']";
public static String addbtn="//input[@name='Add']";
public static String reportsafebtn="//input[@class='buttonStyle']";
public static String actualstartTime="(//tr[@class='tablecontents']//td)[4]";
public static String actualendTime="(//tr[@class='tablecontents']//td)[5]";
public static String actualstartTime1="(//input[@name='newActualStartTime'])";
public static String actualendTime1="(//input[@name='newActualEndTime'])";
public static String savechangesbtn="//input[@name='submit1']";

//Absence Summary

public static String absencesummarytab="//div[@id='oCMenu_level003']";
public static String absencetab="//div[@id='oCMenu_level01']";
public static String reqsummarytab="//input[@name='submit']";
public static String oucverify1="//span[contains(text(),'NS')]";

//Balance Ledger
public static String reasontab="//input[@name='reason']";
public static String credittab="//input[@name='credit']";
public static String addbutton2="//input[@name='action']";
public static String debittab="//input[@name='debit']";
public static String amendtype="//select[@class='textField']";
public static String creditverify="(//td[@title='Column Header: Credit'])";
public static String headertitle="//td[@class='sectionheading2']";
public static String debitverify="(//td[@title='Column Header: Debit'])";



//Attendance - Manage OverTime
public static String sendBtn = "//input[@value='Send']";
public static String volunteerBtn = "//input[@value='Volunteer']";
public static String volunteerDate = "//input[@name='overtimeDate']";
public static String periodDropDown = "//select[@name='period']";
public static String deleteCheckBox = "(//input[@name='deleteSelection'])[1]";
public static String deleteDateCol = "(//input[@name='Date'])[1]";
public static String deleteBtn = "(//input[@value='Delete'])";

//Bulk - Assign Attributes
public static String oucInput = "//input[@name='ouc']"; 
public static String showBtn = "//input[@value='Show']";
public static String attrSelect = "//select[@name='selectedAssignment']";
public static String addBtn = "//input[@value='Add']";
public static String selectAllCheck = "//input[@name='selectAll']";
public static String selectEmpCheck = "(//input[@name='selectedEmployee'])[1]";
public static String fisrtEinCol = "(//td[@title='Column Header:EIN'])[1]//a";
public static String removeBtn = "//input[@value='Remove']";

//Bulk - Assign Skills
public static String schemeSelect = "//select[@name='selectedSchemeName']";
public static String skillCheck_1 = "//input[@name='workTypeAll_1']";

//Bulk Absence

public static String bulktab="//div[@id='oCMenu_level04']";
public static String bookabsencetab="//div[@id='oCMenu_level000']";
public static String einfields="//textarea[@name='eins']";
public static String absenceBtn="//input[@name='Confirm']";
public static String statusField="(//tr[@class='tableheader']//td)[10]";
public static String refuse="(//tr[@class='tableheader']//td//span[@class='errors']";
public static String bookAbs="//span[@class='textGreen']";
public static String modifyAbsence="//div[@id='oCMenu_level002']";
public static String dropDownSelect ="//select[@name='calloutCode']";
public static String attendanceDiaryBtn  = "//input[@value='Attendance Diary']";
public static String commentTab  = "//input[@name='aamNotes']";
public static String statusMsg ="//span[@class='textGreen']";
public static String cancelAbsenceTab ="//div[@id='oCMenu_level001']";
public static String cancelNoteTab ="//input[@name='cancelNotes']";
public static String statusCancelMsg ="//td[@title='Column Header: Status']";
public static String absenceCancelDropDown ="//select[@name='absenceCodesArray']";

//Find

public static String searchIcon ="//img[@alt='Link to Roster Pattern Browser']";
public static String patternNameTab ="//input[@name='patternName']";
public static String submitTab11="//input[@value='Submit']";
public static String patternNameTab1 ="//input[@name='patternName']";
public static String queueTab1 ="//input[@name='assignedQueueName']";


//Skill Group

public static String HierarchySchemeTab ="//select[@name='hierarchyId']";
public static String regionTab ="//select[@name='rbaId']";
public static String domainTab ="//select[@name='cstId']";
public static String createSkillGrpTab ="//input[@class='buttonStyle' and @id='addButton']";
public static String grpNameTab ="//input[@name='planningGroup.planGroupName']";
public static String createBtn ="//input[@value='Create']";
public static String searchTab ="//input[@name='Search']";
public static String radioBtnTab="//input[@name='planningGroup.planGroupId']";
public static String leaveYearSelect ="//select[@name='leaveYear']";

	public static void searchEIN(WebDriver driver, String ein) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(einField)));
		driver.findElement(By.xpath(einField)).sendKeys(ein);
		driver.findElement(By.xpath(submitButton)).click();
	}

	public static void clickOnSkillPwasLink(WebDriver driver) {
		driver.findElement(By.xpath(skillsPwas)).click();
	}

	public static void manageSkills(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(availableSkills_01)));
//		driver.findElement(By.xpath(availableSkills_01)).click();
//		driver.findElement(By.xpath(availableSkills_02)).click();
//		driver.findElement(By.xpath(addSkillsButton)).click();
//		driver.findElement(By.xpath(saveButton)).click();
	}

	public static void manageAttendance(WebDriver driver) {
		driver.findElement(By.xpath(start_Overtime)).sendKeys("0900");
	}
	
	public static void saveLocationPreferences(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		int noDataFoundCount =driver.findElements(By.xpath(noPWAAvailable)).size();
		if(noDataFoundCount == 0) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(availablePWA_0)));
			driver.findElement(By.xpath(availablePWA_0)).click();
			//driver.findElement(By.xpath(availablePWA_1)).click();
			driver.findElement(By.xpath(addPWABtn)).click();
			WebElement prefDropdownSelect_1 = driver.findElement(By.xpath(prefDropdown_1));
			Select pSelect = new Select(prefDropdownSelect_1);
			pSelect.selectByVisibleText("10");
			driver.findElement(By.xpath(savePWAButton)).click();
		//	String message = driver.findElement(By.xpath(confirmMsgPref)).getText();
			//System.out.println("Confirm Msg : " + message);
		//	assertEquals(message, "- Saved Successfully");
			
		}else {
			System.out.println("No PWA(s) is/are available with the employee ");
		}
		
	}
	
	public static void cloneLocationPreferences(WebDriver driver, String ein) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clonePWAButton)));
		
		if(!driver.findElements(By.xpath(associatePWA_0)).isEmpty()) {
			driver.findElement(By.xpath(copyToEIN)).sendKeys(ein);
			driver.findElement(By.xpath(clonePWAButton)).click();
			if(isAlertPresent(driver)){
				System.out.println("isAlertPresent :" + EmployeePage.isAlertPresent(driver));
				driver.switchTo().alert().accept();
			}
			//String message = driver.findElement(By.xpath(confirmMsgPref)).getText();
			//System.out.println("Confirm Msg : " + message);
			//assertEquals(message, "- Cloned Successfully");
		}
	}
	
	public static void createCalendarisedPWAPref(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newDateRangeImg)));
		driver.findElement(By.xpath(newDateRangeImg)).click();
		driver.findElement(By.xpath(startDatePref)).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath(currentDateClick)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(foreverCheckBox)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(endDatePref)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(currentDateClick)).click();
		int iCount = 0;
		iCount = driver.findElements(By.xpath(calPWASelect)).size();
		
		//System.out.println("PWA Select Count: "+iCount);
		
		if(iCount > 0) {
			for (int i = 1; i <= iCount; i = i + 1) {
			  //System.out.println(i);
			  // collecting dynamic PWA preference select xpath ID's. For ex: (//select[@id='preference'])[1], (//select[@id='preference'])[2]
			  String selectId = "(" + calPWASelect + ")[" + i + "]";
			  //System.out.println(selectId);
			  WebElement pwaSelect = driver.findElement(By.xpath(selectId));
			  Select pSelect = new Select(pwaSelect);
			  pSelect.selectByVisibleText(Integer.valueOf(i).toString());
			}
			
			driver.findElement(By.xpath(createNewPWABtn)).click();
			String message = driver.findElement(By.xpath(confirmMsgCalPref)).getText();
			//System.out.println("Confirm Msg : " + message.trim());
		//	assertEquals(message.trim(), "Successfully saved");
		}
	}
	
	public static void saveCalendarisedPWAPref(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newDateRangeImg)));
		String noPwaXpath = validationErrClass + "[2]";
		
		if(driver.findElements(By.xpath(noPwaXpath)).size() <= 0) {
			driver.findElement(By.xpath(startDatePref)).click();
			driver.findElement(By.xpath(currentDateClick)).click();
			Thread.sleep(2000);
			WebElement foreverCheck = driver.findElement(By.xpath(foreverCheckBox));
			System.out.println("foreverCheck.isSelected() : "+foreverCheck.isSelected());
			if(foreverCheck.isSelected()) {
				driver.findElement(By.xpath(foreverCheckBox)).click();
				driver.findElement(By.xpath(endDatePref)).click();
				driver.findElement(By.xpath(currentDateClick)).click();
			}
			
			int iCount = 0;
			iCount = driver.findElements(By.xpath(calPWASelect)).size();
			
			System.out.println("PWA Select Count: "+iCount);
			
			if(iCount > 0) {
				for (int i = 1; i <= iCount; i = i + 1) {
				  //System.out.println(i);
				  // collecting dynamic PWA preference select xpath ID's. For ex: (//select[@id='preference'])[1], (//select[@id='preference'])[2]
				  String selectId = "(" + calPWASelect + ")[" + i + "]";
				  //System.out.println(selectId);
				  WebElement pwaSelect = driver.findElement(By.xpath(selectId));
				  Select pSelect = new Select(pwaSelect);
				  pSelect.selectByVisibleText(Integer.valueOf(i).toString());
				}
				
				driver.findElement(By.xpath(saveNewPWABtn)).click();
				
				String message = driver.findElement(By.xpath(confirmMsgCalPref)).getText().trim();
				//System.out.println("Confirm Msg : " + message);
				assertEquals(message, "Successfully saved");
			}
		}
	}
	
	public static void deleteCalendarisedPWAPref(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newDateRangeImg)));
		String noPwaXpath = validationErrClass + "[2]";
		
		if(driver.findElements(By.xpath(noPwaXpath)).size() <= 0) {
			driver.findElement(By.xpath(deletePwaIcon)).click();
			driver.switchTo().alert().accept();
		}
	}
	
	public static void createCalendarisedSkillPref(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newDateRangeImg)));
		driver.findElement(By.xpath(newDateRangeImg)).click();
		driver.findElement(By.xpath(startDatePref)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(currentDateClick)).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(foreverCheckBox)).click();
		driver.findElement(By.xpath(endDatePref)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(currentDateClick)).click();
		int iCount = 0;
		iCount = driver.findElements(By.xpath(calSkillSelect)).size();
		
		//System.out.println("Skill Select Count: "+iCount);
		
		if(iCount > 0) {
			for (int i = 1; i <= iCount; i = i + 1) {
			  //System.out.println(i);
			  // collecting dynamic Skill preference select xpath ID's. For ex: (//select[@id='preference'])[1], (//select[@id='preference'])[2]
			  String selectId = "(" + calSkillSelect + ")[" + i + "]";
			  //System.out.println(selectId);
			  WebElement skillSelect = driver.findElement(By.xpath(selectId));
			  Select sSelect = new Select(skillSelect);
			  sSelect.selectByVisibleText(Integer.valueOf(i).toString());
			}
			
			driver.findElement(By.xpath(createNewSkillBtn)).click();
			String message = driver.findElement(By.xpath(confirmMsgSkillPref)).getText();
			//System.out.println("Confirm Msg : " + message.trim());
			assertEquals(message.trim(), "Successfully saved");
		}
	}
	
	public static void saveCalendarisedSkillPref(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newDateRangeImg)));
		String noPwaXpath = validationErrClass + "[2]";
		
		if(driver.findElements(By.xpath(noPwaXpath)).size() <= 0) {
			driver.findElement(By.xpath(startDatePref)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(currentDateClick)).click();
			Thread.sleep(2000);
			/*WebElement foreverCheck = driver.findElement(By.xpath(foreverCheckBox));
			System.out.println("foreverCheck.isSelected() : "+foreverCheck.isSelected());
			if(foreverCheck.isSelected()) {
				driver.findElement(By.xpath(foreverCheckBox)).click();*/
				driver.findElement(By.xpath(endDatePref)).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(currentDateClick)).click();
			//}
			
			int iCount = 0;
			iCount = driver.findElements(By.xpath(calSkillSelect)).size();
			
			System.out.println("Skill Select Count: "+iCount);
			
			if(iCount > 0) {
				for (int i = 1; i <= iCount; i = i + 1) {
				  //System.out.println(i);
				  // collecting dynamic PWA preference select xpath ID's. For ex: (//select[@id='preference'])[1], (//select[@id='preference'])[2]
				  String selectId = "(" + calSkillSelect + ")[" + i + "]";
				  //System.out.println(selectId);
				  WebElement skillSelect = driver.findElement(By.xpath(selectId));
				  Select sSelect = new Select(skillSelect);
				  sSelect.selectByVisibleText(Integer.valueOf(i).toString());
				}
				
				driver.findElement(By.xpath(saveSkillBtn)).click();
				
				String message = driver.findElement(By.xpath(confirmMsgSkillPref)).getText().trim();
				//System.out.println("Confirm Msg : " + message);
				assertEquals(message, "Successfully saved");
			}
		}
	}
	
	public static void deleteCalendarisedSkillPref(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newDateRangeImg)));
		String noPwaXpath = validationErrClass + "[2]";
		
		if(driver.findElements(By.xpath(noPwaXpath)).size() <= 0) {
			driver.findElement(By.xpath(deletePwaIcon)).click();
			driver.switchTo().alert().accept();
		}
	}
	
	public static boolean isAlertPresent(WebDriver driver) {
        try {
        	driver.switchTo().alert();
        	return true;
        } catch (NoAlertPresentException e) {
        	return false;
        }
	}
	
	public static String taskforceAddInstanceUtil(WebDriver driver, Properties propertiesO, Boolean ifSecondInstance) {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EmployeePage.addInstanceBtn)));
		
		// add one instance for today's date
		WebElement instanceSelect = driver.findElement(By.xpath(tInstanceSelect));
		Select iSelect = new Select(instanceSelect);
		iSelect.selectByIndex(1);
		
		if(ifSecondInstance) {
			//To find tomorrow's date
			/*Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			Date tomorrow = calendar.getTime();
			String pattern = "dd-MMM-yyyy";
			String tomorrowAsString = new SimpleDateFormat(pattern).format(tomorrow);
			System.out.println(tomorrowAsString);*/
			String tomorrowAsString = HomePage.getDateByDaysCount( 1 );
			
			driver.findElement(By.xpath(EmployeePage.startDateField)).clear();
			driver.findElement(By.xpath(EmployeePage.endDateField)).clear();
			driver.findElement(By.xpath(EmployeePage.startDateField)).sendKeys(tomorrowAsString);
			driver.findElement(By.xpath(EmployeePage.endDateField)).sendKeys(tomorrowAsString);
			
			
		} else {
			String todaysDate = HomePage.getDateByDaysCount( 0 );
			driver.findElement(By.xpath(EmployeePage.startDateField)).sendKeys(todaysDate);
			driver.findElement(By.xpath(EmployeePage.endDateField)).sendKeys(todaysDate);
		/*	driver.findElement(By.xpath(startDatePref)).click();
		    driver.findElement(By.xpath(currentDateClick)).click();
			driver.findElement(By.xpath(endDatePref)).click();
			driver.findElement(By.xpath(currentDateClick)).click()*/;
		}
		
		driver.findElement(By.xpath(startLocInput)).sendKeys(propertiesO.getProperty("prefWorkLoc"));
		driver.findElement(By.xpath(finishLocInput)).sendKeys(propertiesO.getProperty("prefWorkLoc"));
		driver.findElement(By.xpath(domainInput)).sendKeys(propertiesO.getProperty("domain1"));
		driver.findElement(By.xpath(pwaInput)).sendKeys(propertiesO.getProperty("pwaId"));
		
		WebElement progSelect = driver.findElement(By.xpath(progModeSelect));
		Select pSelect = new Select(progSelect);
		pSelect.selectByIndex(1);
		
		WebElement loanSelect = driver.findElement(By.xpath(tLoanSelect));
		Select lSelect = new Select(loanSelect);
		lSelect.selectByIndex(1);
		
		WebElement homeSelect = driver.findElement(By.xpath(homeStartSelect));
		Select hSelect = new Select(homeSelect);
		hSelect.selectByIndex(1);
		
		driver.findElement(By.xpath(homePostcodeInput)).sendKeys("0");
		driver.findElement(By.xpath(loanedOucInput)).sendKeys("0");
		driver.findElement(By.xpath(fjtfInput)).sendKeys("0");
		driver.findElement(By.xpath(ljtfInput)).sendKeys("0");
		
		driver.findElement(By.xpath(addInstanceBtn)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EmployeePage.taskConfirmMsg)));

		String msg = ""; 
		msg = driver.findElement(By.xpath(EmployeePage.taskConfirmMsg)).getText().trim();
		
		return msg;
	}
	
	public static void empSickReportUtil(WebDriver driver, Properties propertiesO) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePage.employeeTab)));
		
		driver.findElement(By.xpath(HomePage.employeeTab)).click();
		driver.findElement(By.xpath(HomePage.sick)).click();
		driver.findElement(By.xpath(HomePage.report)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePage.einField)));
		driver.findElement(By.xpath(HomePage.einField)).sendKeys(propertiesO.getProperty("EIN_valid"));
		driver.findElement(By.xpath(EmployeePage.workedTodayRadio)).click();
		Select oSelect = new Select(driver.findElement(By.xpath(EmployeePage.sickReasonCodeDropdown)));
		oSelect.selectByIndex(1);
		driver.findElement(By.xpath(EmployeePage.voicedReasonField)).sendKeys(propertiesO.getProperty("voicedReason_reportNewSickTest"));
		driver.findElement(By.xpath(EmployeePage.submitNewSickReportButton)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EmployeePage.confirmNewSickReportButton)));
		driver.findElement(By.xpath(EmployeePage.confirmNewSickReportButton)).click();
		String sickConfirmMsg = "//strong[contains(text(),'"+propertiesO.getProperty("EIN_valid")+"')]";
		String msg = driver.findElement(By.xpath(sickConfirmMsg)).getText();
		
		assertEquals(true, msg.contains(propertiesO.getProperty("EIN_valid")), "Unable to create a new sick");
	}
	
	public static void empReturnToWorkUtil(WebDriver driver, Properties propertiesO) {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePage.employeeTab)));
		
		driver.findElement(By.xpath(HomePage.employeeTab)).click();
		driver.findElement(By.xpath(HomePage.sick)).click();
		driver.findElement(By.xpath(HomePage.returnToWork)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePage.einField)));
		driver.findElement(By.xpath(HomePage.einField)).sendKeys(propertiesO.getProperty("EIN_valid"));
		driver.findElement(By.xpath(EmployeePage.submitSickReturnNotification)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EmployeePage.confirmSickReturn)));
		driver.findElement(By.xpath(EmployeePage.confirmSickReturn)).click();
		
		String sickConfirmMsg = "//strong[contains(text(),'"+propertiesO.getProperty("EIN_valid")+"')]";
		String msg = driver.findElement(By.xpath(sickConfirmMsg)).getText();
		assertEquals(true, msg.contains(propertiesO.getProperty("EIN_valid")), "Unable to verify the return to work test");
	}
	
	public static String applyVolunteerOTUtil(WebDriver driver, WebDriverWait wait, Properties propertiesO) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePage.employeeTab)));
		
		driver.findElement(By.xpath(HomePage.employeeTab)).click();
		driver.findElement(By.xpath(HomePage.attendance)).click();
		driver.findElement(By.xpath(HomePage.manageOverTime)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EmployeePage.einField)));
		driver.findElement(By.xpath(EmployeePage.einField)).sendKeys(propertiesO.getProperty("EIN_valid"));
		driver.findElement(By.xpath(EmployeePage.sendBtn)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EmployeePage.volunteerDate)));
		
		//Apply for next sunday as per current sys date
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
		c.set(Calendar.HOUR_OF_DAY,0);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);
		c.add(Calendar.DATE,7);
		
		Date sunday = c.getTime();
		String nextSunday = new SimpleDateFormat("dd-MMM-yyyy").format(sunday);
		System.out.println(nextSunday);
		String verifyText = "Sun " + nextSunday.substring(0, 2); //used for verification should match with this text
		
		driver.findElement(By.xpath(EmployeePage.volunteerDate)).sendKeys(nextSunday);
		WebElement periodSelect = driver.findElement(By.xpath(EmployeePage.periodDropDown));
		Select pSelect = new Select(periodSelect);
		pSelect.selectByVisibleText("Full Day");
		driver.findElement(By.xpath(EmployeePage.volunteerBtn)).click();
		
		return verifyText;
	}
}
