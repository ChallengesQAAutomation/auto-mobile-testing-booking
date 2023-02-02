package starter.utils;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class TestProperties {

    public static WebDriver getDriver(Actor actor) {
        return BrowseTheWeb.as(actor).getDriver();

    }
}
