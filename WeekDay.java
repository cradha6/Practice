import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by rch1 on 5/2/15.
 */
public class WeekDay {


//    Enter Year
//    2015
//    Enter month
//    00 ------ Jan
//    01 ------ Feb
//    Enter date
//    01
//    Current Date:   Thursday Jan 01 , 2015
//            1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();

        System.out.println("Enter month");
        int month = sc.nextInt();

        System.out.println("Enter date");
        int date = sc.nextInt();

        Calendar cal = new GregorianCalendar(year,month,date);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMM dd , yyyy ");

        System.out.println("Current Date:   "+sdf.format(cal.getTime()));
        System.out.println("Week ->"+cal.get(Calendar.WEEK_OF_YEAR));
    }
}
