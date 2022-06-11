package com.example.page;

import com.example.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

import static com.example.locator.HomeLocator.BUTTON_SEARCH;
import static com.example.locator.HomeLocator.INPUT_SEARCH;

public class HomePage extends BaseClass {

  public static void inputSearchBar(String input) {
    WebElement inputSearch = driver.findElement(INPUT_SEARCH);
    inputSearch.click();
    inputSearch.sendKeys(input);
    inputSearch.sendKeys(Keys.ENTER);
  }

  public static void clickBtnSearchBar() {
    driver.findElement(BUTTON_SEARCH).click();
  }
}
