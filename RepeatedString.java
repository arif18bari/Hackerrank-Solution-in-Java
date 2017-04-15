import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/15/2017.
 */
public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int size = s.length();
        int countA = s.length() - s.replace("a", "").length();
       // System.out.println(count);
        long chunks = n/(long)size;
        long count = chunks * (long)countA;
        long remainder = n%(long)size;
        for(int i = 0;i<remainder;i++)
        {
            if(s.charAt(i) == 'a')
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
