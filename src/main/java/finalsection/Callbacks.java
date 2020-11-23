package finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("John", "Montana", value ->
                System.out.println("no last name provided for " + value));

        hello2("John", "Montana",
                () -> System.out.println("no last name provided"));

    }

    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        }
        else{
            callback.run();
        }
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        }
        else{
            callback.accept(firstName);
        }
    }

}
