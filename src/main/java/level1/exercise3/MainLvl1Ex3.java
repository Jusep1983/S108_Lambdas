package level1.exercise3;

import java.util.Arrays;
import java.util.List;

public class MainLvl1Ex3 {
    public static void main(String[] args) {
        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );
        months.forEach(month -> System.out.println(month));
    }
}
