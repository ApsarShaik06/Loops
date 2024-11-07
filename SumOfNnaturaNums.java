import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // Print Sum of First N natural numbers.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int i=1;
        while(i <= n){
            sum +=i; //adding every number and storing in sum
            i++; // increasing i by 1
        }
        System.out.println("Sum of "+n+" Natural numbers is : "+sum);

        // trying with formula to calculate first N natural sum.
        int newSum = (n*(n+1))/2;
        System.out.println("Sum of "+n+" Natural numbers is : "+newSum);
    }
}
