package OOP.Seminare05Homework.model;

import java.util.List;

public class LessonGroup {
    private Teacher teacherOfLessonGroup;
    private List<Student> studentListLessonGroup;

    public Teacher getTeacherOfLessonGroup() {
        return teacherOfLessonGroup;
    }

    public List<Student> getStudentListLessonGroup() {
        return studentListLessonGroup;
    }

    @Override
    public String toString() {
        return "LessonGroup{\n" +
                "teacherLessonGroup:\n" + teacherOfLessonGroup + "\n" +
                "studentListLessonGroup:\n" + studentListLessonGroup +
                "}\n";
    }

    public LessonGroup(Teacher teacherLessonGroup, List<Student> studentListLessonGroup) {
        this.teacherOfLessonGroup = teacherLessonGroup;
        this.studentListLessonGroup = studentListLessonGroup;
    }
}
