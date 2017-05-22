public class GearboxComponent implements IComponent {
    private final String unit = "gear";

    public Gear currGear() {
        return Gear.getRandom();
    }

    @Override
    public String getData() {
        return "Current gear: " + currGear() + unit();
    }

    @Override
    public String unit() {
        return unit;
    }
}
