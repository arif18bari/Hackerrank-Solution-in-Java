import java.util.Scanner;

/**
 * Created by rukshar on 4/16/17.
 */
public class CountingValleys {
    public static void main(String[] args) {
        Scanner sc  =new  Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a[] = new int[n+1];
        a[0]= 0;
        int depth = 0;
        String  input;
        input = sc.nextLine();
        for(int i = 1;i<n+1;i++)
        {
            char c = input.charAt(i-1);
            if(c == 'U')
            {
                depth++;
                a[i] = depth;
            }
            else
            {
                depth--;
                a[i] = depth;
            }
        }
        int prevState = a[0],countValley = 0;

        boolean downward = false, upward = false;

        for(int i = 1;i<n+1;i++)
        {
            if(prevState == 0 && a[i] == -1)
            {
                downward = true;
            }
            if(prevState == -1 && a[i] == 0)
            {
                upward = true;
            }

            if(downward && upward)
            {
                countValley++;
                downward = false; upward = false;
            }

            prevState = a[i];

        }

        System.out.println(countValley);


    }
}
