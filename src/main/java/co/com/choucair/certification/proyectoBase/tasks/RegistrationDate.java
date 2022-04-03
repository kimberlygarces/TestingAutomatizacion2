package co.com.choucair.certification.proyectoBase.tasks;

import co.com.choucair.certification.proyectoBase.model.ChoucairData;
import co.com.choucair.certification.proyectoBase.userinterface.PageDataRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegistrationDate  implements Task {

    private List<ChoucairData> choucairData;

    public RegistrationDate(List<ChoucairData> choucairData) {
        this.choucairData = choucairData;
    }

        public static RegistrationDate the(List<ChoucairData> choucairData) {
        return Tasks.instrumented(RegistrationDate.class, choucairData);
    }


    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                Enter.theValue(choucairData.get(0).getName()).into(PageDataRegister.NAME_INPUT),
                Enter.theValue(choucairData.get(0).getLast()).into(PageDataRegister.LAST_INPUT),
                Enter.theValue(choucairData.get(0).getAddress()).into(PageDataRegister.ADDRESS_INPUT),
                Enter.theValue(choucairData.get(0).getEmail()).into(PageDataRegister.EMAIL_INPUT),
                Enter.theValue(choucairData.get(0).getPhone()).into(PageDataRegister.PHOME_INPUT),
                Click.on(PageDataRegister.GENDER_INPUT),
                Click.on(PageDataRegister.HOBBIES_INPUT),
                Click.on(PageDataRegister.lANGUAGES_INPUT),
                Click.on(PageDataRegister.lANGUAGES_SELECT_INPUT),
                Click.on(PageDataRegister.YEAR_INPUT),
                Click.on(PageDataRegister.YEAR_SELECT_INPUT),
                Click.on(PageDataRegister.COUNTRY_INPUT),
                Click.on(PageDataRegister.MONT_INPUT),
                Click.on(PageDataRegister.MONT_SELECT_INPUT),
                Click.on(PageDataRegister.DAY_INPUT),
                Click.on(PageDataRegister.DAY_SELECT_INPUT),
                Enter.theValue(choucairData.get(0).getPassword()).into(PageDataRegister.PASSWORD_INPUT),
                Enter.theValue(choucairData.get(0).getPassword_confim()).into(PageDataRegister.PASSWORD_CONFIM_INPUT),
                Click.on(PageDataRegister.SUBMIT),
                Click.on(PageDataRegister.SUBMIT)

                );
    }
}
