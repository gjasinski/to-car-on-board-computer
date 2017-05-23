import java.util.Random;

public enum Gear {
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    RETROGRADE("R"),
    NONE("0");

    final private String label;

    Gear(String label) {
        this.label = label;
    }

    public static Gear getRandom() {
        Gear[] gears = Gear.values();
        Random rand = new Random();
        return gears[rand.nextInt(gears.length)];
    }

    @Override
    public String toString() {
        return label;
    }
}
