package OOP.Seminare07.observer;

import java.util.Random;

public class Company {
    Publisher jobAgency;
    String nameCompany;
    int maxSalary;
    Random rnd;

    public Company(Publisher jobAgency, String nameCompany, int maxSalary) {
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        rnd = new Random();
    }

    public void needEmployee(){
        int salary = rnd.nextInt(maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }
}
