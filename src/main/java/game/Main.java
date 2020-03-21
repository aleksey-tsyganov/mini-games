package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter you name");
        String userName = new Scanner(System.in).nextLine();
        Validation.validation(userName);
    }

    public static void startGame(){
        System.out.println("Choose the action \n1. Play 'Guess the number' \n2. Play 'Riddle the number' \n3. Exit");
        String game = new Scanner(System.in).nextLine();

        if (game.equals("1")){
            GuessGame.randomNumberPick();
        }else if (game.equals("2")){
            RiddleGame.userNumberPick();
        }else if (game.equals("3")) {
            System.out.println("See you");
        }else{
            System.out.println("Wrong action");
            startGame();
        }
    }

    public static void oneMoreGame(){
        System.out.println("Want to play one more time? Yes/No");
        String more = new Scanner(System.in).nextLine();
        if(more.equals("Yes")){
            startGame();
        }else {
            System.out.println("See you!");
        }
    }

}
