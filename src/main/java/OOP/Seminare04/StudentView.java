package OOP.Seminare04;

import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> students) {
        System.out.println("Students");
        for (Student student:students){
            System.out.println(student);
        }
    }
}
