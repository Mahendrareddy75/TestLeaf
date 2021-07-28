package com.TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit {
  @Test
  public void EditFields() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();

      d1.get("http://www.leafground.com/");
      d1.findElement(By.linkText("Edit")).click();
      d1.findElement(By.id("email")).sendKeys("mahendra@gmail.com");
      d1.findElement(By.cssSelector("input[value='Append ']")).clear();
      d1.findElement(By.cssSelector("input[value='Append ']")).sendKeys("selenium");
      d1.findElement(By.xpath("//input[@name='username']")).clear();
      d1.findElement(By.xpath("//input[@name='username']")).sendKeys("TestNG");
      d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
      d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).sendKeys("webdriver");
      
      WebElement Textbox = d1.findElement(By.xpath("//input[@disabled='true']"));
      System.out.println("The checkbox is selection state is - " + Textbox.isSelected());
      
    
      d1.close();
      
      
  
  }
}
