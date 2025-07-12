import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        for(int i=1; i<=n; i++)
        {
            product = product*i;
        }
        System.out.println("Factorial of "+n+" is "+ product);
    }
    
}
