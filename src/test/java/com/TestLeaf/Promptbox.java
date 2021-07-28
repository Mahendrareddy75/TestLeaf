package com.TestLeaf;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Promptbox {
  @Test
  public void pbox() throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();

      d1.get("https://demoqa.com/alerts");
      d1.findElement(By.id("promtButton")).click();
  Alert alert=d1.switchTo().alert();
  Thread.sleep(4000);
      alert.sendKeys("HI");
  }
}
