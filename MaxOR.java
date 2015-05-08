import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rch1 on 4/21/15.
 */
public class MaxOR {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if ( !line.isEmpty()){

            int N = Integer.parseInt(line);

            String string  = br.readLine();
            char[] numbers = string.toCharArray();

            if (numbers.length != N)
                throw new RuntimeException("Number of test cases and given input is not matching");
            else{

                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = 0;
                }
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);
                }
            }

        }
        else
            throw new RuntimeException("Please provide the proper number");







    }
}
