import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void randomNumberPick(){
        Random rand = new Random();
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);
        System.out.println("I picked the number");
        game(int_random);
    }

    public static void game(int randInt) {
        System.out.println("Guess what number i picked");
        try {
            int guess = new Scanner(System.in).nextInt();
            checkNumber(guess, randInt);
        }
        catch (Exception e){
            System.out.println("Must be a number");
            game(randInt);
        }
    }

    public static void checkNumber (int guess, int randomInt) {
        if (guess > randomInt){
            System.out.println("Your number is bigger");
            game(randomInt);
        }else if (guess < randomInt){
            System.out.println("Your number is lower");
            game(randomInt);
        }else {
            System.out.println("Bingo");
            System.out.println("Want tp play one more time? Yes/No");
            String more = new Scanner(System.in).nextLine();

            if(more.equals("Yes")){
                Main.main(null);
            }else {
                System.out.println("See you!");
            }
        }
    }
}
