// Write a Java program that creates two string objects using the new keyword with the
// same content. Then, print whether both objects are the same using the == operator and
// the .equals() method.

class StringObject{
    public static void main(String[] args) {
        // Creating two String objects using 'new'
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Using == operator (checks reference, i.e., memory location)
        if (str1 == str2) {
            System.out.println("str1 and str2 are the SAME object (==).");
        } else {
            System.out.println("str1 and str2 are DIFFERENT objects (==).");
        }

        // Using .equals() method (checks content/values)
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 have the SAME content (.equals).");
        } else {
            System.out.println("str1 and str2 have DIFFERENT content (.equals).");
        }
    }
}
