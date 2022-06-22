package assignment1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        factorial(n);
    }

    public static int factorial(int n){
        int fact=1;
        for(int i=1 ; i<=n ; i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of "+n+" is "+fact);
        return 0;
    }

}
/* Output:
        Enter a number:
        5
        The factorial of 5 is 120
*/