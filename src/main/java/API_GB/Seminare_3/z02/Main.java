package API_GB.Seminare_3.z02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("Петров", 101, 5000, Arrays.asList(5, 4, 5)),
                new Student("Иванов", 102, 5000, Arrays.asList(5, 4, 5)),
                new Student("Сидоров", 101, 5000, Arrays.asList(5, 4, 5)),
                new Student("Петрова", 103, 5000, Arrays.asList(5, 4, 5))));

        for (Student student : studentList) {
            if (student.getSurname().endsWith("ова") && student.evenGrades()) {
                System.out.println("student.getSurname() = " + student.getSurname());
                System.out.println("Stipa = " + student.getStipendia());
            }
        }

    }


}

