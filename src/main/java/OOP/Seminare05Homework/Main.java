package OOP.Seminare05Homework;

import OOP.Seminare05Homework.controller.Controller;
import OOP.Seminare05Homework.model.LessonGroup;
import OOP.Seminare05Homework.model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Bill", "_", "Gates");
        controller.createStudent("Steve", "_", "Jobs");
        controller.createStudent("Ilon", "_", "Mask");

        controller.createTeacher("Alexandr", "Sergeevich", "Pushkin");


        controller.printStudents();
        controller.printTeacher();

        //Список id студентов для занятия в преподавателя is = 1
        List<Integer> idStudens = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println("controller.createLessonGroup = " + controller.createLessonGroup(1, idStudens));


    }
}
