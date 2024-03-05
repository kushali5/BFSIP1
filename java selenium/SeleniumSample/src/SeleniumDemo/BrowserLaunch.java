package SeleniumDemo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch {
	
	@Test
    public static void browserInvoke()
    /*{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prathyusha bale\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    System.out.println("Before"+driver.getTitle());
    driver.get("http://www.google.com");
    driver.get("http://www.facebook.com");
    driver.get("http://www.india.com");
    driver.navigate().back();
    driver.quit();
    }*/
    
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prathyusha bale\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    System.out.println("Before"+driver.getTitle());
    driver.navigate().to("http://www.google.com");
    driver.navigate().to("http://www.facebook.com");
    driver.navigate().to("http://www.india.com");
    driver.navigate().back();
    driver.quit();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
browserInvoke();
    } 

	/*public static void main(String[] args) {
		//for windows
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prathyusha bale\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	driver.get("https://www.primevideo.in ");
	driver.manage().window().maximize(); */
	// 	System.out.println(driver.getTitle());
		
	//driver.quit(); 
		
	}


