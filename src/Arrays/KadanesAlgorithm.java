package Arrays;

public class KadanesAlgorithm {
    public int maximumSum(int []arr){
        int  maxSum= arr[0];

        int currentSum = 0;
        for(int i =0;i<arr.length;i++){
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
      int []array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      KadanesAlgorithm kd = new KadanesAlgorithm();
        System.out.println(kd.maximumSum(array));
    }
}
