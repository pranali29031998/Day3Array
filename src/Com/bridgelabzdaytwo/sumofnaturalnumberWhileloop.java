package Com.bridgelabzdaytwo;

public class sumofnaturalnumberWhileloop {
    public static void main(String[] args) {

        int num = 5, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
