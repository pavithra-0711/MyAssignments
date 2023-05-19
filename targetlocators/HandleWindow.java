package targetlocators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.leafground.com/window.xhtml");
		 String handle = driver.getWindowHandle();
		 System.out.println("Parent Window:" +driver.getTitle());
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.findElement(By.xpath("//span[text()='Open']")).click();
		 
		 //open  new window
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> childwindow=new ArrayList<String>(windowHandles);
		 driver.switchTo().window(childwindow.get(1));
		 System.out.println("Child Window:" +driver.getTitle());
		 driver.close();
		 driver.switchTo().window(childwindow.get(0));
		 
		 //open multiple window
		 driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		 Set<String> windowHandles2 = driver.getWindowHandles();
		 List<String> openwindows=new ArrayList<String>(windowHandles2);
		 driver.switchTo().window(openwindows.get(1));
		 System.out.println("First Window Tittle: " +driver.getTitle());
		 driver.switchTo().window(openwindows.get(2));
		 System.out.println("Second Window Tittle:" +driver.getTitle());
		 driver.close();
		 driver.switchTo().window(openwindows.get(1));
		 driver.close();
		 driver.switchTo().window(openwindows.get(0));
		 
		 //find the no.of open tabs
		 driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		 Set<String> windowHandles3 = driver.getWindowHandles();
		 List<String> opentabs=new ArrayList<String>(windowHandles3);
		 System.out.println("No of open Tabs:" +opentabs.size());
		 driver.switchTo().window(opentabs.get(1));
		 driver.close();
		 driver.switchTo().window(opentabs.get(2));
		 driver.close();
		 driver.switchTo().window(opentabs.get(0));
		 
		 //close all windows except parent
		 driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		 Set<String> windowHandles4 = driver.getWindowHandles();
		 List<String> closewindows=new ArrayList<String>(windowHandles4);
		 driver.switchTo().window(closewindows.get(1));
		 System.out.println("1st window:" +driver.getTitle());
		 Thread.sleep(1000);
		 driver.switchTo().window(closewindows.get(2));
		 System.out.println("2nd window:" +driver.getTitle());
		 Thread.sleep(1000);
         driver.switchTo().window(closewindows.get(3));
		 System.out.println("3rd window:" +driver.getTitle());
		 Thread.sleep(1000);
		 driver.close();
		 driver.switchTo().window(closewindows.get(2));
		 driver.close();
		 driver.switchTo().window(closewindows.get(1));
		 driver.close();
		 driver.switchTo().window(closewindows.get(0));
		 
		
	}

}
