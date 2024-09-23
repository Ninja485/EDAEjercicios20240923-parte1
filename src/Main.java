import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Madrid");
        ciudades.add("Pinto");
        ciudades.add("Valdemoro");
        Iterator<String> iterator = ciudades.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("\n");
        for (String ciudad : ciudades){
            System.out.println(ciudad);
        }

        List<String> ciudades2 = new LinkedList<>();
        ciudades2.add("Madrid");
        ciudades2.add("Pinto");
        ciudades2.add("Valdemoro");
        Iterator<String> iterator2 = ciudades2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("\n");

        Set<String> ciudades3 = new HashSet<>();
        ciudades3.add("Madrid");
        ciudades3.add("Pinto");
        ciudades3.add("Valdemoro");
        Iterator<String> iterator3 = ciudades3.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        System.out.println("\n");

        ArrayListIterInterface<String> ciudades4 = new ArrayListIter<>();
        ciudades4.add(0, "Madrid");
        ciudades4.add(1, "Pinto");
        ciudades4.add(2, "Valdemoro");
        Iterator<String> iterator4 = ciudades4.iterator();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }

        System.out.println("\n");

        for (String ciudad : ciudades4){
            System.out.println(ciudad);
        }
    }
}
