package com.TestLeaf;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windows {
  @Test
  public void WindowsTest() {
	  
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      d1.get("http://www.leafground.com/");
      d1.findElement(By.xpath("//a[@href='pages/Window.html']")).click();
      d1.manage().window().maximize();
      Dimension dim =new Dimension(200,300);
      d1.manage().window().setSize(dim);
      d1.navigate().back();
      d1.navigate().forward();
      d1.navigate().refresh();
      d1.findElement(By.xpath("//button[@id='home']")).click();
     Set<String> win_hndl= d1.getWindowHandles();
     Iterator<String> itr=win_hndl.iterator();
     String w1=itr.next();
     String w2=itr.next();
     System.out.println(w1);
     System.out.println(w2);
     d1.switchTo().window(w2);
     System.out.println(d1.getTitle());
     
     System.out.println(d1.getCurrentUrl());
     
   d1.quit();
  }
}
