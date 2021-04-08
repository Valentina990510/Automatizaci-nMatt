package net.mattelsa.tasks;

import net.mattelsa.interactions.StringToTarget;
import net.mattelsa.models.FeaturesModel;
import net.mattelsa.userintefaces.FeaturesClothes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class AddToCart implements Task {

    private FeaturesModel featuresModel;

    public AddToCart(FeaturesModel featuresModel) {
        this.featuresModel = featuresModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

       actor.attemptsTo(
              // WaitUntil.the(FeaturesClothes.AMOUNT, isEnabled()).forNoMoreThan(10).seconds(),
               Enter.theValue(featuresModel.getAmount()).into(FeaturesClothes.AMOUNT),
               WaitUntil.the(StringToTarget.sizes(featuresModel.getSize()), isEnabled()).forNoMoreThan(10).seconds(),
               Click.on(StringToTarget.sizes(featuresModel.getSize())),
               Click.on(FeaturesClothes.ADDTOCART),
               Click.on(FeaturesClothes.GOTOCART));
    }

    public static AddToCart on(FeaturesModel feature){
        return Tasks.instrumented(AddToCart.class,feature);
    }
}
