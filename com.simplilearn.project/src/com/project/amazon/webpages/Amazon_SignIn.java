package com.project.amazon.webpages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_SignIn {
	
	private static WebElement ele1 = null;
	
	public static void signIn(WebDriver driver) throws InterruptedException {
		
		
		ele1 = driver.findElement(By.id("ap_email"));
		ele1.sendKeys("Please enter (EmailID) or create (New Account)!");
		
		String screenshotPath = "//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.project//Project_Screenshots//Amazon_Test/4_Amazon_SignIn_Screenshot.png";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(screenshotPath));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		
		Thread.sleep(5000);
		System.out.println("Exiting from Sign-In page");
		driver.quit();
		
	}

}
