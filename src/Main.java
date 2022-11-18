import java.util.Scanner;

public class Main {
    //Упражнение №1
    public static void main(String[] args) {


        addStrings("Hello","this","is","Java");
        addStrings("Say","my","name");
    }

    static void  addStrings(String ...s) {
        String string = "";
        for (String txt : s){
            string += txt + " ";
        }

        System.out.println(string);
    }

    //Упражнение №2
    public static void main2(String[] args) {

        System.out.println(countSum(2, 3));
        System.out.println(countSum(2.5, 3.3));
        System.out.println(countSum('h', 'i'));
    }

    static int countSum(int ...args){
        int sum = 0;
        for (int arg : args){
            sum += arg;
        }
        return sum;
    }
    static double countSum(double ...args){
        double sum = 0;
        for (double arg : args){
            sum += arg;
        }
        return sum;
    }
    static String countSum(char ...args){
        String sum = "";
        for (char arg : args){
            sum += arg;
        }
        return (String)sum;
    }

    //Упражнение №3
    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        in.close();
        System.out.println(factorial(num));

    }

    static int factorial(int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }
}





