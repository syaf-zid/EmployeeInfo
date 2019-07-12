package sg.edu.rp.c346.employeeinfo;

public class EmployeeInfo {
    private String name;
    private String job;
    private float salary;

    public EmployeeInfo(String name, String job, float salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public float getSalary() {
        return salary;
    }
}
