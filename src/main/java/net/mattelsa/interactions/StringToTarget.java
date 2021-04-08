package net.mattelsa.interactions;

import net.mattelsa.userintefaces.FeaturesClothes;
import net.mattelsa.userintefaces.GoCategories;
import net.serenitybdd.screenplay.targets.Target;

public class StringToTarget   {
    private StringToTarget() { }

    public static Target categories(String nombre) {
        return GoCategories.CATEGORIES.of(nombre);
    }
    public static Target sizes(String size){return FeaturesClothes.SIZE.of(size); }

}
