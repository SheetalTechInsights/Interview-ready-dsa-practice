package Arrays;

public class ProductExceptSelf {
    public int [] product(int[]arr){
        int n = arr.length;
        int []result = new int[n];
        int []preffix = new int[n];
        int []suffix = new int[n];

        preffix[0] =1 ;
        for(int i=1;i<n;i++){
            preffix[i] = preffix[i-1]*arr[i-1];
        }

        suffix[n-1] = 1;
        for(int i =n-2;i>=0;i--){
            suffix[i] = suffix[i+1]*arr[i+1];
        }

        for(int i=0;i<n;i++){
            result[i] = preffix[i] * suffix[i];
        }
        return result;
    }
    public static void main(String[] args) {
         int []arr = {1,2,3,4};
         ProductExceptSelf p = new ProductExceptSelf();
         int []res = p.product(arr);
         for(int num:res){
             System.out.println(num+" ");
         }

    }
}
