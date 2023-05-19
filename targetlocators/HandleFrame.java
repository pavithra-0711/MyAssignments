package targetlocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.leafground.com/frame.xhtml");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  //handle frame
		  driver.switchTo().frame(0);
		  //click me 
		  driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		  //verification
		  String text = driver.findElement(By.xpath("//button[contains(text(),'Hurray')]")).getText();
		  System.out.println(text);
		  
		  
		  //inside nested frame
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(2);
		  driver.switchTo().frame("frame2");
		  driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		  String text2 = driver.findElement(By.xpath("//button[contains(text(),'Hurray')]")).getText();
		  System.out.println("Inside Nest frame:" + text2 );
		  
		  //count frames
		  driver.switchTo().defaultContent();
		  List<WebElement> count = driver.findElements(By.tagName("iframe"));
		  System.out.println("Total No of frames:"+count.size());
		  
		  
		  		

	}

}
