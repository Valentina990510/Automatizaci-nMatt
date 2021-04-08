package net.mattelsa.tasks;

import net.mattelsa.interactions.StringToTarget;
import net.mattelsa.models.CategoriesModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Categories implements Task {

    private CategoriesModel model;

    public Categories(CategoriesModel model) {
        this.model = model;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(StringToTarget.categories(model.getCategories())));
    }

    public static  Categories on(CategoriesModel model){
        return Tasks.instrumented(Categories.class, model);
    }
}
