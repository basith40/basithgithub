package bdTuch.basith401;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Practice {
	

	@Test
	public void wagmansitemsselect() {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.wegmans.com/");
		List<WebElement>manu = driver.findElements(By.cssSelector("ul[class='categories-menu'] li a"));
		for(WebElement myManu : manu) {
			String items = myManu.getText();
			if (items.contains("Meat")) {
				driver.findElement(By.cssSelector("ul[class='categories-menu'] li a")).click();
				
			}
		}
	}
	

}
