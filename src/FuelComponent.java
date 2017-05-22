import java.util.Random;

public class FuelComponent implements IComponent {
    private final String unit = "l/100km";
    private final Random measureTools = new Random();

    @Override
    public String getData() {
        return "Current fuel burning: " + currFuelBurning() + " " + unit() +
                ", average fuel burning:" + avgFuelBurning() + " " + unit();
    }

    @Override
    public String unit() {
        return unit;
    }

    public double currFuelBurning() {
        return measureTools.nextDouble() * 23 + 7;
    }

    public double avgFuelBurning() {
        return measureTools.nextDouble() * 20 + 7;
    }
}
