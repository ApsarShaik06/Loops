import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        //Display all numbers entered by the user except multiple of 10.
        Scanner sc = new Scanner(System.in);
          do{
            System.out.print("Enter your number : ");
            int num = sc.nextInt();
            if(num%10 == 0){
                continue;
            }
            System.out.println("Number was : "+num);
          }while(true);
    }
}
