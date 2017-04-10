import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/10/2017.
 */
public class MarsExploration {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String  s = sc.nextLine();
        int size = (s.length())/3;
        int n = s.length();
        int count = 0;

        for(int i = 0;i<n;i++)
        {
            if(i%3 == 0)
            {
                if(s.charAt(i) != 'S')
                {
                    count++;
                }
            }
            else if(i%3 == 1)
            {
                if(s.charAt(i) != 'O')
                {
                    count++;
                }
            }
            else if(i%3 == 2)
            {
                if(s.charAt(i) != 'S')
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
