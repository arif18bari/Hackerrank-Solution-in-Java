import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/16/2017.
 */
public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        int countApple = 0;

        for(int apple_i=0; apple_i < m; apple_i++){
            int diff = a+apple[apple_i] ;
            if(diff>=s && diff<=t)
            {
                countApple++;
            }
        }


        System.out.println(countApple);

        int countOrange = 0;
        for(int orange_i=0; orange_i < n; orange_i++){
            int diff =b+ orange[orange_i] ;
            if(diff>=s && diff<=t)
            {
                countOrange++;
            }
        }

        System.out.println(countOrange);

    }
}
