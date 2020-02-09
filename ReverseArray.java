package JustPlayAround;
public class ReverseArray {
   public static void reverseRecursive(int[] arr, int start, int end) {
        int temp;
        if (start>end) {
            return ;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseRecursive(arr, start + 1, end - 1);
    }
    public static void reverseIterative(int[] arr, int start, int end) {
       int temp;
       while(start<end) {
           temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
    }
}
