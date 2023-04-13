package Com.bridgelabzdaytwo;

import java.util.Scanner;

public class reversenumberwhileloop {
    public static void main(String[] args) {
        Scanner xyz=new Scanner(System.in);
        int no,rev=0,rem;
        System.out.println("enter the number");
        no=xyz.nextInt();
        while(no!=0)
        {
            rem=no%10;
            no=no/10;
            rev=rev*10+rem;
        }
        System.out.printf("Reverse is %d\n", rev);

    }

}
