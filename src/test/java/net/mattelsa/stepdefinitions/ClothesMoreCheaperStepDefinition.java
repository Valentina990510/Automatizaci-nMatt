package net.mattelsa.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.mattelsa.models.CategoriesModel;
import net.mattelsa.models.FeaturesModel;
import net.mattelsa.questions.ValidatePriceMoreCheaper;
import net.mattelsa.tasks.AddToCart;
import net.mattelsa.tasks.Categories;
import net.mattelsa.tasks.ListPrices;
import net.mattelsa.utils.WebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

public class ClothesMoreCheaperStepDefinition {

    @Before
    public  void init(){
        setTheStage(OnlineCast.ofStandardActors());
    }

    @Given("^As a user I will enter one of the (.*) that appear on the page$")
    public void asAUserIWillEnterOneOfTheCategoriesThatAppearOnThePage(String categories) {
        theActorCalled("Valentina").can(BrowseTheWeb.with(WebDriver.driver().Pagina("https://www.mattelsa.net/")))
                .attemptsTo(Categories.on(new CategoriesModel(categories)));
    }

    @When("^And I will select the cheapest clothes by selecting the (.*) and (.*)$")
    public void andIWillSelectTheCheapestClothesBySelectingTheQuantityAndSize(String amount, String size) {
        theActorCalled("Valentina").attemptsTo(
                ListPrices.listPrices(),
                AddToCart.on(new FeaturesModel(amount, size))
                );
    }

    @Then("^Validate the total price of the product$")
    public void validateTheTotalPriceOfTheProduct() {
        theActorCalled("Valentina").should(seeThat(ValidatePriceMoreCheaper.validatePriceMoreCheaper(), equalTo("BOLSA DE COMPRAS")));
    }
}
