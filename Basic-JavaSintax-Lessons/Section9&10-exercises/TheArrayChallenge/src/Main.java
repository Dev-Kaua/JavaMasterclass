import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] descendingSortArray = getRandomValuesToArray(10);
        System.out.println(Arrays.toString(descendingSortArray));
        

    }

    public static int[] getRandomValuesToArray(int lenght){
        Random random = new Random();
        int[] randomArray = new int[lenght];

        for (int i = 0; i < lenght; i++){
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    private static int[] sortIntegers(int[] array){
        System.out.println(Arrays.toString(array));

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i=0; i < sortedArray.length; i++){
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("-----> " + Arrays.toString(sortedArray));
                }
            }
            System.out.println("FINAL ARRAY -----> " + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}