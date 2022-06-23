package com.example.locator;

import org.openqa.selenium.By;

public interface SearchResultLocator {
  By LABEL_PRODUK_TERLARIS = By.xpath("//a[contains(text(), 'Produk terlaris')]");
  By FIRST_ITEM = By.cssSelector("li[id*='prod_28911164'] a[class*='pordLink notranslate']");
  By FIRST_ITEM_DEKORASI_RUMAH = By.cssSelector("ul[class*='prodListType'] ul:first-of-type li[class*='itemList']:first-of-type a[class*='pordLink notranslate']");
  By ITEM_PRICE = By.cssSelector("span[class*='price notranslate']");
}
