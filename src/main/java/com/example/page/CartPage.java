package com.example.page;

import com.example.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.example.locator.CartLocator.*;

public class CartPage extends BaseClass {

  public static void clickBtnUbahKurir() {
    driver.findElement(BUTTON_UBAH_KURIR).click();
  }

  public static void clickBtnPopUpBatal() {
    driver.switchTo().frame("ifrLayer");
    WebElement clickBtnBatal = driver.findElement(BUTTON_POP_UP_BATAL);
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click()", clickBtnBatal);
    driver.switchTo().parentFrame();
  }

  public static void clickBtnPopUpHapus() {
    driver.findElement(BUTTON_POP_UP_HAPUS).click();
  }

  public static void clickBtnPopUpOK() {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(BUTTON_POP_UP_OK).click();
  }

  public static String getLabelEmptyItem() {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    return driver.findElement(LABEL_EMPTY_CART).getText();
  }
}
