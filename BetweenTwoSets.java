import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/20/2017.
 */
public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        Arrays.sort(a);Arrays.sort(b);
        int smallA = a[0]; int smallB = b[0]; int count = 0;
        for(int i = smallA;i<=smallB;i++)
        {
            boolean flag = true;
            for(int j = 0;j<n && flag;j++)
            {
                if(i%a[j] != 0)
                {
                    flag = false; break;
                }


            }

            for(int j = 0;j<m && flag;j++)
            {
                if(b[j]%i != 0)
                {
                    flag = false; break;
                }


            }
            if(flag)count++;


        }
        System.out.println(count);
    }
}
