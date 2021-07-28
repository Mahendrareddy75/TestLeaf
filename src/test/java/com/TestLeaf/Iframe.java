package com.TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Iframe {
  @Test
  public void frame() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();

      d1.get("http://www.leafground.com/");
     
      d1.findElement(By.xpath("//a[@href='pages/frame.html']")).click();
      d1.switchTo().frame(0);
      d1.findElement(By.id("Click")).click();
      d1.switchTo().defaultContent();
      WebDriverWait var_wait=new WebDriverWait(d1,20);
      var_wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/iframe[1]")));
      //var_wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[1]/iframe[1]"));
    
      d1.switchTo().frame("frame2");
      d1.findElement(By.xpath("//button[@id='Click1']")).click();
  }
}
