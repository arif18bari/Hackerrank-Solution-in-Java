import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/10/2017.
 */
public class BonApetite {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            a[i ] = sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            sum += a[i];
        }

        sum -= a[k];

        //System.out.println(sum);
        int charged = sc.nextInt();

        sum /= 2; //B-actual
        if(sum-charged == 0)
        {
            System.out.println("Bon Appetit");
        }
        else
            System.out.println(charged - sum);

    }
}
