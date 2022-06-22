package assignment1;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int len = sc.nextInt();
        int breadth = sc.nextInt();
        q3 area = new q3();
        System.out.println("The area of the square is = "+area.square(len));
        System.out.println("The area of the triangle is = "+area.triangle(len,breadth));
        System.out.println("The area of the rectangle is = "+area.rectangle(len,breadth));
    }

    int square(int a)
    {
        return 4*a;
    }

    double triangle(int a, int b)
    {
        return (a*b)*0.5;
    }

    int rectangle(int a, int b)
    {
        return a*b;
    }
}


/*
Output:

Enter two numbers:
11 11
The area of the square is = 44
The area of the triangle is = 60.5
The area of the rectangle is = 121

*/
