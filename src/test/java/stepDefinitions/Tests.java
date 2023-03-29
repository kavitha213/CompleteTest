package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//https://github.com/Aravindk1712/new_testcase30.git

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Tests {
WebDriver driver;

@Before
public void initilization() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	//options.addArguments("headless");
    driver=new ChromeDriver(options);
    driver.get("https://demoqa.com/");
    driver.manage().window().maximize();
}
@After
public void end() {
	driver.close();
	
	
}

	@Given("User should open the url")
	public void user_should_open_the_url() {
	   
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //driver.findElement(By.xpath("//div[text()=' Login ']")).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	  
	}

	
	
	@When("User should click the element button")
	public void User_should_click_the_element_button()  {
	    
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]/div[1]")).click();
	    
	}

	@When("User should click the text box and enter all the details")
	public void User_should_click_the_text_box_and_enter_all_the_details() throws InterruptedException {
	    
		driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Arav");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Aravind@demoqa.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("No 21 , neela nagar, 2nd street , Chennai-100");
		
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("No 21 , neela nagar, 2nd street , Chennai-100");
		
	}
	@When("User should click the submit button")
	public void User_should_click_the_submit_button() throws AWTException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		 
		driver.findElement(By.xpath("//button [@Id='submit']")).click();
		
		
		   
		
	}
	
	@When("User should click the check box")
	public void User_should_click_the_check_box() throws InterruptedException {
	    
		driver.findElement(By.xpath("//span[normalize-space()='Check Box']")).click();
		
		//driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click();
		//label[text()='Permanent Address']//following::div//button
		driver.findElement(By.xpath("//label[text()='Permanent Address']//following::div//button")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		 
		
	}
	@When("User should click the home  button and click workfile.doc")
	public void user_should_click_the_home_button_and_click_workfile_doc() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Word File.doc')]")).click();
		
		
		
		 
		
	}
	@When("User should click the radiobutton option")
	public void user_should_click_the_radiobutton_option() {
		driver.findElement(By.xpath("//span[normalize-space()='Radio Button']")).click();
		
	    
	}
	@When("User should click the yes for the answer")
	public void user_should_click_the_yes_for_the_answer() {
		driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
		
	    
	}
	@When("User should click the button option")
	public void user_should_click_the_button_option() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Buttons']")).click();
		
	   
	}
	@When("User should click the double click")
	public void user_should_click_the_double_click() throws InterruptedException {
		
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]")); 
		act.doubleClick(ele).perform();
		
		
	}

@When("User should click the webtable option")
public void user_should_click_the_webtable_option() {
	driver.findElement(By.xpath("//span[normalize-space()='Web Tables']")).click();
}
@When("User should click the edit option and submit")
public void user_should_click_the_edit_option_and_submit() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	driver.findElement(By.xpath("//span[@id='edit-record-2']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")).click();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Arav");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kum");
	driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	

	
}

@When("User should click the radio_button option")
public void user_should_click_the_radio_button_option() {
	driver.findElement(By.xpath("//span[normalize-space()='Radio Button']")).click();
	
    
    
}
@When("User should click the Impressive")
public void user_should_click_the_Impressive() throws InterruptedException {
	driver.findElement(By.xpath("//label[normalize-space()='Impressive']")).click();
	
	
	
	
	
    
   
}
@When("User should click the delete button")
public void user_should_click_the_delete_button() throws InterruptedException {
	driver.findElement(By.xpath("//span[@id='delete-record-3']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")).click();
	
	
	
	
	
    
   
}
@When("User should click the Rightclick option")
public void user_should_click_the_Rightclick_option() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	
	Actions act = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//button[@id='rightClickBtn']")); 
	act.contextClick(ele).perform();
	
	
}

@When("User should click the link option")
public void user_should_click_the_link_option() throws InterruptedException {
	driver.findElement(By.xpath("//span[normalize-space()='Links']")).click();
	
	
	
	
   
   
}
@When("User should click the notfound option")
public void user_should_click_the_notfound_option() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.xpath("//a[@id='invalid-url']")).click(); 
	
	
	
}
@When("User should click the brokenlink option")
public void user_should_click_the_brokenlink_option() throws InterruptedException {
	driver.findElement(By.xpath("//span[normalize-space()='Broken Links - Images']")).click();
	
	
	
	
   
   
}
@When("User should click the brokenlink")
public void user_should_click_the_brokenlink() throws InterruptedException {
	
	

	
	
	driver.findElement(By.xpath("//a[translate(normalize-space(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')='click here for broken link']")).click(); 
	
	
	
}
//@When("User should click the validlink option")
//public void user_should_click_the_validlink_option() throws InterruptedException {
	//driver.findElement(By.xpath("//span[normalize-space()='Broken Links - Images']")).click();}
	
	
	
	
   
   

