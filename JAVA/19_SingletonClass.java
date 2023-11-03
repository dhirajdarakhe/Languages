public class Government {
    // Private static instance of the Government class
    private static Government instance;

    // Private constructor to prevent instantiation from other classes
    private Government() {
        // The government is established.
        System.out.println("The government is established.");
    }

    // Public method to provide the single instance of the Government class
    public static Government getInstance() {
        if (instance == null) {
            instance = new Government();
        }
        return instance;
    }

    // Other government-related methods and attributes can be added here
}

public class Country {
    public static void main(String[] args) {
        // Creating multiple instances of the Government class
        Government government1 = Government.getInstance();
        Government government2 = Government.getInstance();

        // Both government1 and government2 will refer to the same instance
        System.out.println(government1 == government2); // Should print true

        // This demonstrates that there is only one government instance in the country.
    }
}
