package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseClass;

public class ProductPage extends BaseClass {
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='FI-SW-02']")
	private WebElement tigerSharkFish;
	@FindBy(xpath = "//a[text()='FI-SW-01']")
	private WebElement AngleFish;
	@FindBy(xpath = "//a[text()='K9-PO-02']")
	private WebElement Poodledog;
	@FindBy(xpath = "//a[text()='K9-BD-01']")
	private WebElement Bulldog;
	@FindBy(xpath = "//a[text()='FL-DSH-01']")
	private WebElement ManxCat;
	@FindBy(xpath = "//a[text()='FL-DLH-02']")
	private WebElement PersianCat;
	@FindBy(xpath = "//a[text()='RP-SN-01']")
	private WebElement RattlesnakeReptiles;
	@FindBy(xpath = "//tr//td//a[text()='RP-LI-02']")
	private WebElement IguanaReptiles;
	@FindBy(xpath = "//tr//td//a[text()='AV-CB-01']")
	private WebElement AmazonParrot;
	@FindBy(xpath = "//tr//td//a[text()='AV-SB-02']")
	private WebElement FinchBird;

	public WebElement getTigerSharkFish() {
		return tigerSharkFish;
	}

	public void setTigerSharkFish(WebElement tigerSharkFish) {
		this.tigerSharkFish = tigerSharkFish;
	}

	public WebElement getAngleFish() {
		return AngleFish;
	}

	public void setAngleFish(WebElement angleFish) {
		AngleFish = angleFish;
	}

	public WebElement getPoodledog() {
		return Poodledog;
	}

	public void setPoodledog(WebElement poodledog) {
		Poodledog = poodledog;
	}

	public WebElement getBulldog() {
		return Bulldog;
	}

	public void setBulldog(WebElement bulldog) {
		Bulldog = bulldog;
	}

	public WebElement getManxCat() {
		return ManxCat;
	}

	public void setManxCat(WebElement manxCat) {
		ManxCat = manxCat;
	}

	public WebElement getPersianCat() {
		return PersianCat;
	}

	public void setPersianCat(WebElement persianCat) {
		PersianCat = persianCat;
	}

	public WebElement getRattlesnakeReptiles() {
		return RattlesnakeReptiles;
	}

	public void setRattlesnakeReptiles(WebElement rattlesnakeReptiles) {
		RattlesnakeReptiles = rattlesnakeReptiles;
	}

	public WebElement getIguanaReptiles() {
		return IguanaReptiles;
	}

	public void setIguanaReptiles(WebElement iguanaReptiles) {
		IguanaReptiles = iguanaReptiles;
	}

	public WebElement getAmazonParrot() {
		return AmazonParrot;
	}

	public void setAmazonParrot(WebElement amazonParrot) {
		AmazonParrot = amazonParrot;
	}

	public WebElement getFinchBird() {
		return FinchBird;
	}

	public void setFinchBird(WebElement finchBird) {
		FinchBird = finchBird;
	}

}
