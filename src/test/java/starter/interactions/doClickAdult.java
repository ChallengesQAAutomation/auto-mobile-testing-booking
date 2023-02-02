package starter.interactions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import starter.utils.TestProperties;

import static starter.utils.TestProperties.getDriver;

public class doClickAdult implements Interaction {

    Target element;
    int cant;

    public doClickAdult(Target element) {
        this.element = element;
    }

    public static doClickAdult inThe(Target element) {
        return new doClickAdult(element);
    }

    public doClickAdult theCant(int cant){
        this.cant=cant;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getDriver(actor);
        Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width * 0.80);
        int y = (int) (size.height * 0.20);
       // Actions actions = new Actions(driver);
       // actions.moveByOffset(900, 20).click().build().perform();
        for (int i=1;i<cant;i++){
            actor.attemptsTo(Click.on(element));
        }
    }
}
