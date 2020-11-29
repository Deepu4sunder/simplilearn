package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class test {
	@Test
	public void testcase() {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS); 
        
        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();
        
        WebElement logintext = driver.findElement(By.xpath("//*[contains(text(),'Log in to continue learning')]"));
        
        String actual = logintext.getText();
        String expected = "Log in to continue learning";
        
        Assert.assertEquals(expected, actual);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS); 
		driver.close();
	}

}
