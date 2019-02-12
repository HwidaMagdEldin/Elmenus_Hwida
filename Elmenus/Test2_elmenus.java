
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.lang.RuntimeException;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
import org.apache.commons.*;
import org.apache.commons.io.FileUtils;

public class Test2_elmenus {
	
//	public googlePlayStore playstore=new googlePlayStore();
	
private static  WebDriver driver ;
@Test

  public void f() {
	//  System.out.println("test");
	  
	  AccessGames();
  }
  @BeforeTest
  public void Setup() {
	  
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\howida.magdy\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("chrome.switches", "--disable-extensions");
			options.addArguments("user-data-dir=C:\\\\Path");//+userProfile);
			
			 driver = new ChromeDriver(options);
  }
  private static Boolean IsElementPresent(By by)
  {
      try
      {
          driver.findElement(by);
          return true;
      }
      catch (NoSuchElementException e)
      {
          return false;
      }
  }
  
  public static void AccessGames()
	{ 
			
	  
	driver.get("https://play.google.com/store");
	driver.manage().window().maximize();
	Boolean isex=	IsElementPresent(By.id("gb_70"));
	if(isex =true )
	{driver.findElement(By.id("gb_70")).click();
	WebDriverWait wait = new WebDriverWait(driver ,5);
		Login("asmaa.mohammed.18@gmail.com","asmaaroro123+");
			//monaebraheem52@gmail.com","mona1992");//"asmaa.mohammed.18@gmail.com","asmaaroro123+");
	}
		    
		    
		     
		    WebElement game=driver.findElement(By.id("gbqfq"));
		    
game.sendKeys("elmenus");
Actions action = new Actions(driver);
action.sendKeys(Keys.ENTER).build().perform();
		    

        

		    
		    WebDriverWait wait = new WebDriverWait(driver ,20);
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		    
		    Takescreenshoot();
		    WebElement elmeulnk =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"body-content\"]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/a")));//*[@id=\'body-content\']/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div/div")));
		
		    elmeulnk.click();
		    
		    
		    //add review 
		    if(IsElementPresent	(By.xpath("//*[@id=\'fcxH9b\']/div[4]/c-wiz/div/div[2]/div/div[1]/div/div/div[1]/div[1]/span/button" )))
		 	{
		    	Addreview();
				   
				 
				// WebElement rev=   driver.findElement(By.className("review-row"));//(" /html/body/div[9]/div[1]/div/div/div/div[1]/div/div/div[2]/div[1]/div[3]/div/button"));
					
		 	}
		    else
		    {
		    	
		    //Add To wishlist
		    
		    WebElement wishlist=driver.findElement(By.className("iDoEAf"));
		    
		    WebElement btn= wishlist.findElement(By.xpath("//button[@aria-label='Add to wishlist']"));
		    btn.click();
		    
		    
		    //My wishlist
		    

		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e)
		    {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		    
		    WebElement ul_Element = driver.findElement(By.xpath("//*[@id=\'fcxH9b\']/div[1]/c-wiz[1]/div[2]/ul"));
		    List<WebElement> li_All = ul_Element.findElements(By.tagName("li"));
		    WebElement wish=    ul_Element.findElement(By.xpath("//*[@id='fcxH9b']/div[1]/c-wiz[1]/div[2]/ul/li[5]/a/span[2]\n"));
		    wish.click();
		    
 
		 
   WebElement div =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));
		    
		    WebElement elem=    div.findElement(By.xpath("//*[@id=\'body-content\']/div/div/div[1]/div/div/div/div[2]/div/div/div[1]/a/span[2]"));
		    elem.click();
  
 	
 
 		WebElement install =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'fcxH9b\']/div[4]/c-wiz/div/div[2]/div/div[1]/div/c-wiz[1]/c-wiz[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/c-wiz/div/span/button\n" )));		  
 		 
		    
 		   install.click();
 		   
 		   
 		 // WebElement iframeSwitch = driver.findElement(By.cssSelector("body > div.websky-modal-dialog-wrapper"));
 		 driver.switchTo().frame(2);
 		   
 		 
 		  WebElement eleminsbtn=    driver.findElement(By.id("purchase-ok-button"));
  		 eleminsbtn.click();
 		  
 		 
 		
  		driver.switchTo().defaultContent();
  		Addreview();
		    }
 		   
 		 
 		   
 		

 		   
		

		
		
		    
	}
  private static void Takescreenshoot()
  {
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 // Now you can do whatever you need to do with it, for example copy somewhere
		 try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  private static void Addreview()
  {
	  WebElement addrevbtn=   driver.findElement(By.xpath("//*[@id=\'fcxH9b\']/div[4]/c-wiz/div/div[2]/div/div[1]/div/div/div[1]/div[1]/span/button"));
		addrevbtn.click();
		
		 driver.switchTo().frame(2);
		   
		 WebElement conteniubtn=   driver.findElement(By.xpath(" /html/body/div[9]/div[1]/div/div/div/div[1]/div/div/div[2]/div[1]/div[3]/div/button"));
		 conteniubtn.click();
		 
		 WebElement Mstar=   driver.findElement(By.className("star-rating-editable-container"));
		 WebElement fstar= Mstar.findElement(By.xpath("/html/body/div[9]/div[1]/div/div/div/div[1]/div/div/div[3]/div/div[2]/div[2]/div[4]/div/div/div[1]/div[1]/span[5]"));
		 
		 fstar.click();
		 
	  
	  
  }
  
  
  private static void Login(String username,String password)
  {
      //System.setProperty("webdriver.gecko.driver","C:\\your_directory\\geckodriver.exe");
     // WebDriver driver = new FirefoxDriver();
     // driver.manage().window().maximize();
      //tring url = "https://accounts.google.com/signin";
      //driver.get(url);
      
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
      WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
      email_phone.sendKeys(username);
      driver.findElement(By.id("identifierNext")).click();
      WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
      WebDriverWait wait = new WebDriverWait(driver, 20);
      wait.until(ExpectedConditions.elementToBeClickable(password1));
      password1.sendKeys(password);
      driver.findElement(By.id("passwordNext")).click();
      //find popup
     
  }
  public static void jsClick(){

      JavascriptExecutor js = (JavascriptExecutor) driver;
      StringBuilder stringBuilder = new StringBuilder();
      
      
      stringBuilder.append("w3.getHttpObject('q8NYMd').click();");
      
      
      
   //   $('a[data-item-id="stand-out"]');
      js.executeScript(stringBuilder.toString());
  }

	public static void LoginFirst()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\howida.magdy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
	//	String userProfile= "C:\\chromeusr\\Default";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("chrome.switches", "--disable-extensions");
		options.addArguments("user-data-dir=C:\\\\Path");//+userProfile);
		
		 driver = new ChromeDriver(options);
	

		
	}


  @AfterTest
  public void afterTest() {
	//  System.out.println("After test");
	 // driver.close();
  }

}
