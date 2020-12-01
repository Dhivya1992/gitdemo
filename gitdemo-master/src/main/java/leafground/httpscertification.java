package leafground;
 import org.openqa.selenium.remote.HttpSessionId;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class httpscertification {

	public static void main(String[] args)
	{
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
     driver.get("http://www.leafground.com/");
     driver.findElement(By.xpath("//h5[text()='Drop down']")).click();
     WebElement dropdown = driver.findElement(By.id("dropdown1"));
     Select sel = new Select(dropdown);
     sel.selectByIndex(4);
     WebElement dropdown1 = driver.findElement(By.name("dropdown2"));
     Select sel1 = new Select(dropdown1);
     sel1.selectByVisibleText("Appium");
     WebElement dropdown2 = driver.findElement(By.id("dropdown3"));
     Select sel2 = new Select(dropdown2);
     sel2.selectByValue("1");
     WebElement dropdown3 = driver.findElement(By.className("dropdown"));
     Select sel3 = new Select(dropdown3);
     int noOfOptions = sel3.getOptions().size()-1;
     System.out.println(noOfOptions);
     String value = "Selenium";
     List<WebElement> dropdown4 = driver.findElements(By.xpath("(//div[@class='example'])[5]//option"));
     int size = dropdown4.size();
     {
    	 for (int i=0;i<size;i++)
    	 {
    		 String value2 =  dropdown4.get(i).getText();
    		 if (value2.contentEquals(value))
    		 {
    			 dropdown4.get(i).click();
    		 }
    	 }
     }
   
     
     
    		 
	}

}
