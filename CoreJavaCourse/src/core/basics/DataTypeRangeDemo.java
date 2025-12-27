package core.basics;

public class DataTypeRangeDemo {

    public static void main(String[] args) {

        // byte range: -128 to 127
        byte num1 = 127; 
        // byte num1 = 128;  // ❌ Compile-time error: possible lossy conversion from int to byte

        // short range: -32,768 to 32,767
        short num2 = 32767;
        // short num2 = 32768;  // ❌ Compile-time error: out of range for short

        // int range: -2,147,483,648 to 2,147,483,647
        int num3 = 2147483647;
        // int num3 = 2147483648;  // ❌ Compile-time error: integer number too large

        // long range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long num4 = 9223372036854775807L;
        // long num4 = 9223372036854775808L;  // ❌ Compile-time error: long number too large

        // float range: approx ±3.4e38
        float num5 = 3.4e38f;
        // float num5 = 3.5e38f;  // ❌ Compile-time error: floating-point number too large

        // double range: approx ±1.7e308
        double num6 = 1.7e308;
        // double num6 = 1.8e308;  // ❌ Compile-time error: floating-point number too large

        // char range: 0 to 65,535 (Unicode)
        char num7 = 65535;
        // char num7 = 65536;  // ❌ Compile-time error: possible lossy conversion from int to char

        // boolean allows only true or false
        boolean num8 = true;
        // boolean num8 = 1;  // ❌ Compile-time error: incompatible types
    }
}
