package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchView {

    public static Target txtSearchCity = Target.the("txt buscar ciudad")
            .located(AppiumBy.id("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content"));

    public static Target txtPeople = Target.the("txt agregar personas")
            .located(By.xpath("//android.widget.TextView[@text='1 room · 2 adults · 0 children' and @resource-id='com.booking:id/facet_search_box_basic_field_label']"));

    public static Target btnBookingSearch = Target.the("boton para realizar la busqueda de la reserva")
            .located(AppiumBy.id("com.booking:id/facet_search_box_cta"));

    public static Target btnSelectDates = Target.the("seleccionar fecha")
            .located(AppiumBy.id("com.booking:id/facet_date_picker_confirm"));


    public static Target btnApplyPerson = Target.the("seleccionar personas")
            .located(AppiumBy.id("com.booking:id/group_config_apply_button"));

    public static Target linkFirstOption = Target.the("password")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]"));

    public static Target btnRoomsPlus = Target.the("password")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[2]"));

    public static Target btnAdultsPlus = Target.the("password")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.Button[2]"));

    public static Target date = Target.the("date")
            .locatedBy("//android.view.View[@content-desc='{0} February 2023']");

}