package Binary;


/*
point to remember: n &(n-1) .....to count 1
 */
public class NumberOfBits {
    public static int hammingWeight(int num){
        int count =0;
        while(num!=0){
            num = num&(num-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
}
