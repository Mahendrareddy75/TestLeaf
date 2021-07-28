package com.TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {
  @Test
  public void checkButton() {
  
	  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();

      d1.get("http://www.leafground.com/");
      d1.findElement(By.xpath("//a[@href='pages/Button.html']")).click();
      d1.findElement(By.id("home")).click();
      
      d1.findElement(By.xpath("//a[@href='pages/Button.html']")).click();
      
    WebElement s1=  d1.findElement(By.xpath("//button[@id='position']"));
    System.out.println(s1.getText());
      
      
     // String buttoncolor=d1.findElement(By.id("color")).getCssValue("background-color:lightgreen");
      //System.out.println("button color: "+buttoncolor);
    		  
    		  
    		
  }
}
