import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LamdaTest {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.forEach(num -> System.out.println(num));
        for(Integer a : collection)
            System.out.println("a = " + a);

    }
}
