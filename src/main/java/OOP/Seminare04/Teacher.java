package OOP.Seminare04;

public class Teacher extends User {
    private Integer teacherId;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +" "+
                super.toString()+
                '}';
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public Teacher(String firstName, String secondName, String lastName,Integer idTeacher) {
        super(firstName, secondName, lastName);
        this.teacherId = idTeacher;
    }
}