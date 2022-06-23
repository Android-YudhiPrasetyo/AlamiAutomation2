package com.example.StepDefinitions;

import com.example.page.HomePage;
import com.example.page.SearchResultPage;
import io.cucumber.java.en.And;

public class DekorasiRumahStepDef {
  @And("user click elevenia recommended")
  public void userClickEleveniaRecommended() {
    HomePage.clickBtnEleveniaRecommended();
  }

  @And("user click the first item")
  public void userClickTheFirstItem() throws InterruptedException {
    SearchResultPage.clickFirstItemDekorasiRumah();
  }
}
