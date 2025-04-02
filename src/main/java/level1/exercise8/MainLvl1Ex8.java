package level1.exercise8;

public class MainLvl1Ex8 {
    public static void main(String[] args) {

        ReverseInterface reverseInterface = string -> new StringBuilder(string).reverse().toString();
        System.out.println(reverseInterface.reverse("aid otinob nu ecaH"));
    }

}
