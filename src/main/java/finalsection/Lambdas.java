package finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Integer number = null;
        int counter = 0;

//        Function<String, String> uppercaseName = String::toUpperCase;
        BiFunction<String, Integer ,String> uppercaseName = (name, age) -> {
            //logic
            if(name.isEmpty()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };


        System.out.println(uppercaseName.apply("alex", 10));
    }

    class Serive {
        Consumer<String> blah  = s -> {

        };
    }
}
