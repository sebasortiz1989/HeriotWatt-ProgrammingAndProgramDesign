package Examples;

public class NonPrimitiveTypes {
    public static void StringMethodExamples() {
        String text = "Hello World";
        int length = text.length(); // Calls the length() method
        System.out.println("Length: " + length); // Outputs the string length
        String upperText = text.toUpperCase(); // upperText = "HELLO"

        String text2 = "HELLO";
        String lowerText = text2.toLowerCase(); // lowerText = "hello"

        String sub = text.substring(0, 5); // sub = "Hello"

        String text3 = "Java programming";
        boolean hasJava = text3.contains("Java"); // hasJava = true

        String replacedText = text3.replace('a', 'o'); // replacedText = "Jovo progromming"

        String text4 = "  Hello  ";
        String trimmedText = text4.trim(); // trimmedText = "Hello"
    }

    public static void ArrayExample() {
        // Declare and Initialize an Array
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and Modify Array Elements
        System.out.println("First Element: " + numbers[0]);
        numbers[0] = 10; // Update the first element
        System.out.println("Updated First Element: " + numbers[0]);

        // Iterate Through the Array
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
