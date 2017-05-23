import java.util.HashMap;
import java.util.Map;

public class CarData {
    private Map<EComponent, IComponent> components = new HashMap<>();
    public CarData(){
        components.put(EComponent.fuel, new FuelComponent());
        components.put(EComponent.oilTemperature, new OilTemperatureComponent());
        components.put(EComponent.oilPressure, new OilPressureComponent());
        components.put(EComponent.wheelPressure, new WheelComponent());
        components.put(EComponent.gear, new GearboxComponent());
    }
}
