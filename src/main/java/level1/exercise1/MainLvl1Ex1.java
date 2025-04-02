package level1.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
- Exercici 1
A partir d’una llista de Strings, escriu un mètode
que retorna una llista de totes les cadenes que contenen
la lletra ‘o’. Imprimeix el resultat.
 */
public class MainLvl1Ex1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Car", "Sunset", "Toy", "Ball", "Bottle", "OOOOh!"));

        List<String> wordsWithOList = wordsWithO(words);
        System.out.println(wordsWithOList);
    }

    public static List<String> wordsWithO(List<String> words) {
        return words.stream().filter(word -> word.toLowerCase().contains("o")).collect(Collectors.toList());
    }
}
