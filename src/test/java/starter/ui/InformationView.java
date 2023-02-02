package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformationView {



    public static Target labelPrice = Target.the("Precio de la reserva")
            .located(AppiumBy.id("com.booking:id/recommended_block_subtotal_price_view"));


    public static Target btnSelectBooking = Target.the("seleccionar la reserva")
            .located(AppiumBy.id("com.booking:id/rooms_item_select_text_view"));


    public static Target btnSelectOption = Target.the("seleccionar la reserva")
            .located(AppiumBy.id("com.booking:id/recommended_block_reserve_button"));


    public static Target btnBooking = Target.the("reservar")
            .located(By.xpath("//android.widget.Button[@text='Reserve']"));


}
