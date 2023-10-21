import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class calculator {
    public static void main(String[] args) throws IOException {

        float firtnumberpaul , secondnumberpaul , sub ,sum ,div, prod ;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the first number");
        firtnumberpaul = Float.parseFloat(reader.readLine());

        System.out.println("enter the second number");
        secondnumberpaul = Float.parseFloat(reader.readLine());

        sum = firtnumberpaul+secondnumberpaul;
        sub = firtnumberpaul-secondnumberpaul;
        prod= firtnumberpaul*secondnumberpaul;
        div = firtnumberpaul/secondnumberpaul;


        System.out.println("sum is: " + sum);  // Output user input
        System.out.println("subtraction is: " + sub);
        System.out.println("product is: " + prod);
        System.out.println("division is: " + div);


    }

}
