package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginView {

    public static Target BTN_CLOSE = Target.the("Boton para cerra la vista de login")
            .located(AppiumBy.accessibilityId("Navigate up"));
}
