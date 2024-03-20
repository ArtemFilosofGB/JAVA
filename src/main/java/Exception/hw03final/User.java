package Exception.hw03final;

public class User {
    String surname;
    String firstname;
    String midname;
    String dataOfBirth;
    String telefonNumber;
    char gender;

    public User(String surname, String firstname, String midname, String dataOfBirth, String telefonNumber, char gender) {
        this.surname = surname;
        this.firstname = firstname;
        this.midname = midname;
        this.dataOfBirth = dataOfBirth;
        this.telefonNumber = telefonNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>\n", surname, firstname, midname, dataOfBirth, telefonNumber, gender);
    }
}
