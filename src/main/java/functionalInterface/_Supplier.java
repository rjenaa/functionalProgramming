package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getConnectionUrl());
        System.out.println(getDBConnectionsSupplier.get());
    }

    static String getConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionsSupplier = ()
            -> List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customer"
    );

}
