package OOP.Seminare05.controller;

import OOP.Seminare05.model.Student;
import OOP.Seminare05.model.Type;
import OOP.Seminare05.model.User;
import OOP.Seminare05.servise.DataService;
import OOP.Seminare05.view.StudentView;

public class Controller {
    DataService service = new DataService();
    StudentView view = new StudentView();

    public void createStudent(String firstname,String secondName, String lastName){
        service.create(firstname,secondName,lastName, Type.STUDENT);
    }
    public void createTeacher(String firstname,String secondName, String lastName){
        service.create(firstname,secondName,lastName, Type.TEACHER);
    }
    public  void  printStudents(){
        for (Student student:service.getStudent()){
            view.printToConsole(student);
        }
    }

    public void getAllstudent(){
        for (User user:service.getAllStudent()){
            view.printToConsole((Student) user);
        }
    }
}
