package common;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class PreTest {
  public static WebDriver driver;

  public static void beforeTest(String browser) {
    switch (browser) {
      case "firefox":
        firefox();
        break;
      case "firefox-headless":
        firefoxHeadless();
        break;
    }

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().window().setSize(new Dimension(1280, 960));
  }

  static void firefox() {

    driver = new FirefoxDriver();
  }

  public static void firefoxHeadless() {

    FirefoxBinary firefoxBinary = new FirefoxBinary();
    firefoxBinary.addCommandLineOptions("--headless");
    FirefoxOptions firefoxOptions = new FirefoxOptions();
    firefoxOptions.setBinary(firefoxBinary);

    driver = new FirefoxDriver(firefoxOptions);
  }

  static void chrome() {

    driver = new ChromeDriver();
  }

  public static void chromeHeadless() {

    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--headless");
  }
}
