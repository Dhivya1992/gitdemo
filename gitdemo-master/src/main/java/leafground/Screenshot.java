package leafground;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException  
	{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.get("http://www.leafground.com/");
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest = new File("C:/Users/dhivy/OneDrive/Desktop/Screenshot/image1.jpg");
FileUtils.copyFile(src,dest);
driver.findElement(By.xpath("//h5[text()='Edit']")).click();
File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest1 = new File("C:/Users/dhivy/OneDrive/Desktop/Screenshot/image2.jpg");
FileUtils.copyFile(src1,dest1);
driver.findElement(By.id("email")).sendKeys("dhivya");
driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+ "a");
driver.findElement(By.id("email")).sendKeys(Keys.DELETE);


	}

}
