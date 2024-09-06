package Functional_TEsting_case;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test_01 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		TakesScreenshot t1 = (TakesScreenshot)driver;
		
		File temp = t1.getScreenshotAs(OutputType.FILE);
		
		System.out.println(temp);
		
		File perm = new File("./UI testing/Screenshot 2024-09-06 132034.png");
		  
		System.out.println(perm);
		
        
		
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.manage().window().maximize();
		
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://www.getcalley.com/page-sitemap.xml");
		
		TakesScreenshot t2 = (TakesScreenshot)driver;
		
		File temp1 = t2.getScreenshotAs(OutputType.FILE);
		
		System.out.println(temp1);
		
		File perm1 = new File("./UI testing/Screenshot 2024-09-06 133340.png");
		  
		System.out.println(perm1);
		
	}

}
