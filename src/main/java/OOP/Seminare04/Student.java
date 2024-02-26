package OOP.Seminare04;

public class Student extends User implements Comparable<Student> {
    public Integer sudentId;


    public Integer getSudentId() {
        return sudentId;
    }

    public void setSudentId(Integer sudentId) {
        this.sudentId = sudentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sudentId=" + sudentId +" "+
                super.toString();
    }

    public Student(int sudentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.sudentId = sudentId;
    }

    @Override
    public int compareTo(Student o) {
        if (sudentId > o.getSudentId())
            return 1;
        if (sudentId < o.getSudentId())
            return -1;
        return 0;
    }
}
