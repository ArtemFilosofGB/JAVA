package OOP.Seminare03;

import java.util.Iterator;
import java.util.List;

public class StreamInerator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroupList;
    private int counter;

    public StreamInerator(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return studentGroupList.get(counter++);
    }

    @Override
    public void remove() {
        if (hasNext())
            studentGroupList.remove(counter);
    }
}
