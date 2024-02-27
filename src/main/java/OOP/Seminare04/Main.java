package OOP.Seminare04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student4 = new Student(4, "Fed", "Iv", "Dost");
        Student student1 = new Student(1, "Anton", "Pal", "Chehov");
        Student student2 = new Student(2, "Alex", "Serg", "Pushkin");
        Student student3 = new Student(3, "Lev", "Nik", "Tolst");
//Первая группа студентов 1,2,3,4
        List<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));
        StudentGroup studentGroup = new StudentGroup(studentList);

        StudentGroupService sGrSv = new StudentGroupService(studentGroup);

        System.out.println("Student Sort by");
        for (Student student : sGrSv.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println("Student Sort by FIO");
        for (Student student : sGrSv.getSortedStudentGroupByFIO()) {
            System.out.println(student);
        }


        System.out.println("==========Teacher View=============");

        Teacher teacher1 = new Teacher("Kirill", "Iv", "Moiseev", 1);
        Teacher teacher2 = new Teacher("Sergio", "Iv", "Kamenecii", 2);
        Teacher teacher3 = new Teacher("Ali", "A", "Ababua", 3);

        List<Teacher> teacherList = new ArrayList<>(Arrays.asList(teacher1, teacher2, teacher3));
        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(teacherList);

        System.out.println("==========Teacher Servise=============");
        TeacherServise ts = new TeacherServise(teacherList);

        System.out.println("ts.getTeacher():");
        for (Teacher t : ts.getTeacher()) {
            System.out.println(t);
        }

        System.out.println("ts.getSortedTeacherByFIO():");
        for (Teacher teacher : ts.getSortedTeacherByFIO()) {
            System.out.println(teacher);

        }


    }
}


