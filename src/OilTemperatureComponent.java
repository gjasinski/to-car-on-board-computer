import java.util.Random;

public class OilTemperatureComponent implements IComponent {
    private final String unit = "C";
    private final Random measureTools = new Random();

    public double currOilTemperature() {
        return measureTools.nextDouble() * 70 + 30;
    }

    @Override
    public String getData() {
        return "Current oil temperature: " + currOilTemperature() + " " + unit();
    }

    @Override
    public String unit() {
        return null;
    }
}
