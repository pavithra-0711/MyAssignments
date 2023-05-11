package day2week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pavithra");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Subramani");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Pavifb@07");
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select sl=new Select(day);
        sl.selectByIndex(0);
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select sl1=new Select(month);
        sl1.selectByValue("7");
        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select sl2=new Select(year);
        sl2.selectByVisibleText("1997");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        	}

}