@When("User should click the validlink")
public void user_should_click_the_validlink() throws InterruptedException {
	
	

	
	
	driver.findElement(By.xpath("//a[normalize-space()='Click Here for Valid Link']")).click(); 
	
	
	
}
@When("User should click the forbidden option")
public void user_should_click_the_forbidden_option() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.xpath("//a[@id='forbidden']")).click(); 
	Thread.sleep(3000);
	
	
}

@When("User should click the unauthorized option")
public void user_should_click_the_unauthorized_option() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.xpath("//a[@id='unauthorized']")).click(); 
	
	
	
}

@When("User should click the created option")
public void user_should_click_the_created_option() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.xpath("//a[@id='created']")).click(); 
	
	
	
}
@When("User should click the nocontent option")
public void user_should_click_the_nocontent_option() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.xpath("//a[@id='no-content']")).click(); 
	
	
	
}

@When("User should click the moved option")
public void user_should_click_the_moved_option() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.xpath("//a[@id='moved']")).click(); 
	
	
	
}


@When("User should click the badrequest option")
public void user_should_click_the_badrequest_option() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.xpath("//a[@id='bad-request']")).click(); 
	
	
	
}
@When("User should click the home option")
public void user_should_click_the_home_option() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.xpath("//a[@id='simpleLink']")).click(); 
	
	
	
}
@When("User should click the homevPSkr option")
public void user_should_click_the_homevPSkr_option() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.xpath("//a[@id='dynamicLink']")).click(); 


	
	
}

@When("User should click the edit option and edit salary")
public void user_should_click_the_edit_option_and_edit_salary() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	driver.findElement(By.xpath("//span[@id='edit-record-2']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")).click();
	driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("200");
     driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	

	
}

@When("User should click the edit option and edit age")
public void user_should_click_the_edit_option_and_edit_age() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	driver.findElement(By.xpath("//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")).click();
	
	driver.findElement(By.xpath("//input[@id='age']")).sendKeys("19");
     driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	

	
}
@When("User should click the edit option and edit email")
public void user_should_click_the_edit_option_and_edit_email() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	driver.findElement(By.xpath("//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")).click();
	
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("aravindk1994@gmail.com");
     driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	

	
}
@When("User should click the edit option and change department")
public void user_should_click_the_edit_option_and_change_department() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	driver.findElement(By.xpath("//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")).click();
	Actions act = new Actions(driver);
	WebElement elem =driver.findElement(By.xpath("//input[@id='department']")); 
	elem.click();
	act.doubleClick(elem).perform();
	elem.sendKeys("legal");
	
     driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	

	
}@When("User should click the edit option and change lastname")
public void user_should_click_the_edit_option_and_change_lastname() throws InterruptedException {
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	driver.findElement(By.xpath("//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")).click();
	Actions act = new Actions(driver);
	WebElement eleme =driver.findElement(By.xpath("//input[@id='lastName']")); 
	eleme.click();
	act.doubleClick(eleme).perform();
	eleme.sendKeys("abcd");

     driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	

	
}

@SuppressWarnings("deprecation")
@Given("User launch open the url")
public void user_launch_open_the_url() {
     WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	//options.addArguments("headless");
    driver=new ChromeDriver(options);
    driver.get("https://demo.cyclos.org/ui/home");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//div[text()=' Login ']")).click();
}

@When("User should enter the {string} and {string}")
public void user_should_enter_the_and(String User, String pass) {
	driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys(User);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
	driver.findElement(By.xpath("//span[text()='Submit']")).click();
}
@When("User should click the edit profile   button")
public void user_should_click_the_edit_profile_button() throws InterruptedException {
	driver.findElement(By.xpath("//a[@href='/users/self/profile/edit']//div[@class='quick-access-icon']//icon//*[name()='svg']")).click();
	   
    driver.findElement(By.xpath("//input[@id='landLinePhoneNumber']")).sendKeys("044-22771317");
    driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")).click();
   
}
@When("User should change the name and add mobile number and click save button")
public void user_should_change_the_name_and_add_mobile_number_and_click_save_button() {
	
}

@When("User should click the switch theme button new  button")
public void user_should_click_the_switch_theme_button_new_button() throws InterruptedException {
    
	driver.findElement(By.xpath("//a[@href='/personal/settings']//div[@class='quick-access-icon']//icon//*[name()='svg']")).click();
	
	
}

