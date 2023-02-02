package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.questions.LoggedInQuestions;
import starter.tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class BookingStepDefinitions {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());

    }
    @Then("he should see the dashboard")
    public void should_see_the_dashboard() {
        String expectedWelcomeText = "You are logged in as alice";

        theActorInTheSpotlight().should(
                seeThat("the welcome text", LoggedInQuestions.value(),
                        equalTo(expectedWelcomeText))
        );

    }

    @Given("John Wick quiere reservar {int} habitacion en {string}")
    public void johnWickQuiereReservarUnaHabitacionEn(int rooms,String city) {
        theActorCalled("Jhon").attemptsTo(
                NavigateTo.login()
        );

        theActorInTheSpotlight().attemptsTo(
                ToSearch.of(city)
        );
        theActorInTheSpotlight().remember("rooms",rooms);
    }

    @When("en las fechas {string} al {string}")
    public void enLasFechasAlDel(String checkin, String checkout) {
        theActorInTheSpotlight().attemptsTo(
                ChoiceDate.next(checkin,checkout)
        );
    }

    @And("para {int} personas adultas {int} menor de {int} anios")
    public void paraPersonasAdultasUnMenorDeAnios(int adults, int children, int old) {
        int room=theActorInTheSpotlight().recall("rooms");
        theActorInTheSpotlight().attemptsTo(ChoicePeople.numberRoom(room).withAdult(adults).withChildren(children).ofOld(old));
    }

    @And("John realizo la reserva de la segunda opcion de resultado de busqueda")
    public void johnRealizoLaReservaDeLaSegundaOpcionDeResultadoDeBusqueda() {
        theActorInTheSpotlight().attemptsTo(ToSearchBooking.ofTheRoom());
        theActorInTheSpotlight().attemptsTo(DoBooking.ofTheRoom());


    }

    @And("ingreso sus datos personales")
    public void ingresoSusDatosPersonales() {
        theActorInTheSpotlight().attemptsTo(IntoInfomartion.ofClient());

    }
}
