package net.mattelsa.tasks;


import net.mattelsa.userintefaces.SearchPrices;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.*;

public class ListPrices implements Task {
    SearchPrices searchPrices;
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaPrices;
        listaPrices=searchPrices.listPrices();
        ArrayList list = new ArrayList();
        for (int i=0; i<listaPrices.size();i++){
            list.add(Integer.parseInt(listaPrices.get(i).getText().replaceAll("[$ .]","")));
            //System.out.println(list);
        }


        int index=list.indexOf(Collections.min(list));
        System.out.println("el precio mas barato es" +Collections.min(list));
        System.out.println("el precio mas barato es " +index);

        List<WebElementFacade> listaclothes;
        listaclothes=searchPrices.listclothes();

        actor.attemptsTo(Click.on(listaclothes.get(index)));

    }

    public static ListPrices listPrices(){
        return Tasks.instrumented(ListPrices.class);
    }
}
