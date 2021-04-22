package com.bt.fp.fos.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bt.fp.fos.Utility.SetUpConfig;

public class LoginPage extends SetUpConfig {
	private WebDriver driver;
	public static final String usernameField = "//input[@name='userId']";
	public static final String passwordField = "//input[@name='password']";
	public static final String loginButton = "//input[@name='Submit']";
	public static final String yesButton = "//input[@name='Submit']";
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}

	public void login_FP() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usernameField)));
		driver.findElement(By.xpath(usernameField)).sendKeys(uname);
		System.out.println("Username entered.......");
		driver.findElement(By.xpath(passwordField)).sendKeys(pword);
		System.out.println("Password entered.......");
		driver.findElement(By.xpath(loginButton)).click();
		System.out.println("Clicked on Sign in button.......");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(yesButton)));
		driver.findElement(By.xpath(yesButton)).click();
		System.out.println("Clicked on Yes button.......");
	}
}