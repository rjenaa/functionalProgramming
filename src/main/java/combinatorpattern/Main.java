package combinatorpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer= new Customer(
                "Alice",
                "alicegmail.com",
                "+092132213",
                LocalDate.of(2000,1,1)

        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        //Using combinator pattern
        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isNumberValid())
                .and(CustomerRegistrationValidator.isDobValid())
                .apply(customer);

        System.out.println(result);

        if(result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }


}
