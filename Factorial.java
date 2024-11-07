import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // Question 3 :Write a program to find the factorial of any number entered by the user.
        // (Hint:factorialofanumbern=n*(n-1)*(n-2)*(n-3)*......*1andexistsforpositivenumbersonly. 
        // We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
        //Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the samers.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( n < 0){
            System.out.println("Invalid number, please try again..");
        } else {
            int factorial =1;
            for(int i =n; i>=1; i--) {
                factorial *=i;
            }
            System.out.println("Factorial of Given Number is : "+factorial);
        }
    }
}
