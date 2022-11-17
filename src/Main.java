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

        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            System.out.print("Input a number: ");
            arr[i] = in.nextInt();
            sum+=arr[i];
        }
        in.close();
        System.out.println(sum);

    }

    //упражнение №1

    public static void main1(String[] args) {


        char[] name = {80,97,118,101,108};

        for(char i : name){
            System.out.println(i);
        }


        char[] name2 = {80,97,118,101,108};
        String s ="";

        for(char i : name){
            s += i;
        }

        System.out.println(s);
    }


}


















