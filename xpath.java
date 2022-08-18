package com.Selenium.org;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpath {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Velu\\eclipse-workspace\\Seleniumexample\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");	
		 findElement(By.xpath("//button[@onclick='normalAlert()']")).sendkeys("asvdd@gamil")  ;                                                                                                                                                                                                                                                                                                                                                                       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Object findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
