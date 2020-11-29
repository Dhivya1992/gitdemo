package leafground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Framespractise {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
      driver.get("http://www.leafground.com/");
      driver.findElementByXPath("//h5[text()='Frame']").click();
      driver.switchTo().frame(0);
      driver.findElement(By.id("Click")).click();
      WebDriverWait wait = new WebDriverWait(driver,45);
      Thread.sleep(3000);
      driver.navigate().back();
      
	}

}
