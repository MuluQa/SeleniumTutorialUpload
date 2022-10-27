package seleniumPackage;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_Class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://ect.itlearn360.com/customer/login");
		
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[2]/a")).click();
		
	    driver.findElement(By.name("email")).sendKeys("training@infotek-solutions.com");
	    
		driver.findElement(By.name("password")).sendKeys("Test1234$");
		
		driver.findElement(By.id("customerloginForm")).click();
		
		Thread.sleep(3000);
	
		
		}
}
