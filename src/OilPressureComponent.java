import java.util.Random;

public class OilPressureComponent implements IComponent {
    private final String unit = "Pa";
    private final Random measureTools = new Random();

    public double currOilPressure() {
        return measureTools.nextDouble() * 100 + 10;
    }

    @Override
    public String getData() {
        return "Oil pressure: " + currOilPressure() + " " + unit();
    }

    @Override
    public String unit() {
        return unit;
    }
}
