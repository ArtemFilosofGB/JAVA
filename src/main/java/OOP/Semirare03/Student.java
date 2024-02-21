package OOP.Semirare03;

public class Student implements Comparable<Student> {
    public Integer sudentId;

    public String firstName;
    public String secondName;
    public String LastName;


    public Integer getSudentId() {
        return sudentId;
    }

    public void setSudentId(Integer sudentId) {
        this.sudentId = sudentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sudentId=" + sudentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}'+'\n';
    }

    public Student(int sudentId, String firstName, String secondName, String lastName) {
        this.sudentId = sudentId;
        this.firstName = firstName;
        this.secondName = secondName;
        LastName = lastName;
    }

    @Override
    public int compareTo(Student o) {
        if(sudentId > o.getSudentId())
            return 1;
        if(sudentId < o.getSudentId())
            return -1;
        return 0;
    }
}
