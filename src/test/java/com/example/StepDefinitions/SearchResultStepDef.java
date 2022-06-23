package com.example.StepDefinitions;

import com.example.page.AddToCartPage;
import com.example.page.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SearchResultStepDef {
  @When("user click {string} on search result page")
  public void userClickOnSearchResultPage(String tab) {
    SearchResultPage.clickLabelProductTerlaris(tab);
  }

  @When("user click the first product on search result page")
  public void userClickTheFirstProductOnSearchResultPage() {
    SearchResultPage.clickFirstItem();
  }

  @When("user add item to cart")
  public void userAddItemToCart() {
    AddToCartPage.clickBtnTambahKeCart();
  }

}
