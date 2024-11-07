import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // Print Numbers from 1 to n using while loop
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while(i <= n){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
    }
}
