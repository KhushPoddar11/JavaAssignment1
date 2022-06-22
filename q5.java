package assignment1;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        check(year);
    }

    public static int check(int n){
        if(n%4==0)
            System.out.println(n+ " is a leap year.");
        else
            System.out.println(n+ "is not a leap year.");
        return 0;
    }
}

/*
    Output:
    Enter a year:
    2020
    2020 is a leap year.
 */