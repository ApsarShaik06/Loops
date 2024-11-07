import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        //Keep entering numbers till user enter a multiple of 10.
        Scanner sc = new Scanner(System.in);
          do{
            System.out.print("Enter your number : ");
            int num = sc.nextInt();
            if(num%10 == 0){
                break;
            }
            System.out.println(num);
          }while(true);
        System.out.println("I am out of the loop as you entered multiple of 10");
    }
}
