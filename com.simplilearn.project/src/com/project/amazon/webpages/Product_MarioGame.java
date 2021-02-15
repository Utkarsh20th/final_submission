package com.project.amazon.webpages;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.project.amazon.webpages.*;

public class Product_MarioGame {
	
	private static int i=0;
	private static String product1 = "Super Mario Odyssey (Switch)", window1 = null, window2 = null; //iphone 12 gold
	public static String exp_Quantity = null;
	private static JavascriptExecutor js = null;
	private static WebElement ele1 = null, ele2 = null, ele3 = null, ele4 = null, ele5 = null, ele6 = null, ele_6 = null, ele7 = null;
	
	public static void productpage(WebDriver driver) throws InterruptedException {
		
		js = (JavascriptExecutor) driver;
		
		
		
		ele1 = driver.findElement(By.id("twotabsearchtextbox"));
		ele1.sendKeys(product1);
		Thread.sleep(2000);
		String screenshotPath = "//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.project//Project_Screenshots//Amazon_Test//2_Product_MarioGame_search.png";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(screenshotPath));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        ele1.sendKeys(Keys.ENTER);
		
		
		
		String exp_title = "Amazon.in : Super Mario Odyssey (Switch)";      //Amazon.in : iphone 12 gold
		String act_title = driver.getTitle();
		if (act_title.equalsIgnoreCase(exp_title)) {
			System.out.println("Correct product page ["+product1+"] is clicked -- Verified");
			
		}
		Thread.sleep(2000);
		window1 = driver.getWindowHandle();
		System.out.println("Window 1 = "+window1);
		
		
		
		ele2 = driver.findElement(By.xpath("//html//body//div[1]//div[2]//div[1]//div[2]//div//span[3]//div[2]//div[1]//div//span//div//div//div[2]//h2//a//span"));         //"//html//body//div[1]//div[2]//div[1]//div[2]//div//span[3]//div[2]//div[2]//div//span//div//div//div[2]//div[2]//div//div[1]//div//div//div[1]//h2//a//span"
		js.executeScript("arguments[0].scrollIntoView();", ele2);
		ele2.click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		Iterator loop = windows.iterator();
		while(loop.hasNext()) {
			driver.switchTo().window((String) loop.next());
		}
		window2 = driver.getWindowHandle();
		System.out.println("Switched to Window 2 = "+window2);
		
		
		
		//ele3 = driver.findElement(By.xpath());      //"//html//body//div[4]//div[2]//div[2]//div[10]//div[3]//div//h1//span"
		//ele3 = driver.getTitle();
		String exp_msg = "Super Mario Odyssey (Switch): Amazon.in: Video Games";    //New Apple iPhone 12 Pro Max (256GB) - Gold
		String act_msg = driver.getTitle();               //ele3.getText();
		System.out.println("Product fetched: "+act_msg);
		if (act_msg.equalsIgnoreCase(act_msg)) {
			System.out.println("Correct product ["+product1+"] is selected -- Verified");
			if (window1 != window2) {
				System.out.println("Product ["+product1+"] is displayed in new window");
				
			}			
		}
		else {
			System.out.println("Terminate -- Incorrect product displayed!!!");
			driver.quit();
			System.exit(-1);
			
		}
		Thread.sleep(2000);
		
		
		
		ele4 = driver.findElement(By.id("add-to-cart-button"));
		js.executeScript("arguments[0].scrollIntoView();", ele4);
		ele4.click();
		i++;
		exp_Quantity = String.valueOf(i);
		Thread.sleep(2000);
		//ele5 = driver.findElement(By.xpath("//html//body//div[4]//div[2]//div[2]//div[7]//div[3]//div//div[1]//div//div//div[1]//div[3]//div[1]//div[2]//div[1]//div[1]//span[1]//span"));
		//System.out.println("Is sidesheet displayed: "+ele5.isDisplayed());
		//Thread.sleep(2000);
		
		
		//move to cart
		ele_6 = driver.findElement(By.id("hlb-view-cart-announce"));
     // js.executeScript("arguments[0].scrollIntoView();", ele6);
		ele_6.click();
		Thread.sleep(2000);
		System.out.println("Cart button clicked");
		
		
		
		//verify cart page
		String exp_cart_msg = "Amazon.in Shopping Cart";
		String act_cart_msg = driver.getTitle();
		if (act_cart_msg.equalsIgnoreCase(exp_cart_msg)==true) {
			System.out.println("Successfully entered to cart page");
			
		}
			
		}		
		
	}
