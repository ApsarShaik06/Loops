import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
      //Question4: Write a program to print the multiplication table of a number N, entered by the user.
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number, we will give you the Table of given number : ");
      int n = sc.nextInt();

      for(int i = 1; i<=10; i++) {
        System.out.println(n+" * "+i+" = "+(n*i));
      }
    }
}
