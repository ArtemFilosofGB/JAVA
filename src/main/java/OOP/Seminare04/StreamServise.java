package OOP.Seminare04;

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

}
