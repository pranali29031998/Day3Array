package Com.bridgelabzdaytwo;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter you String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String org_str=str;
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(org_str.equals(rev))
        {
            System.out.println(org_str+"is palindrom string");
        }
        else
        {
            System.out.println(org_str+"is not palindrom string");
        }
    }
}
