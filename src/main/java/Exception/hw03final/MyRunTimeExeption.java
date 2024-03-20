package Exception.hw03final;


public class MyRunTimeExeption extends RuntimeException{
    /**
     * @apiNote Проверяет колличество введённых данный из разбитой строки
     * @param arrLength
     */
    public MyRunTimeExeption(int arrLength) {
        super("Недостаточно данных. \n" +
                "Введено записей: " + arrLength+"\nТребуется записей: 6");
    }
}
