import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/15/2017.
 */
public class BeautifulDays {
    public static void main(String[] args) {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt(); j = sc.nextInt(); k = sc.nextInt();
        int count = 0;
        for(int a = i;a<j;a++)
        {
            String aToS= Integer.toString(a);
            String reverse = new StringBuffer(aToS).reverse().toString();
            int reverseInt = Integer.parseInt(reverse);
            if (Math.abs(reverseInt- a) % k == 0)
            {
                count++;
            }

        }
        System.out.println(count);
    }
}
