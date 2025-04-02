package level2.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainLVL2Ex2 {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(11, 2, 3, 4, 5, 600, 775, 882, 902, 1000));
        String answer = stringOfIntegers(listOfIntegers);
        System.out.println(answer);
    }

    private static String stringOfIntegers(List<Integer> listOfIntegers) {
        return listOfIntegers.stream()
                .map(element -> (element % 2 == 0) ? "e" + element : "o" + element)
                .collect(Collectors.joining(","));
    }
}
