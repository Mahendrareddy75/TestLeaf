package com.TestLeaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hyperLink {
  @Test
  public void Hyperlinktest() {
	  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();

      d1.get("http://www.leafground.com/");
      d1.findElement(By.xpath("//a[@href='pages/Link.html']")).click();
      
     
      List<WebElement> links=d1.findElements(By.tagName("a"));
      System.out.println(links.size());
      
      d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).click();
      d1.findElement(By.xpath("//a[@href='pages/Link.html']")).click();
      d1.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
      d1.findElement(By.id("home")).click();
      d1.findElement(By.xpath("//a[@href='pages/Link.html']")).click();
      
      d1.findElement(By.cssSelector("a[href^=\"error.html\"]")).click();
      d1.navigate().back();
      
      d1.findElement(By.linkText("Go to Home Page")).click();
      
      d1.close();
  }
}
