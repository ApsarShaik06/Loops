import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many time you want Hello World word : ");
        int n = sc.nextInt();
        int count =0;

        while( count < n) {
            System.out.println("Hello World");
            count++;
        }

        System.out.println("Printed Hello World "+n+" times.");
    }
}
