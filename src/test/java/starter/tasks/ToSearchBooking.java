package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.ResultView;
import starter.ui.SearchView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ToSearchBooking implements Task {

    String price;
    public ToSearchBooking() {
    }

    public static Performable ofTheRoom() {
        return new ToSearchBooking();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchView.btnBookingSearch)
        );
        actor.attemptsTo(WaitUntil.the(ResultView.linkSecondItem,isVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(
                Click.on(ResultView.linkSecondItem),
                Click.on(ResultView.btnSelectRoom)
        );


    }
}
