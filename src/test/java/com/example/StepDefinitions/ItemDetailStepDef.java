package com.example.StepDefinitions;

import com.example.page.AddToCartPage;
import com.example.page.CartPage;
import com.example.page.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ItemDetailStepDef {
  @When("user add quantity {string} on item detail page")
  public void userAddQuantityOnItemDetailPage(String qty) {
    AddToCartPage.inputQty(qty);
  }

  @When("user click add to cart confirmation pop up")
  public void userClickAddToCartConfirmationPopUp() {
    AddToCartPage.clickBtnPopUpYa();
  }

  @Then("user can see the price is {string}")
  public void userCanSeeThePriceIs(String price) {
    Assert.assertEquals(price, SearchResultPage.getItemPrice());
  }
}
