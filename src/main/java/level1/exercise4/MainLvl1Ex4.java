package level1.exercise4;

import java.util.Arrays;
import java.util.List;

public class MainLvl1Ex4 {
    public static void main(String[] args) {

        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        months.forEach(System.out::println);

    }
}
