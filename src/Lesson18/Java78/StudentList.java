package Lesson18.Java78;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Hayk", "Aramyan", 1999, 60.6));
        studentList.add(new Student("Vahan", "Grigoryan", 2000, 65.4));
        studentList.add(new Student("Hayk", "Nahapetyan", 1988, 45.4));
        studentList.add(new Student("Lilit", "Babayan", 1994, 59.4));
        studentList.add(new Student("Ani", "Stepanyan", 1994, 54.5));
        studentList.add(new Student("Vazgen", "Deroyan", 2000, 95.5));
        System.out.println(studentList);
        System.out.println();
        List<String> names = studentList
                .stream()
                .map(Student::getName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(names);
        List<String> surnames = studentList
                .stream()
                .map(Student::getSurname)
                .toList();
        System.out.println(surnames);
        List<String> fullName = studentList
                .stream()
                .map(Student::fullName)
                .toList();
        System.out.println(fullName);
        List<String> mark = studentList
                .stream()
                .filter(x -> x.getMark() > 60.5)
                .map(Student::fullName)
                .toList();
        System.out.println(mark);
        long count = studentList
                .stream()
                .filter(x -> x.getMark() > 60.5)
                .count();
        System.out.println(count);
        int bigBirthdayMarkHigh50 = studentList
                .stream()
                .filter(x -> x.getMark() > 50)
                .map(Student::getBirthday)
                .reduce(Integer::min)
                .get();
        System.out.println(bigBirthdayMarkHigh50);


    }
}
