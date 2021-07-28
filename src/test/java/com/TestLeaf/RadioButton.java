package com.TestLeaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
  @Test
  public void RadioButtontest() throws InterruptedException {
	  
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();

      d1.get("http://www.leafground.com/");
      d1.findElement(By.linkText("Radio Button")).click();
     
      List<WebElement> radiobuttons=d1.findElements(By.xpath("//input[@type='radio']"));
      System.out.println(radiobuttons.size());
      
      d1.findElement(By.id("yes")).click();
      d1.findElement(By.id("no")).click();
      
      d1.findElement(By.xpath("//input[@value='0' and @name='news']")).click();
      Thread.sleep(2000);
      d1.findElement(By.xpath("//input[@value='1' and @name='news']")).click();
      Thread.sleep(2000);
      d1.findElement(By.xpath("//input[@value='0' and @name='age']")).click();
      Thread.sleep(2000);
      d1.findElement(By.xpath("//input[@value='1' and @name='age']")).click();
      Thread.sleep(2000);
      d1.findElement(By.xpath("//input[@value='2' and @name='age']")).click();
      
      d1.close();
      
      
      
      
  }
}
