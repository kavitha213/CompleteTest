package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseClass;

public class FrontPage extends BaseClass {

	public FrontPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@id='Main']//child::div//child::div//child::a[1]//child::img[1]")
	private WebElement fish;
	@FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[2]/img")
	private WebElement dogs;
	@FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
	private WebElement Cats;
	@FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[3]/img")
	private WebElement Reptiles;
	@FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[5]/img")
	private WebElement Birds;

	public WebElement getFish() {
		return fish;
	}

	public void setFish(WebElement fish) {
		this.fish = fish;
	}

	public WebElement getDogs() {
		return dogs;
	}

	public void setDogs(WebElement dogs) {
		this.dogs = dogs;
	}

	public WebElement getCats() {
		return Cats;
	}

	public void setCats(WebElement cats) {
		Cats = cats;
	}

	public WebElement getReptiles() {
		return Reptiles;
	}

	public void setReptiles(WebElement reptiles) {
		Reptiles = reptiles;
	}

	public WebElement getBirds() {
		return Birds;
	}

	public void setBirds(WebElement birds) {
		Birds = birds;
	}

}
