package com.bt.fp.fos.ObjectRepository;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public static String employeeTab = "//div[@id='oCMenu_level0']";
	public static String persons = "//div[@id='oCMenu_level00']";
	public static String absence = "//div[@id='oCMenu_level01']";
	public static String book = "//div[@id='oCMenu_level000']";
	public static String cancel = "//div[@id='oCMenu_level001']";
	public static String absenceSummary = "//div[@id='oCMenu_level003']";
	public static String absenceDetails = "//div[@id='oCMenu_level004']";
	public static String attendance = "//div[@id='oCMenu_level02']";
	public static String sick = "//div[@id='oCMenu_level03']";
	public static String report = "//div[@id='oCMenu_level000']";
	public static String returnToWork = "//div[@id='oCMenu_level001']";
	public static String manageAttendance = "//div[@id='oCMenu_level000']";
	public static String manageOverTime = "//div[@id='oCMenu_level002']";
	public static String skills = "//div[@id='oCMenu_level05']";
	public static String locations =  "//div[@id='oCMenu_level06']";
	public static String preferences = "//div[@id='oCMenu_level000']";
	public static String calPreferences = "//div[@id='oCMenu_level001']";
	public static String qwickPWATab = "//div[@id='oCMenu_level003']";
	public static String find = "//div[@id='oCMenu_level000']";
	public static String manage = "//div[@id='oCMenu_level001']";
	public static String einField = "//input[@id='textein']";
	public static String findButton = "//input[@name='browseEmployeesSubmitParms']";
	public static String content_NoData = "//tr[@class='tablecontents']//td";
	public static String taskforce = "//div[@id='oCMenu_level005']";
	public static String attendanceCalendar = "//div[@id='oCMenu_level001']";
	public static String sickSummary = "//div[@id='oCMenu_level002']";
	public static String bulkTab = "//div[@id='oCMenu_level04']";
	public static String assignAttrTab = "//div[@id='oCMenu_level003']";
	public static String assignSkillsTab = "//div[@id='oCMenu_level004']";
	
	public static void verifyFindFunctionality(WebDriver driver, String ein) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(employeeTab)));
		
		driver.findElement(By.xpath(employeeTab)).click();
		driver.findElement(By.xpath(persons)).click();
		driver.findElement(By.xpath(find)).click();
		driver.findElement(By.xpath(einField)).sendKeys(ein);
		driver.findElement(By.xpath(findButton)).click();
	}
	
	public static void searchEinToManage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(employeeTab)));
		
		driver.findElement(By.xpath(employeeTab)).click();
		driver.findElement(By.xpath(persons)).click();
		driver.findElement(By.xpath(manage)).click();
	}
	
	public static void manageSkillPreferences(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(employeeTab)));
		
		driver.findElement(By.xpath(employeeTab)).click();
		driver.findElement(By.xpath(skills)).click();
		driver.findElement(By.xpath(preferences)).click();
	}
	
	public static void managePWAPreferences(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(employeeTab)));
		
		driver.findElement(By.xpath(employeeTab)).click();
		driver.findElement(By.xpath(locations)).click();
		driver.findElement(By.xpath(preferences)).click();
	}
	
	public static void manageAttendance(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(employeeTab)));
		
		driver.findElement(By.xpath(employeeTab)).click();
		driver.findElement(By.xpath(persons)).click();
		driver.findElement(By.xpath(manage)).click();
	}
	
	public static String getDateByDaysCount(int daysCount) {
		//To find any custom date by days count in the format of dd-MMM-yyyy
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY,0);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);
		c.add(Calendar.DATE, daysCount);
		
		Date customDay = c.getTime();
		String customDate = new SimpleDateFormat("dd-MMM-yyyy").format(customDay);
		System.out.println("customDate : " + customDate);
		return customDate;
	}
}
