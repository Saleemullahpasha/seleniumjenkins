import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jenkinsdemo {
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setUp() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saleem Ullah\\Downloads\\Compressed\\chromedriver.exe");
	  driver = new ChromeDriver();
	 }
	 
     @Test
	 
	 public void login() {
		 driver.get("https://opensource-demo.orangehrmlive.com/"); //define the url
		 String pageTitle = driver.getTitle(); //get the title of the webpage
		 System.out.println("The title of this page is ===> " +pageTitle);
		 Assert.assertEquals("OrangeHRM", pageTitle); //verify the title of the webpage
		 
		 driver.findElement(By.id("txtUsername")).clear();//clear the input field before entering any value
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");//enter the value of username
		 driver.findElement(By.id("txtPassword")).clear();
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");//enter the value of password
		 driver.findElement(By.id("btnLogin")).click(); //click Login button
		 System.out.println("Successfully logged in");
	 
	 }
     
     @AfterTest
     public void teardown(){
     driver.quit();
     }
}

