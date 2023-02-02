package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.ui.LoginView.BTN_CLOSE;

public class ToSearch implements Task {
    String city;

    public ToSearch(String city) {
        this.city = city;
    }

    public static ToSearch ofCity(String city) {
        return instrumented(ToSearch.class,city);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CLOSE)
        );
    }
}
