package Binary;

public class MissingNumber {
    public static int missingNumber(int[]arr) {
        int xor = 0;
        int n= arr.length;
        for(int i=0;i<=n;i++){
            xor = xor^i;
        }

        for(int num:arr){
            xor =xor^num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[]arr ={3,0,1};
        System.out.println(missingNumber(arr));
    }
}
