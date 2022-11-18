import java.util.Arrays;
import java.util.Scanner;
public class Main {

    //упражнение №3
    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int lastNumber = in.nextInt();
        in.close();

        int[] arr = new int[lastNumber];

        for (int i = 0;i<lastNumber;i++ ){
            if((i > 10) && (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)){
                arr[i] = i;
            } else if ((i > 1 && ((i % 2 != 0 || i == 2) && (i % 3 != 0 || i == 3 )))) {
                arr[i] = i;
            }

        }
        int arrCounter = 0;
        for(int i: arr){
            if(i != 0){
                arrCounter++;
            }
        }
        int[] arrSorted = new int[arrCounter];
        for (int i = 0, j = 0; i  < arr.length; i++){
            if(arr[i] != 0){
                arrSorted[j] = arr[i];
                j++;
            }
        }


        System.out.println(Arrays.toString(arrSorted));


    }

    //упражнение №2
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];


        for(int i = 0; i<arr.length;i++){
            System.out.print("Input a number: ");
            arr[i] = in.nextInt();

        }
        in.close();
        for(int i = 0; i< arr.length; i++){
            if (i == 0){
                System.out.println(arr[0]+ arr[arr.length-1]);
            }
            else System.out.println(arr[i]+arr[i-1]);
        }



    }


    //упражнение №1

    public static void main(String[] args) {


        char[] name = {'P','a','v','e','l'};

        for(char i : name){
            System.out.print(i);
        }
        System.out.println("");

        char[] name2 = {'P','a','v','e','l'};
        String s ="";

        for(char i : name){
            s += i;
        }

        System.out.println(s);
    }


}


















