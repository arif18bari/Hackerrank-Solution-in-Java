import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/15/2017.
 */
public class DrawingBook {
    static int solve(int n, int p){
        // Complete this function
        int numberOfPages = 0;
        if(n%2 == 0)
        {
            numberOfPages += 2; //1st n' last page
            int m = n-2;
            int rest = m/2;
            numberOfPages += rest;

            int page = 1;
            int i = 1;
            int turn = 0;
            if(p == 1){return turn;}
            else {
                while (i <= p) {
                    page++; turn++; i+=2;

                }

            }
            if(numberOfPages/2 < page)
            {
                turn = numberOfPages -(turn+1);
            }

            return  turn;


        }
        else {
            numberOfPages += 1; //1st page
            int m = n - 1;
            int rest = m / 2;
            numberOfPages += rest;

            int page = 1;
            int i = 1;
            int turn = 0;
            if (p == 1 || p == n || p == n - 1) {
                return turn;
            } else {
                while (i < p) {
                    page++;
                    turn++;
                    i += 2;

                }

            }
            if(numberOfPages/2  < page)
            {

                turn = numberOfPages -(turn+1);
            }
            return turn;
        }
        //return  -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
