package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    public void elUsuarioQuiereHacerUnaReservaEnLaCiudadDe(String arg0) {
        theActorCalled("Jhon")
                .can(BrowseTheWeb.with(hisMobileDevice));

         Target BTN_CLOSE= Target.the("Boton para cerrar el intro ")
                .located(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));

        theActorCalled("Jhon").attemptsTo(Click.on(BTN_CLOSE));
        System.out.println("melo");

    }
}
