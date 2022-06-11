package com.example.locator;

import org.openqa.selenium.By;

public interface HomeLocator {
  By INPUT_SEARCH = By.cssSelector("div[class*='header-big'] input[id*='AKCKwd']");
  By BUTTON_SEARCH = By.cssSelector("div[class*='header-big'] button[class*='btn-search']");
}
