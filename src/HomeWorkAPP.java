public class HomeWorkAPP {
    public static void main(String[] args) {
         printThreeWords();
        CheckSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void CheckSumSign(){
        int a = 15;
        int b = 4;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        }
    public static void printColor(){
        int value = 77;
        if (value <= 0){
            System.out.println("Красный");
        } if (value <= 100){
            System.out.println("Желтый");
        } if (value > 100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 5;
        int b = 17;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}