import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/7/2017.
 */
public class CatsAndAMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int distance1= Math.abs(x-z);
            int distance2= Math.abs(y-z);
            if (distance1 < distance2)
            {
                System.out.println("Cat A");
            }
            else if (distance1 > distance2)
            {
                System.out.println("Cat B");
            }
            else
                System.out.println("Mouse C");

        }
    }
}
