package com.example.page;

import com.example.base.BaseClass;

import java.util.concurrent.TimeUnit;

import static com.example.locator.SearchResultLocator.FIRST_ITEM;
import static com.example.locator.SearchResultLocator.LABEL_PRODUK_TERLARIS;

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
}
