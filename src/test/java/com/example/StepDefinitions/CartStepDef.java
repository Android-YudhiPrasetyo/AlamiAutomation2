package com.example.StepDefinitions;

import com.example.page.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartStepDef {
  @When("user click Ubah kurir on cart page")
  public void userClickUbahKurirOnCartPage() {
    CartPage.clickBtnUbahKurir();
  }

  @When("user click Batal button on cart page")
  public void userClickBatalButtonOnCartPage() {
    CartPage.clickBtnPopUpBatal();
  }

  @When("user click Hapus button on cart page")
  public void userClickHapusButtonOnCartPage() {
    CartPage.clickBtnPopUpHapus();
  }

  @When("user click OK button on delete confirmation pop up")
  public void userClickOKButtonOnDeleteConfirmationPopUp() {
    CartPage.clickBtnPopUpOK();
  }

  @Then("user can see there is no product on cart page")
  public void userCanSeeThereIsNoProductOnCartPage() {
    Assert.assertEquals("Tidak ada produk di Shopping Cart.", CartPage.getLabelEmptyItem());
  }
}
