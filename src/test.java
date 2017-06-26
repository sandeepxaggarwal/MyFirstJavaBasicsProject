import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
/*
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();
		WebElement x = driver.findElement(By.name("userName"));
		x.sendKeys("tutorial");*/
		
		
		//driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
		System.out.println(driver.findElement(By.xpath("//input[@name='userName']")).getText());
		
		
		//driver.findElement(By.cssSelector("#searchLanguage"))
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.partialLinkText("STER")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
