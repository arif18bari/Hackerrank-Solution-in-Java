import java.util.Scanner;

/**
 * Created by rukshar on 4/16/17.
 */
public class DesignerPdfViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        int width = word.length();
        int max = -99;
        for(int i =0;i<width;i++)
        {
            char c = word.charAt(i);
            int value = Character.getNumericValue(c);
            int a = Character.getNumericValue('a');
            int height = h[value-a];
            if(height>max)
                max = height;

        }

        System.out.println(width*max);
    }
}
