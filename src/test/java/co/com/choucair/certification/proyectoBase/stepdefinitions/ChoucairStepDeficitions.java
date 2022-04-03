package co.com.choucair.certification.proyectoBase.stepdefinitions;
import co.com.choucair.certification.proyectoBase.model.ChoucairData;
import co.com.choucair.certification.proyectoBase.model.RespuestaFinal;
import co.com.choucair.certification.proyectoBase.questions.Answer;
import co.com.choucair.certification.proyectoBase.tasks.OpenRegister;
import co.com.choucair.certification.proyectoBase.tasks.OpenUp;
import co.com.choucair.certification.proyectoBase.tasks.RegistrationDate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairStepDeficitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user wants to register a new user on the platform$")
    public void theUserWantsToRegisterANewUserOnThePlatform() {
        OnStage.theActorCalled("Kim").wasAbleTo(
                OpenUp.thePage(),
                OpenRegister.OnThePage()
        );
    }


    @When("^FThe user enters the registration data$")
    public void ftheUserEntersTheRegistrationData(List<ChoucairData> ChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationDate.the(ChoucairData));
    }


    @Then("^End user registration$")
    public void endUserRegistration(List<RespuestaFinal> respuestaFinal) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(respuestaFinal)));


    }
}
