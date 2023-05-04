package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf Salemium");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subramani");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pavithra");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Customer Support");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pavithrasubramani0711@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("software Solutions");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sai pavi");
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
	}
	
}
		
		
		
		
		
		
	
		
		
		
		
		
		

		 

		

		
		

		


