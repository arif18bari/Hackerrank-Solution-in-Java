import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/11/2017.
 */
public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 5;
        int liked = 2;
        int total = 2;
        for(int i = 2;i<=n;i++)
        {
            m = liked*3;
            liked = m/2;
            total += liked;
        }
        System.out.println(total);
    }
}
