package OOP.Seminar04Homework.src.main.java.ru.gb.oseminar;



import OOP.Seminar04Homework.src.main.java.ru.gb.oseminar.data.Student;
import OOP.Seminar04Homework.src.main.java.ru.gb.oseminar.data.StudentGroup;
import OOP.Seminar04Homework.src.main.java.ru.gb.oseminar.data.Teacher;
import OOP.Seminar04Homework.src.main.java.ru.gb.oseminar.service.StudentGroupService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student4 = new Student( "Fed", "Iv", "Dost",null, 1L);
        Student student1 = new Student( "Anton", "Pal", "Chehov",null,2L);
        Student student2 = new Student( "Alex", "Serg", "Pushkin",null,3L);
        Student student3 = new Student( "Lev", "Nik", "Tolst",null,4L);

        Teacher teacher1 = new Teacher("Kirill", "Iv", "Moiseev", null);

        List<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));

        StudentGroupService sGrSv = new StudentGroupService();
        sGrSv.createStudentGroup(teacher1,studentList);

        System.out.println("Student Sort by FIO");
        for (Student student : sGrSv.getSortedByFIOStudentGroup()) {
            System.out.println(student);
        }


    }
}
