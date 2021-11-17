package Staff;

public abstract class Employee {
    private String name;
    private String NI;
    private Double salary;

    public Employee(String name, String NI, Double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        this.salary += raise;
    }

    public double payBonus(){
        double bonus = salary * 0.01;
        return bonus;
    }
}
