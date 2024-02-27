package OOP.Seminare04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TeacherServise {
    List<Teacher> teacherList;

    public TeacherServise(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    //sort by fio
    public List<Teacher> getTeacher(){
        return teacherList;
    }
    public List<Teacher>getSortedTeacherByFIO(){
        List<Teacher> teacherListToSort = new ArrayList<>(this.teacherList);
        teacherListToSort.sort(new UserComparator<Teacher>());
        return teacherListToSort;
    }

}
