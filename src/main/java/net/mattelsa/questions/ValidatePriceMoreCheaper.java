package net.mattelsa.questions;

import net.mattelsa.userintefaces.FeaturesClothes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;



public class ValidatePriceMoreCheaper implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FeaturesClothes.VALIDATESHOPPINGBAG).viewedBy(actor).asString();
    }

    public static ValidatePriceMoreCheaper validatePriceMoreCheaper (){
        return new ValidatePriceMoreCheaper();
    }
}
