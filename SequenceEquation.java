import java.util.Scanner;

/**
 * Created by rukshar on 4/16/17.
 */
public class SequenceEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i = 1;i<=n;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 1;i<=n;i++)
        {
            int index = -1;
            for(int j = 1;j<=n;j++)
            {
                if(a[j] == i)
                {
                    index = j;
                }
            }

            for(int j = 1;j<=n;j++)
            {
                if(a[j] == index)
                {
                    System.out.println(j);
                }
            }

        }
    }
}
