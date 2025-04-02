package level3;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

    public static void main(String[] args) {


        List<Object> list = List.of(2, 34, "Pepino", "ESmeralda", 29, "Sol");

        System.out.println("Lista original: " + list);

        List<String> sortedStrings = list.stream()
                .filter(word -> word instanceof String)
                .map(Object::toString)
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .toList();

        System.out.println("Palabras ordenadas por longitud: " + sortedStrings);

    }
}

