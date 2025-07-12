import java.util.Scanner;
public class Q2_student_grade
{
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                if(n<=100 & n>=90)
                {
                    System.out.println("Your grade is O");
                }
                else if(n<=89 & n>=80)
                {
                    System.out.println("Your grade is E");
                }
                else if(n<=79 & n>=70)
                {
                    System.out.println("Your grade is A");
                }
                else if(n<=69 & n>=60)
                {
                    System.out.println("Your grade is B");
                }
                else if(n<=59 & n>=50)
                {
                    System.out.println("Your grade is C");
                }
                else if(n<=49 & n>=40)
                {
                    System.out.println("Your grade is D");
                }
                else
                {
                    System.out.println("Your grade is F");
                }
    }
}
