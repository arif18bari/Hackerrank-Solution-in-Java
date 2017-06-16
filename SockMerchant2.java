package JUNE17;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/16/2017.
 */
public class SockMerchant2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int frequency[] = new int[101];
        for(int i = 0;i<=100;i++)
        {
            frequency[i] = 0;
        }
        for(int i = 0;i<n;i++)
        {
            frequency[c[i]]++;
        }
        int count = 0;
        for(int i = 0;i<=100;i++)
        {
            if(frequency[i] != 0)
            {
                count += (frequency[i]/2);
            }
        }

        System.out.println(count);






    }
}
