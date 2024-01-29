package API_GB.Lesson_1;

public class for_in {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,3,3,1};
        for (int item:arr) {
            if (item==3) item=0;
            System.out.println(item);
            //В лекции было сказано что при обращении к item элемент массива не изменится, но..
            //1
            //0
            //0
            //0
            //1

        }

    }
}
