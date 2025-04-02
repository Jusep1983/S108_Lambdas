package level1.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainLvl1Ex6 {
    public static void main(String[] args) {
        List<Object> unsortedList = new ArrayList<>(Arrays.asList(
                99, "HolaHola", "Hace un bonito dia", 9, "1983", "*", 99999)
        );
        List<Object> sortedList = new ArrayList<>(sortedListOnlyStringByLength(unsortedList));
        List<Object> sortedAllList = new ArrayList<>(sortedAllListByLength(unsortedList));

        System.out.println("Lista desordenada: ");
        unsortedList.forEach(System.out::println);
        System.out.println();

        System.out.println("Lista solo String ordenada por longitud: ");
        sortedList.forEach(System.out::println);
        System.out.println();

        System.out.println("Lista completa ordenada por longitud: ");
        sortedAllList.forEach(System.out::println);
    }

    private static List<String> sortedListOnlyStringByLength(List<Object> unsortedList) {
        return unsortedList.stream()
                .filter(element -> element instanceof String)
                .map(element -> (String) element)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    private static List<String> sortedAllListByLength(List<Object> unsortedList) {
        return unsortedList.stream()
                .map(String::valueOf)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }
}
