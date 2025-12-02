import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMinimumValue(returnedArray);
        System.out.println("Minimum value: " + returnedMin);

//        reverse(returnedArray);
//        System.out.println("Final: " + Arrays.toString(returnedArray));

        int[] reversedCopy = reverseCopy(returnedArray);
        System.out.println("Before reverse: " + Arrays.toString(returnedArray));
        System.out.println("After reverse: " + Arrays.toString(reversedCopy));
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a List of integers separated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMinimumValue(int[] arrayInputted){
        int min = Integer.MAX_VALUE;
        for (int element : arrayInputted){
            if (element < min){
                min = element;
            }
        }
        return min;
    }

    private static void reverse(int[] inputArray){
        int maxIndex = inputArray.length - 1;
        int halfLenght = inputArray.length / 2;

        for (int i = 0; i < halfLenght; i++){
            int temp = inputArray[i];
            inputArray[i] = inputArray[maxIndex - i];
            inputArray[maxIndex - i] = temp;
            System.out.println("---> " + Arrays.toString(inputArray));
        }
    }

    private static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;

        for (int element : array){
            reversedArray[maxIndex--] = element;
        }
        return reversedArray;
    }
}