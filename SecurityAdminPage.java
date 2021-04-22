package com.bt.fp.fos.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecurityAdminPage {

	//menu
	public static String secAdminTab = "//div[@id='oCMenu_level3_0']";
	public static String profileTab = "//div[@id='oCMenu_level02']";
	public static String manageTab = "//div[@id='oCMenu_level000']";
	public static String securityAdminResourceTab = "//div[@id='oCMenu_level03']";
	public static String userTab ="//div[@id='oCMenu_level00']";
	public static String userFinderTab ="//div[@id='oCMenu_level000']";
	public static String roleTab ="//div[@id='oCMenu_level04']";

	//common variables
	public static String headTitle = "//td[@class='sectionheading2']";
	public static String addButton = "//input[@value='Add']";
	public static String saveButton = "//input[@value='Save']";
	public static String confirmRedMsg = "//span[@class='confirmmessage']";
	public static String findButton = "//input[@value='Find']";
	public static String searchButton = "//input[@value='Search']";
	public static String editButton = "//input[@value='Edit']";
	public static String deleteButton = "//input[@value='Delete']";
	public static String cloneButton = "//input[@value='Clone']";
	public static String updateButton = "//input[@value='Update']";
	public static String editResourceBtn = "//input[@value='Edit Resource Mapping']";
	public static String newSearchBtn = "//input[@value='New Search']";
	//Profile
	public static String profileNameInput = "//input[@name='profileVO.profileName']";
	public static String profileDescInput = "//input[@name='profileVO.profileDescription']";
	public static String selectAllCheck = "//input[@name='selectAll']";
	public static String findNameInput = "//input[@name='criteria.profileName']";
	public static String radioCheck = "(//input[@name='radio'])[1]";
	public static String roleSelect = "//select[@name='profileVO.resourceVOObj[1].roleId']";
	
	//SecurityAdmin-Resource-Manage tab
	public static String resourceName ="//input[@name='resourceVO.name']";
	public static String resourceURL ="//input[@name='resourceVO.resourceURL']";
	public static String resourceDescription ="//input[@name='resourceVO.description']";
	public static String menuLevelSelect ="//select[@name='resourceVO.menuId']";
	public static String resourceNameFind ="//input[@name='criteria.name']";
	public static String selectBox ="//input[@id='option0']";
	public static String exportBtn ="(//input[@name='Find'])[2]";
	
	//SecurityAdmin-User-User Finder
	public static String einInput ="//input[@id='textein']";
	public static String generateReport ="//input[@name='GenerateReport']";
	public static String checkBox ="//input[@id='checked0']";
	public static String generateNewReport ="//input[@name='GenerateNewReport']";
	public static String resourceException ="//input[@name='ResourceException']";
	public static String accessLevelSelect ="//select[@name='resourceVOObj[13].roleId']";
	public static String saveBtn ="//input[@id='save']";
	
	public static void findProfileUtil(WebDriver driver, WebDriverWait wait, String profileName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SecurityAdminPage.findButton)));
		driver.findElement(By.xpath(SecurityAdminPage.findButton)).click();
		driver.findElement(By.xpath(SecurityAdminPage.findNameInput)).sendKeys(profileName);
		driver.findElement(By.xpath(SecurityAdminPage.searchButton)).click();
	}
	
	public static String roleNameTab ="//input[@name='roleVO.roleName']";
	public static String roleDescriptionTab ="//input[@name='roleVO.roleDescription']";
	public static String successMsg="//span[@class='confirmmessage']";
	public static String roleAccessName ="//input[@name='criteria.roleName']";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
