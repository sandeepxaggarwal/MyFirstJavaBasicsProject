import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class noOfLinks
{

   public static void main(String[] args) throws InterruptedException, FileNotFoundException
   {

      Thread.sleep(3000);
      FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
      WebDriver driver = new FirefoxDriver();
      int x = 10;
      driver.get("http://newtours.demoaut.com/");

      /*
       * List<WebElement> allLinks=driver.findElements(By.tagName("a")); System.out.println(allLinks.size());
       * 
       * for(int i=0;i<allLinks.size();i++){ System.out.println(allLinks.get(i).getText() + " -> " + allLinks.get(i).getAttribute("href")); }
       */

      // driver.findElements(By.name("userName1"));
      /*
       * Boolean isElementPresent = driver.findElements(By.name("userName1")).size()!=0; System.out.println(isElementPresent);
       * 
       * 
       * try{ driver.findElement(By.name("userName1")); }catch(NoSuchElementException e){ e.printStackTrace(); }
       */

      System.out.println(driver.getTitle());

      /*
       * System.out.println(driver.getCurrentUrl());
       * 
       * System.out.println(driver.getPageSource());
       */

      String expValue = "Welcome: Mercury Tours";
      String actValue = driver.getTitle();

      if (actValue == expValue)
      {
         System.out.println("Test passed");
      }
      else
      {
         System.out.println("Test failed");
      }

      /*
       * if(driver.getTitle().contentEquals("Welcome: Mercury Tours")){ System.out.println("Test passed"); }else{ System.out.println("Test failed"); }
       */

   }

   public void test()
   {

   }

}
