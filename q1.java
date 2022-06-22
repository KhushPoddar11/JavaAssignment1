package assignment1;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        q1 check = new q1();
        check.tell(num);
    }
    public void tell(int n) {
        if(n%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}

/* Output:
        Enter a number:
        11
        Number is odd
*/
