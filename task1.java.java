import java.util.*;
import java.util.*;
public class Main{
     static boolean guessCorrect = false;
     static int guess;
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        boolean choice=true;
        int min=1;
        int max=100;
        int score=0;
        int attempts=4;
        int roundsPlayed=1;
        while(choice){
            
        System.out.println("Welcome to the Number Game");
        int randomNumber = random.nextInt(max)+min;
        //System.out.println(randomNumber);
        
         while(!guessCorrect && attempts>0){
            System.out.println("Enter the number");
            guess=sc.nextInt();
            attempts --;
             
             if(guess>randomNumber){
                 System.out.println("Too high");
             }
             else if(guess==randomNumber){
                 System.out.println("you guess correctly you wins the game");
                 score++;
                 guessCorrect=true;
                 
             }
             else{
                 System.out.println("Too low");
             }
             
    }
        
         System.out.print("Do you eant to play again?"+"\n"+"press y for yes and n for no:");
         
         char ch=sc.next().charAt(0);
         choice=ch=='y'?true:false;
         if (choice){
             attempts=4;
             roundsPlayed++;
             guessCorrect=false;
         }
         else{
             System.out.println("Here is your score card:");
             System.out.println("Score:"+ score);
             System.out.println("No of rounds played:"+ roundsPlayed);
         }
        
        
    }
    }
}
