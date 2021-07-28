package com.TestLeaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListBox {
  @Test
  public void Dropdown() throws InterruptedException {
	  
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();

      d1.get("http://www.leafground.com/");
      d1.findElement(By.cssSelector("a[href='pages/Dropdown.html']")).click();
      
      Select boxone=new Select(d1.findElement(By.id("dropdown1")));
      boxone.selectByIndex(2);
     
      Select boxTwo=new Select(d1.findElement(By.xpath("//Select[@name='dropdown2']")));
      boxTwo.selectByVisibleText("Loadrunner");
      
      //Select boxfour=new Select(d1.findElement(By.xpath("//select[@id='dropdown3' and @name='dropdown3']")));
      
      
      
    Select boxthree=new Select(d1.findElement(By.cssSelector("select.dropdown")));
       boxthree.selectByValue("2");
      
      Select boxfour=new Select(d1.findElement(By.xpath("//*[@class='dropdown']")));
      boxfour.deselectByValue("Selenium");
      
      Select boxfive=new Select(d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]")));
      boxfive.selectByIndex(3);
      Boolean bool=boxfive.isMultiple();
      System.out.println(bool);
      //boxfive.selectByIndex(1);
      //boxfive.selectByValue("Appium");
      
      
      
      
      
      
  }
  
}
