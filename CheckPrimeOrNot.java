import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        //Display all numbers entered by the user except multiple of 10.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if( n == 2 ) {
            System.out.println("Given number is Prime");
        } else {
            boolean isPrime = true;
            for(int i=2; i<= n/2; i++) {
                if(n % i == 0){
                   isPrime = false;
                   break;
                }
            }
            if(isPrime){
                System.out.println("Given number is Prime");
            } else {
                System.out.println("Given number is not Prime");
            }
        }
    }
}
