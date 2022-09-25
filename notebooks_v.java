import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class notebooks_v {
    public static String[] getFilterData() {
        Scanner iScanner = new Scanner(System.in);
        String[] res = new String[2];

        System.out.println("\nChoose filter parameter:\n" +
            "1 - serial number\n" +
            "2 - name of producer\n" + 
            "3 - color\n" + 
            "4 - diagonal\n");
        res[0] = iScanner.nextLine();

        System.out.println("\nEnter filter value:" );
        res[1] = iScanner.nextLine();
        iScanner.close();
        return res;
    }

    public static void viewData(LinkedHashSet<notebooks_m> arrayList) {
        Logger logger = Logger.getAnonymousLogger();
        if (arrayList.isEmpty()) {
            logger.info("Requested information is not found");
        } else {
            for (var item : arrayList) {
            ArrayList<String> res = new ArrayList<>();
            res.add(item.nb_sn);
            res.add(item.nb_producer);
            res.add(item.nb_color);
            res.add(item.nb_diagonal.toString());
            logger.info(String.format("Data as array: %s\n", Arrays.toString(res.toArray())));
            }
        }
    }
}
