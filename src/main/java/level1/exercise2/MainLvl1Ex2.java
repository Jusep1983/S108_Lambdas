package level1.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
- Exercici 2
Has de fer el mateix que en el punt anterior, però ara,
el mètode ha de retornar una llista amb els Strings que
a més de contenir la lletra ‘o’ també tenen més de 5 lletres.
Imprimeix el resultat.
 */
public class MainLvl1Ex2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Car", "Sunset", "Toy", "Ball", "Bottle", "OOOOh!"));

        List<String> wordsWithOList = wordsWithOAndFiveLetters(words);
        System.out.println(wordsWithOList);

    }

    public static List<String> wordsWithOAndFiveLetters(List<String> words) {
        return words.stream()
                .filter(word -> word.toLowerCase().contains("o") && word.length() > 5)
                .collect(Collectors.toList());
    }
}
