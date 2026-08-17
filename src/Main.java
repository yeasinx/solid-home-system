import com.smarthome.alerts.EmailAlert;
import com.smarthome.devices.SmartCamera;
import com.smarthome.devices.SmartLight;
import com.smarthome.devices.SmartSprinkler;
import com.smarthome.interfaces.AlertChannel;
import com.smarthome.interfaces.MotionDetectable;
import com.smarthome.interfaces.Switchable;
import com.smarthome.system.HomeSecuritySystem;

void main() {
    List<Switchable> mySwitches = List.of(
            new SmartLight(),
            new SmartCamera(),
            new SmartSprinkler()
    );

    List<MotionDetectable> mySensors = List.of(
            new SmartCamera()
    );

    AlertChannel myAlerts = new EmailAlert();

    HomeSecuritySystem security = new HomeSecuritySystem(mySwitches, mySensors, myAlerts);

    security.armSystem();
}
