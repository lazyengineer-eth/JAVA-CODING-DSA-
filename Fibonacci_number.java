/*
 * to find the nth fibonaci number
 * 
 */


import java.util.Scanner;

public class Fibonacci_number {
    public static void main(String[] args) {


        System.out.println("enter the nth number to find");
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();


        int a= 0;
        int b=1;
        int count=2;

        while (count<=n){

            int temp=b;
            b+=a;
            a=temp;
            count++;


        }
        System.out.println("the nth fibonacci number is:"+b);
    }
}
