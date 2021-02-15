package com.project.amazon.test;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.project.amazon.webpages.*;

public class TestDriverClass {

	static int browser_choice = 0;
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		// Invoking appropriate web browser
		System.out.println("Web browser chosen: Chrome");
		System.setProperty("webdriver.chrome.driver","//home//utkarsh20thgmai//Downloads//Softwares//Selenium_softwares//webdriver_chrome_driver_version83//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Amazon_Homepage.homepage(driver);
		Product_MarioGame.productpage(driver);
		Amazon_Cartpage.cartpage(driver);
		Amazon_SignIn.signIn(driver);

	}

}
