import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reach\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement coloumndriver1=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver1.findElements(By.tagName("a")).size());
		
		/*WebElement coloumndriver2=footerdriver.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
		System.out.println(coloumndriver2.findElements(By.tagName("a")).size());
		
		WebElement coloumndriver3=footerdriver.findElement(By.xpath("//table/tbody/tr/td[3]/ul"));
		System.out.println(coloumndriver3.findElements(By.tagName("a")).size());
		
		WebElement coloumndriver4=footerdriver.findElement(By.xpath("//table/tbody/tr/td[4]/ul"));
		System.out.println(coloumndriver4.findElements(By.tagName("a")).size());*/
		
		//First footer Coloumn
		
		for(int i=1;i<coloumndriver1.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumndriver1.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000l);
		}
	        Set<String> abc=driver.getWindowHandles();
		    Iterator<String>it=abc.iterator();
		    
		    while(it.hasNext())
		    {
		    	driver.switchTo().window(it.next());
		    	System.out.println(driver.getTitle());
		    }
			
			
			
		
		
		
		
		
	}

}
