package level2.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainLvl2Ex1 {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(Arrays.asList
                ("Jose", "Mia", "asa", "Itziar", "Ana", "Ane")
        );

        List<String> namesListFormat = namesThreeLetters(namesList);
        System.out.println(namesListFormat);

    }

    private static List<String> namesThreeLetters(List<String> namesList) {
        return namesList.stream().filter(name -> name.charAt(0) == 'A' && name.length() == 3)
                .collect(Collectors.toList());
    }

}
