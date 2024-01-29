package API_GB.Seminare_3.z01;

public class Item {
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Item(String name, String country, Integer volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }

    private String name;
    private String country;
    private Integer volume;
}
