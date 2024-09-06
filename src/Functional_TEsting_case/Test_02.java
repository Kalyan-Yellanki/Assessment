package Functional_TEsting_case;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_02 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.dealsdray.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='css-sukebr']/descendant::div/following::div/span[text()='chevron_right']")).click();
		
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("F:\\demo-data.xlsx");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Import']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		TakesScreenshot t1 = (TakesScreenshot)driver;
		
		File temp = t1.getScreenshotAs(OutputType.FILE);
		
		System.out.println(temp);
		
		File perm = new File("./FuntionaltestValidateScreenshot\\Screenshot 2024-09-06 121133.png");
		  
		System.out.println(perm);
		
		Thread.sleep(2000);
		
	}
	
}
