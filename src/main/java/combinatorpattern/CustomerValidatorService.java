package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isNumberValid(String phoneNumber){
        return phoneNumber.contains("+0");
    }
    private boolean isDOBValid(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid (Customer customer){
        return isEmailValid(customer.getEmail()) &&
                isNumberValid(customer.getPhoneNumber()) &&
                isDOBValid(customer.getDob());
    }
}
