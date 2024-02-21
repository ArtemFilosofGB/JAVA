package OOP.Semirare03;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamServise {
    private Stream stream;

    public StreamServise(Stream stream) {
        this.stream = stream;
    }

    public Stream getStream() {
        return stream;
    }
    public static void sortStreamOfStudentGroup(List<Stream> streamList) {
        Collections.sort(streamList,new StreamCoparator());
    }
//    public List<StudentGroup> getSortStream(){
//        List<StudentGroup> studentGroupList = new ArrayList<>(stream.getStudentGroupList());
//        for (StudentGroup studentGroup : studentGroupList) {
//            studentGroup.
//
//        }
//        return studentGroupList;
//    }
}
