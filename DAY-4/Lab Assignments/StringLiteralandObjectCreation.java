
// Write a Java program that creates two string variables using string literals with the same
// content. Then, print whether both variables point to the same object.

class StringLiteralandObjectCreation{
    public static void main(String[] args) {
        // two strings using string literals
        String str1 = "Hello";
        String str2 = "Hello";

        // Compare 
        if (str1 == str2) {
            System.out.println("Both str1 and str2 point to the SAME object in memory.");
        } else {
            System.out.println("str1 and str2 point to DIFFERENT objects in memory.");
        }
    }
}