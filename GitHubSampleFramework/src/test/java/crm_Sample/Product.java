package crm_Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product {
	
	public static void main(String[] args) {

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	driver.findElement(By.xpath("//a[@href='index.php?module=Products&action=index']"));
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
	driver.close();
}
}