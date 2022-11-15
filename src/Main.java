
import java.util.Scanner;
public class Main {

    //упражнение №1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.printf("Факториал числа %d: %d \n", num, factorial);
        in.close();


    }

    //упражнение №2
    public void main2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.printf("сумма цифр числа %d: %d \n", num, sum);
        in.close();
    }

    //упражнение №3
    public static void main3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        int dlina = in.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int shirina = in.nextInt();

        int dlinaCounter = 0;
        String dlinaLines = " ";
        String spaces = " ";
        int shirinaCounter = 0;
        String shirinaLines = "";

        while (dlinaCounter < dlina) {
            dlinaLines += "-";
            dlinaCounter++;
        }

        for (int i = 0; i < dlinaCounter; i++) {
            spaces += " ";
        }
        while (shirinaCounter < shirina) {
            shirinaLines += "|" + spaces + "|" + "\n";
            shirinaCounter++;
        }

        //out
        System.out.print(dlinaLines);
        System.out.println("");
        System.out.print(shirinaLines);
        System.out.print(dlinaLines);

        in.close();
    }

    //Упражнение №4
    public static void main4(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + num);
            } else {
                System.out.println(i - num);
            }
            if (i == num) {
                System.out.println("числа равны");
            }
        }

        in.close();
    }

    //упражнение 5
    public static void main5(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;

        do {
            System.out.println("Введите число: ");
            num = in.nextInt();
            if (num != 1) {
                System.out.println("не угадал");
            }

        } while (num != 1); // не понял, почему здесь отрицацие, получается 1 != 1 , но это же false

        System.out.println("Угадал!");

        in.close();

    }
}


















