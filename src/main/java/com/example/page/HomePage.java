package com.example.page;

import com.example.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import static com.example.locator.HomeLocator.*;

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

  public static void clickBtnHomeAndFood() {
    driver.findElement(LINK_CATEGORY_HOME_AND_FOOD).click();
  }

  public static void clickBtnDekorasiRumah() {
    driver.findElement(LINK_CATEGORY_DEKORASI_RUMAH).click();
  }

  public static void clickBtnEleveniaRecommended() {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(LINK_ELEVENIA_RECOMMENDED).click();
  }
}
