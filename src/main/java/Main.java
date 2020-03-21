import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter you name");
        String userName = new Scanner(System.in).nextLine();
        Validation.validation(userName);
    }

    public static void startGame(String user){
        System.out.println("Choose the action");
        System.out.println("1. Play 'Guess the number'");
        System.out.println("2. Play 'Riddle the number'");
        System.out.println("3. Exit");
        String game = new Scanner(System.in).nextLine();

        if (game.equals("1")){
            GuessGame.randomNumberPick();
        }else if (game.equals("2")){
            RiddleGame.userNumberPick();
        }else if (game.equals("3")) {
            System.out.println("See you");
        }else{
            System.out.println("Wrong action");
            startGame(user);
        }
    }

}
