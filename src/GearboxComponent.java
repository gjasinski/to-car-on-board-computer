public class GearboxComponent implements IComponent {
    private final String unit = "GEAR_BOX";

    public Gear currGear() {
        return Gear.getRandom();
    }

    @Override
    public String getData() {
        return "Current GEAR_BOX: " + currGear() + unit();
    }

    @Override
    public String unit() {
        return unit;
    }
}
