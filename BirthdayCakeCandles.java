import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/5/2017.
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[]= new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);

        int max = a[n-1]; int count = 0;
        for(int i = n-1;i>=0;i--)
        {
            if(a[i] == max)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
