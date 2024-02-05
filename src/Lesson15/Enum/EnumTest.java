package Lesson15.Enum;

public class EnumTest {
    public static void main(String[] args) {
        drive(Direction.EAST);
        drive(Direction.SOUTH);
        drive(Direction.NORTH);
        drive(Direction.WEST);
    }

    static void drive(Direction d) {
//        if (d == Direction.EAST){
//            System.out.println("Drive east");
//        }
//        if (d == Direction.NORTH){
//            System.out.println("Drive north");
//        }
//        if (d == Direction.SOUTH){
//            System.out.println("Drive south");
//        }
//        if (d == Direction.WEST){
//            System.out.println("Drive west");
//        }
        switch (d) {
            case EAST -> System.out.println("East");
            case NORTH -> System.out.println("North");
            case SOUTH -> System.out.println("South");
            case WEST -> System.out.println("West");
        }
    }
}
