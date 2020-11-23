package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without Predicates");
        System.out.println(isPhoneNumberValid("07000000000") );
        System.out.println(isPhoneNumberValid("09023772300") );
        System.out.println(isPhoneNumberValid("090237723011") );

        System.out.println("With Predicates");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09023772300"));

        System.out.println(
                "Is phone Number valid and contains and has 3 " + isPhoneNumberValidPredicate.and(contains3).test("07000000000")
        );
        System.out.println(
                "Is phone Number valid and contains and has 3 " + isPhoneNumberValidPredicate.and(contains3).test("07023772300")
        );

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> contains3 = phoneNumber ->
            phoneNumber.contains("3");
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
