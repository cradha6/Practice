package Practice;

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
            final int tests = Integer.parseInt(line);
            String[] firstLine = new String[tests];
            String[] secondLine = new String[tests];

            for (int i = 0; i <tests ; i++) {
                firstLine[i] = br.readLine();
                secondLine[i] = br.readLine();
            }

          checkSubString(firstLine, secondLine);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void checkSubString(String[] firstLine, String[] secondLine) {

        boolean present = false;
        int count = 0;
        for (int i = 0; i < firstLine.length; i++) {

            char[] first  = firstLine[i].toLowerCase().toCharArray();
            char[] second = secondLine[i].toLowerCase().toCharArray();

            for(int j = 0; j < first.length; j++)
            {
                for (int k = 0; k < second.length; k++) {
                    if(first[j] == second[k] ){
                        count++;
                        if (count > 1)
                            break;
                    }

                }
                if (count > 1)
                    break;
            }
            if(count >1 ){
                System.out.println("YES");
            }
            else
                System.out.println("NO");

            count = 0;


        }

    }
}
