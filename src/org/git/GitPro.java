package org.git;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GitPro {



		public static void main(String[] args) throws AWTException  {
			System.setProperty("webdriver.chrome.driver", "D:\\tina\\softesting\\Locators\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/ ");
			driver.manage().window().maximize();
			Actions a=new Actions(driver);
			Robot r=new Robot();
			
			 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
				WebElement c=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
				c.sendKeys("agmail.com");
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_A);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_A);
				a.contextClick(c).perform();
				for (int i = 0; i < 4; i++) {
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
						}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
		}}

