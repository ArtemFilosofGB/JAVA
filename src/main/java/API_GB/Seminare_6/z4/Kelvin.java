package API_GB.Seminare_6.z4;

public class Kelvin extends Converter{
    /**
     * Кельвин
     * @param value Цельсия
     * @return Кельвин
     */
    @Override
    public double convertValue(double value) {
        return value+273.15;
    }
}
