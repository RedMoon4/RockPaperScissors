import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int rock=1;
        int paper=2;
        int scissors=3;
        String chose;
        String rocky="Rock";
        String papery="Paper";
        String scissorsy="Scissors";

        String win=("You won! :) Good job! Rerun program to play again.");
        String tie=("You tied, good game. Rerun program to play again.");
        String lose=("RPS Bot won, good game. Rerun program to play again.");
        String y="y";
        String Y="Y";
        String Yes="Yes";
        String yes="yes";
        String X="X";
        String x="x";
        String N="N";
        String n="n";
        String No="No";
        String no="no";
        String go;
        int Player=0;
        int Ai=0;


        do{

            int oneToThree =(int)(Math.random()*3)+1;
            System.out.println("Your Score: "+Player+" Com Score: "+Ai);
            System.out.println("Let's play Rock Paper Scissors against RPS Bot! (Robotic Player Systems)\n" +
                    "Click right under this mesasage, then type Rock for Rock, Paper for Paper, or Scissors for Scissors and press enter! \n" +
                    "The game will ONLY accept the above words in upercase! NOTHING ELSE! \nIf you " +
                    "need to rerun the program press the green arrow. Press x if you don't want to play.");
            chose=scan.next();

            if(oneToThree==rock&&chose.equals(rocky)) {
                System.out.println("You both chose Rock. "+tie);
            }
            else if(oneToThree==paper&&chose.equals(papery)){
                System.out.println("You both chose Paper. "+tie);
            }
            else if(oneToThree==rock&&chose.equals(papery)){
                System.out.println("RPS Bot chose Rock and you chose Paper. "+win);
                Player++;
            }
            else if(oneToThree==scissors&&chose.equals(rocky)){
                System.out.println("RPS Bot chose Scissors and you chose Rock. "+win);
                Player++;
            }
            else if(oneToThree==paper&&chose.equals(scissorsy)){
                System.out.println("RPS Bot chose Paper and you chose Scissors. "+win);
                Player++;
            }
            else if(oneToThree==paper&&chose.equals(rocky)){
                System.out.println("RPS Bot chose Paper and you chose Rock. "+lose);
                Ai++;
            }
            else if(oneToThree==rock&&chose.equals(scissorsy)){
                System.out.println("RPS Bot chose Rock and you chose Scissors. "+lose);
                Ai++;
            }
            else if(oneToThree==scissors&&chose.equals(papery)){
                System.out.println("RPS Bot chose Scissors and you chose Paper. "+lose);
                Ai++;
            }
            else{
                System.out.println("I don't know what you entered into the game and I can't understand it" +
                        ", \n but it wasn't a valid choice and RPS Bot" +
                        " doesn't understand what you did either. \nRemember there are only 3 choices in Rock Paper Scissors." +
                        " \n Now press the green triangle to rerun the program, \nthen click underneath the message that appears at the start. \nType" +
                        " Rock to choose Rock, Paper for Paper, or Scissors for Scissors. \nThe game will ONLY accept the above words in uppercase! NOTHING ELSE!" +
                        "\n Then, press enter to try your luck!");}
        }while((chose.equals(Y)||chose.equals(y)||chose.equals(Yes)||chose.equals(yes))||(!chose.equals(x)&&!chose.equals(X)&&!chose.equals(n)&&!chose.equals(N)&&!chose.equals(No)&&!chose.equals(no)) );

    }
}