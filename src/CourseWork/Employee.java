package CourseWork;

public class Employee {
    private static int id = 0;
    private final String name;
    int department;
    double salary;

    //int id = 0;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getId() {
        return id++;
    }

    public String toString() {
        return " - " + name + "; отдел " + department + "; заработная плата " + salary + " рублей.";
    }
}
