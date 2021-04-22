package com.bt.fp.fos.ObjectRepository;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {

	// Admin Menu
	public static String adminTab = "//div[@id='oCMenu_level4']";
	public static String general = "//div[@id='oCMenu_level02']";
	public static String auditLog = "//div[@id='oCMenu_level000']";
	public static String manageHierarchy = "//div[@id='oCMenu_level008']";
	public static String usageLogTab = "//div[@id='oCMenu_level001']";
	public static String hierarchySchemeTab = "//div[@id='oCMenu_level1510']";
	public static String absenceTab ="//div[@id='oCMenu_level00']";
	public static String leaveYearTab ="//div[@id='oCMenu_level4011']";
	public static String bhCalendarTab = "//div[@id='oCMenu_level003']";
	public static String bhDatesTab = "//div[@id='oCMenu_level004']";
	public static String partDayFractionsTab = "//div[@id='oCMenu_level4012']";
	public static String createAbsencePatternTab = "//div[@id='oCMenu_level4018']";
	public static String searchAbsencePatternTab ="//div[@id='oCMenu_level4017']";
	public static String assignAbsencePatternTab ="//div[@id='oCMenu_level4019']";
	public static String taskForceTab ="//div[@id='oCMenu_level47']";
	public static String taskForceBulkMappingTab ="//div[@id='oCMenu_level000']";
	public static String taskForceResendTab ="//div[@id='oCMenu_level001']";
	public static String taskForceCoverageTab ="//div[@id='oCMenu_level002']";
	public static String taskForceSummaryTab ="//div[@id='oCMenu_level004']";
	public static String taskForceTFInstancesTab ="//div[@id='oCMenu_level006']";
	public static String taskForceTFAdhocOUCTab ="//div[@id='oCMenu_level008']";
	public static String adminRulesTab ="//div[@id='oCMenu_level05']";
	public static String RuleValidatorTab ="//div[@id='oCMenu_level003']";
	public static String RuleDefaultsTab ="//div[@id='oCMenu_level001']";
	public static String adminFOSAdminTab ="//div[@id='oCMenu_level49']";
	public static String fosAdminFRWorkAreaTab ="//div[@id='oCMenu_level005']";
	public static String editHierarchyTab ="//div[@id='oCMenu_level129']";
	public static String absenceCodeOverridesTab  ="//div[@id='oCMenu_level000']";
	public static String peopleQueuesTab ="//div[@id='oCMenu_level002']";
	
	public static String rulesTab =  "//div[@class='clLevel1' and @id='oCMenu_level05']";
	public static String browseTab = "//div[@id='oCMenu_level000']";
    public static String adminTaskforceTab ="//div[@class='clLevel1' and @id='oCMenu_level47']";
	public static String adminTFuserIdTab="//div[contains(text(),'TF Userids')]";
    public static String notificationTab =" //div[@class='clLevel1' and @id='oCMenu_level48']";
	public static String mngeeEventNoticatn="//div[contains(text(),'Manage Event Notifications')]";
	public static String sickTab = "//div[@class='clLevel1' and @id='oCMenu_level06']";
	public static String sickReasonsTab = "//div[@id='oCMenu_level000']";
	public static String corporateDayTab ="//div[@id='oCMenu_level006']";
	public static String weeklyMinTab ="//input[@name='corporateDayLengthVO.weeklyMins']";
	public static String weeklyaAttendanceTab ="//input[@name='corporateDayLengthVO.weeklyAttendance']";
	public static String codeOverrides ="//div[@class='clLevel1' and @id='oCMenu_level000']";
	public static String reasonCodeTab ="//div[@class='clLevel1' and @id='oCMenu_level4013']";
	public static String refusalReasonCode ="//div[@class='clLevel1' and @id='oCMenu_level4014']";
	public static String displayCoachingTab ="//div[@class='clLevel1' and @id='oCMenu_level4015']";
	public static String modifyDisplayCoaching="//div[@class='clLevel1' and @id='oCMenu_level4016']";
	public static String attendenceTab ="//div[@id='oCMenu_level01']";
	public static String lunchDurationTab ="//div[@id='oCMenu_level001']";
	public static String attdOptions="//div[@id='oCMenu_level004']";
	public static String flexSchemes="//div[@id='oCMenu_level003']";
	public static String OrganizationTab ="//div[@class='clLevel1' and @id='oCMenu_level003']";
	public static String eOrgEventsTab ="//div[@class='clLevel1' and @id='oCMenu_level005']";
	public static String empLinkTab ="//div[@class='clLevel1' and @id='oCMenu_level006']";
	public static String employeeCalAttributesTab ="//div[@id='oCMenu_level007']";
	public static String peopleCategoryTab ="//div[@id='oCMenu_level004']";
	public static String adminIVRTab ="//div[@id='oCMenu_level03']";
	public static String resetIVRPinTab ="//div[@id='oCMenu_level002']";
	public static String iVRTab ="//div[@class='clLevel1' and @id='oCMenu_level03']";
	public static String absenceCategories="//div[@class='clLevel1' and @id='oCMenu_level000']";
	public static String absenceContacts ="//div[@class='clLevel1' and @id='oCMenu_level001']";
	public static String ivrTelNoTab ="//div[@id='oCMenu_level003']";
	public static String overtimeCodesTab ="//div[@id='oCMenu_level002']";
	public static String leaveEntitlementGroupsTab ="//div[@id='oCMenu_level129']";
	public static String corporateDayLengthTab ="//div[@id='oCMenu_level006']";
	
	
	
	//common variables
	public static String submitButton = "//input[@value='Submit']";
	public static String cloneBtn = "//input[@value='Clone']";
	public static String createBtn = "//input[@value='Create']";
	public static String saveBtn = "//input[@value='Save']";
	public static String importBtn = "//input[@value='Import']";
	public static String searchBtn = "//input[@value='Search']";
	public static String exportBtn = "//input[@value='Export']";
	public static String addBtn = "//input[@value='Add']";
	public static String editBtn = "//input[@value='Edit']";
	public static String deleteBtn = "//input[@value='Delete']";
	public static String successMsg = "//td[@class='confirmmessage']";
	public static String headTitle = "//td[@class='sectionheading2']";
	public static String findBtn = "//input[@value='Find']";
	public static String newSearchBtn = "//input[@value='New Search']";
	public static String showAllBtn = "//input[@value='Show All']";
	public static String updateBtn = "//input[@value='Update']";
	public static String ruleDefaultTab ="//div[@class='clLevel1' and @id='oCMenu_level001']";
	public static String radioBtn ="//input[@name='radio']";
	public static String submtBtn ="//input[@name='submit']";
	
	
	// Audit Log
	public static String changeClassSelect = "//select[@name='changeClass']";
	public static String submitBtn = "//input[@name='submit']";
	public static String auditLogContents = "//tr[@class='tablecontents']";
	
	//Usage Log
	public static String usedIdCol = "(//td[@title='Column Header:User ID'])";
	public static String startDateInput = "//input[@name='startDate']";
	public static String toolNameSelect = "//select[@name='toolName']";
	
	// Manage Hierarchy - Clone
	public static String hierarchySelectType = "//select[@name='type']";
	public static String hierarchySelectClone = "//select[@name='typeToClone']";
	public static String hierarchyInputClone = "//input[@name='cloneName']";
	public static String hierarchyTitle = "//tr[@class='p_title']//td";

	// Manage Hierarchy - Add New
	public static String ukExpandIcon = "(//img[@src='/images/expand.GIF'])[1]";
	public static String addNewBtn = "//input[@name='addRegion']";
	public static String hierarchyNameInput = "//input[@name='fillNewNode[0].name']";
	public static String hierarchyDescInput = "//input[@name='fillNewNode[0].nodeDesc']";
	public static String confirmMsg = "//td[@class='confirmmessageGreen']";
	public static String manageSubmitBtn = "//input[@value='Submit']";
	
	// Manage Hierarchy - Edit
	public static String editLink = "(//ul[@id='level1']//a)[1]";
	
	// Manage Hierarchy - Delete
	public static String deleteIcon = "(//ul[@id='level1']//img[@src='./images/trash.gif'])[1]";
	public static String deleteConfirmMsg = "(//td[@class='confirmmessageGreen'])[2]";
	//public static String saveBtn = "//input[@value='Save']";
	
	// Manage Hierarchy - Import
	public static String importInput = "//input[@id='filePath']";
	public static String importConfirmMsg = "(//td[@class='confirmmessageGreen'])[3]";
	
	// Manage Hierarchy - Search
	public static String searchInput = "//input[@name='searchNodeName']";
	public static String searchFoundText = "(//td//a//font)[1]";
	
	//Hierarchy Scheme
	public static String schemeNameInput = "//input[@name='schemeVO.schemeName']";
	public static String schemeDescInput = "//input[@name='schemeVO.schemeDesc']";
	public static String areaTypeSelect = "//select[@name='schemeVO.areaType']";
	public static String skillTypeSelect = "//select[@name='schemeVO.skillType']";
	public static String manageEngSchemeSelect = "//select[@name='empItem[49].value']";
	public static String manageBHCalSelect = "//select[@name='empItem[25].value']";
//	//Absence Tab
	
	public static String leaveYrDes = "//input[@name='leaveYearVO.leaveYearDesc']";
	public static String startDateTab = "//input[@name='leaveYearVO.yearStartDate']";
	public static String endDateTab = "//input[@name='leaveYearVO.yearEndDate']";
	public static String showAllBtn1 ="//input[@name='browse']";
	
	//Admin_Rules_RuleValidator tab
	public static String ruleValidatorName ="//input[@name='ruleValidatorVO.name']";
	public static String ruleValidatorClass ="//input[@name='ruleValidatorVO.ruleClass']";
	public static String ruleValidatorSelect ="//select[@name='fieldPeopleRuleVO.ruleValidator']";
	
	//Part Day Fraction Tab
	public static String durationInput ="//input[@name='partDayFractionVO.duration']";
	public static String fractionInput ="//input[@name='partDayFractionVO.fraction']";
	public static String resetBtn ="//input[@name='Reset']";
	
	//Create Absence Pattern Tab
	public static String absencePatternNameInput ="//input[@name='absencePatternName']";
	public static String descriptionInput ="//input[@name='description']";
	public static String lengthInput ="//input[@name='length']";
	public static String bookingWindowInput ="//input[@name='bookingWindow']";
	public static String endDateInput ="//input[@name='endDate']";
	public static String deletebutton ="//table[@id='searchResults']/tbody/tr/td[7]/img";
	
	//Assign Absence Pattern Tab
	public static String einInputtxt ="//input[@name='ein']";
	public static String absencePatternSelect ="//select[@name='absencePattern']";
	public static String showUnassignedSelect ="//select[@name='showUnassigned']";
	public static String absencePatternNameSelect ="//select[@name='absencePatternName']";
	public static String bookRosteredOffSelect ="//select[@name='bookRosteredOff']";
	public static String einCheckBox ="//input[@name='einCheckBox']";
	public static String anchorEffectiveDate ="//a[@name='anchorEffectiveDate']/img";
	public static String effectiveEndDate ="//input[@name='effectiveEndDate']";
	
	//TaskForce-BulkMapping Tab
	public static String einInput ="//textarea[@id='textein']";
	public static String taskForceInstanceSelect ="//select[@name='wmInstance']";
	public static String startDateBtn ="//a[@name='anchorStartDate']/img";
	public static String todayDate ="//div[@id='calDiv']/table/tbody/tr/td/center/table[2]/tbody/tr[10]/td/a";
	public static String endDateBtn ="//a[@name='anchorEndDate']/img";
	public static String startLocInput ="//input[@name='startLocation']";
	public static String finishLocInput ="//input[@name='finishLocation']";
	public static String domainInput="//input[@name='domain']";
	public static String progModeSelect="//select[@name='progressionMode']";
	public static String loanSelect="//select[@name='loan']";
	public static String homeStartSelect="//select[@name='homeStart']";
	public static String fjtfInput="//input[@name='firstJobTravelFactor']";
	public static String ljtfInput="//input[@name='lastJobTravelFactor']";
	public static String selectEmploteeRadioBtn="//input[@name='selectedEmployee']";
	public static String homePostCodeInput="//input[@name='homePostcode']";
	public static String addSuccessMsg="//form[@name='bulkMappingsForm']/table[3]/tbody/tr[6]/td/font/b";
	public static String oucInput="//input[@name='ouc']";
	public static String effectiveDateInput="//input[@name='effectiveDate']";
	public static String removeMappintBtn="(//input[@name='submit'])[2]";
	
	//TaskForce-Resend Tab
	
	public static String ein="//input[@id='textein']";
	public static String absence="//input[@name='sendAbsences']";
    public static String attendence="//input[@name='sendAttendances']";
    
    //Taskforce-TF Instances Tab
    public static String taskForceID="//input[@name='wmInstanceVO.taskForceId']";
    public static String taskForceDescription="//input[@name='wmInstanceVO.description']";
    public static String absenceServiceName="//input[@name='wmInstanceVO.absenceServiceName']";
    public static String attendenceServiceName="//input[@name='wmInstanceVO.attendanceServiceName']";
    public static String employeeServiceName="//input[@name='wmInstanceVO.employeeServiceName']";
    public static String windowLength="//input[@name='wmInstanceVO.windowLength']";
    public static String taskForceIDSelect="//select[@name='taskforceId']";
    public static String taskForceAddBtn="//form[@name='wmInstanceEditorForm']/table/tbody/tr[8]/td/input[1]";
    public static String taskForceRadioBtn="//input[@value='WMCRT']";
    
   //Taskforce-TF AdhocOUC Tab
    public static String taskForceTFAdhocOUCEin="//input[@name='wmAdhocVO.ein']";
    public static String wmPinInput="//input[@name='wmAdhocVO.wmPin']";
    public static String taskforceIDInput="//input[@name='wmAdhocVO.taskForceId']";
    public static String taskforceIDRadioBtn="//input[@name='wmAdhocVO.initialEin']";
	
	//BH Calendar
	public static String calendarInput = "//input[@name='bankHolidayCalendarVO.bhCalendarId']";
	public static String calendarDescInput = "//input[@name='bankHolidayCalendarVO.bhCalendarDescription']";
	public static String searchCalInput = "//input[@name='bankHolidayCalendarSearchCriteria.bhCalendarId']";
	
   // Absence coprporate Tab
	public static String pageTitleCorp="//td[@class='sectionheading2']";

	
	 //RuleBrowse
	public static String pageHeader ="//td[@class='sectionheading2']";
	public static String ruleIdTab ="//input[@name='fieldPeopleRuleVO.ruleId']";
	public static String ruleDescp ="//input[@name='fieldPeopleRuleVO.ruleDesc']";
	public static String defaultValueTab ="//input[@name='fieldPeopleRuleVO.defaultValue']";
	public static String ruleIdSearchTab ="//input[@name='fieldPeopleRuleSearchCriteria.ruleId']";
	public static String ruleDescptnSearchTab = "//input[@name='fieldPeopleRuleSearchCriteria.ruleDesc']";
	
		//Admin_FOS Admin_FR Work Area
	public static String hierarchySchemeSelect="//select[@id='findScheme']";
	public static String domaineSelect="//select[@id='findDomain']";
	public static String frWorkAreaInput="//input[@id='frWorkArea']";
	public static String addExchList_0="//input[@id='addExchList_0']";
	public static String addExchList_1="//input[@id='addExchList_1']";
	public static String addExchButton="//input[@name='addExchButton']";
	public static String checkBox="//input[@id='delFrwaList_0']";
	public static String viewAssociatedEINbtn="//input[@id='assEIN']";
	public static String updateSuccessMsg="//td[contains(text(),'FR Work Area updated successfully.')]";
	public static String backBtn="//input[contains(@title,'Back to FR Work Areas')]";
	public static String textART_FE="//a[contains(text(),'ART_FE')]";
	
	//Takforce TFUserID
	
	public static String taskforceIdTb ="//input[@name='wmUserIdsVO.taskForceId']";
	public static String userIDtb ="//input[@name='wmUserIdsVO.userId']";
	public static String passwordTb="//input[@name='wmUserIdsVO.password']";
	public static String adminPageHeader= "//td[@class='sectionheading2']";
	public static String userIDTaskforceTab ="//input[@name='wmUserIdsSearchCriteriaVO.taskForceId']";
	
	//Mange Event
	public static String notificationIdTab ="//input[@name='recipientId']";
	public static String manageHeaderTitle ="//td[@class='sectionheading2']";
	public static String cancelCheckBox ="//input[@name='deletedNotifications']";
	
	//Sick Reasons
	public static String reasonCode ="//input[@name='sickReasonVO.sickReasonCode']";
	public static String descriptionCode="//input[@name='sickReasonVO.sickDesc']";
	public static String sickReasonsTitle ="//td[@class='sectionheading2']";
	public static String radioSelectBtn ="//input[@name='radio' and @onclick='enablefn(\"111\")']";
	public static String sickCodeTab ="//input[@name='sickReasonSearchCriteria.sickReasonCode']";

//Admin_General_EditHierarchy
	public static String expandFirst="//img[@id='plusButton0']";
	public static String expandSecond="(//img[@id='plusButton0'])[2]";
	public static String addNewPropertyBtn="(//input[@name='addType'])[3]";
	public static String propertyName="//input[@name='nodeProperties.levelName']";
	public static String propertyDescription="//input[@name='nodeProperties.desc']";
	public static String selectAllowNull="//select[@name='nodeProperties.allowNull']";
	public static String deleteImg="//img[contains(@alt,'Deletes ARTTest')]";
	
	//Code Overrides
	public static String organizationCodeTb ="//select[@name='absenceCodeOverrideVO.organisationCode']";
	public static String roleTB ="//select[@name='absenceCodeOverrideVO.role']";
	public static String absenceT ="//select[@name='absenceCodeOverrideVO.absenceCode']";
	public static String overridableTB ="//select[@name='absenceCodeOverrideVO.overridableAbsence']";
	public static String headerTitle ="//td[@class='sectionheading2']";
	public static String organizationCodeTb1 ="//select[@name='absenceCodeOverrideSearchCriteria.organisationCode']";
	public static String roleTB1 ="//select[@name='absenceCodeOverrideSearchCriteria.role']";
	public static String overridableTabAbsence ="//select[@name='absenceCodeOverrideVO.updatedOverridableAbsence']";
	
		//Admin_Absence_AbsenceCodeOverrides
	public static String organisationCode="//select[@name='absenceCodeOverrideVO.organisationCode']";
	public static String role="//select[@name='absenceCodeOverrideVO.role']";
	public static String absenceCode="//select[@name='absenceCodeOverrideVO.absenceCode']";
	public static String overridableAbsence="//select[@name='absenceCodeOverrideVO.overridableAbsence']";
	public static String organisationCodeFind="//select[@name='absenceCodeOverrideSearchCriteria.organisationCode']";
	public static String roleFind="//select[@name='absenceCodeOverrideSearchCriteria.role']";
	public static String updatedOverridableAbsence="//select[@name='absenceCodeOverrideVO.updatedOverridableAbsence']";
	
	//Admin_General_PeopleQueue
	public static String queueName="//input[@name='peopleQueueVO.queueName']";
	public static String category="//select[@name='peopleQueueVO.category']";
	public static String queueDescription="//input[@name='peopleQueueVO.description']";
	public static String queueNameFind="//input[@name='peopleQueueSearchCriteria.queueName']";
	public static String categoryFind="//select[@name='peopleQueueSearchCriteria.category']";
	
	//Reason Codes
	public static String reasonCodeTb ="//input[@name='reasonCodeVO.reasonCode']";
	public static String reasonCodeDescpTab ="//input[@name='reasonCodeVO.reasonDesc']";
	
	//Refusal Reason Code
	public static String refReasonCode ="//input[@name='refusalReasonCodeVO.reasonCode']";
	public static String weighingReasonTab ="//input[@name='refusalReasonCodeVO.reasonWeighting']";
	public static String weighingDescTab ="//input[@name='refusalReasonCodeVO.reasonDesc']";
	public static String patternTab ="//input[@name='pattern']";
	//Admin_attendence_LunchDuration
	public static String lunchDurationMins="//input[@name='lunchDurationVO.lunchDurationMins']";
	public static String lunchDurationDesc="//input[@name='lunchDurationVO.lunchDurationDesc']";
	
		//Admin_attendence_attendenceOptions
	public static String attendenceName="//input[@id='textNameId']";
	public static String attendenceDesc="//input[@id='textDescriptionId']";
	public static String selectsendToHRId="//select[@id='selectsendToHRId']";
	public static String attendanceOptionName="//input[@name='attendanceOptionName']";
	public static String attendanceRadioBtn="//input[@name='selId']";
	
	//Admin_attendence_FlexSchemes
	public static String schemeName="//input[@name='flexibleWorkingSchemeVO.name']";
	public static String schemeDescription="//input[@name='flexibleWorkingSchemeVO.description']";
	
	//Admin organization
	public static String orgCodeTb ="//input[@name='organisationVO.organisationCode']";
	public static String orgDescTb="//input[@name='organisationVO.organisationDesc']";
	
    //Employee Links
	public static String linkNameTab ="//input[@name='employeeLinksVO.name']";
	public static String linkUrlTab ="//input[@name='employeeLinksVO.linkURL']";
	public static String OrderLinkTab ="//input[@name='employeeLinksVO.linkOrder']";
	
	//Admin_General_employeeCalAttributes
	public static String attributeName ="//input[@name='calendariseAttributeVO.attributeName']";
	public static String attributeValue ="//input[@name='calendariseAttributeVO.attributeValue']";
	public static String maxLength ="//input[@name='calendariseAttributeVO.maxLength']";
	public static String allowForever ="//input[@name='calendariseAttributeVO.allowForever']";
	
	//Admin_Genreal_QueueCategories
	public static String categoryQueueName ="//input[@name='categoryQueueVO.queueName']";
	public static String categoryDescription ="//input[@name='categoryQueueVO.description']";
	public static String searchCategoryQueueName ="//input[@name='categoryQueueSearchCriteria.queueName']";
	
		//Absence Category code
	public static String absCategoryCodeTab ="//input[@name='absenceCategoryVO.absenceCategoryCode']";
	public static String absCategogyCodeDesc="//input[@name='absenceCategoryVO.absenceCategoryDesc']";
	public static String absContactCodeTab ="//input[@name='absenceContactVO.absenceContactCode']";
	public static String absContactDescTab ="//input[@name='absenceContactVO.absenceContactDesc']";
	
		//Admin_IVR_IVR Tel No
	public static String leaveTelNo ="//input[@name='leaveTelNo']";
	public static String sickTelNo ="//input[@name='sickTelNo']";
	public static String checkBox1 ="//input[@name='eins']";
	
	public static String overtimeCode ="//input[@name='overtimeCodeVO.overtimeCode']";
	public static String overtimeCodeDesc ="//input[@name='overtimeCodeVO.overtimeDesc']";
	
	//Admin->Absence->Leave Entitlement Groups
	public static String leaveEntitlementGroups ="//input[@name='leaveEntitlementGroupVO.holidayEntitlementGroup']";
	public static String leaveEntitlementGroupsDesc ="//input[@name='leaveEntitlementGroupVO.description']";
	public static String leaveEntitlementGroupsSelect ="//select[@name='corporateDayLengthVO.holidayEntitlementGroup']";
	
	public static void findBHCalendarUtil(WebDriver driver, Properties propertiesO) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AdminPage.adminTab)));
		driver.findElement(By.xpath(AdminPage.adminTab)).click();
		driver.findElement(By.xpath(AdminPage.absenceTab)).click();
		driver.findElement(By.xpath(AdminPage.bhCalendarTab)).click();
		
		String calName = propertiesO.getProperty("bhCalName");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AdminPage.findBtn)));
		driver.findElement(By.xpath(AdminPage.findBtn)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AdminPage.searchCalInput)));
		driver.findElement(By.xpath(AdminPage.searchCalInput)).sendKeys(calName);
        driver.findElement(By.xpath(AdminPage.searchBtn)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AdminPage.searchCalInput)));
		String confirmStr = driver.findElement(By.xpath("//td[contains(text(),'"+calName+"')]")).getText();
		assertEquals(calName, confirmStr, "Unable to find the BH calendar data");
	}
}
