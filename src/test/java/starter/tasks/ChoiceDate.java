package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.SearchView;

import java.util.Arrays;

public class ChoiceDate implements Task {

    private final String checkin,chckout;

    public ChoiceDate(String checkin, String chckout) {
        this.checkin = checkin;
        this.chckout = chckout;
    }

    public static Performable next(String checkin,String checkout) {
        return new ChoiceDate(checkin,checkout);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String checkinDate= Arrays.stream(checkin.split("/")).findFirst().get();
        String checkoutDate= Arrays.stream(chckout.split("/")).findFirst().get();
        actor.attemptsTo(
                Click.on(SearchView.date.of(checkinDate)),
                Click.on(SearchView.date.of(checkoutDate)),
                Click.on(SearchView.btnSelectDates)
        );
    }


}
