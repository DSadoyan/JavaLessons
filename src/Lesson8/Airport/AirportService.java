package Lesson8.Airport;

import java.util.Scanner;

public class AirportService {
    public Plane createPlane() {
        Scanner scanner = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter name of the plane");
        plane.setName(scanner.next());
        System.out.println("Enter release year");
        plane.setReleaseYear(scanner.nextInt());
        System.out.println("Enter hours in air");
        plane.setHoursInAir(scanner.nextInt());
        System.out.println("Is military plane? Y/N");
        String m = scanner.next().toLowerCase();
        plane.setMilitary(m.charAt(0) == 'y');
        return plane;
    }

    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() + " " + plane.getReleaseYear());
    }

    public void printNameOrHours(Plane plane) {
        System.out.println(plane.getReleaseYear() > 2000 ? plane.getName() : plane.getHoursInAir());
    }

    public String nameOfPlaneWithBiggerTime(Plane plane1, Plane plane2) {
        return plane1.getHoursInAir() > plane2.getHoursInAir() ? plane1.getName() : plane2.getName();
    }

    public Plane planeWithBiggerName(Plane a, Plane b) {
        return a.getName().length() > b.getName().length() ? a : b;
    }

    public void printPlaneArray(Plane[] planes) {
        for (Plane x : planes)
            x.printInfo();
    }

    public void printMilitaryPlaneAfter2010(Plane[] planes) {
        for (Plane x : planes)
            if (x.isMilitary() && x.getReleaseYear() > 2010)
                x.printInfo();
    }

    public Plane maxHoursInAir(Plane[] planes) {
        Plane max = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getHoursInAir() > max.getHoursInAir()) {
                max = planes[i];
            }

        }
        return max;
    }

    public void printOldestPlane(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getReleaseYear() < min.getReleaseYear()) {
                min = planes[i];
            }
        }
        min.printInfo();
    }

    public void printNewestMilitary(Plane[] planes) {
        Plane newest = planes[0];
        int indexOfMilitary = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary())
                newest = planes[i];
            indexOfMilitary = i;
            break;
        }
        for (int i = indexOfMilitary + 1; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getReleaseYear() > newest.getReleaseYear()) {
                newest = planes[i];
            }
        }
        newest.printInfo();
    }


}
