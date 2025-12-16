import java.util.Scanner;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int empid;
    int pan;
    double bas_sal;

    Employee(int empid, String name, int age, int pan, double bas_sal) {
        super(name, age); 
        this.empid = empid;
        this.pan = pan;
        this.bas_sal = bas_sal;
    }

    double gross_sal() {
        double DA = 0.4 * bas_sal;
        double HRA = 0.2 * bas_sal;
        double CCA = 250;
        return bas_sal + DA + HRA + CCA;
    }

    double deduct() {
        double PF = 0.1 * bas_sal;
        double PT = 100;
        double IT = 0.1 * gross_sal();
        return PF + PT + IT;
    }

    double net_income() {
        return gross_sal() - deduct();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        System.out.println("Enter employee details:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + " ID:");
            int empid = sc.nextInt();

            System.out.println("Enter employee name:");
            String name = sc.next();

            System.out.println("Enter employee age:");
            int age = sc.nextInt();

            System.out.println("Enter employee basic salary:");
            double bas_sal = sc.nextDouble();

            System.out.println("Enter employee PAN:");
            int pan = sc.nextInt();

            employees[i] = new Employee(empid, name, age, pan, bas_sal);
        }

        for (int i = 0; i < 5; i++) {
            Employee e = employees[i];
            System.out.println("\nDetails for Employee " + (i + 1) + ":");
            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("Gross Salary: " + e.gross_sal());
            System.out.println("Deductions: " + e.deduct());
            System.out.println("Net Salary: " + e.net_income());
        }

        sc.close();
    }
}
