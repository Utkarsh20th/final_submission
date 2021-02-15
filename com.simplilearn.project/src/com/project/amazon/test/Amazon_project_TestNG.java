package com.project.amazon.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Amazon_project_TestNG {

	WebDriver driver = null;
	WebElement ele = null;
	JavascriptExecutor js = null;
	WebDriver wait;
	String exp_Quantity = null, act_Quantity = null;
	int click_count=0;

	@BeforeClass
	public void beforeClass() {
	}

	@BeforeTest
	public void instantiate_chromeDriver() {
		System.setProperty("webdriver.chrome.driver","//home//utkarsh20thgmai//Downloads//Softwares//Selenium_softwares//webdriver_chrome_driver_version83//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		js = (JavascriptExecutor) driver;

	}
	
	@Test(priority=1)
	public void amazon_homepage() {
		String url = "https://www.amazon.in/";
		driver.get(url);
		String screenshotPath = "//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.project//Project_Screenshots//Amazon_TestNG//1_Amazon_TestNG_homepage.png";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(screenshotPath));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
	
	@Test(priority=2)
	public void amazon_smileNGO() throws InterruptedException {
		ele = driver.findElement(By.xpath("//html//body//div[1]//div[5]//div[1]//div//div[1]//ul//li[5]//a"));
		ele.click();
		Thread.sleep(5000);
		
		ele = driver.findElement(By.xpath("//html//body//div[1]//div[2]//div[2]//div[1]//div//div//div//div//div[5]//div//div//div//img"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println("1. Gifing a smart device");
		String screenshotPath1 = "//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.project//Project_Screenshots//Amazon_TestNG//2_Amazon_TestNG_giftSmartDevice.png";
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot1, new File(screenshotPath1));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		ele = driver.findElement(By.xpath("//html//body//div[1]//div[2]//div[2]//div[1]//div//div//div//div//div[7]//div[2]//div//div//a//img"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		String screenshotPath2 = "//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.project//Project_Screenshots//Amazon_TestNG//3_Amazon_TestNG_NGOIndiaSTEM.png";
		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot2, new File(screenshotPath2));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		ele.click();
		
		ele = driver.findElement(By.xpath("//html//body//div[1]//div[2]//div//div//div//div//div//div[2]//div[7]//div//div//ul//li[3]//span//div//div//div//div[2]//div[3]//div//div[1]//div//div[1]//div[1]//h3//a"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		String screenshotPath3 = "//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.project//Project_Screenshots//Amazon_TestNG//4_Amazon_TestNG_product_view.png";
		File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot3, new File(screenshotPath3));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		ele = driver.findElement(By.xpath("//html//body//div[1]//div[2]//div//div//div//div//div//div[2]//div[7]//div//div//ul//li[3]//span//div//div//div//div[2]//div[3]//div//div[2]//div//span//span[1]//span//a"));
		ele.click();
		click_count++;
		exp_Quantity = String.valueOf(click_count);
		Thread.sleep(2000);
		
	}
	
	@Test(priority=3)
	public void amazon_subCart() {
		System.out.println("2. We are on page: "+driver.getTitle());
		
		act_Quantity = driver.findElement(By.xpath("//html//body//div[1]//div//div[3]//div[2]//div[1]//div//div//div[3]//div//div//div//div[1]//div[1]//span//span[1]")).getText();
		if(act_Quantity.contains(exp_Quantity)) {
			System.out.println("3. Quantity matched: ["+act_Quantity+"]");
			
		}
		String screenshotPath = "//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.project//Project_Screenshots//Amazon_TestNG//5_Amazon_TestNG_quantity_match.png";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(screenshotPath));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		ele = driver.findElement(By.xpath("//html//body//div[1]//div//div[3]//div[2]//div[1]//div//div//div[4]//div//div//div//span[2]//span//a"));
		ele.click();

	}
	
	@Test(priority=4)
	public void amazon_buy() throws InterruptedException {
		System.out.println("4. Now we have to sign-in to buy");
		ele = driver.findElement(By.xpath("//html//body//div[1]//div[1]//div[2]//div//div[2]//div//div[1]//form//div//div//div//div[1]//input[1]"));
		ele.sendKeys("please enter [EmailID]");
		String screenshotPath = "//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.project//Project_Screenshots//Amazon_TestNG//6_Amazon_TestNG_signInToBuy.png";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(screenshotPath));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(5000);

	}

	@AfterTest
	public void afterTest() {
		System.out.println("5. Closing web browser and driver");
		driver.close();
		
	}

}
