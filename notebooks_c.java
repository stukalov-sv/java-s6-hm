import java.util.LinkedHashSet;

public class notebooks_c {
    public static LinkedHashSet<notebooks_m> getFilteredArray(LinkedHashSet<notebooks_m> arrayList, String filterCase, String filterWord) {
        LinkedHashSet<notebooks_m> res = new LinkedHashSet<>(); 
        switch (filterCase) {
            case "1":
                for (var item : arrayList) {
                    if (item.nb_sn.equals(filterWord)) {
                        res.add(item);
                    }
                }
                break;
            case "2":
                for (var item : arrayList) {
                    if (item.nb_producer.equals(filterWord)) {
                        res.add(item);
                    }
                }
                break;
            case "3":
                for (var item : arrayList) {
                    if (item.nb_color.equals(filterWord)) {
                        res.add(item);
                    }
                }
                break;
            case "4":
                for (var item : arrayList) {
                    if (item.nb_diagonal.toString().equals(filterWord)) {
                        res.add(item);
                    }
                }
                break;
            default:
                break;

        }
        return res;
    }
}
