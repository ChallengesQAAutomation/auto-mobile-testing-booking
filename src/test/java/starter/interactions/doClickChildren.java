package starter.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class doClickChildren implements Interaction {

    Target element;
    int cant;

    public doClickChildren(Target element) {
        this.element = element;
    }

    public static doClickChildren inThe(Target element) {
        return new doClickChildren(element);
    }

    public doClickChildren theCant(int cant){
        this.cant=cant;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i=0;i<=cant;i++){
            actor.attemptsTo(Click.on(element));
        }
    }
}
