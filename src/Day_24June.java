import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Day_24June {

	public static void main(String[] args) throws InterruptedException, AWTException {
		/*
		int[] x = {1,2,3,4,5};
		
		for(int i:x){
			System.out.println(i);
		}*/
		
		
		/*int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] i :x){
			for(int j : i){
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println();
		}*/
		
		WebDriver driver = new FirefoxDriver();
		/*driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement country = driver.findElement(By.name("country"));
		Select dropDown = new Select(driver.findElement(By.name("country")));
		//Select dropDown = new Select(country);
		
		
		//dropDown.selectByVisibleText("INDIA");
		
		dropDown.selectByValue("6");
		
		dropDown.selectByIndex(0);
		
		
		
		List<WebElement> allOptions = dropDown.getOptions();
		System.out.println(allOptions.size());
		
		for(int i=0;i<allOptions.size();i++){
			System.out.println(allOptions.get(i).getText());
		}
		
		System.out.println(dropDown.getFirstSelectedOption());*/
		

		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		/*
		Select multiSelectBox = new Select(driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[1]/select")));
		
		multiSelectBox.selectByVisibleText("Russia");
		multiSelectBox.selectByValue("India");
		multiSelectBox.selectByIndex(0);
		
		
		Thread.sleep(3000);
		
		multiSelectBox.deselectByValue("Russia");
		multiSelectBox.deselectByVisibleText("India");
		multiSelectBox.deselectByIndex(0);
		
		Thread.sleep(3000);
		
		multiSelectBox.selectByVisibleText("Russia");
		multiSelectBox.selectByValue("India");
		multiSelectBox.selectByIndex(0);
		
		Thread.sleep(3000);
		
		multiSelectBox.deselectAll();
		
		Thread.sleep(3000);
		
		multiSelectBox.selectByVisibleText("Russia");
		multiSelectBox.selectByValue("India");
		multiSelectBox.selectByIndex(0);
		
		System.out.println(multiSelectBox.getFirstSelectedOption().getText());
		
		List<WebElement> allSelectedOptions = multiSelectBox.getAllSelectedOptions();
		
		for(int i=0;i<allSelectedOptions.size();i++){
			System.out.println(allSelectedOptions.get(i).getText());
		}
		*/
		
		/*WebElement checkbox = driver.findElement(By.xpath("//*[@id='check3']"));
		
		checkbox.click();
		
		if(!checkbox.isSelected()){
			checkbox.click();
		}else{
			System.out.println("Already checked");
		}
		
		
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		
		WebElement radio_btn = driver.findElement(By.xpath("//*[@id='radio1']"));
		
		System.out.println(radio_btn.isSelected());
		System.out.println(radio_btn.isDisplayed());
		System.out.println(radio_btn.isEnabled());
		
		radio_btn.click();
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/input")).click();
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
		
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("sandeep");
		Thread.sleep(3000);
		alert.dismiss();
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		alert = driver.switchTo().alert();
		alert.sendKeys("sandeep");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE);*/
		
		
		WebElement table = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody"));
		
		List<WebElement> allrows= table.findElements(By.tagName("tr"));
		System.out.println(allrows.size());
		
		WebElement row = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[1]"));
		
		List<WebElement> allCols = row.findElements(By.tagName("td"));
		
		System.out.println(allCols.size());
		
		for(int i=1;i<=allrows.size();i++){
			for(int j=1;j<=allCols.size();j++){
				System.out.print(driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText());
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
