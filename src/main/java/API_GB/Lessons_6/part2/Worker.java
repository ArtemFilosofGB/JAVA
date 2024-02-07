package API_GB.Lessons_6.part2;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        String res = String.format(id+" nane:"+firstName+" "+lastName);
        return res;
    }

    @Override
    public boolean equals(Object o) {
        var t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }
    @Override
    public int hashCode() {
        return id;
    }
}
