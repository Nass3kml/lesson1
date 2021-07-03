import java.util.Arrays;

public class HomeWorkAPP {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] Array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(Array));
        changeZeroesAndOnes(Array);
        System.out.println(Arrays.toString(Array));

        System.out.println("Задание 2");
        int[] twoArray = new int[100];
        System.out.println(Arrays.toString(twoArray));
        fillArrayWithSequence(twoArray);
        System.out.println(Arrays.toString(twoArray));

        System.out.println("Задание 3");
        int[] threeArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(threeArray));
        doubleNumbersLessThanSix(threeArray);
        System.out.println(Arrays.toString(threeArray));

        System.out.println("Задание 4");
        int[][] square = new int[6] [6];
        System.out.println("Нули");
        printSquare(square);

        fillDiagWithOnes(square);
        System.out.println("Единицы");
        printSquare(square);

        System.out.println("Задание 5");
        int initualValue = 10;
        int size = 5;
        int[] fourArray = getNewArrayWith(initualValue, size);
        System.out.println(Arrays.toString(fourArray));
    }

    public static void printSquare(int[][] inputSquare){
        for (int i = 0; i < inputSquare.length; i++){
            System.out.println(Arrays.toString(inputSquare[i]));
        }
    }
    // 1 задание
    public static void changeZeroesAndOnes(int [] inputArray){
        for (int i = 0; i < inputArray.length; i++){
            inputArray[i] = 1 - inputArray[i];
        }
    }

    // 2 задание
    public static void fillArrayWithSequence(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (i + 1);
        }
    }

    // 3 задание
    static void doubleNumbersLessThanSix(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++){
            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
        }
    }

    // 4 задние
    public static void fillDiagWithOnes (int[][] sqaure){
        for (int i = 0; i < sqaure.length; i++){
            sqaure [i][i] = 1;
            sqaure[i] [sqaure[i].length - 1 - i] = 1;
        }
    }

    // 5 задание
    public static int[] getNewArrayWith(int initualValue, int length){
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++){
            result[i] = initualValue;
        }
        return result;
    }
}