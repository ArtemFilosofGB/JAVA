package OOP.Seminare05Homework.servise;

import OOP.Seminare05Homework.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataService {
    private List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeId(type);
        if (type == Type.STUDENT) {
            users.add(new Student(firstName, secondName, lastName, id));
        } else if (type == Type.TEACHER) {
            users.add(new Teacher(firstName, secondName, lastName, id));
        }

    }

    private int getFreeId(Type type) {
        boolean isStudent = type == Type.STUDENT;
        int lastId = 1;
        for (User user : users) {
            if (user instanceof Student && isStudent)
                lastId = ((Student) user).getStudentId() + 1;
            else if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastId;
    }

    public List<Student> getStudent() {
        List<Student> studentList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student)
                studentList.add((Student) user);

        }
        return studentList;
    }

    public List<Teacher> getTeacher() {
        List<Teacher> teacherList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher)
                teacherList.add((Teacher) user);

        }
        return teacherList;
    }

    public List<User> getAllStudent() {
        List<User> studentList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof User)
                studentList.add(user);
        }
        return studentList;
    }


    public LessonGroup createLessonGroup(int teacherForLessonId, List<Integer> studentForLessonId) {
        Teacher teacherForLesson = null;
        List<Student> studentsForLesson = new ArrayList<>();

        //поиск учителя
        for (User user : users) {
            if (user instanceof Teacher && ((Teacher) user).getTeacherId() == teacherForLessonId)
                teacherForLesson = (Teacher) user;
        }
        //поиск студенов
        for (User user : users) {
            for (Integer i : studentForLessonId) {
                if (user instanceof Student && ((Student) user).getStudentId().equals(i))
                    studentsForLesson.add((Student) user);
            }
        }
        return new LessonGroup(teacherForLesson, studentsForLesson);
    }

}
//package service;
//
//        import model.Student;
//        import model.Teacher;
//        import model.Type;
//        import model.User;
//
//        import java.util.ArrayList;
//        import java.util.List;
//
//public class DataService {
//    private List<User> users = new ArrayList<>();
//    public void create(String firstName, String secondName, String lastName, Type type){
//        int id = getFreeId(type);
//        if(type == Type.STUDENT){
//            users.add(new Student(firstName,secondName,lastName, id));
//        }else if(type == Type.TEACHER){
//            users.add(new Teacher(firstName,secondName,lastName, id));
//        }
//
//    }
//    private int getFreeId(Type type){
//        boolean isStudent = type == Type.STUDENT;
//        int lastId = 1;
//        for (User user : users) {
//            if(user instanceof Student && isStudent)
//                lastId = ((Student) user).getStudentId() + 1;
//            else if (user instanceof Teacher && !isStudent) {
//                lastId = ((Teacher) user).getTeacherId() + 1;
//            }
//        }
//        return lastId;
//    }
//
//    public List<User> getUsers() {
//        return users;
//    }
//}
