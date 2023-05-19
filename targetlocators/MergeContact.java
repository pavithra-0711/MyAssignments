package targetlocators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps/control/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.partialLinkText("CRM")).click();
		  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		  driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		  driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		  //window navigate to from contacts window
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> fromwindow=new ArrayList<String>(windowHandles);
		 driver.switchTo().window(fromwindow.get(1));
		 
		 //click on the first contact
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]")).click();
		 //switch back to the parent(merge)window
		 driver.switchTo().window(fromwindow.get(0));
		 driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		 Set<String> windowHandles2 = driver.getWindowHandles();
		 List<String> Towindow=new ArrayList<String>(windowHandles2);
		 driver.switchTo().window(Towindow.get(1));
		 
		 //click on second contact
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		 driver.switchTo().window(Towindow.get(0));
		 //click on merge button
		 driver.findElement(By.xpath("//a[text()='Merge']")).click();
		 
		 //handling confirm Alert
		 Alert confirm = driver.switchTo().alert();
		 System.out.println(confirm.getText());
		 confirm.accept();
		 System.out.println("Tittle of the resultant page is:" +driver.getTitle());
		 
		 
	}

}
