
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumVsXor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long count = 0;

        String bin = Long.toBinaryString(n);
        //System.out.println(bin);

        /* just count total numbers of ZERO present in binary number of given n,
         and answer will be the 2 to the power of (total num of zero).*/

        while(n!= 0 )
        {
            boolean flag = true;
            if(n%2 == 1) flag = false;
            count  += flag?1:0;
            n/=2;
        }

        System.out.println((long)Math.pow(2,count));
    }
}

/* I believe the justification is that the xor simulates binary addition without
the carry over to the next digit. For the zero digits of n you can either add a
1 or 0 without getting a carry which implies xor = + whereas if a digit in n is 1
then the matching digit in x is forced to be 0 on order to avoid carry. For each 0
 in n in the matching digit in x can either being a 1 or 0 with a total combination
  count of 2^(num of zero).*/