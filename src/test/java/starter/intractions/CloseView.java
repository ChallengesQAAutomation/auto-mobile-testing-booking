package starter.intractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.ui.LoginView.BTN_CLOSE;

public class CloseView implements Interaction {

    public static CloseView ofIntro() {
        return instrumented(CloseView.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_CLOSE));

    }
}
