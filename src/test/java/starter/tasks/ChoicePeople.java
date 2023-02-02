package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.interactions.doClickAdult;
import starter.interactions.doClickRoom;
import starter.ui.SearchView;

public class ChoicePeople implements Task {
    int room,adult,children,old;

    public ChoicePeople(int room) {
        this.room = room;
    }

    public ChoicePeople withAdult(int adult){
        this.adult=adult;
        return this;
    }

    public ChoicePeople withChildren(int children){
        this.children=children;
        return this;
    }

    public ChoicePeople ofOld(int old){
        this.old=old;
        return this;
    }
    public static ChoicePeople numberRoom(int room) {
        return new ChoicePeople(room);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchView.txtPeople));
        actor.attemptsTo(
                doClickRoom.inThe(SearchView.btnRoomsPlus).theCant(room),
                doClickAdult.inThe(SearchView.btnAdultsPlus).theCant(adult)
                );
        actor.attemptsTo(Click.on(SearchView.btnApplyPerson));
    }


}
