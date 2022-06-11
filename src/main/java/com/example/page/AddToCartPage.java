package com.example.page;

import com.example.base.BaseClass;
import org.openqa.selenium.WebElement;

import static com.example.locator.AddToCartLocator.*;

public class AddToCartPage extends BaseClass {

  public static void inputQty(String qty) {
    WebElement inputQty = driver.findElement(INPUT_QUANTITY);
    inputQty.click();
    inputQty.clear();
    inputQty.sendKeys(qty);
  }

  public static void clickBtnTambahKeCart() {
    driver.findElement(BUTTON_TAMBAH_KE_CART).click();
  }

  public static void clickBtnPopUpYa() {
    driver.findElement(BUTTON_POP_UP_YA).click();
  }
}
