package com.TestLeaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
  @Test
  public void Checkboxtest() throws InterruptedException {
	  
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();

      d1.get("http://www.leafground.com/");
      d1.findElement(By.cssSelector("a[href='pages/checkbox.html']")).click();
     
      
    /*  List<WebElement> cbox = d1.findElements(By.xpath("//input[@type='checkbox']"));
      for ( WebElement el : cbox ) {
          if ( el.isSelected() ) {
              el.click();
          }
      }
      System.out.println(cbox.size());
      Thread.sleep(2000);*/
     
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")).click();
    d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
    
    
    d1.close();
  }
}
