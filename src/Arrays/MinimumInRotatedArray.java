package Arrays;

public class MinimumInRotatedArray {
    public int minimum(int []arr){
        int low  = 0;
        int high = arr.length-1;
        while(low<high){
            int mid  = low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
    int []arr = {4,5,6,7,1,2,3};
    MinimumInRotatedArray min = new MinimumInRotatedArray();
    int result = min.minimum(arr);
        System.out.println(result+" ");
    }
}
