import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert numbers separated by commas: ");
        String input = scanner.nextLine();
        String[] splits =input.split(",");
        int[] myArray =new int[splits.length];
        for (int i = 0; i < splits.length; i++){
        myArray[i] = Integer.parseInt(splits[i].trim());
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println("-".repeat(30));
        myArray.reve
        System.out.println();
    }

    public int[] reverse(int[] inputArray){
        return inputArray;
    }
}