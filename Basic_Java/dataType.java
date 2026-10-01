public class DataTypesDemo {
    public static void main(String[] args) {
        
     

        // byte: 1 byte (8 bits), stores whole numbers from -128 to 127
        byte age = 25;

        // short: 2 bytes, stores whole numbers from -32,768 to 32,767
        short year = 2026;

        // int: 4 bytes, standard type for whole numbers (-2.14B to 2.14B)
        int population = 1500000;

        // long: 8 bytes, for massive integers. Requires an 'L' suffix
        long bankBalance = 9876543210L;

        // float: 4 bytes, for fractional numbers. Requires an 'f' suffix
        float price = 19.99f;

        // double: 8 bytes, standard type for precision decimals
        double pi = 3.141592653589793;

        // char: 2 bytes, stores a single Unicode character in single quotes
        char grade = 'A';

        // boolean: Stores true or false values
        boolean isJavaFun = true;


        // ==========================================
        // 2. NON-PRIMITIVE DATA TYPES (Reference Types)
        // ==========================================

        // String: A sequence of characters enclosed in double quotes
        String greeting = "Hello, World!";

        // Array: A collection of elements of the same type
        int[] luckyNumbers = {7, 11, 21, 42};


        // ==========================================
        // PRINTING VALUES TO CONSOLE
        // ==========================================
        System.out.println("--- Primitive Data Types ---");
        System.out.println("Byte value: " + age);
        System.out.println("Short value: " + year);
        System.out.println("Int value: " + population);
        System.out.println("Long value: " + bankBalance);
        System.out.println("Float value: " + price);
        System.out.println("Double value: " + pi);
        System.out.println("Char value: " + grade);
        System.out.println("Boolean value: " + isJavaFun);

        System.out.println("\n--- Non-Primitive Data Types ---");
        System.out.println("String value: " + greeting);
        System.out.println("Array first element: " + luckyNumbers[0]);
    }
}
