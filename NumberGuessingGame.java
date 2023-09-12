import java.util.*;
import java.lang.Math;
public class NumberGuessingGame{
    public static void main(String[]args){
        int limit=5;
        int i;
        System.out.println("Welcome to Guess Number Game");
        System.out.println("You Will Be Asked To Guess A Number To Win The Game ");
        System.out.println("You Have Maximum, 5 Attemp Limit");
        Scanner input=new Scanner(System.in);
        int randomNumber=(int)(Math.random()*100)+1;
       
        
     
        for(i=0;i<limit;i++){
            System.out.println("Enter a guess number between 1 to 100");
            int guessNumber=input.nextInt();
            if(randomNumber==guessNumber){
                System.out.println("OOhhOO!,Your Number is Correct.You Win the Game!");
                break;
            }
            else if(randomNumber>guessNumber&&i!=limit-1){
                System.out.println("Your Guess Number is Greater");
            }
            else if(randomNumber<guessNumber&&i!=limit-1){
                System.out.println("Your Guess Number is Smaller");
            }
            
        }
        if(i==limit){
            System.out.println("Sorry,Your limit is Over");
        }
    }
}