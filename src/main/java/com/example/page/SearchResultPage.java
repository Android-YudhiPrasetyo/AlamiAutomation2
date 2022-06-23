package com.example.page;

import com.example.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static com.example.locator.SearchResultLocator.*;

public class SearchResultPage extends BaseClass {

  public static void clickLabelProductTerlaris(String tab) {
    if(tab.equalsIgnoreCase("Produk terlaris")) {
      driver.findElement(LABEL_PRODUK_TERLARIS).click();
    }
  }

  public static void clickFirstItem() {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(FIRST_ITEM).click();
  }

  public static String getItemPrice() {
    return driver.findElement(ITEM_PRICE).getText();
  }

  public static void clickFirstItemDekorasiRumah() throws InterruptedException {
    scrollDown();
    driver.findElement(FIRST_ITEM_DEKORASI_RUMAH).click();
  }

  public static void scrollDown() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350);");
    Thread.sleep(3000);
  }
}
