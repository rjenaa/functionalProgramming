package functionalInterface;

import javax.imageio.ImageReader;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
    Customer maria = new Customer("maria", "9999");
    greetCustomer(maria);
    greetCustomerV2(maria, false);


    //Consumer Functional Interface
    greetCustomerConsumer.accept(maria);

    greetCustomerConsumerV2.accept(maria, false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +", thanks for registering " +
                    (showPhoneNumber ? customer.customerNumber : "********")
            );

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering " + customer.customerNumber
            );

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering " + customer.customerNumber
        ) ;
    }

    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName +", thanks for registering " +
                (showPhoneNumber ? customer.customerNumber : "********")
        );
    }


    static class Customer {
        private final String customerName;
        private final String customerNumber;

        Customer(String name, String number) {
            this.customerName = name;
            this.customerNumber = number;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerNumber='" + customerNumber + '\'' +
                    '}';
        }
    }

}
