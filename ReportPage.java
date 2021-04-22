package com.bt.fp.fos.ObjectRepository;

public class ReportPage {

	// menu
	public static String reportstab = "//div[@id= 'oCMenu_level2']";
	public static String attendancefield ="//div[@id='oCMenu_level01']";
	public static String dpam_field = "//div[@id='oCMenu_level000']"; 
	public static String dpam_weekly = "//div[@id='oCMenu_level001']";
	public static String dabs_field = "//div[@id='oCMenu_level002']";
	public static String dprp_field = "//div[@id='oCMenu_level003']";
	public static String sign_on_sign_off_report_field = "//div[@id='oCMenu_level004']";
    public static String flex_balances_field ="//div[@id='oCMenu_level005']";	
    public static String shrinkage_field ="//div[@id='oCMenu_level006']";
    public static String WTR_report = "//div[\"id='oCMenu_level007']";
    public static String leave_appeal_report ="//div[''id='oCMenu_level008']";
    public static String absenceTab = "//div[@id='oCMenu_level00']";
    public static String datuTab = "//div[@id='oCMenu_level000']"; 
	public static String attrDatuTab = "//div[@id='oCMenu_level001']";
	public static String balanceSummaryTab = "//div[@id='oCMenu_level002']";
	public static String partDaySickTab = "//div[@id='oCMenu_level003']";
	public static String startDateIcon = "//img[@src='/images/date.gif'][1]";
	public static String endDateIcon = "(//img[@src='/images/date.gif'])[2]";
	public static String currentDateClick = "//td[@class='cpCurrentDate']//a[@class='cpCurrentDate']";
	public static String securityTab ="//div[@class='clLevel1' and @id='oCMenu_level03']";
	public static String loginAttemptsTab = "//div[@class='clLevel1' and @id='oCMenu_level000']";
	public static String usersforRuleTab ="//div[@class='clLevel1' and @id='oCMenu_level001']";
	public static String resourcesTab ="//div[@class='clLevel1' and @id='oCMenu_level002']";
	public static String repEmployeeTab = "//div[@class='clLevel1' and @id='oCMenu_level02']";
	public static String skillPWATab ="//div[@class='clLevel1' and @id='oCMenu_level000']";
	public static String empPassReportTab ="//div[@class='clLevel1' and @id='oCMenu_level001']";
	public static String empCalSkillTab ="//div[@class='clLevel1' and @id='oCMenu_level002']";
	public static String resourceReportTab ="//div[@id='oCMenu_level002']";
	// common variables
	public static String submitBtn1 ="//input[@value='Submit']";
	

	// DPAM Reports
	public static String OUC_field = "//input[@name='ouc']";
	public static String EINs_field = "//textarea[@id='einField']";
	public static String submitbutton = "//input[@class='buttonStyle']";
	public static String reportMsg = "//td[contains(text(),'Name')]";
	
	// DPAM Weekly
	public static String OUC_field1 = "//input[@name='ouc']";
	public static String EINs_field1 = "//textarea[@id='einField']";
	public static String submitbutton1 = "//input[@class='buttonStyle']";
	public static String reportMsg2 = "//td[contains(text(),'OUC: TAWD')]";
	
	// DABS
	public static String OUC_field2 = "//input[@name='ouc']";
	public static String submitbutton2 = "//input[@type='submit']";
	public static String reportMsg1 = "//td[contains(text(),'TAWD')]";
	
	// Sign In Sign OFF
	public static String EIN_field3 = "//input[@name='ein']";
	public static String submitbutton3 = "//input[@type='submit']";
	public static String reportMsg4 = "//td[contains(text(),'TAWD%')]";
	
	// Shrinkage
	public static String OUC_field3 = "//input[@name='ouc']";
	public static String submitbutton4 = "//input[@type='submit']";
	
	// Flex Balances
	public static String ein_field4 = "//input[@id='textein']";
	public static String generateReport = "//input[@name='GenerateReport']";
	
	// Absence Reports
	public static String leaveGroupInput = "//input[@name='leaveGroupName']";
	public static String submitBtn = "//input[@value='Submit']";
	public static String oucColumn = "(//td[@title='Column Header: OUC'])[1]";

  //Security Reports
    
    public static String einFiledTab = "//input[@name='logonAttemptCriteriaVO.userId']";
    public static String generateReportTab ="//input[@name='GenerateReport']";
    public static String einResourceField ="//input[@name='resourcesReportCriteriaVO.userId']";
    public static String generateReportTab1 ="//input[@value='Generate Report']";
    
}
