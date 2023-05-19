package targetlocators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//simple Alert
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		String text2 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println("Simple Alert msg:" + text2);
		
		//confirm Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		//click to cancel
		alert2.dismiss();
		String text3 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(text3);
		//click to OK
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert okalert = driver.switchTo().alert();
		Thread.sleep(1000);
		okalert.accept();
		String text4 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(text4);
		
		//prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	    Alert alert3 = driver.switchTo().alert();
	    Thread.sleep(1000);
	    System.out.println("prompt Alert:" + alert.getText());
		alert3.sendKeys("sai sujesh");
		alert3.accept();
		String text5 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text5);
		
		//sweet Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(2000);
		String msg = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt96_content']/p")).getText();
		System.out.println(msg);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		//sweet model
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		String msg1 = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt101_content']/p")).getText();
		System.out.println(msg1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		//sweet alert confirm
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String msg2 = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
		System.out.println(msg2);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		//Minimize and Maximize
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
	    Thread.sleep(1000);
		String msg3 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[3]")).getText();
		System.out.println("Max and Min:"+ msg3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]")).click();
		
		
	}
}

