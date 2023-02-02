package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {

    public static Target btnClose = Target
            .the("")
            .located(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));

    public static Target txtDestination = Target.the("destino")
            .located(By.xpath("//android.widget.TextView[@text='Enter your destination']"));



}
