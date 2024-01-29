package Algoritm_and_Data_Structure;

import java.util.concurrent.atomic.AtomicInteger;

public class fibonachi {

    /**
     * @apiNote Вычисленеи числа фибоначи
     * @param position
     * @param counter
     * @return
     */
    public static int fibonachi(int position, AtomicInteger counter){
        counter.incrementAndGet();
        if(position==1){
            return 0;
        }
        if (position==2){
            return 1;
        }
        return fibonachi(position-1,counter)+fibonachi(position-2,counter);

    }
}
