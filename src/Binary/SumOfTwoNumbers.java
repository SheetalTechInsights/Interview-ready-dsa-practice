package Binary;

/*
  i> xor --->  calculate without carry
  ii> AND ----> calculate with carry
 */

public class SumOfTwoNumbers {
    public static int sum(int num1,int num2){
        while(num2!=0){
            int carry = (num1&num2)<<1;
             num1 = num1^num2;
             num2 = carry;
        }
        return num1;
    }
    public static void main(String[] args) {
      int a = 2;
      int b = 3;
        System.out.println(SumOfTwoNumbers.sum(a,b));
    }
}
