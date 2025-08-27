// Write a Java program that creates a string using the new keyword and then calls the
// intern() method. Print whether the interned string is pointing to the same object as the
// original string literal

class StringInternMethod {
    public static void main(String[] args) {
        String str1 = new String("hello");   // created in heap
        String str2 = str1.intern();         // interned (points to string pool)
        String str3 = "hello";               // string literal from pool

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str2 == str3: " + (str2 == str3));
    }
}
