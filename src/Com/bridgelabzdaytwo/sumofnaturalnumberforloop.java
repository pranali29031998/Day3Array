package Com.bridgelabzdaytwo;

public class sumofnaturalnumberforloop {
    public static void main(String[] args) {

        int num = 5, sum = 0;

        for(int i = 1; i <= num; i++)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
