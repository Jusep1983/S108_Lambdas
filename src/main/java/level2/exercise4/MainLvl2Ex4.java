package level2.exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainLvl2Ex4 {
    public static void main(String[] args) {

        List<Object> unsortedList = new ArrayList<>(Arrays.asList(
                99, "Hola", "adios", 1, "enManuel", "E", 99999, "jose", "boooooe", "zoto", "zeta")
        );

        System.out.println("\nLista ordenada alfabéticamente: ");
        sortListAlphabetically(unsortedList).forEach(System.out::println);
        System.out.println("\nLista ordenada alfabéticamente si contiene \"e\" primero: ");
        sortListWithEFirst(unsortedList).forEach(System.out::println);
        System.out.println("\nLista ordenada alfabéticamente si contiene \"e\" primero y cambiando \"a\" por \"4\": ");
        sortListreplaceAFor4(unsortedList).forEach(System.out::println);
    }


    private static List<String> sortListAlphabetically(List<Object> unsortedList) {
        return unsortedList.stream()
                .map(Object::toString)
                .sorted(Comparator.comparing(s -> s.charAt(0)))
                .collect(Collectors.toList());
    }

    private static List<String> sortListWithEFirst(List<Object> unsortedList) {
        return unsortedList.stream()
                .map(Object::toString)
                .sorted(Comparator.comparing(s -> s.charAt(0)))
                .sorted(Comparator.comparing((String s) -> !s.contains("e")))
                .collect(Collectors.toList());
    }

    private static List<String> sortListreplaceAFor4(List<Object> unsortedList) {
        return unsortedList.stream()
                .map(Object::toString)
                .map(s -> s.replace("a", "4"))
                .sorted(Comparator.comparing(s -> s.charAt(0)))
                .sorted(Comparator.comparing((String s) -> !s.contains("e")))
                .collect(Collectors.toList());
    }
}