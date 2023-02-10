import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args) {
        String computerChoice;
        Random Cnum= new Random(3);
        int ComNum=Cnum.nextInt(1,4);

        Scanner scnr=new Scanner(System.in);
        System.out.println("Would you like to play Rock, Paper, Scissors?");
        System.out.println("Enter (N) for no and (Y) for yes");
        String userAns=scnr.nextLine();

        if(userAns.equalsIgnoreCase("N")){
            return;
        }

        System.out.println("choose between (rock, paper and scissors)");
        String userChoice=scnr.nextLine();

        if(ComNum==1){
            computerChoice="rock";
        }
        else if(ComNum==2){
            computerChoice="paper";
        }
        else{
            computerChoice="scissors";
        }

        System.out.println("The computer chose: " + computerChoice );

        if(computerChoice.equals(userChoice)){
            System.out.println("The game was a draw!");
        }
        else if(computerChoice.equals("rock")) {
            if (userChoice.equalsIgnoreCase("paper")) {
                System.out.println("Paper wraps rock. You Win!");
            }
        }
            else if(userChoice.equalsIgnoreCase("scissors")){
                System.out.println("Rock crushes paper. You lose...");
            }
        else if(computerChoice.equals("paper")){
            if(userChoice.equalsIgnoreCase("rock")){
                System.out.println("Paper wraps rock. You lose...");
            }
            else if(userChoice.equalsIgnoreCase("scissors")){
                System.out.println("Scissors cuts paper. You Win!");
            }
            }
        else if(computerChoice.equals("scissors")){
            if(userChoice.equalsIgnoreCase("rock")){
                System.out.println("Rock crushes scissors. You Win!");
            }
            else if(userChoice.equalsIgnoreCase("paper")){
                System.out.println("Scissors cut paper. You lose...");
            }
            }
        else{
                System.out.println("Please chose between rock, paper and scissors");
            }
















    }
}
