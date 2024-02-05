package Lesson8.Airport;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();
        Plane plane = service.createPlane();
        Plane plane1 = service.createPlane();
        Plane plane2 = service.createPlane();
        Plane[] planes = {plane,plane1,plane2};
        System.out.println("--------------------");
        service.printNameAndReleaseDate(plane);
        System.out.println("--------------------");
        service.printNameOrHours(plane);
        System.out.println("--------------------");
        System.out.println(service.nameOfPlaneWithBiggerTime(plane, plane1));
        System.out.println("--------------------");
        service.planeWithBiggerName(plane, plane1).printInfo();
        System.out.println("--------------------");
        service.printPlaneArray(planes);
        System.out.println("--------------------");
        service.printMilitaryPlaneAfter2010(planes);
        System.out.println("--------------------");
        service.maxHoursInAir(planes).printInfo();
        System.out.println("--------------------");
        service.printOldestPlane(planes);
        System.out.println("--------------------");
        service.printNewestMilitary(planes);
    }
}
