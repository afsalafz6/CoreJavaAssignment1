package assignment5_Generics;

import java.util.HashSet;

class Employee {
    int id;
    String name, department;
    double salary;
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void displayDetails(){
        System.out.println("Employee Details : id: " +this.id + ", Name :" +this.name + ", Salary :" + this.salary + ", Department : " + this.department +"\n");
    }
}
public class HashSetEmployee {
    public static void main(String[] args) {
        HashSet<Employee> emp =new HashSet<Employee>();

        Employee E1 =new Employee(1,"Afsal", 20000, "Developer");
        Employee E2 =new Employee(2,"Raj", 30000, "HR");

        emp.add(E1);
        emp.add(E2);

        E1.displayDetails();
        E2.displayDetails();

        System.out.println(E2.department);
    }

}
