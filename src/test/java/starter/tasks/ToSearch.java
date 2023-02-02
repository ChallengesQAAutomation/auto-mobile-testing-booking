package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.SearchView;

import static starter.ui.SearchView.linkFirstOption;

public class ToSearch implements Task {

    private final String city;

    public ToSearch(String city) {
        this.city = city;
    }

    public static Performable of(String city) {
        return new ToSearch(city);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(city).into(SearchView.txtSearchCity),
                Click.on(linkFirstOption)
        );
    }
}
