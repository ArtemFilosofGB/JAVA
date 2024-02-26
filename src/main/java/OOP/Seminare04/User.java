package OOP.Seminare04;

public class User {
    private String firstName;
    private String secondName;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    private String LastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
