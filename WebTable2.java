package SDETSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable2 {

	//Iterating all the values in table1,table2,table3,table4 and table5
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		

		driver.get("https://www.leafground.com/table.xhtml");
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Number of rows	
	List<WebElement> allrows =	driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
	int rowsize = allrows.size();	
		
	//Number of columns	
	List<WebElement> allcolumns =	driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/thead/tr/th"));
	int columnsize =allcolumns.size();
	
	System.out.println("TABLE 1");
	
	//Iterating all the datas in a table1
	for(int i=1;i<=rowsize;i++) {
		for(int j=1;j<=columnsize;j++) {
		String alldatas =	driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']/tr[" + i + "]/td["+ j + "]")).getText();
		
		System.out.println(alldatas);
		}
	}
	
	//going to next table
	WebElement table2 = driver.findElement(By.xpath("//a[@aria-label='Page 2']"));
	table2.click();
	
	System.out.println("TABLE 2");
	//Number of rows	
			List<WebElement> allrows2 =	driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
			int rowsize2 = allrows.size();	
				
			//Number of columns	
			List<WebElement> allcolumns2 =	driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/thead/tr/th"));
			int columnsize2 =allcolumns.size();
	
	//Iterating all the datas in a table2
		for(int i=1;i<=rowsize2;i++) {
			for(int j=1;j<=columnsize2;j++) {
			String alldatas =	driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']/tr[" + i + "]/td["+ j + "]")).getText();
			
			System.out.println(alldatas);
			}
		}
		
		driver.navigate().refresh();
		
		//going to next table
		WebElement table3 =  driver.findElement(By.xpath("//a[@aria-label='Page 3']"));
		table3.click();
		
		System.out.println("TABLE 3");
		//Number of rows	
		List<WebElement> allrows3 =	driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowsize3 = allrows.size();	
			
		//Number of columns	
		List<WebElement> allcolumns3 =	driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/thead/tr/th"));
		int columnsize3 =allcolumns.size();
		
		
		//Iterating all the datas in a table3
			for(int i=1;i<=rowsize3;i++) {
				for(int j=1;j<=columnsize3;j++) {
				
				String alldatas =	driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']/tr[" + i + "]/td["+ j + "]")).getText();
				System.out.println(alldatas);
				}
			}
			
			driver.navigate().refresh();
			
			//going to next table
			WebElement table4 =  driver.findElement(By.xpath("//a[@aria-label='Page 4']"));
			table4.click();
			
			System.out.println("TABLE 4");
			//Number of rows	
			List<WebElement> allrows4 =	driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
			int rowsize4 = allrows.size();	
				
			//Number of columns	
			List<WebElement> allcolumns4 =	driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/thead/tr/th"));
			int columnsize4 =allcolumns.size();
			//Iterating all the datas in a table4
				for(int i=1;i<=rowsize4;i++) {
					for(int j=1;j<=columnsize4;j++) {
						
						String alldatas =	driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']/tr[" + i + "]/td["+ j + "]")).getText();
					System.out.println(alldatas);
					}
				}
				
				driver.navigate().refresh();
				
				//going to next table
				WebElement table5 =  driver.findElement(By.xpath("//a[@aria-label='Page 5']"));
				table5.click();
				
				
				System.out.println("TABLE 5");
				
				//Number of rows	
				List<WebElement> allrows5 =	driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
				int rowsize5 = allrows.size();	
					
				//Number of columns	
				List<WebElement> allcolumns5 =	driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/thead/tr/th"));
				int columnsize5 =allcolumns.size();
				
				
				//Iterating all the datas in a table5
					for(int i=1;i<=rowsize5;i++) {
						for(int j=1;j<=columnsize5;j++) {
							
							String alldatas =	driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']/tr[" + i + "]/td["+ j + "]")).getText();
						System.out.println(alldatas);
						}
					}
	
	}

}
