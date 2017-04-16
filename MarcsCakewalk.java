import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by rukshar on 4/16/17.
 */
public class MarcsCakewalk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        // your code goes here
        long calorieSum = 0;
        Arrays.sort(calories);

        int index  = n-1;

        for(int i = 0;i<n;i++)
        {
            calorieSum += calories[index]*Math.pow(2,i);
            index--;
        }

        System.out.println(calorieSum);


    }
}
