package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rch1 on 5/9/15.
 */
public class PascaleTriangle {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        final int K = Integer.parseInt(line);

        if(K < 2 && K > 10 ){
            throw new RuntimeException("K shouldn't be less than 2 or greater 10");
        }
        for (int i = 0 ; i < K; i++) {

            for (int r = 0; r <= i ; r++) {
                System.out.print(factorial(i) / (factorial(r) * factorial(i - r)));
            }
            System.out.println();
        }
    }

    private static int factorial(int n) {
        int c, fact = 1;
        if ( n < 0 )
            System.out.println("Number should be non-negative.");

        else
        {
            for ( c = 1 ; c <= n ; c++ )
                fact = fact*c;

            return fact;
        }

        return 0;
    }


}
