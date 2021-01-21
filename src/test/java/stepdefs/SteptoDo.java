package stepdefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import core.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SteptoDo 
{
	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehal\\Documents\\NVIDIA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.get("https://www.newegg.com/NVIDIA/BrandStore/ID-1441");
	    WebElement southAmericaFlag=driver.findElement(By.xpath("//div[@class='react-slidedown']//ul//li[4]"));
		southAmericaFlag.click();
		
		WebElement UnitedState=driver.findElement(By.xpath("//div[text()='United States']"));
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(UnitedState));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", UnitedState);
	    
	    
	    driver.findElement(By.xpath("//button[@class='btn']")).click();
	   
	    
	    WebElement GEForce=driver.findElement(By.id("tb_id109"));	
	    JavascriptExecutor executor3 = (JavascriptExecutor) driver;
	    executor3.executeScript("arguments[0].click()",GEForce);
	   
	    
	    
	    List<WebElement> itemtitles=driver.findElements(By.xpath("//a[@class='itemTitle']"));
	    
	    for (int i=0;i<itemtitles.size();i++) 
	    {
	    	System.out.println(itemtitles.get(i).getText());
           
	    }
	    
	}

	

	
	}
