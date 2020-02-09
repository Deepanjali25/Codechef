package JustPlayAround;
import java.util.Scanner;
public class FindDuplicate {
    public static void printRepeating(int[] intArray) {
        int i;
        for (i = 0; i < intArray.length; i++) {
            if (intArray[Math.abs(intArray[i])] >= 0)
                intArray[Math.abs(intArray[i])] = -intArray[Math.abs(intArray[i])];
            else
                System.out.print(Math.abs(intArray[i]) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindDuplicate duplicate = new FindDuplicate();
        int intArray[] = {1, 2, 3, 1, 3, 6, 6};
        duplicate.printRepeating(intArray);
    }
}
