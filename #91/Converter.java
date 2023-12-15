import java.util.*;

public class Converter {
    public static void main(String args[]) {
        //
        System.out.println();
        System.out.println("Creeking the Java Coding Interview");
        System.out.println("Question No. 91");
        System.out.println("===== What is ? extends T =====");
        System.out.println("Answers is ....");
        System.out.println(" Suppose U extends T Box<U> does not extends Box<T>, But it extends Box<? extends T>   ");
        System.out.println();

        Convert c = new Convert();

        List<Double> doubles = new ArrayList<>();
        doubles.add(21.00);
        doubles.add(22.22);
        doubles.add(23.33);
        doubles.add(24.44);
        doubles.add(25.55);
        var longs = c.converter(doubles);

        System.out.println(longs);

    }
}

class Convert {
    List<Long> converter(
        List<? extends Number> numbers) {
            return numbers.stream().map(Number::longValue).toList();
    }
    
}