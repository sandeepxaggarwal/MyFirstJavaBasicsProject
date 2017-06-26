import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day_25June
{

   public static void main(String[] args) throws IOException, InterruptedException
   {
      /*
       * //Browser Navigation commands
       * 
       * WebDriver driver = new FirefoxDriver(); driver.get("http://newtours.demoaut.com");
       * 
       * driver.navigate().to("http://google.com");
       * 
       * driver.navigate().back();
       * 
       * driver.navigate().forward(); driver.navigate().refresh();
       * 
       * //How to maximize the browser window
       * 
       * driver.manage().window().maximize();
       * 
       * //How to capture screenshot
       * 
       * File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); FileUtils.copyFile(srcfile, new File("C:\\CaptureImage.bmp"));
       */

      /*
       * WebDriver driver = new FirefoxDriver(); driver.get("http://newtours.demoaut.com"); System.out.println(System.getProperty("user.dir"));
       * //FileInputStream fis = new FileInputStream("C:\\SeleniumCoaching\\MyFirstJavaBasicsProject\\src\\OR.properties"); FileInputStream fis = new
       * FileInputStream(System.getProperty("user.dir")+"\\src\\OR.properties"); Properties prop = new Properties();
       * 
       * prop.load(fis);
       * 
       * System.out.println(prop.getProperty("x")); System.out.println(prop.getProperty("y"));
       * 
       * driver.findElement(By.name(prop.getProperty("x"))).sendKeys("tutorial"); driver.findElement(By.name(prop.getProperty("y"))).sendKeys("tutorial");
       */

      // Implicit and Explicit Wait

      WebDriver driver = new FirefoxDriver();
      // driver.get("http://newtours.demoaut.com");
      /*
       * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); driver.findElement(By.name("userName"));
       * 
       * //Explicit wait WebDriverWait wait = new WebDriverWait(driver, 30); //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password1")));
       * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("password")));
       */

      // driver.findElement(By.name("login"));

      // driver.switchTo().alert();
      /* driver.switchTo().window("abc"); */

      driver.get("https://github.com/");

      WebElement search_box = driver.findElement(By.name("q"));

      search_box.sendKeys("selenium");
      search_box.sendKeys(Keys.ENTER);

      Thread.sleep(5000);
      search_box = driver.findElement(By.name("q"));
      search_box.clear();

   }

}
