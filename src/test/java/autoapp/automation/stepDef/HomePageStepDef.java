package autoapp.automation.stepDef;

import autoapp.automation.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePageStepDef {


    @When("^I hover on mega menu ([^\"]*) and click on ([^\"]*)$")
    public void iHoverOnMegaMenuMenuAndClickOnSubMenu(String menu, String subMenu) throws InterruptedException {
        HomePage.hoverClickMegaMenu(menu, subMenu);
        Thread.sleep(5000);
    }

    @Then("^I should be able to view ([^\"]*) page$")
    public void iShouldBeAbleToViewSubMenuPage(String pageName) {
        HomePage.validatePageTitle(pageName);
    }
}




