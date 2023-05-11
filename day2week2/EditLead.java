package day2week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("pavithra");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[3]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TCS");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
        System.out.println(text);
        Thread.sleep(1000);
        driver.close();
	}

	}

        
        
        	
        
		
        
        
 
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

		
		
		

		
		

	