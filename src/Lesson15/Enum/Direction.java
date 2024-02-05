package Lesson15.Enum;

public enum Direction {
    NORTH("N"),
    SOUTH("S"),
    WEST("W"),
    EAST("E");

    public final String value;
    private Direction(String v) {
        value = v;
    }
}
