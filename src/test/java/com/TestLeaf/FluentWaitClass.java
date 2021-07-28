package com.TestLeaf;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class FluentWaitClass {
  @Test
  public void FluentWait() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();

	

	  d1.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
	  d1.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
	  
	  
	  FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d1)
	         .withTimeout(30, TimeUnit.SECONDS)
	         .pollingEvery(5, TimeUnit.SECONDS)
	         .ignoring(NoSuchElementException.class);
	  
	  WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	  public WebElement apply(WebDriver d1) {
	  WebElement element = d1.findElement(By.xpath("//p[@id='demo']"));
	  String getTextOnPage = element.getText();
	  if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
	  System.out.println(getTextOnPage);
	  return element;
	  }else{
	  System.out.println("FluentWait Failed");
	  return null;
	  }
	  }
	  });
	  }
	 }
