package com.cucumber.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\java\\com\\driver\\seventysix\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				throw new RuntimeException("Please specify valid browser Name");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();

		}
	}
	
	public static void doubleclick(
			WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.doubleClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public static boolean elementIsDisplayed(WebElement element) {

		try {
// WebElement element = driver.findElement(By.id(""));
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static boolean elementIsEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void waitforElementVisibility(WebElement element) {
		try {
			WebDriverWait wd = new WebDriverWait(driver, 20);
			wd.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void driverQuit(WebDriver driver) {
		driver.quit();
	}

	public static void waitforTextPresentOnElement(WebElement element, String text) {
		try {
			WebDriverWait wd = new WebDriverWait(driver, 20);
			wd.until(ExpectedConditions.textToBePresentInElement(element, text));
		} catch (Exception e) {
// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void inputValuestoWebElement(WebElement element, String value) {
		try {
			waitforElementVisibility(element);
			boolean elementIsDisplayed = elementIsDisplayed(element);
			boolean elementIsEnabled = elementIsEnabled(element);
			if (elementIsEnabled && elementIsDisplayed) {
// element.clear();
				element.sendKeys(value);
			}
		} catch (Exception e) {
// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	

	public static String getTextInWebElement(WebElement element) throws Exception {
		try {
			String text = element.getText();
			return text;
		} catch (Exception e) {

			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void clickOnWebElement(WebElement element) {
		try {
			waitforElementVisibility(element);
			if (elementIsDisplayed(element)) {
				element.click();
			}
		} catch (Exception e) {
// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void mouseHoverToTheElemnet(WebElement element) {
		try {
			waitforElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void mouseClickToTheElemnet(WebElement element) {
		try {
			waitforElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).click().build().perform();
		} catch (Exception e) {
// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void pickMultipleDatesforRoundTrip(WebElement element, String frmdate, String toDate)
			throws InterruptedException {

		try {
// FROM
			String[] frmSplitDate = frmdate.split("/");
			String frmGivenDate = frmSplitDate[0];
			String frmGivenMonth = frmSplitDate[1];
			int frmUserDate = Integer.parseInt(frmGivenDate);
			int frmUserMonth = Integer.parseInt(frmGivenMonth);
			String frmMonth = Month.of(frmUserMonth).name();
			String frmMonthInShort = frmMonth.substring(0, 1).toUpperCase() + frmMonth.substring(1, 3).toLowerCase();
// TO
			String[] toSplitDate = toDate.split("/");
			String toGivenDate = toSplitDate[0];
			String toGivenMonth = toSplitDate[1];
			int toUserDate = Integer.parseInt(toGivenDate);
			int toUserMonth = Integer.parseInt(toGivenMonth);
			String toMonth = Month.of(toUserMonth).name();
			String toMonthInShort = toMonth.substring(0, 1).toUpperCase() + toMonth.substring(1, 3).toLowerCase();
			Calendar cal = Calendar.getInstance();
			int currMonth = cal.get(Calendar.MONTH);
			System.out.println(currMonth);
			String upperCase = frmMonth.substring(0, 1).toUpperCase()
					+ frmMonth.substring(1, frmMonth.length()).toLowerCase();
			System.out.println(upperCase);

			System.out.println(toMonthInShort);
			for (int i = 1; i <= frmUserMonth - (currMonth + 1); i++) {
				WebElement nxtMonth = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
				nxtMonth.click();
			}
			currMonth = frmUserMonth;
			Thread.sleep(1000);
			WebElement fromDate = driver.findElement(
					By.xpath("//div[contains(@aria-label,'" + frmMonthInShort + " " + frmUserDate + "')]"));
			fromDate.click();
			Thread.sleep(1000);
			for (int i = 1; i <= toUserMonth - (currMonth + 1); i++) {
				WebElement nxtMonth = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
				nxtMonth.click();
			}
			Thread.sleep(1000);
			WebElement tDate = driver
					.findElement(By.xpath("//div[contains(@aria-label,'" + toMonthInShort + " " + toUserDate + "')]"));
			Thread.sleep(1000);
			tDate.click();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to pick a date");
		}
	}

	public static void selectValueDropdown(WebElement element, String value) {
		try {
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable toselect value from dropdown");

		}

	}

	public static void scrollbyUsingElement(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", element);
		} catch (Exception e) {
			throw new RuntimeException("Unable to Scroll");
		}
	}

	public static void scrollbyCoordinates(int height, int width) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("windows.scrollBy(" + width + "," + height + ")");
		} catch (Exception e) {
			throw new RuntimeException("Unable to Scroll");
		}
	}

	public static void sendKeysUsingActions(WebElement element, String value) {
		try {
			Actions ac = new Actions(driver);
			ac.sendKeys(element, value).build().perform();
			;
		} catch (Exception e) {
			throw new RuntimeException("Unable to sendKeysUsingActions");
		}
	}

	public static void clickUsingActions(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
			;
		} catch (Exception e) {
			throw new RuntimeException("Unable to sendKeysUsingActions");
		}
	}

	public static void dragAndDropUsingActions(WebElement src, WebElement tar) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(src, tar).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to drag and Drop");
		}
	}

	public static File tkScreenshot(String filename) throws IOException {
		try {
//File dest = new File(System.getProperty("user.dir"+"/Screenshots.png"));
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\cucumber\\reports\\screenshotone"+filename+".png");
			System.out.println("screenshot");

			
			//System.out.println("taking");
			//File temp = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, dest);
			return dest;
		} catch (WebDriverException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}
	
	public static String excelRead(int row, int cell) throws IOException {

		File f = new File("D:\\Excel.xlsx");
		FileInputStream fin = new FileInputStream(f);

		// .xlsx - XSSFWORKBOOK or .xls - HSSFWORKBOOK
		Workbook wb = new XSSFWorkbook(fin);
		Sheet sheet = wb.getSheet("Sheet1");
		Cell c = sheet.getRow(row).getCell(cell);
		CellType cellType = c.getCellType();
		String cellValue = null;
		if (cellType.equals(CellType.STRING)) {
			cellValue = c.getStringCellValue();
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = c.getNumericCellValue();
			long l = (long) numericCellValue;
			cellValue = String.valueOf(l);
		}
		System.out.println(cellValue);
		return cellValue;
	}

	public static  void Switch_multiplewindow(int id) {
		
		Set<String> pid=driver.getWindowHandles();
		List<String> cid= new ArrayList<String>(pid);
		cid.addAll(pid);
		driver.switchTo().window(cid.get(id));
		
	}
	}

/*
 * public static void main(String[] args) { Calendar cal =
 * Calendar.getInstance(); int currMonth = cal.get(Calendar.MONTH);
 * System.out.println(currMonth+1); }
 */

