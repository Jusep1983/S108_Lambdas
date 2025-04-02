import java.util.Arrays;
import java.util.List;

public class ejemploTonto {

    public static void main(String[] args) {


//        Operacion suma = (a, b) -> (a + b);
//
//        int resultado = suma.calcular(3, 2);
//
//        System.out.println(resultado);
//
//        List<String> months = Arrays.asList(
//                "January", "February", "March", "April", "May", "June",
//                "July", "August", "September", "October", "November", "December"
//        );
//
//        months.forEach(month -> System.out.println(month));
//
//        /* Simplified equivalence: */ months.forEach(System.out::println);
    }
    public interface Operacion {

        int calcular(int a, int b);

    }



}
