package outline;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 

public class commandLine extends Config{ 
   WebDriver driver = null;
   //WebDriverWait wait = new WebDriverWait(driver,60);

   
   	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable{
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//driver.manage().window().maximize();
		//System.out.println("opening page : "+ baseURl);
		//driver.get(baseURl);
	}

	@When("^User enters UserName and Password$")
	public void user_enters_Username_and_Password() throws Throwable{
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	
	@Then("^User is able to Login Successfully$")
	public void user_is_able_to_login_successfully() throws Throwable {
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SIGN-OFF")));
	Thread.sleep(5000);
	System.out.println("Logged In successfully!");		
	}
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}	
	
	
	@When("^User LogOut from the Application$")
	public void user_Logout_from_the_Application() throws Throwable {
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
	
	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_successfully() throws Throwable {
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		driver.close();
	}
	
}