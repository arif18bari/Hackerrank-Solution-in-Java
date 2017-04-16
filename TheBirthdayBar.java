import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/16/2017.
 */
public class TheBirthdayBar {

    static int getWays(int[] squares, int d, int m){
        // Complete this function
        int n = squares.length; int tempSum;
        int ways = 0;
        if(n-m<0)
        {
            System.out.println("premature");
            return  0;
        }
        else {

            for(int i =0;i<=n-m;i++)
            {
                tempSum =0;
                for(int j = i;j<i+m;j++)
                {
                    tempSum += squares[j];
                }

                if(tempSum == d)ways++;
            }
        }
        return ways;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
