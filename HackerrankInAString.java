import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/15/2017.
 */
public class HackerrankInAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String hackerrank = "hackerrank";
        int m = hackerrank.length();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            int index = 0;

            int n = s.length();
            for(int i =0;i<n;i++)
            {
                if(hackerrank.charAt(index) == s.charAt(i))
                {
                    index++;
                }
                if(index==m-1)
                {
                    break;
                }
            }
            if(index == m-1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
