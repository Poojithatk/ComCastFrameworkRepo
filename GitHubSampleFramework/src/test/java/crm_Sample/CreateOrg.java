package crm_Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrg {

	public static void main(String[] args) {
		
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://localhost:8888/");
	        driver.findElement(By.name("user_name")).sendKeys("admin");
	        driver.findElement(By.name("user_password")).sendKeys("admin");
	        driver.findElement(By.id("submitButton")).click();
	        driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
	        driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	        driver.findElement(By.name("accountname")).sendKeys("poojitha TK");
	        driver.findElement(By.name("button")).click();
        		
	}
}