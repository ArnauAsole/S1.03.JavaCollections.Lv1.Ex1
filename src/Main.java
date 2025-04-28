import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        List<Month> months = new ArrayList<>(Arrays.asList(
                new Month("January"), new Month("February"), new Month("March"),
                new Month("April"), new Month("May"), new Month("June"),
                new Month("July"), new Month("September"), new Month("October"),
                new Month("November"), new Month("December")
        ));

        months.add(7, new Month("August"));

        System.out.println("ArrayList in order:");
        for (Month m : months) {
            System.out.println(m);
        }

        Set<Month> monthSet = new HashSet<>(months);

        monthSet.add(new Month("January"));

        System.out.println("\nHashSet (no duplicates):");
        for (Month m : monthSet) {
            System.out.println(m);
        }

        System.out.println("\nRun with a 'for':");
        for (int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i));
        }

        System.out.println("\nRun with a 'Iterator':");
        Iterator<Month> it = months.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}