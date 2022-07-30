import java.util.Scanner;

public class Count_numbers {
    public static void main(String[] args) {
        System.out.println("enter the no. to be counted");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int count=0;

        while(num>0){
            int rem=num%10;

            if (rem== 5){
                count++;
            }
            num=num/10;

        }
        System.out.println("number 5 is repeated "+count+"times");
    }
}
