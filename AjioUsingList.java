package week3.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioUsingList {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1. Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");

		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 2. In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);

		// 3. To the left of the screen under " Gender" click the "Men"
		driver.findElement(
				By.xpath("//label[@class=\"facet-linkname facet-linkname-genderfilter facet-linkname-Men\"]")).click();

		Thread.sleep(1000);

		// 4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for=\"Men - Fashion Bags\"]")).click();

		// 5. Print the count of the items Found.
		String itemsFound = driver.findElement(By.xpath("//div[@class=\"length\"]")).getText();
		System.out.println(itemsFound);

		// 6. Get the list of brand of the products displayed in the page and print the
		// list.
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		System.out.println("Size of the brand List is : " + brandList.size());
		System.out.println("Brand List");
		for (WebElement webElement : brandList) {
			System.out.println(webElement.getText());
		}

		// 7. Get the list of names of the bags and print it
		List<WebElement> bagName = driver.findElements(By.className("name"));
		System.out.println("Size of Bag name list is : " + bagName.size());
		System.out.println("Bag Names");
		for (WebElement webElement : bagName) {
			System.out.println(webElement.getText());
		}

	}

}
