package com.example.StepDefinitions;

import com.example.base.BaseClass;
import com.example.page.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
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
}
