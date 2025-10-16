import java.util.Scanner;

class Student
{
    String USN;
    String name;
    int[] marks = new int[9];
    int[] credits = new int[9];

    void read(Scanner sc)  
    {
        System.out.println("Enter USN:");
        USN = sc.nextLine();
        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter marks and credits for 9 subjects:");
        for (int i = 0; i < 9; i++)
        {
            System.out.println("Subject " + (i + 1) + " marks:");
            marks[i] = sc.nextInt();

            System.out.println("Subject " + (i + 1) + " credits:");
            credits[i] = sc.nextInt();

            // Clearing the buffer after nextInt()
            sc.nextLine();
        }
    }

    double gradePoint(int mark)
    {
        if (mark >= 90) return 10;
        else if (mark >= 80) return 9;
        else if (mark >= 70) return 8;
        else if (mark >= 60) return 7;
        else if (mark >= 50) return 6;
        else if (mark >= 40) return 5;
        else return 0;
    }

    double sgpa()
    {
        int totalCredits = 0;
        double totalPoints = 0;

        for (int i = 0; i < 9 ; i++)
        {
            totalPoints += gradePoint(marks[i]) * credits[i];
            totalCredits += credits[i];
        }

        return totalPoints / totalCredits;
    }

    void display()
    {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + name);
        System.out.println("SGPA: " + sgpa());
    }
}

class sgpa1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.read(sc);

        s.display();

        sc.close();
    }
}
