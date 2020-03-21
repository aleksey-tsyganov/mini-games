public class Validation {

    public static void validation(String str) {
        if (str.matches("^[a-zA-Z]+$" )) {
            str = str.substring(0, 1).toUpperCase() + str.substring(1);
            System.out.println("Hello " + str);
            Main.startGame(str);

        }else {
            System.out.println("Name must contains only english letters and no spaces");
            Main.main(null);
        }
    }
}
