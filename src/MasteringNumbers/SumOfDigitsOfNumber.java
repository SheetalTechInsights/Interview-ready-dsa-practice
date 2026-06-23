package MasteringNumbers;

import java.util.*;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int sum =0;
        while(n !=0){
            int lastDigit = n%10;
            sum =sum+lastDigit;
            n = n/10;
        }
        System.out.println(sum);
    }


}
