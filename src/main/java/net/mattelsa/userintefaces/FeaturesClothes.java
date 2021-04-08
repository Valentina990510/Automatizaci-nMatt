package net.mattelsa.userintefaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FeaturesClothes {
    public static final Target AMOUNT =Target.the("Enter the amount").locatedBy("//input[@id='qty']");
    public static final Target SIZE =Target.the("Enter size").locatedBy("//input[@id='attribute133-{0}']");
    public static final Target ADDTOCART =Target.the("Add to cart").located(By.id("add-btn-bag"));
    public static final Target GOTOCART =Target.the("Go to cart").locatedBy("//body/div[3]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/form[1]/div[3]/div[2]/div[3]/div[3]/div[1]/a[1]");
    public static final Target VALIDATESHOPPINGBAG =Target.the("Validate shopping bag").located(By.xpath("//span[contains(text(),'Bolsa de compras')]"));
}
