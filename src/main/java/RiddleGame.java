import java.util.Random;
import java.util.Scanner;

public class RiddleGame extends GuessGame{

    public static void userNumberPick(){
        System.out.println("Choose the number from 0 to 100");
        System.out.println("Please, type 'Загадал'");
        String picked = new Scanner(System.in).nextLine();
        if(picked.equals("Загадал")){
            Random rand = new Random();
            int upperbound = 101;
            int int_random = rand.nextInt(upperbound);
            checkNumber(int_random);
        }
    }

    public static void checkNumber (int randomInt) {
        System.out.println("You guess " + randomInt + "?");
        System.out.println("Загаданное число 'Меньше', 'Больше', 'Правильно'");
        String right = new Scanner(System.in).nextLine();
        if (right.equals("Больше")){
            increaseNumber(randomInt);
        }else if (right.equals("Меньше")){
            decreaseNumber(randomInt);
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

    public static void decreaseNumber(int num){
        num = num - 1;
        checkNumber(num);
    }

    public static void increaseNumber(int num){
        num = num + 1;
        checkNumber(num);
    }
}
