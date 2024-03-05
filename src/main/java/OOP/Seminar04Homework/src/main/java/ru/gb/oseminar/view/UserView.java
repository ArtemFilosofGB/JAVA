package OOP.Seminar04Homework.src.main.java.ru.gb.oseminar.view;



import OOP.Seminar04Homework.src.main.java.ru.gb.oseminar.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
