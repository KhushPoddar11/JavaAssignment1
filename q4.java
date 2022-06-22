package assignment1;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The smallest integer is "+compare(a,b,c));
    }

    public static int compare(int a, int b, int c){
        int min;
        if(a<b && a<c)
            min=a;
        else if(b<a && b<c)
            min=b;
        else
            min=c;
        return min;
    }
}


/*
    Output:-
    Enter three numbers:
    1 2 3
    The smallest integer is 1
*/