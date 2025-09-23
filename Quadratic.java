import java.util.Scanner;
import java.lang.Math;
class Quadratic
{
    public static void main(String[]args)
    {
        double a,b,c;
        double r1,r2,d;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the first number");
        a= in.nextDouble();
        System.out.println("enter the second number");
        b= in.nextDouble();
        System.out.println("enter the third number");
        c= in.nextDouble();
        if(a==0)
        {
            System.out.println("The quadratic equation does not exist");
            System.out.println("Enter a non zero value");
            a=in.nextDouble();
        }
    d=b*b-4*a*c;
    if (d==0)
    {
        r1=(-b)/(2*a);
        System.out.println("The roots are real and equal");
        System.out.println(r1);
    }
    else if(d>0)
    {
        r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
        r2=((-b)-(Math.sqrt(d)))/(double)(2*a);
        System.out.println("the roots are real and unequal");
        System.out.println(r1);
        System.out.println(r2);
    }
    else if(d<0)
    {
        r1= (-b)/(2*a);
        r2 = Math.sqrt(-d)/(2*a);
        System.out.println("The roots are imaginary");
        System.out.println(r1);
        System.out.println(r2);
    }
    }
}