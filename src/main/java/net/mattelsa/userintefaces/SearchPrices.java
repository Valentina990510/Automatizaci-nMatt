package net.mattelsa.userintefaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import java.util.List;

public class SearchPrices extends PageObject {

    public List<WebElementFacade> listPrices(){
        List<WebElementFacade> list= findAll(By.xpath("//span[@class='price']"));
        return  list;
    }

    public List<WebElementFacade> listclothes(){
        List<WebElementFacade> clothes=findAll(By.xpath("//div[@class='lzy_img img-responsive']"));
        return clothes;
    }
}
