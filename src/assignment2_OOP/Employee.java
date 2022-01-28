package assignment2_OOP;

public class Employee {
    public void managerSalary(double salary, double incentive){
        System.out.println("Manager Salary is " +salary + " also include Incentive "+ incentive + "\n");
    }
    public void labourSalary(double salary, double overtime){
        System.out.println("Labour Salary is " +salary + " also include Overtime "+ overtime + "\n");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.managerSalary(10000.0, 2000.0);

        Manager m1 = new Manager();
        m1.managerSalary(10000.0, 2000.0);

        Employee e2 = new Employee();
        e2.labourSalary(9000.0, 500.0);

        Labour l1 = new Labour();
        l1.labourSalary(9000.0, 500.0);
    }
}

class Manager extends Employee {
    @Override
    public void managerSalary(double salary, double incentive) {
        System.out.println("Manager Salary Sum is " + (salary+incentive) + "\n");
    }
}
class Labour extends Employee {
    @Override
    public void labourSalary(double salary,double overtime) {
        System.out.println("Labour Salary Sum is " + (salary + overtime) + "\n");
    }
}
