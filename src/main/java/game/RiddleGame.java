package game;

import java.util.Scanner;

public class RiddleGame{

    static int maxNum = 100;
    static int minNum = 0;

    public static void userNumberPick(){
        System.out.println("Choose the number from 0 to 100");
        System.out.println("Please, type 'Загадал'");
        String picked = new Scanner(System.in).nextLine();
        if(picked.equals("Загадал")){
            checkNumber(50);
        }
    }

    public static void checkNumber (int randomInt) {
        System.out.println("You guess " + randomInt + "? \nЗагаданное число 'Меньше', 'Больше', 'Правильно'");
        String right = new Scanner(System.in).nextLine();
        if (right.equals("Больше")){
            increaseNumber(randomInt);
        }else if (right.equals("Меньше")){
            decreaseNumber(randomInt);
        }else if (right.equals("Правильно")){
            System.out.println("Bingo");
            Main.oneMoreGame();
        }else {
            System.out.println("You should type 'Меньше', 'Больше', 'Правильно'");
            checkNumber(randomInt);
        }
    }

    public static void decreaseNumber(int num){
        maxNum = num - 1;
        num = (minNum + maxNum) / 2;
        checkNumber(num);
    }

    public static void increaseNumber(int num){
        minNum = num + 1;
        num = (minNum + maxNum) / 2;
        checkNumber(num);
    }
}

