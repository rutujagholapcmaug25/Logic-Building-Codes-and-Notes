// Write a Java program that declares three string literals with the same content and prints
// whether all three strings refer to the same object using the == operator.

class StringLiteral {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        String str3 = "java";

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str2 == str3: " + (str2 == str3));
        System.out.println("str1 == str3: " + (str1 == str3));

        // Check if all three are same object
        if (str1 == str2 && str2 == str3) {
            System.out.println("All three strings refer to the same object.");
        } else {
            System.out.println("Strings refer to different objects.");
        }
    }
}
