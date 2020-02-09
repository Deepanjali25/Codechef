package JustPlayAround;
public class Knapsack {
    public static int max(int a, int b) { // A utility function that returns maximum of two integers
        return (a > b)? a : b;
    }
    public static int knapSack(int W, int[] weight, int[] value, int n) {
        // Returns the max val that can be put in a knapsack of capacity W
        if (n == 0 || W == 0)
            return 0;
        // If weight of the nth item is more than Knapsack capacity W,
        // then this item cannot be included in the optimal solution
        if (weight[n-1] > W)
            return knapSack(W, weight, value, n-1);//Return the maximum of two cases:(1)nth item included (2)not included
        else
            return max( value[n-1]+knapSack(W-weight[n-1], weight, value, n-1), knapSack(W, weight, value, n-1));
    }
    public static void main(String[] args) {
        int[] value = new int[]{60, 100, 120};
        int[] weight = new int[]{10, 20, 30};
        int W = 50;
        int n = value.length;
        System.out.println(knapSack(W, weight, value, n));
    }
}