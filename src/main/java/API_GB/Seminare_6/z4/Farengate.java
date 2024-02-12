package API_GB.Seminare_6.z4;

public class Farengate extends Converter{
    /**
     *
     * @param value градусы цельсия
     * @return Фаренгейт
     */
    @Override
    public double convertValue(double value) {
        return (value*1.8)+32;
    }
}
