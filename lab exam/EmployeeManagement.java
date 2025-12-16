import java.util.Scanner;

class Employee {
    String name;
    int age;
    String pan;
    int empId;
    double basicSalary;

    Employee(String name, int age, String pan, int empId, double basicSalary) {
        this.name = name;
        this.age = age;
        this.pan = pan;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    double grossIncome() {
        double hra = 0.20 * basicSalary;
        double da  = 0.10 * basicSalary;
        double cca = 250.0;
        return basicSalary + hra + da + cca;
    }

    double deduction() {
        double pf = 0.12 * basicSalary;
        double pt = 100.0;
        double it = 0.10 * basicSalary;
        return pf + pt + it;
    }

    double netSalary() {
        return grossIncome() - deduction();
    }

    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PAN: " + pan);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Income: " + grossIncome());
        System.out.println("Deduction: " + deduction());
        System.out.println("Net Salary: " + netSalary());
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, int age, String pan, int empId,
            double basicSalary, double bonus) {

        super(name, age, pan, empId, basicSalary);
        this.bonus = bonus;
    }

    @Override
    double grossIncome() {
        return super.grossIncome() + bonus;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter PAN: ");
            String pan = sc.nextLine();

            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();

            System.out.print("Enter Basic Salary: ");
            double basicSalary = sc.nextDouble();

            System.out.print("Enter Bonus (Manager): ");
            double bonus = sc.nextDouble();

            emp[i] = new Manager(name, age, pan, empId, basicSalary, bonus);

            sc.nextLine();
        }

        System.out.println("\nEMPLOYEE SALARY DETAILS");

        for (int i = 0; i < 5; i++) {
            emp[i].display();
        }

        sc.close();
    }
}
