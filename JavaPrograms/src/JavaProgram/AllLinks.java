package JavaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinks {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver","D://Software//Driver//geckodriver-v0.24.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		
		//Launching sample website
		driver.get("http://google.co.in");
		driver.manage().window().maximize();

		//Get list of web-elements with tagName  - a
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		//Traversing through the list and printing its text along with link address
		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}

		//Comver.close();menting driver.quit() for user to verify the links printed
		//driver.quit();
	}	



}


