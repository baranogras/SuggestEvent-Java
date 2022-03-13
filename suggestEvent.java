package Lesson3;
import java.util.Scanner;

public class suggestEvent {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a Temperature Value :");
        heat = input.nextInt();
         if (heat < 5){
             System.out.println("You Can Ski.");
         }else if (heat <= 25){
             if (heat <= 15){
                 System.out.println("You Can Go To The Cinema.");
             }
             if (heat >= 10 ){
                 System.out.println("You Can Go On A Picnic.");
             }

         }else{
             System.out.println("You Can Go Swimming.");
         }
    }
}
