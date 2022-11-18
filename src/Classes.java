public class Classes {
    //Упражнение №5
    public static void main(String[] args) {

        Counter Plus = new Counter("Plus", 150);
        Plus.plus();
        Counter Minus = new Counter("Minus", 10);
        Minus.minus();
        Minus.userMinus(150);
        Minus.userPlus(300);
    }

}
class Counter{
    String name;
    int count;

    Counter(String name, int count){
        this.name = name;
        this.count = count;
    }
    Counter(String name){
        this.name = name;
        this.count = 0;
    }

    void plus(){
        System.out.println(++count);
    }
    void minus(){
        System.out.println(--count);
    }
    void userPlus(int i){
        System.out.println(count-i);
    }
    void userMinus(int i){
        System.out.println(count-i);
    }
}
