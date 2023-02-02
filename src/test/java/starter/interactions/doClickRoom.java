package starter.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class doClickRoom implements Interaction {

    Target element;
    int cant;

    public doClickRoom(Target element) {
        this.element = element;
    }

    public static doClickRoom inThe(Target element) {
        return new doClickRoom(element);
    }

    public doClickRoom theCant(int cant){
        this.cant=cant;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i=1;i<cant;i++){
            actor.attemptsTo(Click.on(element));
        }
    }
}
