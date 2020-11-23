package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
//        Supplier<NullPointerException> nullPointerExceptionSupplier = () -> new NullPointerException();
       Optional.ofNullable("john@gmial.com")
//                .orElseGet(() -> "default value");
//            .orElseThrow(nullPointerExceptionSupplier);
                        .ifPresentOrElse(email -> System.out.println("Sending email to " + email ),
                            () -> System.out.println("Cannot send email"));

    }
}
