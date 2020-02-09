package JustPlayAround;
public class RotateArray {
    public static void arrayRotation(int[] arr, int d) {
        int[] tempArray = new int[d];
        for (int i = 0; i < d; i++) {
            tempArray[i] = arr[i];
        }
        System.out.println(tempArray);
    }
    public static void main(String[] args) {
        int[] arrToRotate = {1,2,3,4,5};
        int d = 2;
        arrayRotation(arrToRotate,d);
    }
}
