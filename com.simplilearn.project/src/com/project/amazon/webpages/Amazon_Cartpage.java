package com.project.amazon.webpages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import com.project.amazon.webpages.Product_MarioGame;

public class Amazon_Cartpage {
	
	private static WebElement ele1 =null, ele2 = null;
	private static JavascriptExecutor js = null;
	
	public static void cartpage(WebDriver driver) throws InterruptedException {
		
		js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		
		//ele1 = driver.findElement(By.xpath("//html//body//div[1]//div[4]//div//div[7]//div//div[2]//div[2]//div//form//div[3]//span[1]"));
		ele1 = driver.findElement(By.id("sc-subtotal-label-activecart"));
		js.executeScript("arguments[0].scrollIntoView();", ele1);
		String act_Quantity = ele1.getText();
		if (act_Quantity.contains(Product_MarioGame.exp_Quantity)==true) {
			System.out.println("Ordered quantity: "+act_Quantity);
			System.out.println("Same quantity is displayed -- Verified");
			String screenshotPath = "//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.project//Project_Screenshots//Amazon_Test/3_Amazon_Cartpage_same_quantity.png";
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(screenshot, new File(screenshotPath));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
			
		}
		else {
			System.out.println("Terminate  -- quantity not matched!!!");
			driver.quit();
			System.exit(-1);
			
		}
		
		
		
		ele2 = driver.findElement(By.name("proceedToRetailCheckout"));
		js.executeScript("arguments[0].scrollIntoView();", ele2);
		Thread.sleep(2000);
		ele2.click();
		Thread.sleep(2000);
		String exp_title = "Amazon Sign In";
		String act_title = driver.getTitle();
		if (act_title.equalsIgnoreCase(exp_title)==true) {
			System.out.println("Sign In page opened");
			
		}
		else {
			System.out.println("Terminate -- unexpected page opened!!!");
			driver.quit();
			System.exit(-1);
			
		}
		
	}

}
