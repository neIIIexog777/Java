import java.util.Scanner;


//Упражнение №1
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        scanner.close();

    String answer =  checkingMessage(s);
    printConsole(answer);

    }

        static String checkingMessage(String s){
        switch (s) {
            case "Hi":  // Если s равно "Hi"
//                Выводим в консоль "Hello"
                return "Hello";

            case "Bye":
                return "Good bye";

            case "How are you":
                return "How are your doing";

            default:
                return "Unknown message";
        }
    }

    static void printConsole(String s){
        System.out.println(s);
    }
}