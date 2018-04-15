package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;
	@FindBy(id = "tab-flight-tab-hp")
	WebElement flightTab;

	@FindBy(id = "flight-type-roundtrip-label-hp-flight")
	WebElement roundTrip;

	@FindBy(id = "flight-type-multi-dest-label-hp-flight")
	WebElement multipleDestination;

	@FindBy(id = "flight-origin-hp-flight")
	WebElement flightOriginTextBox;

	@FindBy(id = "flight-destination-hp-flight")
	WebElement flightDestinationTextBox;

	@FindBy(id = "flight-departing-hp-flight")
	WebElement flightDepartingDate;

	@FindBy(id = "flight-returning-hp-flight")
	WebElement flightReturningDate;

	@FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']")
	WebElement searchButton;

	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickFlightTab() {
		flightTab.click();
	}

	public void setFlightOrginCity(String OriginCity) {
		flightOriginTextBox.sendKeys(OriginCity);
	}
	
	public void setFlightDestinationCity(String DestinationCity) {
		flightDestinationTextBox.sendKeys(DestinationCity);
	}
	
	public void setFlightDepartingDate(String DepartingDate) {
		flightDepartingDate.sendKeys(DepartingDate);
	}
	
	public void setFlightReturningDate(String ReturningDate) {
		flightReturningDate.sendKeys(ReturningDate);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void clickRoundTripTab() {
		roundTrip.click();
	}

	public void clickMultipleDestinationTab() {
		multipleDestination.click();
	}
}
