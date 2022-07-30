
/*
 * Program to reverse any input number
 */



import java.util.Scanner;
 
public class Reverse_number {
    public static void main(String[] args) {
        System.out.println("Enter number to be reversed");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        
        // int num = 4256;


        int ans =0;
        while(num>0){
            int rem = num%10;
            num/=10;
            ans=ans*10+rem;


        }
        System.out.println(ans);
    }
}
