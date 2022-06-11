package com.example.locator;

import org.openqa.selenium.By;

public interface AddToCartLocator {
  By INPUT_QUANTITY = By.cssSelector("input[id*='optionStock0']");
  By BUTTON_TAMBAH_KE_CART = By.cssSelector("div[class*='btnArea'] a[class*='btnOrange']:first-of-type");
  By BUTTON_POP_UP_YA = By.cssSelector("div[id*='mo_lay144'] div[class*='btnC'] a[class*='btnRed']");
}
