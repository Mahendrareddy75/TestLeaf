package com.TestLeaf;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Aleart {
  @Test
  public void alerttest() throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();

      d1.get("http://www.leafground.com/");
      d1.findElement(By.xpath("//a[@href='pages/Alert.html']")).click();
      
      d1.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();
     System.out.println( d1.switchTo().alert().getText());
     d1.switchTo().alert().accept();
      
      d1.findElement(By.xpath("//button[contains(text(),'Confirm Box')]")).click();
      d1.switchTo().alert().dismiss();
      
     // d1.findElement(By.xpath("//button[contains(text(),'Prompt Box')]")).click();
      d1.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
      
      
      Alert alert=d1.switchTo().alert();
     
      
      Thread.sleep(2000);
      alert.sendKeys("HI");
      
      
     // alert.accept();
        
  }
}
