package com.example.locator;

import org.openqa.selenium.By;

public interface CartLocator {
  By BUTTON_UBAH_KURIR = By.xpath("//a[contains(text(), 'Ubah Kurir')]");
  By BUTTON_POP_UP_BATAL = By.xpath("//a[contains(text(), 'Batal')]");
  By BUTTON_POP_UP_HAPUS = By.cssSelector("td[class*='btn cartfont'] a:last-of-type");
  By BUTTON_POP_UP_OK = By.cssSelector("a[id*='chkDelPopY']");
  By LABEL_EMPTY_CART = By.xpath("//strong[contains(text(), 'Tidak ada produk di Shopping Cart.')]");
}
