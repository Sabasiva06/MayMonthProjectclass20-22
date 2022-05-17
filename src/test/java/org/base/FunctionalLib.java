package org.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//class which contains reuseable Methods 
public class FunctionalLib {
	public static WebDriver driver;

	// Browser configuration
	public void getDriver(String browser) {

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid Browser Name");
			break;
		}

		driver.manage().window().maximize();
	}

	// Launch Url
	public void launchUrl(String url) {
		driver.get(url);

	}

	// Method for sendkeys
	public void typeText(WebElement element, String data) {
		element.sendKeys(data);
	}

	// method for click
	public void btnLogin(WebElement element) {
		element.click();

	}

//	public String getDataFromExcel(String sheetName, int rowNo, int cellNo) throws IOException {
//		File file = new File("C:\\Users\\sabas\\eclipse-workspace\\Direct9.30am\\Test Data\\Book1.xlsx");
//		FileInputStream stream = new FileInputStream(file);
//		Workbook workbook = new XSSFWorkbook(stream);
//		Sheet sheet = workbook.getSheet(sheetName);
//		Row row = sheet.getRow(rowNo);
//		Cell cell = row.getCell(cellNo);
//		String value = null;
//		CellType cellType = cell.getCellType();
//		switch (cellType) {
//		case STRING:
//			value = cell.getStringCellValue();
//			break;
//		case NUMERIC:
//			if (DateUtil.isCellDateFormatted(cell)) {
//				Date dateCellValue = cell.getDateCellValue();
//				SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
//				value = format.format(dateCellValue);
//			} else {
//				double numericCellValue = cell.getNumericCellValue();
//				long l = (long) numericCellValue;
//				value = String.valueOf(l);
//			}
//			break;
//		default:
//			System.out.println("Invalid Data");
//			break;
//		}
//		return value;
//	}

	public static Properties getDataFromProeprty() throws IOException {
		// TODO Auto-generated method stub

		// Location of the file
		File file = new File(
				"C:\\Users\\sabas\\eclipse-workspace\\Direct9.30am\\src\\test\\resources\\Conf.properties");

		// For Reading the file,we should use the class called FileReader

		FileReader fileReader = new FileReader(file);

		// For reading the property files
		Properties properties = new Properties();

		properties.load(fileReader);

		return properties;
	}

	public static String getKeyFromPro(String key) throws IOException {

		String string = getDataFromProeprty().get(key).toString();

		return string;

	}
}
