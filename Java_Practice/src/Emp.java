public class Emp {
    String name;
    int age;
    double salary;
    String location;

    Emp(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public void salaryRaise(double salary) {
        this.salary = salary + 1000;
    }
}
