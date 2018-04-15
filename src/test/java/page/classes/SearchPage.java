package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public static WebElement element = null;

	// Returns the flight origin textbox element
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		return element;
	}

	// Returns the flight destination textbox element
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		return element;
	}

	// Returns the flight departure date textbox element
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing-hp-flight"));
		return element;
	}

	// Returns the flight return date textbox element
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		return element;
	}
	
	//Retrun the search box element
	public static WebElement searchButton(WebDriver driver) {
		element=driver.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']"));
		return element;
	}
	
	//Click on Search Button
	public static void clickOnSearchButton(WebDriver driver) {
		element=searchButton(driver);
		element.click();
	}
	//Navigate to Flights Tab
	public static void navigateToFlightsTab(WebDriver driver) {
		driver.findElement(By.id("tab-flight-tab-hp")).click();
	}

}
