package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.Female;
import static imperative.Main.Gender.Male;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", Male),
            new Person("Maria", Female),
            new Person("Aisha", Female),
            new Person("Alex", Male),
            new Person("Alice", Female)
        );

        System.out.println("//Imperative Approach (Lots of code)");
        //Imperative Approach (Lots of code)
        List<Person> females = new ArrayList<Person>();

        for (Person person: people) {
            if (Female.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person female: females) {
            System.out.println(female);
        }

        System.out.println("//Declaritive Approach");
        //Declaritive Approach (Tell it what you want)
        people.stream()
                .filter(person -> Female.equals(person.gender))
                .forEach(System.out::println);

        System.out.println("//Declaritive but collecting into a list and then printing");
        //Declaritive but collecting into a list and then printing
        //Takes in a person and returns true or false if its a female
        Predicate<Person> personPredicate = person -> Female.equals(person.gender);

        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        females2.forEach(System.out::println);
    }

    public static class Person {
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
        Male, Female
    }
}
