//2 a. Develop a java program for performing various string operations with different string handling
//functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
//Substring Operations , String Modification, Whitespace Handling, String Concatenation, String
//Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and
//endsWith()



package stringoperations;

public class StringOperationsDemo {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("Index of 'Program': " + text.indexOf("Program"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0 to 4): " + text.substring(0, 4));

        // 6. String Modification
        String modified = text.replace("Java", "Python");
        System.out.println("Modified String: " + modified);

        // 7. Whitespace Handling
        String strWithSpaces = "   Welcome   ";
        System.out.println("Before trim: '" + strWithSpaces + "'");
        System.out.println("After trim: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" Middle");
        sb.append(" End");
        System.out.println("StringBuilder result: " + sb);

        // 11. String Formatting
        String name = "Akshay";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation (contains, startsWith, endsWith)
        String email = "example@gmail.com";

        if (email.contains("@") && 
            (email.endsWith(".com") || email.endsWith(".in")) && 
            !email.startsWith("@")) {

            System.out.println("Valid Email: " + email);
        } else {
            System.out.println("Invalid Email: " + email);
        }
    }
}