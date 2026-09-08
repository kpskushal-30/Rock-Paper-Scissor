import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissor"};
        String playerchoice;
        String compchoice;
        int rounds;
        int comptotal = 0;
        int playertotal = 0;

        System.out.println("-----ROCK PAPER SCISSOR GAME-----");
        System.out.print("Enter the number of rounds: ");
        rounds = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i<rounds;i++){
            System.out.print("Enter your move(rock, paper, scissor): ");
            playerchoice = scanner.nextLine().toLowerCase();

            if(!playerchoice.equals("rock") && !playerchoice.equals("paper") && !playerchoice.equals("scissor")){

                System.out.println("Invalid Choice!!!");
            }

            compchoice = choices[random.nextInt(3)];
            System.out.println("Computer's choice: " + compchoice);

            if(playerchoice.equals(compchoice)){
                System.out.println("It's a TIE!!!");

            }
            else if(playerchoice.equals("rock") && compchoice.equals("scissor")  ||
                    playerchoice.equals("paper") && compchoice.equals("rock") ||
                    playerchoice.equals("scissor") && compchoice.equals("paper")){

                System.out.println("You WIN the round!!!");
                playertotal+=1;
            }
            else{
                System.out.println("You LOST the round!!");
                comptotal+=1;
            }



        }
        System.out.println("---------------------");
        System.out.print("Score: " + playertotal + "-" + comptotal);
        System.out.println();
        if(playertotal > comptotal){
            System.out.println("You WON,Congrats :) !!!!");
        }
        else{
            System.out.println("You LOSE :(");
        }
        System.out.println("Thank you for playing!!");
    }

}
