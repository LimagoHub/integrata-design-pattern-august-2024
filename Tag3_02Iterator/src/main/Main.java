package main;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        final var liste = List.of("Eins","Zwei","Drei", "Vier");

        //System.out.println(liste.get(0));

        for (int i = 0; i < liste.size() ; i++) {
            System.out.println(liste.get(i));
        }

        liste.forEach(System.out::println);

        for (var item:liste) {
            System.out.println(item);
        }
        System.out.println("-----------------------------");
        var it = liste.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for(var iter = liste.iterator(); it.hasNext();)
            System.out.println();

    }
}