@When("User should click the payment button")
public void user_should_click_the_payment_button() throws AWTException, InterruptedException {
    
    driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
     driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys(" Car");
     driver.findElement(By.xpath("//a[text()=' Car repair ']")).click();
     driver.findElement(By.xpath(" //input[@id='id_4']")).sendKeys("100");
    
     driver.findElement(By.xpath("//div[@class='w-100 mw-100 text-truncate pr-3']"));
     driver.findElement(By.xpath("//span[text()='Next']")).click();
     
     driver.findElement(By.xpath("//span[text()='Confirm']")).click();
     
    /*WebElement drop = driver.findElement(By.xpath("//button[@class='btn btn-icon ml-2']"));
    drop.click();
    driver.findElement(By.xpath("//a[text()=' Car repair ']")).click();
    driver.findElement(By.xpath("//input[contains(@id,'id')]")).sendKeys("200");
    driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
    driver.findElement(By.xpath("//textarea[contains(@id,'id')]")).sendKeys("Payment done");
    driver.findElement(By.xpath("//span[text()='Next']")).click();*/
    
}
@When("User should enter the value and click confirm button")
public void user_should_enter_the_value_and_click_confirm_button() {
    
	//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
	
}

@When("User should click the directory button")
public void User_should_click_the_directory_button() throws AWTException, InterruptedException {
    

	driver.findElement(By.xpath("//a[@href='/users/search']")).click();
	driver.findElement(By.xpath("//div[normalize-space()='My vouchers']")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Buy vouchers')]")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Cinema voucher']")).click();
	//driver.findElement(By.xpath("//input[contains(@class,'form-control text-right ng-untouched ng-pristine ng-valid')]")).sendKeys("100");
	driver.findElement(By.xpath("//span[text()='Amount']//following::div//input[@class='form-control text-right ng-untouched ng-pristine ng-valid']")).sendKeys("100");
	
	driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='Confirm']")).click();
	
	////span[text()='Amount']//following::div//input[@class='form-control text-right ng-valid ng-dirty ng-touched']
	//driver.findElement(By.xpath("//a[@href='/users/messages/search']//div[@class='quick-access-icon']")).click();
   
   // driver.findElement(By.xpath("//div[contains(text(),'New message')]")).click();
    //driver.findElement(By.xpath("//button[@id='id_11']")).click();
   //Select select = new Select( driver.findElement(By.xpath("//button[@id='id_2']")));
   //select.selectByVisibleText("User");
   
    
    //driver.findElement(By.xpath("//button[@class='btn btn-icon ml-2']//icon//*[name()='svg']")).click();
    //driver.findElement(By.xpath("//a[normalize-space()='Alfred Akuffo Addo']")).click();
    //driver.findElement(By.xpath("//div[@id='id_212_editor']")).sendKeys("Hi, This is test 1 2 3 4");
    //driver.findElement(By.xpath("//span[normalize-space()='Send']")).click();
    
    
    
    
}

@When("User should click My vouchers and click Buy vouchers and send button")
public void User_should_click_My_vouchers_and_click_Buy_vouchers_and_send_button() {
    
	//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
	
}


@When("User should click scheduled payment")
public void user_should_click_scheduled_payment() {
	driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
	driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")).click();
	//driver.findElement(By.xpath("//th[text()='Due date']//parent::thead//following::td//a[text()=' 08/05/2023 ']")).click();
	//driver.findElement(By.xpath("//div[text()='Cancel this scheduled payment']")).click();
	//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
	
	
}

@When("User should click the member account button")
public void user_should_click_the_member_account_button() {
    driver.findElement(By.xpath("//a[@href='/banking/self/payment-requests']//div[@class='quick-access-icon']//icon//*[name()='svg']")).click();
    driver.findElement(By.xpath("//div[normalize-space()='Member account']")).click();

}
@When("User should click car repair details and validate that")
public void user_should_click_car_repair_details_and_validate_that() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



/*@When("User should click the add newest  button")
public void user_should_click_the_add_newest_button() throws AWTException, InterruptedException {
    
    driver.findElement(By.xpath("//a[@href='/users/contacts']")).click();
    driver.findElement(By.xpath("//div[contains(text(),'Add new')]")).click();
    driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("ar");
    driver.findElement(By.xpath("//a[normalize-space()='Ariadne']")).click();
    driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")).click();
    
    
    
}

@When("User should enter the value and click the submit button")
public void user_should_enter_the_value_and_click_the_submit_button() {
    
	//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
	
}*/



	







}
