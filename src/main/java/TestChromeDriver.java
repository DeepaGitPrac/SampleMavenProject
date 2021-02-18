import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeDriver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
	System.out.println("Intializing chrome driver");
	}

}
