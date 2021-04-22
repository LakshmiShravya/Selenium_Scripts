package com.bt.fp.fos.ObjectRepository;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagePage {

	//menu
	public static String manageTab = "//div[@id='oCMenu_level1_0']";
	public static String leaveGroupTab = "//div[@id='oCMenu_level02']";
	public static String findTab = "//div[@id='oCMenu_level000']";
	public static String roasterPatternTab = "//div[@id='oCMenu_level05']";
	public static String rCreateTab = "//div[@id='oCMenu_level002']";
	public static String overtimeTab = "//div[@id='oCMenu_level03']";
	public static String authoriseTab = "//div[@id='oCMenu_level000']";
	public static String displayTab = "//div[@id='oCMenu_level001']";
	public static String modifyTab = "//div[@id='oCMenu_level003']";
	public static String rosRenameTab = "//div[@id='oCMenu_level004']";
	public static String rosDeleteTab = "//div[@id='oCMenu_level005']";
	public static String eDisplayTab = "//div[@id='oCMenu_level006']";
	public static String eCreateTab = "//div[@id='oCMenu_level007']";
	public static String eModifyTab = "//div[@id='oCMenu_level008']";
	public static String eRenameTab = "//div[@id='oCMenu_level129']";
	public static String manageLveGrpTab ="//div[@id='oCMenu_level001']";
	public static String renameTab="//div[@class='clLevel1' and @id='oCMenu_level005']";
	public static String deleteTab="//div[@class='clLevel1' and @id='oCMenu_level006']";
	public static String setAutoTab="//div[@class='clLevel1' and @id='oCMenu_level001']";
    public static String restrictedPeriodTab ="//div[@class='clLevel1' and @id='oCMenu_level003']";
    public static String leaveTab = "//div[@id='oCMenu_level01']";
	public static String leaveSchedularTab ="//div[@id='oCMenu_level000']";
	public static String manageLeaveEOYCarryOverTab ="//div[@id='oCMenu_level002']";
	public static String mlgtTab="//div[@id='oCMenu_level007']";
	public static String bulkMLGTTab="//div[@id='oCMenu_level008']";
	
	public static String bulkShortNoticePrd="//div[@class='clLevel1' and @id='oCMenu_level004']";
	public static String escalataionTemplateTab="//div[@id='oCMenu_level002']";
	public static String escalataionDestinationTab="//div[@id='oCMenu_level003']";
 
    
	//common variables
	public static String headTitle = "//td[@class='sectionheading2']";
	public static String addEnteredTab="//input[@name='submit']";
	public static String confirmTab ="//input[@value='Confirm Changes']";
	public static String confirmTab1 ="//input[@value='Create Leave Group']";
	public static String submitBtn = "//input[@value='Submit']";
	public static String dateTab="//input[@name='otDate']";
	public static String OUCTab ="//input[@class='textField']";
	public static String selectAllBtn="//input[@name='deleteAll']";
	public static String removeTab ="//input[@value='remove Selected...']";
	public static String einField="//input[@id='ein']";
	public static String addButton="//input[@name='addbuttonbottom']"; 
	public static String oucField="//input[@name='searchCriteriaVO.ouc']";
	public static String searchBtn="//input[@name='searchbutton']";
	public static String dateSelect1 = "//img[@src='/images/date.gif'][1]";
//	public static String dateSelect2 = "(//img[@src='/images/date.gif'])[2]";
	public static String currentDateClick = "//td[@class='cpCurrentDate']//a[@class='cpCurrentDate']";
	public static String einField1="//input[@name='ein']";
	public static String searchButton="//input[@name='Search']";
	public static String ocuTab="//input[@name='ouc']";
	public static String startDateTab = "//input[@name='startDate']";
	public static String parkbtn= "//input[@value='Park']";
	public static String unParkBtn= "//input[@value='UnPark']";
	public static String closeBtn = "//input[@value='Close']";
	public static String insertTab = "//input[@value='Insert']";
	public static String updateBtn ="//input[@value='Update']";
	public static String editBtn ="//input[@id='edit']";
	
	//Leave Group
	public static String leaveGroupNameInput = "//input[@name='leaveGroupName']";
	public static String lgSubmitBtn = "//input[@name='submitParms']";
	
	//Roaster Pattern - Create
	public static String patternNameInput = "//input[@name='patternName']";
	public static String patternDescInput = "//input[@name='patternDescription']";
	
	//Roaster Pattern - Modify
	public static String listBtn = "//input[@value='List']";
	public static String versionSelect = "//select[@name='effectiveDateChoice']";
	public static String startTimeInput = "(//input[@name='startTime'])[1]";
	public static String endTimeInput = "(//input[@name='endTime'])[1]";
	
	//Roaster Pattern - Rename
	public static String oldPatternInput = "//input[@name='oldPatternName']";
	public static String newPatternInput = "//input[@name='newPatternName']";
	
	//Authorise OverTime
	public static String einTextArea = "//textarea[@id='textein']";
	public static String overtimeDate = "//input[@name='overtimeDate']";
	public static String approveCheckBox = "//input[@name='approved']";
	public static String actionBtn = "//input[@value='Action']";
	public static String approvalNotesInput = "//input[@name='approvalNotes']";
	public static String authConfirmMsg = "//span[contains(text(),'All selected entries have been successfully actioned')]";
	
	//LeaveGroup Find/ Manage
	public static String leaveGrpLink = "(//td[@title='Column Header:Leave Group']/a)[1]";
	public static String manageLvePage ="//td[@class='sectionheading2']";
	public static String lveGrpDescription="//input[@name='leaveGroupDesc']";
	public static String orgnSelect="//select[@name='leaveGroupOrgCode']";
	public static String enabledBox="//input[@name='leaveGroupEnableDiscProcess']";
	public static String autoBox="//input[@name='leaveGroupEnableAutoDisc']";
	public static String addEmployees="//textarea[@name='addedEmployees']";
	public static String succMsg="//span[@class='successMessage']";
	
	// Assign Attributes
	public static String assignAttributeTab="//div[@class='clLevel1' and @id='oCMenu_level002']";
	public static String showTab="//input[@type='submit']";
	public static String assignTab="//select[@name='selectedAssignment']";
	public static String inputAge="//input[@name='pctAllowed']";
	public static String inputAge2="(//input[@name='pctAllowed'])[2]";
	public static String minimumOnDuty="//input[@name='minOnDuty']";
	public static String minimumOnDuty2="(//input[@name='minOnDuty'])[2]";
	public static String leaveGrpLink1="(//span[@class='textStyle']/a)[1]";
	
	//Rename
	public static String oldLveGrpName="//input[@name='oldLeaveGroupName']";
	public static String newLveGrpName="//input[@name='newLeaveGroupName']";
	
	// Overtime Auto Authorize
	
	public static String periodTab="//select[@name='otPeriod']";
	public static String startTab="//input[@name='otStartTime']";
	public static String endTab="//input[@name='otEndTime']";
	public static String periodTab1="//select[@name='period']";
	public static String dateInputTab="//input[@name='overtimeDate']";
	
	// Enhanced DOC
	public static String locationTab="//input[@name='enhancedDocVO.location']";
	public static String comeBackTimeTab="//input[@name='enhancedDocVO.comeBackTime']";
	public static String enhanceDocPage="//td[@class='sectionheading2']";
	public static String dateTab1="//input[@name='searchCriteriaVO.date']";
	public static String confirmMesge="//td[contains(text(),'IPSWICH')]";
	public static String dutyOfCareTab="//div[@id='oCMenu_level04']";
	
		// Escalation events"
	public static String validateMsg="//a[@href=/manageEmployee.do?ein=]";
	public static String oucverify="//td[contains(text(),'NSC99']";
	public static String escNotesTab="//textarea[@id='escNotes']";
	public static String escalationEventsTab = "//div[@class='clLevel1' and @id='oCMenu_level000']";
	public static String enhancedDocTab ="//div[@class='clLevel1' and @id='oCMenu_level001']";
	
	//Restricted period
	
	public static String scheduleTab="//input[@name='schedule']";
	public static String reasonTab="//input[@name='reasonText']";
	
	//SNP Applied
	
	public static String lveGroCheckBox ="//input[@name='leaveGroupName' and @value='ALITEMP']";
	public static String shortNoticePrdTab ="//input[@name='shortNoticeThreshold']";
	public static String applySNP ="//input[@value='Apply SNP']";
	public static String headerTitle1 ="//td[@class='sectionheading2']";
	public static String monCheckBox="//input[@name='shortNoticePeriodMon']";
	public static String tueCheckBox="//input[@name='shortNoticePeriodTue']";
	public static String wedCheckBox="//input[@name='shortNoticePeriodWed']";
	public static String thuCheckBox="//input[@name='shortNoticePeriodThu']";
	public static String applySNPConfig ="//input[@value='Apply SNP Config']";
//Manage_Leave Group_Restricted Periods
	
	public static String startDateImg ="//a[@name='anchorStartDate']/img";
	public static String endDateImg ="//a[@name='anchorEndDate']/img";
	public static String reasonTextbox ="//input[@name='reasonText']";
	public static String scheduleCheckBox="//input[@name='schedule']";
	public static String insertBtn="//input[@name='action']";
	public static String dateToday ="//a[contains(text(),'Today')]";
	public static String saveBtn ="//input[@name='submit']";
	//public static String checkBox ="//input[contains(@name(),'BID_')]";
	public static String savedTxt ="//font[contains(text(),'SAVED')]";
	public static String freezeBtn="//input[@value='Freeze']";
	public static String frozenTxt ="//font[contains(text(),'FROZEN')]";
	public static String unFreezeBtn="//input[@value='Unfreeze']";
	public static String bookBtn="//input[@value='Book']";
	public static String bookedTxt="//font[contains(text(),'BOOKED')]";
	public static String dateLink="//a[contains(@href,'reportStartDate')]";
	public static String deleteBtn="//input[@value='Delete']";
	public static String leaveYearSelect="//select[@name='leaveYear']";
	public static String capAtInput="//input[@name='capAtAmount']";
	public static String balance="//td[contains(text(),'120:00')]";
	public static String einCheckbox="//input[@name='einCheckbox']";
	
	//manage_Leave Group_bulkMLGTTab
	public static String orgCodeSelect="//select[@name='orgCode']";
	public static String todayDate="//a[contains(text(),'Today')]";
	public static String endDateInput="//input[@name='endDate']";
	public static String leaveLimit="//input[@name='leaveLimit']";
	public static String otherLimit="//input[@name='otherLimit']";
	public static String totalLimit="//input[@name='totalLimit']";
	public static String checkBoxLeaveGrp="//input[@name='selectedLeaveGroup']";
	public static String modifyBtn="//input[@value='Modify']";
	public static String templateName="//select[@name='templateName']";
	public static String escalationStep="//input[@name='escalationLevelVO.escalationLevel']";
	public static String escalationInitiateAfter="//input[@name='escalationLevelVO.delayMins']";
	
	//manage_DutyOfCare_EscalationTemplate
	public static String escalationTemplateName="//input[@name='escalationTemplateVO.template_name']";
	public static String escalationDescription="//input[@name='escalationTemplateVO.template_desc']";
	public static String addBtn="//input[@name='Add']";
	public static String noSignOnCheckBox="//input[@id='cbEscType_0']";
	public static String noSignOffCheckBox="//input[@id='cbEscType_1']";
	public static String enhancedDoCCheckBox="//input[@id='cbEscType_2']";
	public static String after1CheckBox="//input[@id='cb1_0']";
	public static String after2CheckBox="//input[@id='cb1_1']";
	public static String after3CheckBox="//input[@id='cb1_2']";
	public static String mins1Input="//input[@id='delayMins_0']";
	public static String mins2Input="//input[@id='delayMins_1']";
	public static String mins3Input="//input[@id='delayMins_2']";
	public static String useTravel1CheckBox="//input[@id='useTravel_0']";
	public static String useTravel2CheckBox="//input[@id='useTravel_1']";
	public static String useTravel3CheckBox="//input[@id='useTravel_2']";
	public static String saveButton="//input[@name='Save']";
	public static String escalationStepAddBtn="(//input[@name='Add'])[2]";
	public static String selectStep="//select[@name='escalationTemplateDetailsVO.escalation_level']";
	public static String selectDays="//select[@name='escalationTemplateDetailsVO.days']";
	public static String fromDate="//input[@id='fromDate']";
	public static String endDate="//input[@id='endDate']";
	public static String selectDestination="//select[@name='escalationTemplateDetailsVO.destination']";
	public static String radioBtn="//input[@name='radio']";
	
	//manage_DutyOfCare_EscalationDestination
	public static String escDestinationName="//input[@name='newEscDestVO.escDestinationName']";
	public static String escDestinationDescription="//input[@name='newEscDestVO.description']";
	public static String escDestinationIVRNumber="//input[@name='newEscDestVO.ivrNumber']";
	public static String addNewBtn="//input[@id='addButton']";
	public static String editBtn1="//input[@id='editButton']";
	
	
	
	public static void createRoasterPatternUtil(WebDriver driver, String name) {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.manageTab)));
		
		driver.findElement(By.xpath(ManagePage.manageTab)).click();
		driver.findElement(By.xpath(ManagePage.roasterPatternTab)).click();
		driver.findElement(By.xpath(ManagePage.rCreateTab)).click();
 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.patternNameInput)));
		driver.findElement(By.xpath(ManagePage.patternNameInput)).sendKeys(name);
		driver.findElement(By.xpath(ManagePage.submitBtn)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.manageTab)));
		Select oSelect = new Select(driver.findElement(By.xpath("//select[@name='lunchDuration']")));
		oSelect.selectByValue("40");
		driver.findElement(By.xpath(ManagePage.patternDescInput)).sendKeys(name);
		
		driver.findElement(By.xpath(ManagePage.submitBtn)).click();
		
		String headTitle = driver.findElement(By.xpath(ManagePage.headTitle)).getText();
		assertEquals(headTitle, "Display Roster Pattern");
	}
	
	public static void createExtRoasterPatternUtil(WebDriver driver, String name) {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.manageTab)));
		
		driver.findElement(By.xpath(ManagePage.manageTab)).click();
		driver.findElement(By.xpath(ManagePage.roasterPatternTab)).click();
		driver.findElement(By.xpath(ManagePage.eCreateTab)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.patternNameInput)));
		driver.findElement(By.xpath(ManagePage.patternNameInput)).sendKeys(name);
		driver.findElement(By.xpath(ManagePage.submitBtn)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.patternDescInput)));
		Select oSelect = new Select(driver.findElement(By.xpath("//select[@name='globalLunchDuration']")));
		oSelect.selectByValue("40");
		driver.findElement(By.xpath(ManagePage.patternDescInput)).sendKeys("OK");
		
		driver.findElement(By.xpath(ManagePage.submitBtn)).click();
		
		String headTitle = driver.findElement(By.xpath(ManagePage.headTitle)).getText();
		assertEquals(headTitle, "Display Extended Roster Pattern");
	}
	
	public static String rosterDisplayUtil(WebDriver driver, String name, Boolean isExt) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.manageTab)));
		
		driver.findElement(By.xpath(ManagePage.manageTab)).click();
		driver.findElement(By.xpath(ManagePage.roasterPatternTab)).click();
		if(isExt) {
			driver.findElement(By.xpath(ManagePage.eDisplayTab)).click();
		} else {
			driver.findElement(By.xpath(ManagePage.displayTab)).click();
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.patternNameInput)));
		driver.findElement(By.xpath(ManagePage.patternNameInput)).sendKeys(name);
		driver.findElement(By.xpath(ManagePage.submitBtn)).click();
		
		String rpXpath = "//td[contains(text(), '"+name+"')]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(rpXpath)));
		String rpName = driver.findElement(By.xpath(rpXpath)).getText();
		return rpName;
	}
	public static String rosterModifyUtil(WebDriver driver, String name, Boolean isExt, String startTime) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.manageTab)));
		
		driver.findElement(By.xpath(ManagePage.manageTab)).click();
		driver.findElement(By.xpath(ManagePage.roasterPatternTab)).click();
		if(isExt) {
			driver.findElement(By.xpath(ManagePage.eModifyTab)).click();
		} else {
			driver.findElement(By.xpath(ManagePage.modifyTab)).click();
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.patternNameInput)));
		driver.findElement(By.xpath(ManagePage.patternNameInput)).sendKeys(name);
		driver.findElement(By.xpath(ManagePage.listBtn)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.versionSelect)));
		
		Select vSelect = new Select(driver.findElement(By.xpath(ManagePage.versionSelect)));
		vSelect.selectByIndex(1);
		driver.findElement(By.xpath(ManagePage.submitBtn)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.startTimeInput)));
		driver.findElement(By.xpath(ManagePage.startTimeInput)).clear();
		driver.findElement(By.xpath(ManagePage.startTimeInput)).sendKeys(startTime);
		driver.findElement(By.xpath(ManagePage.endTimeInput)).clear();
		driver.findElement(By.xpath(ManagePage.endTimeInput)).sendKeys("1700");
		driver.findElement(By.xpath(ManagePage.submitBtn)).click();
		
		String timeXpath = "//td[contains(text(), '"+startTime+"')]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(timeXpath)));
		String timeText = driver.findElement(By.xpath(timeXpath)).getText();
		
		return timeText;
	}
	
	public static String renameRosterUtil(WebDriver driver, Boolean isExt, String oldName, String newName) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.manageTab)));
		
		driver.findElement(By.xpath(ManagePage.manageTab)).click();
		driver.findElement(By.xpath(ManagePage.roasterPatternTab)).click();
		if(isExt) {
			driver.findElement(By.xpath(ManagePage.eRenameTab)).click();
		} else {
			driver.findElement(By.xpath(ManagePage.rosRenameTab)).click();
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.oldPatternInput)));
		driver.findElement(By.xpath(ManagePage.oldPatternInput)).sendKeys(oldName);
		
		driver.findElement(By.xpath(ManagePage.newPatternInput)).sendKeys(newName);
		driver.findElement(By.xpath(ManagePage.submitBtn)).click();
		
		String rpXpath = "//td[contains(text(), '"+newName+"')]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(rpXpath)));
		String rpName = driver.findElement(By.xpath(rpXpath)).getText();
		
		return rpName;
	}
	
	public static void deleteRosterUtil(WebDriver driver, String name) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.manageTab)));
		
		driver.findElement(By.xpath(ManagePage.manageTab)).click();
		driver.findElement(By.xpath(ManagePage.roasterPatternTab)).click();
		driver.findElement(By.xpath(ManagePage.rosDeleteTab)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.patternNameInput)));
		driver.findElement(By.xpath(ManagePage.patternNameInput)).sendKeys(name);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ManagePage.listBtn)));
		driver.findElement(By.xpath(ManagePage.listBtn)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='effectiveDate']")));
		
		driver.findElement(By.xpath("//input[@name='deleteAll']")).click();
		driver.findElement(By.xpath(ManagePage.submitBtn)).click();
		String delConfirmMsg = "//td[contains(text(), 'Roster Pattern "+name+" Successfully deleted.')]";

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(delConfirmMsg)));
		int iCount = driver.findElements(By.xpath(delConfirmMsg)).size();
		System.out.println("msg count : " + iCount);
		assertEquals(1, iCount, "Unable to verify the delete Roster Pattern");
	}
	
}
