package com.TestLeaf;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class waitstest {
  @Test
  public void OrangeHrm() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahen\\Documents\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();

	

      d1.get("https://opensource-demo.orangehrmlive.com/");
      d1.manage().window().maximize();
      d1.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
      d1.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
      d1.findElement(By.xpath("//input[@id='btnLogin']")).click();
      Actions act=new Actions(d1);
      WebElement eleone=  d1.findElement(By.xpath("//b[contains(text(),'Admin')]"));
    WebElement eletwo=  d1.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
    WebElement elethree=  d1.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
    
    
    act.moveToElement(eleone).perform();
    act.moveToElement(eletwo).perform();
    act.moveToElement(elethree).click().perform();
 
    Wait<WebDriver> wait = new FluentWait<WebDriver>(d1)   
    	    .withTimeout(30, TimeUnit.SECONDS)    
    	    .pollingEvery(5, TimeUnit.SECONDS)   
    	    .ignoring(NoSuchElementException.class);
    WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
    	public WebElement apply(WebDriver d1) {
    		return d1.findElement(By.xpath("//input[@id='searchSystemUser_userName'"));
    	}
    });
    
    //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='searchSystemUser_userName'")));
    
    Select boxone=new Select(d1.findElement(By.xpath("//select[@id='searchSystemUser_userType']")));
    boxone.selectByIndex(2);
      
  }
}
