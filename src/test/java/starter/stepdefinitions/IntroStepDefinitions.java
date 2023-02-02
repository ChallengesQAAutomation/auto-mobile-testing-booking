package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.intractions.CloseView;
import starter.tasks.ToSearch;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class IntroStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("John Wick wants to create a new post")
    public void john_want_to_create_a_new_post() {
        theActorCalled("Jhon")
                .can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("el usuario quiere hacer una reserva en la ciudad de {string}")
    public void elUsuarioQuiereHacerUnaReservaEnLaCiudadDe(String city) {
        theActorCalled("Jhon")
                .can(BrowseTheWeb.with(hisMobileDevice));
        theActorCalled("Jhon").attemptsTo(CloseView.ofIntro());
        theActorCalled("Jhon").attemptsTo(ToSearch.ofCity(city));

    }
}
