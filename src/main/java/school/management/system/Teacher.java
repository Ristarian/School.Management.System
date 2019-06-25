package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    // we are setting the value of salary because it might change in the future
    public void setSalary(int salary){
        this.salary = salary;
    }
}
