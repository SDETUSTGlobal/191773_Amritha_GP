package src;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
				driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
				driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
				driver.findElement(By.xpath("/html/body/form/div[3]/input[3]")).click();
				driver.findElement(By.linkText("Order")).click();
				Select dropdown = new Select(driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_ddlProduct")));  
			    dropdown.selectByVisibleText("FamilyAlbum");
		        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys("5");
		        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).clear();
		        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("100");
		        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).clear();
		        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys("100");
		        driver.findElement(By.className("btn_dark")).click();
		        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[2]/li[1]/input")).sendKeys("Amritha");
		        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[2]/li[2]/input")).sendKeys("NCC Road");
		        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[2]/li[3]/input")).sendKeys("Trivandrum");
		        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Kerala");
		        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys("695025");
		        
		        driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_cardList_2")).click();
		        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("99999999");
		        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("07/18");
		        driver.findElement(By.partialLinkText("Proc")).click();
		        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		        
		        
		        driver.findElement(By.linkText("View all products")).click();
		        
		        
		        driver.findElement(By.partialLinkText("orders")).click();
		        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();
		        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/input")).click();
		        System.out.println(driver.findElement(By.tagName("h2")).getText());
		        
		       
		        driver.findElement(By.linkText("Logout")).click();
				//driver.close();

	}

}
