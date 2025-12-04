package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	public static WebDriver driver;
	@Given("User should login the leverEDGE login page")
	public void LogIn() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://leveredgept3.hulcd.com/rsunify/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("userName")).sendKeys("SA");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Unilever@123");
		driver.findElement(By.id("databaseName")).sendKeys("411179");
		driver.findElement(By.id("gologin")).click();
		Thread.sleep(5000);
		
		
		//Java Script methods 
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement el=driver.findElement(By.className("Class"));
		js.executeScript("arguments[0].setAttribute('value','Test')",el);
		Object ob=js.executeScript("arguments[0].getAttribute('value')", el);
		String sob=(String) ob;
		System.out.println(sob);
		js.executeScript("arguments[0].click", el);
		js.executeScript("arguments[0].scrollIntoView('True')", el);
		js.executeScript("arguments[0].scrollIntoView('False')", el);
		js.executeScript("arguments[0].style.display='block'",el);
		js.executeScript("window.scrollBy(0,100)");
		js.executeScript("window.scrollTo(100,0)");
		
		
	   
	}

	@When("User should navigate to the Transaction page")
	public void user_should_navigate_to_the_transaction_page() {
		
		driver.findElement(By.xpath("//a[@class='ikea-instant-popup-close-btn']")).click();
		driver.findElement(By.xpath("//a[@class='rsu-popup-control-close-btn']")).click();
		
		
		WebElement transaction = driver.findElement(By.xpath("//span[text()='Transactions']"));
		Actions a=new Actions(driver);
		a.moveToElement(transaction).build().perform();
		
		
	   
	}

	@When("User should navigate to the RS return location page")
	public void user_should_navigate_to_the_rs_return_location_page() {
	  
	}

	@Then("User should verify with multiple inputs")
	public void user_should_verify_with_multiple_inputs() {
	    
	}

}
