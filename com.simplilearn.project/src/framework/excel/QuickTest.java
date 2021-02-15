package framework.excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","//home//utkarsh20thgmai//eclipse-workspace//com.simplilearn.phase1.project//Libraries//webdriver_chrome_driver_version83//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
