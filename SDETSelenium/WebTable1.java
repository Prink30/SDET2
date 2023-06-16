package SDETSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.leafground.com/table.xhtml");

		List<WebElement> ab = driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/tr/td[5]"));

		List<String> bc = new ArrayList<>();
		bc.add("NEGOTIATION");
		bc.add("QUALIFIED");

		for (int i = 1; i <= ab.size(); i++) {
			String ac = driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']/tr[" + i + "]/td[5]")).getText();
			// System.out.println(ac);

			if (bc.contains(ac)) {

				String name = driver.findElement(By.xpath("//tbody[@id= \"form:j_idt89_data\"]/tr[" + i + "]/td[1]"))
						.getText();

				String country = driver.findElement(By.xpath("//tbody[@id= \"form:j_idt89_data\"]/tr[" + i + "]/td[2]"))
						.getText();

				String Joiningdate = driver
						.findElement(By.xpath("//tbody[@id= \"form:j_idt89_data\"]/tr[" + i + "]/td[4]")).getText();
				System.out.println(name + " " + country + " " + Joiningdate);
			}

		}

	}

}
