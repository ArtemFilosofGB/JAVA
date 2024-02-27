package OOP.Seminare05Homework.controller;

import OOP.Seminare05Homework.model.*;
import OOP.Seminare05Homework.servise.DataService;
import OOP.Seminare05Homework.view.StudentView;
import OOP.Seminare05Homework.view.TeacherView;

import java.util.List;

public class Controller {
    DataService service = new DataService();
    StudentView studentView = new StudentView();
    TeacherView teacherView = new TeacherView();

    public void createStudent(String firstname,String secondName, String lastName){
        service.create(firstname,secondName,lastName, Type.STUDENT);
    }
    public void createTeacher(String firstname,String secondName, String lastName){
        service.create(firstname,secondName,lastName, Type.TEACHER);
    }
    public  void  printStudents(){
        for (Student student:service.getStudent()){
            studentView.printToConsole(student);
        }
    }
    public  void  printTeacher(){
        for (Teacher teacher:service.getTeacher()){
            teacherView.printToConsole(teacher);
        }
    }

    public void getAllstudent(){
        for (User user:service.getAllStudent()){
            studentView.printToConsole((Student) user);
        }
    }

    /**
     * @apiNote Создние группы для обучения 1 Преподаватель, Список студентов
     * @param teacher
     * @param students - Список
     */

    public LessonGroup createLessonGroup(int teacherId, List<Integer> studentId) {
        return service.createLessonGroup(teacherId,studentId);
    }
}
