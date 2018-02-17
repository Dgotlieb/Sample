import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    private static WebDriver driver;

    @BeforeClass
    public static void setup1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\daniel.gotlieb\\Desktop\\Latest web drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    }
	//12j
	//ss


	  
    public void d123(){
        driver.get("https://translate.google.com/");
    }
}
