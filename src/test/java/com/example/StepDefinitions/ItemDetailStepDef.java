package com.example.StepDefinitions;

import com.example.page.AddToCartPage;
import com.example.page.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ItemDetailStepDef {
  @When("user add quantity {string} on item detail page")
  public void userAddQuantityOnItemDetailPage(String qty) {
    AddToCartPage.inputQty(qty);
  }

  @When("user click add to cart confirmation pop up")
  public void userClickAddToCartConfirmationPopUp() {
    AddToCartPage.clickBtnPopUpYa();
  }
}
