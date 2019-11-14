import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);
        String playerChoice;

        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int Player = 0;
        int Ai = 0;

        String win = ("You win! Good job!" + "\n" + "Enter 'quit' to stop playing.");
        String tie = ("It's a tie!" + "\n" + "Enter 'quit' to stop playing.");
        String lose = ("Ai Bot wins!" + "\n" + "Enter 'quit' to stop playing.");

        //Opening Text
        System.out.println("Let's Play Rock-Paper-Scissors against an Ai." +
                "\n" + "Everything will be random, try your luck out!.");

        playerChoice = scan.nextLine();
        do {
            if (!playerChoice.equals("quit")) {

                //Randomizer
                int aiChoice = (int) (Math.random() * 3) + 1;

                if (aiChoice == rock && (playerChoice.equals("rock") || playerChoice.equals("Rock") || playerChoice.equals("1"))) {
                    System.out.println("You both picked Rock. " + tie);

                } else if (aiChoice == paper && (playerChoice.equals("paper") || playerChoice.equals("Paper") || playerChoice.equals("2"))) {
                    System.out.println("You both picked Paper. " + tie);

                } else if (aiChoice == scissors && (playerChoice.equals("scissors") || playerChoice.equals("Scissors") || playerChoice.equals("3"))) {
                    System.out.println("You both picked Scissors" + tie);

                } else if (aiChoice == rock && (playerChoice.equals("paper") || playerChoice.equals("Paper") || playerChoice.equals("2"))) {
                    System.out.println("Ai picked Rock and you chose Paper. " + win);
                    Player++;

                } else if (aiChoice == scissors && (playerChoice.equals("rock") || playerChoice.equals("Rock") || playerChoice.equals("1"))) {
                    System.out.println("Ai picked Scissors and you chose Rock. " + win);
                    Player++;

                } else if (aiChoice == paper && (playerChoice.equals("scissors") || playerChoice.equals("Scissors") || playerChoice.equals("3"))) {
                    System.out.println("Ai picked Paper and you chose Scissors. " + win);
                    Player++;

                } else if (aiChoice == paper && (playerChoice.equals("rock") || playerChoice.equals("Rock") || playerChoice.equals("1"))) {
                    System.out.println("Ai picked Paper and you chose Rock. " + lose);
                    Ai++;

                } else if (aiChoice == rock && (playerChoice.equals("scissors") || playerChoice.equals("Scissors") || playerChoice.equals("3"))) {
                    System.out.println("Ai picked Rock and you chose Scissors. " + lose);
                    Ai++;

                } else if (aiChoice == scissors && (playerChoice.equals("paper") || playerChoice.equals("Paper") || playerChoice.equals("2"))) {
                    System.out.println("Ai picked Scissors and you chose Paper. " + lose);
                    Ai++;

                } else {
                    System.out.println("Invalid input please try again");

                }

            }  System.out.println("+--------------------------+");
            System.out.println("|Final Score: " + Player + " Ai Score: " + Ai + "|");
            System.out.println("+--------------------------+");

        }while(!playerChoice.equals("quit"));

    }
}