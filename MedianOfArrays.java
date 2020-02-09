package JustPlayAround;
import java.util.ArrayList;
import java.util.Collections;
public class MedianOfArrays {
    public static void merge(int[] arr1, int[] arr2) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < arr1.length ; i++) {
            myList.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            myList.add(arr2[i]);
        }
        Collections.sort(myList);
        int n = myList.size();
        System.out.println(median(myList, n));
    }
    public static double median(ArrayList<Integer> myList, int n) {
        if (n%2!=0) {
            return myList.get(n / 2);
        }
        else {
            return (myList.get((n - 1) / 2) + myList.get(n / 2))/2.0;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        merge(arr1,arr2);
    }
}
