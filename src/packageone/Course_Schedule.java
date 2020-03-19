package packageone;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Course_Schedule extends Globals{
	
	
	WebDriver driver = new FirefoxDriver();
	By StudenName = By.xpath("//input[@id='input_9_1']");
	By StudetEmailId = By.xpath("//input[@id='input_9_2']");
	By StudentContactNumber = By.name("input_3");
	By StundentModeOfTraining = By.cssSelector("#input_9_5");
	By StudentState = By.xpath("//input[@id='input_9_16']");
	By SubmitButton = By.xpath("//input[@id='gform_submit_button_9']");
	By HeaderError = By.xpath("//div[@class='validation_error']");
	By FieldError = By.xpath("//div[@class='gfield_description validation_message']");
	
	@Test
	public void Student_Enrolment() throws InterruptedException {
		Thread.sleep(4000);
		WebElement Name_Field = driver.findElement(StudenName);
		Scroll(Name_Field);
		Thread.sleep(4000);
		
		driver.findElement(StudenName).sendKeys(DataMap.get("Student_Name"));
		//Thread.sleep(2000);
		driver.findElement(StudetEmailId).sendKeys(DataMap.get("Student_Email_Id"));
		//Thread.sleep(2000);
		driver.findElement(StudentContactNumber).sendKeys(DataMap.get("Student_Phone_No"));
		
		WebElement Mode_Of_Training = driver.findElement(StundentModeOfTraining);		
		Select MOT = new Select(Mode_Of_Training);
		MOT.selectByVisibleText(DataMap.get("Student_Mode_Of_Training"));
		
		driver.findElement(StudentState).sendKeys(DataMap.get("Student_State"));
		
		driver.findElement(SubmitButton).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		String Header_Error = driver.findElement(HeaderError).getText();
		System.out.println(Header_Error);
		
		String Header_Error_Expected_value = "There was a problem with your submission. Errors have been highlighted below.";
		
		
		if(Header_Error.equals(Header_Error_Expected_value)) {
			System.out.println("Error at header is as per the requirement");
		}else {
			System.out.println("Error at header is not as per the requirement");
		}
		
		String Field_Error = driver.findElement(FieldError).getText();
		System.out.println(Field_Error);
		String Field_Error_Expected_Value = "This field is required.";
		
		if(Field_Error.equals(Field_Error_Expected_Value)) {
			System.out.println("Error is displayed as per the requrement");
		}else {
			System.out.println("Error is not displayed as per the requrement");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//WebDriver driver = new ChromeDriver();
	//WebDriver driver = new InternetExplorerDriver();
	
/*	switch(browser) {
		case Firefox:
			WebDriver driver = new FirefoxDriver();
			break;
		case Chrome:
			WebDriver driver = new chromeDriver();
	}*/
	
	@BeforeTest
	public void Navigate() throws InterruptedException {
		//driver.get("https://nareshit.in/");
		driver.get("https://nareshit.in/course-schedule/");
		//driver.navigate().to("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		//driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	//	driver.navigate().to("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void Close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	public void Screenshot() throws IOException {
		TakesScreenshot TSS = ((TakesScreenshot)driver);
		File Screen_Shot = TSS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screen_Shot, new File("C:\\Users\\Satish\\eclipse-workspace\\9_30_to_10_30_batch\\Screenshots\\Courses_Schedule.png"));
	}
	
	
	@Test
	public void WebTables() throws InterruptedException {
		LinkedList<String> Courses = new LinkedList<String>();
		LinkedList<WebElement> Courses_Ele = new LinkedList<WebElement>();
		
		Courses_Ele.addAll(driver.findElements(By.xpath("//table[@id='tablepress-37']/tbody/tr/td[1]/b/a")));
		
		for(int Ele=0;Ele<Courses_Ele.size();Ele++) {
			//String Value = Courses_Ele.get(Ele).getText();
			Courses.add(Courses_Ele.get(Ele).getText());
		}
		System.out.println(Courses);
		
		
		driver.findElement(By.xpath("//th[@class='column-1 sorting']")).click();
		Thread.sleep(2000);
		List<WebElement> After_app_sort = driver.findElements(By.xpath("//table[@id='tablepress-37']/tbody/tr/td[1]/b/a"));
		LinkedList<String> After_App_Sort_values = new LinkedList<String>();
		
		for(int ele=0;ele<After_app_sort.size();ele++) {
			After_App_Sort_values.add(After_app_sort.get(ele).getText());
		}
		System.out.println(After_App_Sort_values);
		
		Collections.sort(Courses);
		System.out.println(Courses);
		
		if(Courses.equals(After_App_Sort_values)) {
			System.out.println("Sort on Courses column is working fine");
		}else {
			System.out.println("Sort on courses column is not working fine.");
		}
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Search:')]//input")).sendKeys("CORE JAVA");
		
		List<WebElement> Faculty = driver.findElements(By.xpath("//table[@id='tablepress-37']/tbody/tr/td[2]"));		
		
		LinkedList<String> Faculty_Name = new LinkedList<String>();
		for(int i=0;i<Faculty.size();i++) {
			Faculty_Name.add(Faculty.get(i).getText());
		}
		System.out.println(Faculty_Name);
		
		driver.findElement(By.xpath("//td[contains(text(),'Mr. Kishan')]/../td[1]/b/a")).click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void PopUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='snp-close snp_nothanks']")).click();
	}
	
	public void Scroll(WebElement Element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement Submit_Button = element;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(5000);
	}
	
	
	
	
	
	public void Mouse_Hover() throws InterruptedException {
		WebElement Move_To = driver.findElement(By.xpath("//span[text()='New Batches']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(Move_To);
		act.perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='menu-item-2306']//span[contains(text(),'New Batches')]")).click();
	}
	
	public void Windows() throws InterruptedException {
		WebElement Sprint_MVC = driver.findElement(By.xpath("//a[text()='Spring MVC']"));
		Scroll(Sprint_MVC);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Spring MVC']")).click();
		Thread.sleep(5000);
		
		String Current_Window = driver.getWindowHandle();
		//System.out.println(Current_Window);
		
		//for(int)
		
		LinkedList<String> Windows = new LinkedList<String>();
		Windows.addAll(driver.getWindowHandles());
		
		driver.switchTo().window(Windows.get(1));
		
		String Value = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		System.out.println(Value);
		
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(Current_Window);
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		//LinkedList<String> windows = driver.getgetWindowHandles();
		
		//driver.switchTo().window(windows.)
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Drag_Drop() {
		WebElement From = driver.findElement(By.xpath("//h1[contains(text(),'Block 3')]"));
		WebElement To = driver.findElement(By.xpath("//h1[contains(text(),'Block 2')]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To);
		act.perform();
		
	}
	
	public void Checkbox() {
		List<WebElement> Checkbox = driver.findElements(By.xpath("//input[@class='cb1-element']"));
	//	String Before_All = driver.findElement(By.xpath("")).getAttribute("value");
		boolean flag = true;
		System.out.println(Checkbox.size());
		for(int i=0;i<Checkbox.size();i++) {
			Checkbox.get(i).click();
			String value = driver.findElement(By.id("check1")).getAttribute("value");
			if(value.equals("Check All")) {
				if(i<Checkbox.size()-1) {
					continue;
				}else {
					flag=false;
				}
			}else {
				if(i==Checkbox.size()-1) {
					continue;
				}else {
					flag= false;
				}
			}
		}
		
		
		if(flag==false) {
			System.out.println("The Check All funcionality is not working fine.");
		}else {
			System.out.println("Check All functionality is working fine.");
		}
		
		
		
		
		
	}
	
	public void Radio_Button() {
		
		String Gender = driver.findElement(By.xpath("(//input[@value='Female'])[2]")).getAttribute("value");
		System.out.println(Gender);
		driver.findElement(By.xpath("(//input[@value='Female'])[2]")).click();
		
		String Age = driver.findElement(By.xpath("//label[contains(text(),'15 to 50')]/input")).getAttribute("value");
		System.out.println(Age);
		driver.findElement(By.xpath("//label[contains(text(),'15 to 50')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();
		
		String Output = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
		System.out.println(Output);
		
		if(Output.contains(Gender)&&Output.contains(Age)) {
			System.out.println("Output contains the selected values");
		}else {
			System.out.println("Output doesnt contain the selected value");
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
