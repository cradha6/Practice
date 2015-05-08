import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rch1 on 5/8/15.
 */
public class TwoStrings {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = br.readLine();
            int Tests = Integer.parseInt(line);
            String secondLine = br.readLine();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
