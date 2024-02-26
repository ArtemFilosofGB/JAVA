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
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);

        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFIO()) {
            System.out.println(student);
        }
        System.out.println("==========Group=============");
//Вторая группа студент 1,2
        List<Student> studentList2 = new ArrayList<>();
        StudentGroup studentGroup2 = new StudentGroup(studentList2);
        studentGroup2.addStudent(student1);
        studentGroup2.addStudent(student2);

       List<StudentGroup> studentGroupList = new ArrayList<>();
       studentGroupList.add(studentGroup);
        studentGroupList.add(studentGroup2);


        System.out.println("========steam===============");

        StreamInerator streamInerator = new StreamInerator(studentGroupList);
        while (streamInerator.hasNext()) {
            System.out.println("steam = \n" + streamInerator.next().toString());
        }
        Stream stream1 = new Stream();
        stream1.studentGroupList.add(studentGroup);
        Stream stream2 = new Stream();
        stream2.studentGroupList.add(studentGroup2);
        stream2.studentGroupList.add(studentGroup2);
        //Поток 2 больше потока 1
        System.out.println(stream1.compareTo(stream2));//studentGroupList.size() o.studentGroupList.size() 1 2  ===-1

        System.out.println("========Sort steam===============");
        List<Stream>streamList = new ArrayList<>(Arrays.asList(stream1,stream2));
        StreamServise.sortStreamOfStudentGroup(streamList);
        System.out.println("Sorted Streams:\n" + streamList);

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(studentList);

    }
}


