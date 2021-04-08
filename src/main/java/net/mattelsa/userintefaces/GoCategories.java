package net.mattelsa.userintefaces;


import net.serenitybdd.screenplay.targets.Target;

public class GoCategories {
    public static final Target CATEGORIES =Target.the("Click in the categories").locatedBy("//span[text()='{0}']");
}
