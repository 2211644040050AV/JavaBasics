public class maxSubArray {

    // max sub array sum
    // public static void Print_SubArr(int Arr[]) {
    // int currSum = 0;
    // int maxSum = Integer.MIN_VALUE;

    // for (int i = 0; i < Arr.length; i++) {
    // int start = i;
    // for (int j = i; j < Arr.length; j++) {
    // int end = j;
    // currSum = 0;
    // for (int k = start; k <= end; k++) { // print
    // // subarray sum
    // currSum += Arr[k];
    // }
    // System.out.println(currSum);
    // if (maxSum < currSum) {
    // maxSum = currSum;
    // }
    // }
    // }
    // System.out.println("Max Sum = " + maxSum);
    // }

    // max sub array prefix sum
    public static void Print_SubArr(int Arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[Arr.length];
        prefix[0] = Arr[0];

        // calculate prefix array
        for (int i = 1; i < Arr.length; i++) {
            prefix[i] = prefix[i - 1] + Arr[i];
        }

        for (int i = 0; i < Arr.length; i++) {
            int start = i;
            for (int j = i; j < Arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int Arr[] = { 2, 4, 6, 8, 10 };
        Print_SubArr(Arr);
    }

}