package com.example.StepDefinitions;

import com.example.base.BaseClass;
import com.example.page.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeStepDef extends BaseClass {

  @Before
  public void setup() {
    setDriver();
  }

  @After
  public void tearDown() throws InterruptedException {
    closeDriver();
  }

  @Given("user open the web page")
  public void userOpenTheWebPage() throws InterruptedException {
    navigateToHome();
  }

  @When("user search {string} on search bar")
  public void userSearchOnSearchBar(String search) {
    HomePage.inputSearchBar(search);
  }

  @When("user click Home and Food")
  public void userClickHomeAndFood() {
    HomePage.clickBtnHomeAndFood();
  }

  @And("user click Dekorasi rumah")
  public void userClickDekorasiRumah() {
    HomePage.clickBtnDekorasiRumah();
  }


}
