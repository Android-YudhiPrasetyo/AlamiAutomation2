package com.example.locator;

import org.openqa.selenium.By;

public interface HomeLocator {
  By INPUT_SEARCH = By.cssSelector("div[class*='header-big'] input[id*='AKCKwd']");
  By BUTTON_SEARCH = By.cssSelector("div[class*='header-big'] button[class*='btn-search']");
  By LINK_CATEGORY_HOME_AND_FOOD = By.cssSelector("i[class*='ico-meta-home']");
  By LINK_CATEGORY_DEKORASI_RUMAH = By.cssSelector("a[id*='home-dekorasi-rumah-ruang-tidur-kamar-mandi']");
  By LINK_ELEVENIA_RECOMMENDED = By.xpath("//a[contains(text(), 'elevenia Recommended')]");
}
