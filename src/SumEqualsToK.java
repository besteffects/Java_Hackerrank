// Print out all integer pairs from the array below whose sum is equal to 6 and return their count.

public class SumEqualsToK {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        findNumberOfPairsSum(arr, sum);
    }

    static int findNumberOfPairsSum(int[] arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    count++;
                    System.out.print(arr[i] + " " + arr[j] + ", ");
                }
            }
        }
        return count;
    }
}
