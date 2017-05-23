import java.util.HashMap;
import java.util.Map;

public class CarData {
    private Map<EComponent, IComponent> components = new HashMap<>();
    public CarData(){
        components.put(EComponent.FUEL, new FuelComponent());
        components.put(EComponent.OIL_TEMPERATURE, new OilTemperatureComponent());
        components.put(EComponent.OIL_PRESSURE, new OilPressureComponent());
        components.put(EComponent.WHEEL_PRESSURE, new WheelComponent());
        components.put(EComponent.GEAR_BOX, new GearboxComponent());
    }
    public IComponent get(EComponent component) {
        return components.get(component);
    }
}
