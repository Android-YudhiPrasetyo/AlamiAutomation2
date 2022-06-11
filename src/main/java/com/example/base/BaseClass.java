package com.example.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseClass {

  public static WebDriver driver;

  public void setDriver() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

  }

  public void navigateToHome() throws InterruptedException {
    driver.get("https://www.elevenia.co.id/");
    driver.manage().window().maximize();
    Thread.sleep(10000);
  }

  public void closeDriver() throws InterruptedException {
    Thread.sleep(5000);
    driver.close();
    driver.quit();
  }
}
