package Examples;

public class DataTypeConversionAndCasting {
    /*
    Implicit type conversion (widening),
    Also known as automatic type conversion, widening happens when a smaller data type
    is automatically converted into a larger data type. Since there is no risk of data loss,
    Java handles this conversion automatically.
    */
    public static void WideningExample() {
        int num = 100;
        double doubleNum = num;// Automatic conversion from int to double
        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + doubleNum);
    }

    /*
    Explicit type conversion (narrowing)
    Also known as type casting, narrowing happens when a larger data type is explicitly converted
    into a smaller data type. Since there is a risk of data loss, we must manually specify the conversion.
    */
    public static void NarrowingExample() {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; // Manual casting from double to int
        System.out.println("Double value: " + doubleValue);
        System.out.println("Converted to int: " + intValue);
    }
}
