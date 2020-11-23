package streams;

import imperative.Main;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Male),
                new Person("Maria", Female),
                new Person("Aisha", Female),
                new Person("Alex", Male),
                new Person("Alice", PREFER_NOT_TO_SAY)
        );

//        Function<Person, String> personStringFunction = person -> person.name;
//
//        ToIntFunction<String> length = String::length;
//
//        IntConsumer println = System.out::println;
//        people.stream()
//                .map(personStringFunction)
//                .mapToInt(length)
//                .forEach(println);

        Predicate<Person> personPredicate = person -> Female.equals(person.gender);
        boolean onlyFemales = people.stream()
                .noneMatch(personPredicate);

        System.out.println(onlyFemales);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        Male, Female, PREFER_NOT_TO_SAY
    }

}
