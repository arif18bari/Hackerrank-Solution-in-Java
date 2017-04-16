import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rukshar on 4/16/17.
 */
public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for (int pendrives_i = 0; pendrives_i < m; pendrives_i++) {
            pendrives[pendrives_i] = in.nextInt();
        }

        Arrays.sort(keyboards);
        Arrays.sort(pendrives);


        //can't buy lowest so -1
        if (keyboards[0] + pendrives[0] > s)
        {
            System.out.println("-1");
        }
        else
        {

            int max = -99;
            for(int i = n-1;i>=0 ;i--)
            {
                int keyboardPrice = keyboards[i];
                for(int j = m-1;j>=0;j--)
                {
                    int temp = keyboardPrice+pendrives[j];
                    if(temp<=s)
                    {

                        if(temp> max)
                        {
                            max = temp;
                        }
                    }
                }
            }

            System.out.println(max);
        }
    }
}
