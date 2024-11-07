import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        //Question2:Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        Scanner sc = new Scanner(System.in);
        String stop = "Y";
        
        int evenSUm = 0;
        int oddSum = 0;
        do{
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if(n%2 == 0){
                evenSUm +=n;
            } else {
                oddSum +=n;
            }
            System.out.println("Do you want to stop entering input? (Y/N): ");
            String enter = sc.next();
            if(stop.equals(enter)){
                break;
            }
        }while(true);

        System.out.println("Sum of Even numbers : "+evenSUm);
        System.out.println("Sum of Odd numbers : "+oddSum);
    }
}
