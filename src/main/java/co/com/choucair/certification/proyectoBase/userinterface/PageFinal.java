package co.com.choucair.certification.proyectoBase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageFinal  extends PageObject {

    public static final Target FINAL =
            Target.the("Final test").
                    located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
}
