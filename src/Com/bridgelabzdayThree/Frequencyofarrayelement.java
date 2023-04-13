package Com.bridgelabzdayThree;

import java.util.Arrays;

public class Frequencyofarrayelement {
    public static void main(String[] args){
        int[] arr = { 2, 3, 2, 4, 3, 1, 1,};
        Arrays.sort(arr);
        int i,j,frequency;
        System.out.println("frequency of arraye element");
        for(i=0; i<arr.length; i++) {
            frequency = 1;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    frequency++;
                } else {
                    break;
                }
            }
            i = j - 1;
            if (frequency > 1) {
                System.out.println(arr[i] + "=" + frequency);
            }
        }
    }
}


