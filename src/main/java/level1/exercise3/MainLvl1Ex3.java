package level1.exercise3;

import java.util.Arrays;
import java.util.List;

/*
Crea una llista amb els noms dels mesos de l’any.
Imprimeix tots els elements de la llista amb una lambda.
 */
public class MainLvl1Ex3 {
    public static void main(String[] args) {

        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        months.forEach(month -> System.out.println(month));
    }
}
