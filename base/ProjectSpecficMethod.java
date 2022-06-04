package com.leaftaps.UI.base;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.leaftaps.UI.utility.ReadExcelData;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ProjectSpecficMethod {
	public RemoteWebDriver driver;
	@BeforeMethod
	public void startbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void endBrwoser() {
		driver.close();
	}
	@DataProvider
	public String[][] testData() throws IOException {
		String[][] readExcelData = ReadExcelData.readData("001");
		return readExcelData;
}
}

