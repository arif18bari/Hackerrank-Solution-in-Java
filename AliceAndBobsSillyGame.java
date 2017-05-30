import java.util.Scanner;

/**
 * Created by Rukshar Alam on 5/30/2017.
 */
public class AliceAndBobsSillyGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for (int a0 = 0; a0 < g; a0++) {
            int n = in.nextInt();
            // your code goes here
            // initially assume all integers are prime
            boolean[] isPrime = new boolean[n+1];
            for (int i = 2; i <= n; i++) {
                isPrime[i] = true;
            }

            // mark non-primes <= n using Sieve of Eratosthenes
            for (int factor = 2; factor*factor <= n; factor++) {

                // if factor is prime, then mark multiples of factor as nonprime
                // suffices to consider mutiples factor, factor+1, ...,  n/factor
                if (isPrime[factor]) {
                    for (int j = factor; factor*j <= n; j++) {
                        isPrime[factor*j] = false;
                    }
                }
            }

            // count primes
            int primes = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) primes++;
            }
           // System.out.println("The number of primes <= " + n + " is " + primes);
            if(primes%2 == 0)
            {
                System.out.println("Bob");
            }
            else
                System.out.println("Alice");
        }
    }
}
