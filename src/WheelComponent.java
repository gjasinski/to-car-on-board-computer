import java.util.Random;

public class WheelComponent implements IComponent {
    private final String unit = "Bar";
    private final Random measureTools = new Random();

    public double currWheelPressure() {
        return measureTools.nextDouble() * 2 + 1;
    }

    @Override
    public String getData() {
        return "Current wheel pressure: " + currWheelPressure() + " " + unit();
    }

    @Override
    public String unit() {
        return unit;
    }
}
