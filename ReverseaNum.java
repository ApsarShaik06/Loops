import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // Reverse A number.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int reverse=0;
        while(n != 0){
            int lastDigit = n%10; // it will give you reminder as n = 123 then reminder is 3
            reverse = reverse*10 + newNum;
            n = n/10;
        }
        System.out.println("The Reverse number is : "+reverse);
    }
}
