package MasteringNumbers;

import java.util.Scanner;

public class ProductOfNumber {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        while(n!=0){
            int ld = n%10;
            prod =prod*ld;
            n = n/10;
        }
        System.out.println(prod);
    }
}
