package OOP.Seminare07.Adapter;

import java.time.LocalDateTime;

public interface MeteoSenser {

    int getId(); // идентификатор датчика

    Float getTemperature(); // температура датчика

    Float getHumidity(); // влажность

    Float getPressure(); // давление

    LocalDateTime getDateTime(); // время чтения данных датчика
}
