package com.project.amazon.webpages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.project.amazon.test.TestDriverClass;

public class Amazon_Homepage {

	public static void homepage(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.amazon.in/");
		
		String exp_title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String act_title = driver.getTitle();
		
		if (act_title.equalsIgnoreCase(exp_title)==true) {
			System.out.println("Welcome to Amazon Homepage");
			System.out.println("Correct homepage is clicked -- Verified");
			
			String screenshotPath = "//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.project//Project_Screenshots//Amazon_Test//1_Amazon_Homepage_Screenshot.png";
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(screenshot, new File(screenshotPath));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
			
		}		
		else {
			System.out.println("Terminate -- Incorrect webpage clicked!!!");
			driver.quit();
			System.exit(-1);
			
		}
		

	}

}
