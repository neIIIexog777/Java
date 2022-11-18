import java.util.Scanner;

public class Main {
    //Упражнение №1
    public static void main1(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        scanner.close();

        String answer =  checkingMessage(s);
        printConsole(answer);

    }

    static String checkingMessage(String s){
        switch (s) {
            case "Hi":
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

    //Упражнение №2
    public static void main2(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");

        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        scanner.close();

//        Если а - четное ИЛИ b - кратно трем
        if (a % 2 == 0 || b % 3 == 0) {
            System.out.println(a == b);
        }

        checkMultipleTwoOrThree(a,b);
    }
    static void checkMultipleTwoOrThree(int a, int b){
        if (a % 2 == 0 && a % 3 == 0) {    // Данную проверку можно оптимизировать как a % 6 == 0
//            Записываем в переменную result результат возведения a в степень b
//            Тип double был использован, потому что Math.pow() возвращает именно его.
//            В остальном нам подошел бы и long
            double result = Math.pow(a, b);

//            Если результат превышает допустимые размеры для int
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {    //в ином случае
//                Каст к int необязателен, но позволяет избежать выведения в консоль дробной части
                System.out.println((int) result);
            }
        }
    }


    //упражнение №3
    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        int length = in.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int width = in.nextInt();
        in.close();

        int lengthCounter = 0;
        String lengthLines = ""; // " "

        while (lengthCounter < length) {
            lengthLines += "-";
            lengthCounter++;
        }
        lengthLines = " " + lengthLines;
        String space = " ";

        for (int i = 0; i < lengthCounter; i++) {
            space += " ";
        }
        String widthLines = "";
        int widthCounter = 0;

        while (widthCounter < width) {
            widthLines += "|" + space + "|" + "\n";
            widthCounter++;
        }

        printConsole(lengthLines, widthLines );



    }
   static void printConsole(String lengthLines,String widthLines){
        System.out.print(lengthLines);
        System.out.println("");
        System.out.print(widthLines);
        System.out.print(lengthLines);
    }


    }
